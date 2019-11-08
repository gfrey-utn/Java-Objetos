-- Test: 10 consultas de prueba

-- 1. ¿Quiénes son los 3 mejores jugadores?
select j.nombre, j.apellido, s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
order by s.valoracion desc
limit 3;

-- 2. ¿Quiénes son los 10 mejores arqueros?
select j.nombre, j.apellido, s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
where s.posicion = 'Arquero'
order by s.valoracion desc
limit 10;

-- 3. ¿Qué equipos tienen más jugadores?
select e.nombre, count(*) nro_jugadores
from equipos e
join jugadores j on e.id = j.equipo_id
group by e.nombre
having nro_jugadores = (
	select count(*) nro_jugadores
    from equipos e
    join jugadores j on e.id = j.equipo_id
    group by e.nombre
    order by nro_jugadores desc
    limit 1);

-- 4. ¿Cuál es la división con más equipos?
select l.nombre, l.division, count(*) nro_equipos, p.nombre pais
from ligas l
join paises p on p.id = l.pais_id
join equipos e on l.id = e.liga_id
group by l.nombre, l.division, p.nombre
having nro_equipos = (
	select count(*) nro_equipos
    from ligas l
    join equipos e on l.id = e.liga_id
    group by l.nombre
    order by nro_equipos desc
    limit 1);

-- 5. ¿Quién es el jugador más longevo?
select nombre, apellido, fechanacimiento
from jugadores
where fechanacimiento = (select min(fechanacimiento) from jugadores);

-- 6. ¿Quiénes son los jugadores con más crecimiento (POT - VAL)?
select j.nombre, j.apellido, s.valoracion, s.potencial, (s.potencial - s.valoracion) "Crecimiento"
from jugadores j
join stats s on j.id = s.jugador_id
where (s.potencial - s.valoracion) = (select max(potencial - valoracion) from stats);

-- 7. ¿Cuáles son los mejores jugadores de cada país?
select j.nombre, j.apellido, p.nombre "nacionalidad", s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
join paises p on p.id = j.pais_id
where s.valoracion = (
	select max(valoracion)
    from jugadores js
    join stats ss on js.id = ss.jugador_id
    where js.pais_id = p.id
);

-- 8. ¿Cuáles son los jugadores que, o bien son argentinos, o juegan en una liga argentina?
select j.nombre, j.apellido, p.nombre "nacionalidad" , l.nombre "liga", s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
join paises p on p.id = j.pais_id
join equipos e on e.id = j.equipo_id
join ligas l on l.id = e.liga_id
where p.nombre = "Argentina" or l.pais_id = 2
order by s.valoracion desc;

-- 9. ¿Cuáles son los defensores zurdos de más de 1.85 m?
select j.nombre, j.apellido, s.altura, s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
where s.posicion = 'Defensor' and s.pie = 'Zurdo' and s.altura > 185
order by s.valoracion desc;

-- 10. ¿Cuáles son los jugadores menores a 20 años con un potencial mayor a 80?
select j.nombre, j.apellido, j.fechanacimiento, s.valoracion, s.potencial,
		timestampdiff(year,j.fechanacimiento,curdate()) "Edad"
from jugadores j
join stats s on j.id = s.jugador_id
where timestampdiff(year,j.fechanacimiento,curdate()) < 20 and s.potencial > 80
order by s.potencial desc;

-- BONUS TRACK
-- 11. Mostrar stats de todos los jugadores
select j.nombre,j.apellido,j.numero,j.fechanacimiento,e.nombre "equipo",
		s.posicion,s.pie,s.altura,s.peso,s.ataque,s.defensa,s.pases,
        s.velocidad,s.tiro,s.valoracion,s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
join equipos e on e.id = j.equipo_id
order by s.valoracion desc;

-- 12. Mostrar información de todos los jugadores
select j.nombre, j.apellido, j.numero, j.fechanacimiento,
		timestampdiff(year,j.fechanacimiento,curdate()) "edad",
		p.nombre "nacionalidad", e.nombre "equipo", l.nombre "liga",
		l.division, s.posicion, s.pie, s.altura, s.peso,
		s.valoracion, s.potencial
from jugadores j
join stats s on j.id = s.jugador_id
join paises p on p.id = j.pais_id
join equipos e on e.id = j.equipo_id
join ligas l on l.id = e.liga_id
order by s.valoracion desc;

-- 13. ¿Cuáles son los 10 mejores delanteros según habilidad de tiro y valoración menor a 86?
select j.nombre,j.apellido, timestampdiff(year,j.fechanacimiento,curdate()) "edad",
		s.tiro,s.valoracion
from jugadores j
join stats s on j.id = s.jugador_id
where s.posicion = 'Delantero' and s.valoracion < 86
order by s.tiro desc
limit 10;
