INSERT INTO CUSTOMER(ID, EMAIL, PASSWORD, BALANCE, NAME) VALUES
(1, 'user', 'xx7hfcrcLSr979', 1000, 'Artsiom');

INSERT INTO FOOD(ID, CALORIE, CATEGORY, DESCRIPTION, NAME, PRICE) VALUES
(1, 558, 'MEAL', 'Fideua', 'Fideua', 15),
(2, 379, 'MEAL', 'Paella', 'Paella', 13),
(3, 278, 'MEAL', 'Tortilla', 'Tortilla', 10),
(4, 162, 'MEAL', 'Gazpacho', 'Gazpacho', 8),
(5, 470, 'MEAL', 'Quesadilla', 'Quesadilla', 13);


create table users(
                      username varchar_ignorecase(50) not null primary key,
                      password varchar_ignorecase(500) not null,
                      enabled boolean not null
);

create table authorities (
                             username varchar_ignorecase(50) not null,
                             authority varchar_ignorecase(50) not null,
                             constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);


INSERT INTO users (username, password, enabled) values ('user','{bcrypt}$2a$10$uTlh2juIVyMuqR0NBp.gEegXXOWN8Z9XSJIUrLIorc3d9Su6RlSY.',true);
INSERT INTO users (username, password, enabled) values ('admin','{bcrypt}$2a$10$iqqBJWS8JrPD4E6MYzh4W.jg1BttS1MThwCzRnrTkd.O93kW4EVGW',true);

INSERT INTO authorities (username, authority) values ('user','ROLE_USER');
INSERT INTO authorities (username, authority) values ('admin','ROLE_ADMIN');

