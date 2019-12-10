CREATE TABLE league (
    id    integer PRIMARY KEY,
    name   varchar NOT NULL CHECK (name <> ''),
    homeTeamType varchar,
    hasOfferings boolean,
    container varchar,
    allowRoundRobins boolean,
    leagueSpecialsCount integer,
    eventSpecialsCount integer,
    eventCount integer
);

ALTER TABLE pinnacle.league
    OWNER to postgres;
