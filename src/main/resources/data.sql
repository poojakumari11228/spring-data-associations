-- USERS

INSERT INTO users (id, name)
VALUES (111, 'Pooja Kumari');

INSERT INTO post (id, author, content, title, user_id)
VALUES  (100, 'Pooja', 'Java is an Object Oriented Language', 'OOP', 111 );

INSERT INTO post (id, author, content, title, user_id)
VALUES  (101, 'Pooja', '2nd post', '2', 111 );

INSERT INTO comment(id, name, text, post_id)
VALUES (101, 'Pooja', 'Nice Work!', 100 )

-- INSERT INTO users (id, name) VALUES (1, 'John Doe');
-- INSERT INTO users (id, name) VALUES (2, 'Jane Smith');
--
-- INSERT INTO post (id, title, content, author, user_id) VALUES (1, 'Hello World', 'This is my first post', 'John Doe', 1);
-- INSERT INTO post (id, title, content, author, user_id) VALUES (2, 'My Second Post', 'This is my second post', 'John Doe', 1);
-- INSERT INTO post (id, title, content, author, user_id) VALUES (3, 'Jane''s First Post', 'This is Jane''s first post', 'Jane Smith', 2);
