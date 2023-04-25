-- two dashes for comments in sql 

-- CRUD 
-- C - create - INSERT INTO
-- R - read - SELECT
-- U - update - UPDATE
-- D - delete - DELETE

DROP TABLE movies;
-- everytime we run our file it deletes the table and creates it again every time otherwise you'd be trying to override it each time and would present errors

--------- CREATE--------
-- movies (table)

CREATE TABLE movies (
    id SERIAL, 
    title VARCHAR(255),
    duration INT, -- NOT NULL
    rating VARCHAR(255)
);
-- the (255) can be any number, represent the length od the string
-- no comma at the end - ie rating VARCHAR(255) has no comma at the end - just like a sentence and a semicolon at the end of the ()

INSERT INTO movies (title, duration, rating) VALUES ('Alien', 117, '18');
INSERT INTO movies (title, duration, rating) VALUES ('The Imitation Game', 114, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('Iron Man', 126, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('The Martian', 144, '12A');

INSERT INTO movies (title, rating) VALUES ('Braveheart', 'PG');

INSERT INTO movies (title, duration, rating) VALUES ('Guardians of the Galaxy', 121, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('You Only Live Twice', 117, 'PG');
INSERT INTO movies (title, duration, rating) VALUES ('I Know What You Did Last Summer', 101, '18');

-- INSERT INTO creates a row in the table
-- only pass variables we have to manually put in
-- only '' for VARCHAR not "" like Java

-- INSERT INto will pass incomplete values unless you put 'NOT NULL' after variable in the top - INT NOT NULL - wont allow insertion of braveheart


------ SELECT --------
SELECT * FROM movies;
-- SELECT query - how we get information back out of the database
----- asterisk in sql called a wildcard, means anything or everything - tranlation of line above (select everything from movies table)
----- has to be on the bottom of updates

-- SELECT title FROM movies;
----- instead of wildcard * - can input title or other variable to show values for just that variable 

-- SELECT * FROM movies WHERE rating = 'PG';
----- adding WHERE will return all variables (wildcard) where the rating are PG
----- should only return braveheart

-- SELECT * FROM movies WHERE duration > 120;
----- will show all movies where the duration is above 120 minutes by adding the > symbol
----- NOT keyword also exists if you find the correct syntax 

------- UPDATE -----------
-- UPDATE movies SET (duration, rating) = (178, '12A') WHERE id = 5;
-- SELECT * FROM movies;
------ updating braveheart with a duration and its rating with a new rating 

-- SELECT * FROM movies WHERE duration IS NULL;
-- UPDATE movies SET duration = 0 WHERE duration IS NULL;
-- SELECT * FROM movies;
----- will show you all the movies where there is no value for duration
----- second would return 0 instead of null for all movies without a duration

--------- DELETE ----------
--DELETE FROM movies WHERE id  = 5;
--SELECT * FROM movies;
----- will delete all movies where the id is 5 - would get rid of braveheart - be careful with this one



--------- Searching through database ---------
-- SELECT * FROM movies WHERE title = 'You';
----- will give you only films called You - wont return anything

-- SELECT * FROM movies WHERE LOWER (title) LIKE LOWER ('%The%');
----- partial matching 'fuzzy matching' to any film with word in it
----- case sensitive
----- will give us matches to anything with The% then stuff after it "The Martial"
----- %The% - films with words before and after The 
----- %The - films with word The at the end of the title

----- LOWER and then wrapping will show both upper case and lower case 
----- ILIKE too but less efficient


-- SELECT * FROM movies ORDER BY duration; 
----- will show movies ascending duration time (can add ASC for ascending but its asc by default)
----- adding DESC to the end after duration will provide then in descending order 

-- SELECT * FROM movies WHERE rating = '12A' ORDER By duration ASC;
----- will show all movies with 12A rating in ascending order of duration 


-------- AGGREGATE FUNCTIONS -----------
--COUNT, SUM, AVG among others

--SELECT COUNT() FROM movies; 
----- COUNT is a method and needs values to be passed into ()
----- (*) this will count everything in our query 

--SELECT DISTINCT rating FROM movies; 
--SELECT COUNT(DISTINCT rating) FROM movies;
----- if we wanted to count how many different types of raating data there are 
----- will show 12A, 18, PG in a samll rating table it makes 
----- we can COUNT the number of DISTINCT ratings there are by passing (DISTINCT rating) into the ()
----- this would return 3

-- SELECT rating, COUNT(rating) FROM movies; - ERROR wont work as you need to add group by or 
----- if we want to count how many films are in each of the rating values, how many films are 12A?
-- SELECT rating FROM movies GROUP BY rating;
----- this will work and will show you 
----- this is similar to the DISTINCT method but DISTINCT only shows info for the different type of rating 
----- whereas GROUP BY has access to the whole table and can now see how many films are in each rating 
-- SELECT rating, COUNT (*) FROM movies GROUP BY rating;
----- better alternative to first line  
----- will give rating type on one side of table and how many in each rating on other side

-- SELECT rating, AVG(duration) FROM movies GROUP BY rating;
----- will give you same as above but with the average duration of movies within each rating
-- SELECT rating, AVG(duration) FROM movies GROUP BY rating ORDER BY rating ASC;
-- SELECT rating, AVG(duration) FROM movies GROUP BY rating ORDER BY AVG(duration) DESC;
----- will order your rating in asc default unless you put DESC at the end instead
----- second will order by average duration - longest first


-- REMEMBER!!! cant use an aggregate function unless you use a GROUP BY (GROUP BY the column outside the aggregate function - so SELECT 'rating' ...... GROUP BY 'rating;)


--------- ORDER & LIMIT --------
----- you want to be transferring the least amount of data from and to SQL and Java 
----- you use these commands to avoid sending the whole database and eating up your bandwidth and storage 

-- SELECT * FROM movies ORDER BY duration ASC;
-- SELECT * FROM movies ORDER BY duration ASC LIMIT 3;
----- we can use the LIMIT keyword to reduce the amount of data we send 
----- top line will give all the movies in order of duration
----- second line will give the 3 top shortest films in order of duration to limit amount of data used and sent 


-- can store anything in SQL, links, images, files, text literally anything and is used in web development worldwide 
-- better to save a link to an image for future reference 


