drop database if exists futbol;
create database futbol;
use futbol;

create table paises(
    id int auto_increment primary key,
    nombre varchar(30) not null    
);

create table ligas(
    id int auto_increment primary key,
    pais_id int not null,
    nombre varchar(50) not null,
    division int not null
);

create table equipos(
    id int auto_increment primary key,
    nombre varchar(50) not null,
    liga_id int not null
);

create table jugadores(
    id int auto_increment primary key,
    nombre varchar(30) not null,
    apellido varchar(30) not null,
    numero int not null,
    fechanacimiento datetime not null,
    pais_id int not null,
    equipo_id int not null,
    stats_id int not null
);

create table stats(
    id int auto_increment primary key,
    jugador_id int not null,
    posicion enum ('Arquero', 'Defensor', 'Volante', 'Delantero'),
    pie enum ('Zurdo', 'Diestro'),
    altura int not null,
    peso int not null,
    ataque int not null,
    defensa int not null,
    pases int not null,
    velocidad int not null,
    tiro int not null,
    valoracion int not null,
    potencial int not null
);

-- Definición de Foreign Keys

alter table ligas
    add constraint fk_ligas_paises_idPais
    foreign key(pais_id)
    references paises(id);

alter table equipos
    add constraint fk_equipos_ligas_idLiga
    foreign key(liga_id)
    references ligas(id);

alter table jugadores
    add constraint fk_jugadores_pais_idPais
    foreign key(pais_id)
    references paises(id);

alter table jugadores
    add constraint fk_jugadores_equipos_idEquipo
    foreign key(equipo_id)
    references equipos(id);
    
alter table jugadores
    add constraint fk_jugadores_stats_idStats
    foreign key(stats_id)
    references stats(id);

alter table stats
    add constraint fk_stats_jugadores_idJugador
    foreign key(jugador_id)
    references jugadores(id);

-- DML: Inserción de registros de prueba
-- insert into paises (nombre) values ("Argentina");


