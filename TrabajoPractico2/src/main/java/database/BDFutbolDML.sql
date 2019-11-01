-- DML: Inserción de registros de prueba
use futbol;

-- Países
insert into paises (nombre) values
('Alemania'),
('Argentina'),
('Bélgica'),
('Brasil'),
('Chile'),
('Colombia'),
('Costa Rica'),
('Croacia'),
('Egipto'),
('Eslovenia'),
('España'),
('Francia'),
('Holanda'),
('Hungría'),
('Inglaterra'),
('Italia'),
('Polonia'),
('Portugal'),
('Senegal'),
('Suiza'),
('Uruguay');

-- Ligas
insert into ligas (pais_id, nombre, division) values
(15,'Premier League',1),
(15,'Championship',2),
(11,'La Liga',1),
(16,'Serie A',1),
(1,'Bundesliga',1),
(12,'Ligue 1',1),
(13,'Eredivisie',1),
(18,'Primeira Liga',1),
(2,'Superliga Argentina',1),
(2,'Primera Nacional',2),
(4,'Série A (BRA)',1);

-- Equipos
insert into equipos (nombre, liga_id) values
('Arsenal'		, 1),
('Chelsea'		, 1),
('Liverpool'	, 1),
('Man. City'	, 1),
('Man. United'	, 1),
('Tottenham'	, 1),
('Leeds United'	, 2),
('Atlético Madrid', 3),
('FC Barcelona'	, 3),
('Real Madrid'	, 3),
('Sevilla'		, 3),
('AC Milan'		, 4),
('Inter'		, 4),
('Juventus'		, 4),
('Napoli'		, 4),
('Roma'			, 4),
('Bayern Munich', 5),
('B. Dortmund'	, 5),
('B. Leverkusen', 5),
('RB Leipzig'	, 5),
('Schalke 04'	, 5),
('Lyon'			, 6),
('Monaco'		, 6),
('PSG'			, 6),
('Ajax'			, 7),
('Feyenoord'	, 7),
('PSV'			, 7),
('Benfica'		, 8),
('Porto'		, 8),
('Sp. Lisboa'	, 8),
('Boca'			, 9),
('Independiente', 9),
('Racing'		, 9),
('River'		, 9),
('San Lorenzo'	, 9),
('Chacarita'	, 10),
('Corinthians'	, 11),
('Flamengo'		, 11),
('Fluminense'	, 11),
('Gremio'		, 11),
('Santos'		, 11),
('Sao Paulo'	, 11);

-- Jugadores
insert into jugadores (nombre,apellido,numero,fechanacimiento,pais_id,equipo_id) values
('Lionel',	'Messi',	10, '1987/06/24',2,  9),
('Cristiano','Ronaldo',	7,  '1985/02/05',18, 14),
('Neymar',	'Junior',	10, '1992/02/05',4,  24),
('Jan',		'Oblak',	13, '1993/01/07',10, 8),
('Kevin',	'De Bruyne',17, '1991/06/28',3,  4),
('Eden',	'Hazard',	7,  '1991/01/07',3,  10),
('Mohamed',	'Salah',	11, '1992/06/15',9,  3),
('Virgil',	'van Dijk',	4,  '1992/02/05',13, 3),
('Marc-André','ter Stegen',1,'1992/04/30',1, 9),
('Robert',	'Lewandowski',9,'1988/08/21',17, 17),
('Luka',	'Modric',	10, '1985/09/09',8,  10),
('Kylian',	'Mbappé',	7,  '1998/12/20',12, 24),
('NGolo',	'Kanté',	7,  '1991/03/29',12, 2),
('Alisson',	'Becker',	1,  '1992/10/02',4,  3),
('Harry',	'Kane',		10, '1993/07/28',15, 6),
('Kalidou',	'Koulibaly',26, '1991/06/20',19, 15),
('Antoine',	'Griezmann',17, '1991/03/21',12, 9),
('David',	'de Gea',	1,  '1990/11/07',11, 5),
('Sergio',	'Busquets',	5,  '1988/07/16',11, 9),
('Luis',	'Suárez',	9,  '1987/01/24',21, 9),
('Sergio',	'Ramos',	4,  '1986/03/30',11, 10),
('Sergio',	'Agüero',	10, '1988/06/02',2,  4),
('Giorgio',	'Chiellini',3,  '1984/08/14',16, 14),

('Ederson',	'Moraes',	31,	'1993/08/17',4,  4),
('Hugo',	'Lloris',	1,	'1986/12/26',12, 6),
('Manuel',	'Neuer',	1,	'1986/03/27',1,  17),
('Samir',	'Handanovic',1,	'1984/07/14',10, 13),
('Keylor',	'Navas',	1,	'1986/12/15',7,  24),
('Thibaut',	'Courtois',	1,	'1992/05/11',3,  10),
('Wojciech','Szczesny',	1,	'1990/04/18',17, 14),
('Gianluigi','Donnarumma',99,'1999/02/25',16,12),
('Anthony',	'Lopes',	1,	'1990/10/01',18, 22),
('Norberto','Neto',		13,	'1989/07/19',4,  9),
('Roman',	'Bürki',	1,	'1990/11/14',20, 18),
('Péter',	'Gulácsi',	1,	'1990/05/06',14, 20),

('Paulo',	'Dybala',	10,	'1993/11/15',2,  14),
('Ángel',	'Di María',	11,	'1988/02/14',2,  24),
('Mauro',	'Icardi',	18,	'1993/02/19',2,  24),
('Giovani',	'Lo Celso',	18,	'1996/04/09',2,  6),
('Nicolás',	'Tagliafico',31,'1992/08/31',2,  25),
('Nicolás',	'Otamendi',	30,	'1988/02/12',2,  4),
('Walter',	'Kannemann',4,	'1991/03/14',2,  40),
('Marcos',	'Rojo',		16,	'1990/03/20',2,  5),

('Lisandro','López',	15,	'1983/03/02',2,  33),
('Franco',	'Armani',	1,	'1986/10/16',2,  34),
('Esteban',	'Andrada',	1,	'1991/01/26',2,  31),
('Sergio',	'Romero',	22,	'1987/02/22',2,  5),
('Lucas',	'Pratto',	27,	'1988/06/04',2,  34),
('Iván',	'Marcone',	23,	'1990/06/03',2,  31),
('Eduardo',	'Salvio',	11,	'1990/07/13',2,  31),
('Daniele',	'de Rossi',	16,	'1983/07/24',16, 31),
('Juan F.',	'Quintero',	10,	'1993/01/18',6,  34),
('Marcelo',	'Díaz',		21,	'1986/12/30',5,  33),
('Exequiel','Palacios',	15,	'1998/10/05',2,  34),
('Gabriel',	'Arias',	1,	'1987/09/13',5,  33),
('Martín',	'Campaña',	25,	'1989/05/29',21, 32),
('Javier',	'Pinola',	22,	'1983/02/24',2,  34),
('Frank',	'Fabra',	18,	'1991/02/22',6,  31),

('Aymeric',	'Laporte',	14,	'1994/05/27',12, 4),
('Jan',		'Vertonghen',5,	'1987/04/24',3,  6),
('Samuel',	'Umtiti',	23,	'1993/11/14',12, 9),
('Clément',	'Lenglet',	15,	'1995/06/17',12, 9),
('Jordi',	'Alba',		18,	'1989/03/21',11, 9),
('Alex',	'Sandro',	12,	'1991/01/26',4,  14),
('Marcelo',	'Vieira',	12,	'1988/05/12',4,  10),
('Lucas',	'Hernández',21,	'1996/02/14',12, 17),
('Alex',	'Telles',	13,	'1992/12/15',4,  29),

('João',	'Félix',	7,	'1999/11/10',18, 8),
('Matthijs','de Ligt',	4,	'1999/08/12',13, 14),
('Vinícius','Júnior',	25,	'2000/07/12',4,  10),
('Jadon',	'Sancho',	7,	'2000/03/25',15, 18),
('Phil',	'Foden',	47,	'2000/05/28',15, 4),
('Rodrygo',	'Goes',		27,	'2001/01/09',4,  10),
('Kai',		'Havertz',	29,	'1999/06/11',1,  19),
('Callum',	'Hudson-Odoi',20,'2000/11/07',15,2),
('Nicolò',	'Zaniolo',	22,	'1999/07/02',16, 16),
('Ibrahima','Konaté',	6,	'1999/05/25',12, 20);

-- Stats
insert into stats
(jugador_id,posicion,pie,altura,peso,
ataque,defensa,pases,velocidad,tiro,
valoracion,potencial) values
(1,  'Delantero', 'Zurdo',		170,72, 99,40,95,85,93, 94,94), -- Messi
(2,  'Delantero', 'Diestro',	186,80, 97,35,86,86,94, 93,93), -- CR7
(3,  'Delantero', 'Diestro',	175,68, 91,46,92,90,86, 92,92), -- Neymar
(4,  'Arquero',	  'Diestro',	188,79, 30,97,61,65,55,	91,93), -- Oblak
(5,	 'Volante',	  'Diestro',	180,68,	90,56,97,77,85,	91,91),	-- KDB
(6,	 'Delantero', 'Diestro',	175,74,	90,45,84,87,83,	91,91), -- Hazard
(7,	 'Delantero', 'Zurdo',		175,71,	92,47,77,90,81,	90,90),	-- Salah
(8,	 'Defensor',  'Diestro',	196,92,	64,95,82,79,72,	90,91),	-- van Dijk
(9,  'Arquero',	  'Diestro',	187,85, 35,95,82,62,59,	90,93), -- ter Stegen
(10, 'Delantero', 'Diestro',	184,78,	97,49,76,80,90,	90,90), -- Lewa
(11, 'Volante',   'Diestro',	172,66,	84,65,92,81,78,	90,90),	-- Modric
(12, 'Delantero', 'Diestro',	178,73,	95,40,79,95,83,	89,95), -- Mbappé
(13, 'Volante',   'Diestro',	169,69,	66,83,75,86,72,	89,90),	-- Kanté
(14, 'Arquero',	  'Diestro',	191,91, 50,94,80,63,56,	89,91), -- Alisson
(15, 'Delantero', 'Diestro',	188,86,	93,45,85,75,91,	89,91), -- Kane
(16, 'Defensor',  'Diestro',	188,89,	63,91,81,81,63,	89,91), -- Koulibaly
(17, 'Delantero', 'Zurdo',		176,73,	92,58,83,84,86,	89,89),	-- Griezmann
(18, 'Arquero',   'Diestro',	190,73,	35,96,70,63,57,	89,90),	-- De Gea
(19, 'Volante',   'Diestro',	189,76,	70,85,88,70,66,	89,89),	-- Busquets
(20, 'Delantero', 'Diestro',	182,86,	91,47,80,74,90,	89,89), -- Suárez
(21, 'Defensor',  'Diestro',	184,82,	80,84,83,78,75,	89,89), -- Ramos
(22, 'Delantero', 'Diestro',	172,74,	95,34,77,84,89,	89,89), -- Agüero
(23, 'Defensor',  'Zurdo',		187,85,	65,95,79,78,72,	89,89),	-- Chiellini

(24, 'Arquero',	  'Zurdo',		188,89, 55,88,87,68,66,	88,91),	-- Ederson
(25, 'Arquero',   'Zurdo',		188,78, 30,92,62,64,57,	88,88),	-- Lloris
(26, 'Arquero',   'Diestro',	193,92, 40,97,73,69,63,	88,88),	-- Neuer
(27, 'Arquero',   'Diestro',	193,89, 30,92,63,59,56,	88,88),	-- Handanovic
(28, 'Arquero',   'Diestro',	184,78, 30,86,62,62,56,	87,87),	-- Navas
(29, 'Arquero',   'Zurdo',		199,96, 30,94,63,61,56,	87,88),	-- Courtois
(30, 'Arquero',   'Diestro',	196,85, 30,93,65,61,58,	86,88),	-- Szczesny
(31, 'Arquero',   'Diestro',	196,90, 30,85,61,63,55,	85,92),	-- Donnarumma
(32, 'Arquero',   'Zurdo',		184,81, 30,92,64,64,54,	85,87),	-- Lopes
(33, 'Arquero',   'Diestro',	190,84, 30,86,66,62,57,	85,86), -- Neto
(34, 'Arquero',   'Diestro',	187,83, 30,86,60,61,53,	85,86),	-- Bürki
(35, 'Arquero',   'Diestro',	192,90, 30,85,60,60,58,	85,86),	-- Gulácsi

(36, 'Delantero', 'Zurdo',		177,73, 84,52,81,82,90,	88,92),	-- Dybala
(37, 'Delantero', 'Zurdo',		180,75, 88,51,85,87,79,	86,86),	-- Di María
(38, 'Delantero', 'Diestro',	181,75, 91,33,75,77,87,	85,86),	-- Icardi
(39, 'Volante',   'Zurdo',		177,69, 81,61,83,78,80,	83,89),	-- Lo Celso
(40, 'Defensor',  'Zurdo',		171,67, 70,78,75,84,72,	83,84),	-- Tagliafico
(41, 'Defensor',  'Diestro',	181,80, 67,84,82,77,71,	82,82),	-- Otamendi
(42, 'Defensor',  'Zurdo',		183,78, 61,80,71,77,68,	80,80),	-- Kannemann
(43, 'Defensor',  'Zurdo',		186,82, 66,78,77,80,73,	78,78),	-- Rojo

(44, 'Delantero', 'Diestro',	174,74, 84,52,77,72,82, 81,81), -- Licha
(45, 'Arquero',   'Diestro',	188,88, 30,85,65,62,57, 80,80), -- Armani
(46, 'Arquero',   'Diestro',	193,82, 35,81,71,65,56, 80,83), -- Andrada
(47, 'Arquero',	  'Diestro',	192,87, 30,78,66,69,58,	80,80), -- Romero
(48, 'Delantero', 'Diestro',	188,82,	82,52,77,77,81,	80,80),	-- Pratto
(49, 'Volante',   'Diestro',	181,78,	61,75,82,72,65,	80,80), -- Marcone
(50, 'Volante',   'Diestro',	171,70,	77,46,78,86,80,	80,80),	-- Salvio
(51, 'Volante',   'Diestro',	184,83,	70,81,85,67,76,	82,82),	-- de Rossi
(52, 'Volante',	  'Zurdo',		168,63, 77,35,91,76,80,	80,83), -- Quintero
(53, 'Volante',   'Diestro',	166,67,	71,65,84,64,74,	80,80), -- M. Díaz
(54, 'Volante',   'Diestro',	178,78,	70,62,79,80,76,	78,88),	-- Palacios
(55, 'Arquero',   'Diestro',	187,88,	30,83,56,63,57,	78,78), -- Arias
(56, 'Arquero',   'Diestro',	186,75,	30,84,75,65,54,	78,78),	-- Campaña
(57, 'Defensor',  'Zurdo',		182,81, 68,77,77,76,72,	78,78), -- Pinola
(58, 'Defensor',  'Zurdo',		173,78,	75,57,74,82,74,	77,77), -- Fabra

(59, 'Defensor',  'Zurdo',		189,85,	66,88,84,79,65,	87,90), -- Laporte
(60, 'Defensor',  'Zurdo',		189,88,	67,89,82,76,74,	87,87),	-- Vertonghen
(61, 'Defensor',  'Zurdo',		182,75,	64,85,77,78,69,	86,89),	-- Umtiti
(62, 'Defensor',  'Zurdo',		186,81,	55,86,82,74,61,	85,89),	-- Lenglet
(63, 'Defensor',  'Zurdo',		170,68,	83,65,83,91,72,	87,87), -- J. Alba
(64, 'Defensor',  'Zurdo',		181,81,	73,68,81,84,73,	85,85), -- A. Sandro
(65, 'Defensor',  'Zurdo',		172,73,	82,63,84,83,74,	85,85), -- Marcelo
(66, 'Defensor',  'Zurdo',		184,76,	65,86,76,78,60,	84,89),	-- L. Hernández
(67, 'Defensor',  'Zurdo',		181,71, 75,62,82,83,70,	84,86),	-- A. Telles

(68, 'Delantero', 'Diestro',	180,70, 86,50,77,79,81,	80,93),	-- J. Félix
(69, 'Defensor',  'Diestro',	189,89, 66,80,78,77,73,	85,93),	-- de Ligt
(70, 'Delantero', 'Diestro',	177,67, 72,40,76,92,71,	79,92),	-- Vinícius
(71, 'Volante',   'Diestro',	180,76, 81,42,79,85,77,	84,92),	-- Sancho
(72, 'Volante',   'Zurdo',		171,59, 75,41,75,83,67,	76,90),	-- Foden
(73, 'Delantero', 'Diestro',	173,63, 70,30,66,88,71,	76,89),	-- Rodrygo
(74, 'Volante',   'Zurdo',		186,70, 81,44,81,79,79,	84,92),	-- Havertz
(75, 'Delantero', 'Diestro',	182,76, 74,44,77,89,71,	74,88),	-- Hudson-Odoi
(76, 'Volante',   'Zurdo',		190,78, 76,53,80,79,79,	74,88), -- Zaniolo
(77, 'Defensor',  'Diestro',	192,93, 63,82,75,77,61,	79,88);	-- Konaté

