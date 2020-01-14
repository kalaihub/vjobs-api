DROP DATABASE IF EXISTS vj__db;

CREATE DATABASE vj__db
    WITH OWNER = vj__owner;

DROP SCHEMA IF EXISTS vj__schema;

CREATE SCHEMA vj__schema
    AUTHORIZATION vj__owner;