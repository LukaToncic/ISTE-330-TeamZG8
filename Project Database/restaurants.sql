DROP DATABASE IF EXISTS restaurants;
CREATE DATABASE restaurants;
USE restaurants;

-- restaurant with name, address, type of served food (origin), menu number
CREATE TABLE restaurant(
	rID int NOT NULL DEFAULT '0000',
    rName varchar(50) NOT NULL,
    rAddress varchar(100) NOT NULL,
    rOrigin varchar(50) NOT NULL,
    mNumber int NOT NULL,
    PRIMARY KEY (rID),
    CONSTRAINT menuNumber FOREIGN KEY (mNumber) REFERENCES menu (mNumber)
);
DROP TABLE restaurant;

-- menu with name, type of food (origin), and names of food
-- TODO: create multiple menus for every food origin
CREATE TABLE menu(
	mNumber int NOT NULL default '1',
    fName varchar(50),
	KEY (mNumber),
	CONSTRAINT foodName FOREIGN KEY (fName) REFERENCES food (fName)
);
DROP TABLE menu;

-- food with name and origin
-- TODO: create some foods to insert into menus
CREATE TABLE food(
	fName varchar(50) NOT NULL,
    fOrigin varchar(20) NOT NULL,
    KEY(fOrigin),
    KEY(fName)
);
DROP TABLE food;


-- populate
INSERT INTO restaurant VALUES('0001', 'Murican Steakhouse', 'Street Street 01', 'American', '1'), ('0002', "Mama Mia's", 'Lil Italy 13', 'Italian', '2');

INSERT INTO menu VALUES('1', 'Steak'), ('1', 'Hamburger'), ('2', 'Pizza'), ('2', 'Carbonara');

INSERT INTO food VALUES('Steak', 'American'), ('Hamburger', 'American'), ('Pizza', 'Italian'), ('Carbonara', 'Italian');