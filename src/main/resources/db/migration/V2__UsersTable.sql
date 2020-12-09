ALTER TABLE users
ADD COLUMN username VARCHAR(100),
ADD COLUMN role VARCHAR(100),
ADD COLUMN password VARCHAR,
ADD COLUMN enabled boolean;

UPDATE users
SET username = 'chatse', role = 'ADMIN', password = '1234', enabled = true
WHERE name ='bebino' AND firstname = 'chatsss';

UPDATE users
SET username = 'groot', role ='ADMIN', password = '1234', enabled =true
WHERE name = 'tarde' AND firstname = 'grootse';


ALTER TABLE users
ALTER COLUMN username SET NOT NULL,
ALTER COLUMN role SET NOT NULL,
ALTER COLUMN password SET NOT NULL,
ALTER COLUMN enabled SET NOT NULL;

