DROP SCHEMA IF EXISTS oblig3 CASCADE;


CREATE SCHEMA oblig3;

CREATE TABLE oblig3.party (
    id INTEGER,
    CONSTRAINT plPK PRIMARY KEY (id)
);

CREATE TABLE oblig3.participant (
	phone VARCHAR(8),
    gender VARCHAR(6),
    firstname VARCHAR(20),
	lastname VARCHAR(20),
    hashedpwd VARCHAR,
    PARTY_ID INTEGER,
    CONSTRAINT pPK PRIMARY KEY (phone),
    CONSTRAINT fk FOREIGN KEY (PARTY_ID) REFERENCES oblig3.party(id)
);

INSERT INTO oblig3.party (id) values (1);