-- INSERT AUTHORS
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Fiodor', 'Mikhailovitch', 'Dostoievski', 10, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Chuck', '', 'Palahniuk', 8, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Philip', 'Kindred', 'Dick', 12, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Edsger', 'Wybe', 'Dijkstra', 15, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'John', 'Forbes', 'Nash', 11, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'James', '', 'Gosling', 23, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Martin', '', 'Fowler', 9, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Kent', '', 'Beck', 13, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Robert', 'Cecil', 'Martin', 34, NOW(), NOW());
INSERT INTO authors (id, enabled, name, middle_name, last_name, number, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), true, 'Friedrich', 'Wilhelm', 'Nietzsche', 27, NOW(), NOW());

-- INSERT BOOKS
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Crime e Castigo', '1234567890110', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Canção de Ninar', '1234567890111', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'O Homem Duplo', '1234567890112', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'A Discipline of Programming', '1234567890113', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Essays on Game Theory', '1234567890114', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'A Linguagem de Progamação Java', '1234567890115', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Padrões de Arquitetura de Aplicações Corporativas', '1234567890116', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'TDD Desenvolvimento Guiado por Testes', '1234567890117', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Código Limpo', '1234567890118', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Humano, Demasiado Humano', '1234567890119', 'Lorem ipsum dolor sit amet', false, NOW(), NOW());

-- INSERT book-author ASSOCIATION
INSERT INTO publications_authors (author_id, publication_id) VALUES (1, 11);
INSERT INTO publications_authors (author_id, publication_id) VALUES (2, 12);
INSERT INTO publications_authors (author_id, publication_id) VALUES (3, 13);
INSERT INTO publications_authors (author_id, publication_id) VALUES (4, 14);
INSERT INTO publications_authors (author_id, publication_id) VALUES (5, 15);
INSERT INTO publications_authors (author_id, publication_id) VALUES (6, 16);
INSERT INTO publications_authors (author_id, publication_id) VALUES (7, 17);
INSERT INTO publications_authors (author_id, publication_id) VALUES (8, 18);
INSERT INTO publications_authors (author_id, publication_id) VALUES (9, 19);
INSERT INTO publications_authors (author_id, publication_id) VALUES (10, 20);