CREATE TABLE sport (
    id    integer PRIMARY KEY,
    name   varchar NOT NULL CHECK (name <> ''),
    hasOfferings BOOLEAN,
    leagueSpecialsCount integer ,
    eventSpecialsCount integer ,
    eventCount integer
);

ALTER TABLE pinnacle.sport
    OWNER to postgres;
