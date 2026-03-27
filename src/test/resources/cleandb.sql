SET FOREIGN_KEY_CHECKS = 0;

-- Clear tables
DELETE FROM book;
DELETE FROM author;

SET FOREIGN_KEY_CHECKS = 1;

-- Reset auto_increment
ALTER TABLE author AUTO_INCREMENT = 1;
ALTER TABLE book AUTO_INCREMENT = 1;
INSERT INTO author (id, first_name, last_name) VALUES (1, 'Kathy', 'Sierra'), (2, 'Joseph', 'Ottinger'), (3, 'Herbert', 'Schilt');
INSERT INTO book (id, title, author_id, isbn, publication_year) VALUES (1, 'Head First Java, 2nd Edition', 1, '978-0596009205', 2005), (2, 'Beginning Hibernate', 2, '978-1-4842-2319-2', 2016), (3, 'Java: A Beginner’s Guide (Sixth Edition)', 3, '978-0071809252', 2014);
