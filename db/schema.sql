-- noinspection SqlNoDataSourceInspectionForFile

CREATE
EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE account
(
	accountId            serial PRIMARY KEY,
	id                   uuid                         DEFAULT uuid_generate_v4(),
	username             VARCHAR(255),
	userpass             VARCHAR(255),
	emailAddress         VARCHAR(255) UNIQUE NOT NULL,
	accountStatusId      INTEGER             NOT NULL DEFAULT 0,
	dateCreated          TIMESTAMP           NOT NULL,
	dateLastLogin        TIMESTAMP,
	dateTokenExpires     TIMESTAMP,
	dateLocked           TIMESTAMP,
	dateProbationExpires TIMESTAMP
);

CREATE TABLE lastRead
(
	lastReadId serial PRIMARY KEY,
	accountId  INTEGER NOT NULL,
	storyId    INTEGER NOT NULL,
	chapterId  INTEGER NOT NULL,
	location   VARCHAR(25)
);

CREATE TABLE story
(
	storyId       serial PRIMARY KEY,
	id            uuid                  DEFAULT uuid_generate_v4(),
	accountId     INTEGER      NOT NULL,

	storyStatusId INTEGER      NOT NULL DEFAULT 0,
	wordCount     INTEGER      NOT NULL DEFAULT 0,
	title         VARCHAR(255) NOT NULL,
	titleSorted   VARCHAR(255) NOT NULL,

	summary       TEXT,
	notes         TEXT,

	dateCreated   TIMESTAMP    NOT NULL,
	dateModified  TIMESTAMP,
	dateArchived  TIMESTAMP

);

CREATE TABLE chapter
(
	chapterId       serial PRIMARY KEY,
	id              uuid                  DEFAULT uuid_generate_v4(),
	storyId         INTEGER      NOT NULL,
	accountId       INTEGER      NOT NULL,

	chapterStatusId INTEGER      NOT NULL DEFAULT 0,
	chapterNumber   INTEGER      NOT NULL DEFAULT 1,
	wordCount       INTEGER      NOT NULL DEFAULT 0,

	title           VARCHAR(255) NOT NULL,
	summary         VARCHAR(1000),
	content         TEXT,
	notes           TEXT,

	dateCreated     TIMESTAMP    NOT NULL,
	datePublished   TIMESTAMP,
	dateModified    TIMESTAMP,
	dateArchived    TIMESTAMP,

);
