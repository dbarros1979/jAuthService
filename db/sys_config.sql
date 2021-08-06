DO $$
DECLARE 
idrolesinserted bigint;
idusersinserted  bigint;
BEGIN
    INSERT INTO roles(name, active) VALUES ('ROLE_ADMIN', 1)
        RETURNING id INTO idrolesinserted;
    INSERT INTO users(name, password, active) VALUES ('admin@email.com', 'pwd', 'wpd', 1)
        RETURNING id INTO idusersinserted;
    INSERT INTO usersroles(idusers, idroles, active) VALUES (idusersinserted, idrolesinserted, 1);

    
    INSERT INTO roles(name, active) VALUES ('ROLE_CLIENT', 1);
END $$;
