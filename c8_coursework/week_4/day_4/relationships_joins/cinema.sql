DROP TABLE IF EXISTS castings;
DROP TABLE IF EXISTS actors;
DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors;
-- cant drop directors first otherwise error, because movies depends on directors being as its being referenced in movies

-- drop the dependencies last but
-- create dependencies first 

CREATE TABLE directors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    duration INT, 
    rating VARCHAR(10),
    director_id INT REFERENCES directors(id)
);
--have to put REFERENCES then reference the table(column) - cant reference something you haven't made yet 
--references the directors table but the table has to be above otherwise it won't see it

INSERT INTO directors (name) VALUES ('Ridley Scott');
INSERT INTO directors (name) VALUES ('Morten Tyldum');
INSERT INTO directors (name) VALUES ('Jon Favreau');
INSERT INTO directors (name) VALUES ('Steven Spielberg');

INSERT INTO movies (title, duration, rating, director_id) VALUES ('Alien', 117, '18', 1);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('The Imitation Game', 114, '12A', 2);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('Iron Man', 126, '12A', 3);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('The Martian', 144, '12A', 1);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('Dr Strange', 130, '15A', 4);

-- different relationships --
----- many to one - 
----- many to many - need to have a join table when used 
----- one to one - limited use cases 

CREATE TABLE actors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO actors (name) VALUES ('Sigourney Weaver');
INSERT INTO actors (name) VALUES ('Benedict Cumberbatch');
INSERT INTO actors (name) VALUES ('Robert Downey Jr');
INSERT INTO actors (name) VALUES ('Gwyneth Paltrow');
INSERT INTO actors (name) VALUES ('John Boyega');

---JOIN TABLE - for many to many relationship

--CREATE TABLE castings (
    --movie_id INT,
    --actor_id INT  
--); 
-- a join table should and would usually look like this but for purpose of class:

CREATE TABLE castings (
    id SERIAL PRIMARY KEY,
    movie_id INT REFERENCES movies(id),
    actor_id INT REFERENCES actors(id),
    character_name VARCHAR(255)  
);

INSERT INTO castings (movie_id, actor_id, character_name) VALUES (1, 1, 'Ripley');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (2, 2, 'Alan Turing');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (3, 3, 'Tony Stark');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (3, 4, 'Pepper Potts');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 2, 'Dr Strange');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 3, 'Tony Stark');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 4, 'Pepper Potts');



-- JOINERS

-- left join - every row on left and corresponding data on right
-- right join - every row on right and corresponding data of left
-- inner join - no redundancy


--select * from directors 
--left join movies
--on directors.id = movies.director_id;
----- this would produce the directors values on the left side of the movies values
----- last line = if directors.id matches the director_id in moviees then create an entry 

----- two joined columns look like one 
----- can rename them like this: using as
--select directors.name as director, movies.title as movie, movies.rating from directors 
--left join movies
--on directors.id = movies.director_id
--where movies.duration < 120;

--always aim for cleaner data by renaming 
select actors.name as actor, castings.character_name as character, movies.title as movie from actors
inner join castings
on actors.id = castings.actor_id
inner join movies
on castings.movie_id = movies.id;
-- inner joining actors with casting and then inner joining castings with movies