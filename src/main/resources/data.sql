-- USERS

INSERT INTO users (id, name)
VALUES (111, 'Pooja Kumari');

INSERT INTO post (id, author, content, title, user_id)
VALUES  (100, 'Pooja', 'Java is an Object Oriented Language', 'OOP', 111 );

INSERT INTO post (id, author, content, title, user_id)
VALUES  (101, 'Pooja', '2nd post', '2', 111 );

INSERT INTO comment(id, name, text, post_id)
VALUES (101, 'Pooja', 'Nice Work!', 100 )
