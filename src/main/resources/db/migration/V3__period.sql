CREATE TABLE period (

number integer primary key ,
description varchar,
shortDescription varchar,
spreadDescription varchar,
moneylineDescription varchar,
totalDescription varchar,
team1TotalDescription varchar,
team2TotalDescription varchar,
spreadShortDescription varchar,
moneylineShortDescription varchar,
totalShortDescription varchar,
team1TotalShortDescription varchar,
team2TotalShortDescription varchar
);

ALTER TABLE pinnacle.period
    OWNER to postgres;
