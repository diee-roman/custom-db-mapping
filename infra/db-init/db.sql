CREATE TABLE account (
                          user_id serial PRIMARY KEY,
                          username VARCHAR ( 50 ) UNIQUE NOT NULL,
                          password VARCHAR ( 50 ) NOT NULL,
                          email VARCHAR ( 255 ) UNIQUE NOT NULL,
                          created_on TIMESTAMP NOT NULL,
                          last_login TIMESTAMP,
                          roles text[]
);

INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (1, 'pepe', 'asdasd', 'asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (4, 'pepe1', 'asdasd', 'asd1@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (5, 'pepe2', 'asdasd', '2asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (6, 'pepe3', 'asdasd', '3asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (7, 'pepe4', 'asdasd', '4asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (8, 'pepe5', 'asdasd', '5asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
INSERT INTO public.account (user_id, username, password, email, created_on, last_login, roles) VALUES (9, 'pepe6', 'asdasd', '6asd@email.provider', '2022-02-18 19:46:57.000000', '2022-02-18 19:47:00.000000', '{1,2,3}');
