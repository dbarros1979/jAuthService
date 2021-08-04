CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    Email VARCHAR(255) UNIQUE NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    avatar VARCHAR(100) NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS profiles
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS usersprofiles
(
    id SERIAL PRIMARY KEY,
    idusers INT NOT NULL,
    idprofiles INT NOT NULL,
    active INT NOT NULL,
    FOREIGN KEY (idusers) REFERENCES users (id),
    FOREIGN KEY (idprofiles) REFERENCES profiles (id)
);

CREATE TABLE IF NOT EXISTS permissions
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS profilespermissions
(
    id SERIAL PRIMARY KEY,
    idprofiles INT NOT NULL,
    idpermissions INT NOT NULL,
    active INT NOT NULL,
    FOREIGN KEY (idprofiles) REFERENCES profiles (id),
    FOREIGN KEY (idpermissions) REFERENCES permissions (id)
);