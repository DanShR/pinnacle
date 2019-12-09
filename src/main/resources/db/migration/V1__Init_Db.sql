CREATE TABLE sport (
                       id    integer PRIMARY KEY,
                       name   varchar NOT NULL CHECK (name <> '')
);

ALTER TABLE pinnacle.sport
    OWNER to postgres;
