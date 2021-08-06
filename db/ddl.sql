CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NULL,
    firstname VARCHAR(100) NULL,
    surname VARCHAR(100) NULL,
    avatar VARCHAR(100) NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS roles
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS usersroles
(
    id SERIAL PRIMARY KEY,
    idusers INT NOT NULL,
    idroles INT NOT NULL,
    active INT NOT NULL,
    FOREIGN KEY (idusers) REFERENCES users (id),
    FOREIGN KEY (idroles) REFERENCES roles (id)
);
