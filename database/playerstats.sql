DROP TABLE IF EXISTS player_stats;


CREATE TABLE player_stats (
player_id SERIAL NOT NULL PRIMARY KEY
, player_name VARCHAR(75) NOT NULL
, position VARCHAR(20) NOT NULL
, points_per_game VARCHAR(4) NOT NULL
, assists_per_game VARCHAR (4) NOT NULL
, rebounds_per_game VARCHAR(4) NOT NULL
, field_goal_percentage VARCHAR(4) NOT NULL
, three_point_percentage VARCHAR(4) NOT NULL
, free_throw_percentage VARCHAR(4) NOT NULL
 );


 INSERT INTO player_stats (player_name, position, points_per_game, assists_per_game, rebounds_per_game, field_goal_percentage, three_point_percentage, free_throw_percentage)
 VALUES ('Jayson Tatum', 'Forward-Guard', '30.2', '4.8', '8.8', '46.2', '35.0', '86.3'),
 		('Jaylen Brown', 'Guard-Forward', '26.5', '3.3', '6.9', '48.7', '33.8', '77.2'),
		('Marcus Smart', 'Guard', '11.4', '6.8', '3.4', '42.3', '33.6', '77.4'),
		('Robert Williams', 'Center-Forward', '8.4', '1.5', '8.6', '75.0', '0.0', '62.5'),
		('Al Horford', 'Center-Forward', '9.6', '2.7', '6.2', '48.1','44.5', '73.7'),
		('Derrick White', 'Guard', '11.9', '3.8', '3.3', '45.7', '37.6', '86.8'),
		('Grant WIlliams', 'Forward', '8.3', '1.8', '4.7', '45.6', '40.4', '82.0'),
		('Sam Hauser', 'Forward', '6.2', '0.7', '2.5', '45.8', '41.9', '66.7'),
		('Payton Pritchard', 'Guard', '4.7', '1.0', '1.5', '39.6', '33.9', '69.2'),
		('Malcom Brogdon', 'Guard', '14.6', '3.7', '4.1', '48.8', '46.0', '88.7'),
		('Mike Muscala', 'Forward-Center', '7.2', '0.3', '3.2', '44.4', '37.0', '50.0'),
		('Luke Kornet', 'Center', '3.7', '0.7', '2.8', '69.7', '33.3', '85.3'),
		('Blake Griffin', 'Forward', '4.7', '1.3', '3.3', '50.0', '38.8', '62.5');


--			SELECT * FROM player_stats;

