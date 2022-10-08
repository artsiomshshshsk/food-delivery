INSERT INTO CUSTOMER(ID, EMAIL, PASSWORD, BALANCE, NAME) VALUES (1, 'a', 'a', 100, 'quicklogin'),
(2, 'test_user@epam.com', 'XpQC6C4bfqF4ds', 100, 'Test User'),
(3, 'test_user1@epam.com', 'KMtEd2YQmM84EP', 0, 'Test User 1'),
(4, 'test_user2@epam.com', 'aZYyrmsmQ5PTcf', 50, 'Test User 2'),
(5, 'test_user3@epam.com', 'xMWsiLqu6Yph2u', 16.1, 'Test User 3'),
(6, 'test_user4@epam.com', 'qMDQX9m9xn2mAH', 200, 'Test User 4'),
(7, 'test_user5@epam.com', 'e3RZjfcWbH3VvR', 1, 'Test User 5'),
(8, 'test_user6@epam.com', 'dcpxZX3V6NJ5E3', 9, 'Test User 6'),
(9, 'test_user7@epam.com', 'umuQ8meYRDTA39', 66, 'Test User 7'),
(10, 'test_user8@epam.com', 'rDbYUYd7avU47A', 1000, 'Test User 8'),
(11, 'test_user9@epam.com', 'gG3pdVYdQoVVFS', 0, 'Test User 9'),
(12, 'test_user10@epam.com', '6v6UwWzkyxw9oZ', 63, 'Test User 10'),
(13, 'test_user11@epam.com', 'Lo5DfPiAgqkmGx', 31, 'Test User 11'),
(14, 'test_user12@epam.com', 'dwqPk5Y3KUdEPa', 86, 'Test User 12'),
(15, 'test_user13@epam.com', '5wxKVBHZxzTL7r', 32.9, 'Test User 13'),
(16, 'test_user14@epam.com', 'Fv84dVypppzUQF', 24, 'Test User 14'),
(17, 'test_user15@epam.com', 'LWyjr58n9wbHqU', 3, 'Test User 15'),
(18, 'test_user16@epam.com', 'yQnVdt2hYhB5Fp', 356, 'Test User 16'),
(19, 'test_user17@epam.com', 'xx7hfcrcLSr979', 354.68, 'Test User 17'),
(20, 'test_user18@epam.com', 't8bkVh79CZ84EK', 96.14, 'Test User 18');

INSERT INTO FOOD(ID, CALORIE, CATEGORY, DESCRIPTION, NAME, PRICE) VALUES (1, 558, 'MEAL', 'Fideua', 'Fideua', 15),
(2, 379, 'MEAL', 'Paella', 'Paella', 13),
(3, 278, 'MEAL', 'Tortilla', 'Tortilla', 10),
(4, 162, 'MEAL', 'Gazpacho', 'Gazpacho', 8),
(5, 470, 'MEAL', 'Quesadilla', 'Quesadilla', 13);

INSERT INTO _ORDER(ID, PRICE, TIMESTAMP_CREATED, CUSTOMER_ID) VALUES (1, 36, TIMESTAMP '2019-06-28 23:09:00', 20),
(2, 91, TIMESTAMP '2021-12-11 15:29:00', 10),
(3, 39, TIMESTAMP '2020-08-20 04:30:00', 6),
(4, 114, TIMESTAMP '2019-09-11 02:03:00', 16),
(5, 42, TIMESTAMP '2019-08-28 17:17:00', 20),
(6, 30, TIMESTAMP '2019-08-02 22:09:00', 10),
(7, 106, TIMESTAMP '2021-06-26 15:54:00', 11),
(8, 80, TIMESTAMP '2021-05-04 18:27:00', 12),
(9, 113, TIMESTAMP '2020-07-21 21:17:00', 6),
(10, 39, TIMESTAMP '2019-08-02 03:33:00', 15),
(11, 13, TIMESTAMP '2021-03-14 04:17:00', 8),
(12, 89, TIMESTAMP '2021-06-28 18:52:00', 6),
(13, 10, TIMESTAMP '2019-09-03 11:13:00', 8),
(14, 42, TIMESTAMP '2019-06-11 11:57:00', 2),
(15, 29, TIMESTAMP '2021-09-28 08:02:00', 11),
(16, 39, TIMESTAMP '2019-08-30 09:57:00', 10),
(17, 45, TIMESTAMP '2020-06-15 16:02:00', 9),
(18, 30, TIMESTAMP '2019-08-21 22:21:00', 5),
(19, 96, TIMESTAMP '2021-07-08 09:20:00', 5),
(20, 62, TIMESTAMP '2020-02-17 12:23:00', 12),
(21, 111, TIMESTAMP '2021-12-02 23:00:00', 9),
(22, 28, TIMESTAMP '2020-01-18 21:36:00', 2),
(23, 63, TIMESTAMP '2021-07-14 23:53:00', 8),
(24, 72, TIMESTAMP '2020-12-06 22:20:00', 11),
(25, 41, TIMESTAMP '2020-09-01 00:28:00', 18),
(26, 20, TIMESTAMP '2021-10-29 16:53:00', 17),
(27, 30, TIMESTAMP '2020-08-01 14:13:00', 20),
(28, 75, TIMESTAMP '2021-03-10 10:22:00', 13),
(29, 30, TIMESTAMP '2020-04-18 17:24:00', 8),
(30, 92, TIMESTAMP '2019-05-06 01:22:00', 5),
(31, 104, TIMESTAMP '2019-09-11 14:23:00', 2),
(32, 81, TIMESTAMP '2021-01-29 15:32:00', 3),
(33, 13, TIMESTAMP '2021-03-19 19:48:00', 18),
(34, 56, TIMESTAMP '2019-12-03 05:37:00', 10),
(35, 95, TIMESTAMP '2020-11-10 13:42:00', 19),
(36, 41, TIMESTAMP '2021-10-15 20:23:00', 11),
(37, 105, TIMESTAMP '2021-11-19 16:03:00', 20),
(38, 79, TIMESTAMP '2020-09-25 17:36:00', 14),
(39, 56, TIMESTAMP '2019-05-04 22:02:00', 19),
(40, 91, TIMESTAMP '2021-01-24 21:15:00', 17);

INSERT INTO ORDER_ITEM(ID, PIECES, PRICE, FOOD_ID, ORDER_ID) VALUES (1, 2, 20, 3, 1),
(2, 2, 16, 4, 1),
(3, 2, 16, 4, 2),
(4, 2, 26, 2, 2),
(5, 3, 39, 5, 2),
(6, 1, 10, 3, 2),
(7, 2, 26, 5, 3),
(8, 1, 13, 2, 3),
(9, 3, 45, 1, 4),
(10, 1, 13, 2, 4),
(11, 2, 26, 5, 4),
(12, 3, 30, 3, 4),
(13, 2, 16, 4, 5),
(14, 2, 26, 2, 5),
(15, 3, 30, 3, 6),
(16, 2, 30, 1, 7),
(17, 1, 13, 5, 7),
(18, 3, 24, 4, 7),
(19, 3, 39, 2, 7),
(20, 3, 30, 3, 8),
(21, 1, 13, 2, 8),
(22, 3, 24, 4, 8),
(23, 1, 13, 5, 8),
(24, 3, 39, 5, 9),
(25, 2, 30, 1, 9),
(26, 3, 24, 4, 9),
(27, 2, 20, 3, 9),
(28, 3, 39, 5, 10),
(29, 1, 13, 5, 11),
(30, 3, 39, 2, 12),
(31, 2, 26, 5, 12),
(32, 3, 24, 4, 12),
(33, 1, 10, 3, 13),
(34, 2, 16, 4, 14),
(35, 1, 13, 2, 14),
(36, 1, 13, 5, 14),
(37, 2, 16, 4, 15),
(38, 1, 13, 2, 15),
(39, 3, 39, 5, 16),
(40, 3, 45, 1, 17),
(41, 3, 30, 3, 18),
(42, 1, 8, 4, 19),
(43, 1, 13, 5, 19),
(44, 3, 30, 3, 19),
(45, 3, 45, 1, 19),
(46, 3, 24, 4, 20),
(47, 1, 13, 2, 20),
(48, 1, 15, 1, 20),
(49, 1, 10, 3, 20),
(50, 2, 16, 4, 21),
(51, 3, 39, 5, 21),
(52, 2, 26, 2, 21),
(53, 2, 30, 1, 21),
(54, 2, 20, 3, 22),
(55, 1, 8, 4, 22),
(56, 3, 45, 1, 23),
(57, 1, 8, 4, 23),
(58, 1, 10, 3, 23),
(59, 1, 10, 3, 24),
(60, 3, 39, 2, 24),
(61, 1, 15, 1, 24),
(62, 1, 8, 4, 24),
(63, 1, 8, 4, 25),
(64, 1, 13, 2, 25),
(65, 2, 20, 3, 25),
(66, 2, 20, 3, 26),
(67, 3, 30, 3, 27),
(68, 2, 26, 5, 28),
(69, 3, 39, 2, 28),
(70, 1, 10, 3, 28),
(71, 3, 30, 3, 29),
(72, 1, 13, 5, 30),
(73, 2, 26, 2, 30),
(74, 1, 8, 4, 30),
(75, 3, 45, 1, 30),
(76, 3, 39, 2, 31),
(77, 1, 15, 1, 31),
(78, 2, 26, 5, 31),
(79, 3, 24, 4, 31),
(80, 2, 16, 4, 32),
(81, 2, 26, 5, 32),
(82, 3, 39, 2, 32),
(83, 1, 13, 5, 33),
(84, 2, 30, 1, 34),
(85, 2, 26, 5, 34),
(86, 2, 30, 1, 35),
(87, 1, 10, 3, 35),
(88, 3, 39, 5, 35),
(89, 2, 16, 4, 35),
(90, 1, 15, 1, 36),
(91, 2, 26, 2, 36),
(92, 3, 39, 2, 37),
(93, 2, 30, 1, 37),
(94, 2, 26, 5, 37),
(95, 1, 10, 3, 37),
(96, 3, 39, 2, 38),
(97, 1, 10, 3, 38),
(98, 2, 30, 1, 38),
(99, 2, 30, 1, 39),
(100, 2, 26, 2, 39),
(101, 3, 45, 1, 40),
(102, 2, 20, 3, 40),
(103, 2, 26, 5, 40);

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

