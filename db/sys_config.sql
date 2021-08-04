DO $$
BEGIN
    INSERT INTO users(email, firstname, surname, active) VALUES ('admin@wpd.com', 'admin', 'wpd', 1);
END $$;
