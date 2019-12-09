CREATE TABLE IF NOT EXISTS pinnacle.sport
(
    id integer ,
    name varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE pinnacle.sport
    OWNER to postgres;
