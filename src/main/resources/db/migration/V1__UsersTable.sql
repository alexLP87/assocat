CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE  users(
    id UUID NOT NULL DEFAULT uuid_generate_v1(),
    CONSTRAINT user_pkey_ PRIMARY KEY (id),
    name VARCHAR(100) NOT NULL,
    firstname VARCHAR (100) NOT NULL
);

CREATE TABLE cats(
    id UUID NOT NULL DEFAULT uuid_generate_v1(),
    CONSTRAINT cat_pkey_ PRIMARY KEY (id),
    name VARCHAR(100) NOT NULL,
    race VARCHAR (100) NOT NULL
);

INSERT INTO users (name, firstname) VALUES (
 'bebino', 'chatsss'
);
INSERT INTO users (name, firstname) VALUES (
 'tarde', 'grootse'
  );

INSERT INTO cats (name, race) VALUES (
'Guemongue', 'PERSAN'
 );

INSERT INTO cats (name, race) VALUES (
'Groslo', 'EUROPEEN'
);

