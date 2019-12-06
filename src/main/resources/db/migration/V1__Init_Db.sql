CREATE TABLE IF NOT EXISTS pinnacle.sport
(
    id integer NOT NULL ,
    PRIMARY KEY (id)
);

ALTER TABLE pinnacle.sport
    OWNER to postgres;