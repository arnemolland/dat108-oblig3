DROP TABLE IF EXISTS participants,participantlist;

CREATE TABLE participantlist (
    id INTEGER,
    PRIMARY KEY (id)
);

CREATE TABLE participants (
    gender VARCHAR(6),
    fullname VARCHAR(20),
    hashedpwd VARCHAR,
    phone VARCHAR(8),
    PARTICIPANTLIST_ID INTEGER,
    PRIMARY KEY (phone),
    CONSTRAINT fk FOREIGN KEY (PARTICIPANTLIST_ID) REFERENCES participantlist(id)
);

INSERT INTO participantlist (id) values (1);