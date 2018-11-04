DROP SCHEMA IF EXISTS oblig3 CASCADE;


CREATE SCHEMA oblig3;

CREATE TABLE oblig3.party (
    id INTEGER,
    CONSTRAINT plPK PRIMARY KEY (id)
);

CREATE TABLE oblig3.participant (
	phone VARCHAR(8),
    gender VARCHAR(6),
    fullname VARCHAR(20),
    hashedpwd VARCHAR,
    PARTICIPANTLIST_ID INTEGER,
    CONSTRAINT pPK PRIMARY KEY (phone),
    CONSTRAINT fk FOREIGN KEY (PARTICIPANTLIST_ID) REFERENCES oblig3.party(id)
);

INSERT INTO oblig3.party (id) values (1);