CREATE TABLE IF NOT EXISTS pinnacle.league
(
    id integer NOT NULL ,
    name char not NULL,
    PRIMARY KEY (id)
);

ALTER TABLE pinnacle.sport
    OWNER to postgres;