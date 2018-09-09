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

-- INSERT EXEMPLARS
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 1, '800', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 2, '800', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 3, '800', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 4, '800', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 12, 1, '801', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 12, 2, '801', true, 3, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 1, '802', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 2, '802', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 3, '802', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 1, '601', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 2, '601', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 3, '601', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 4, '601', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 1, '500', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 2, '500', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 3, '500', true, 1, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 16, 1, '601.1', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 16, 2, '601.1', true, 2, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 1, '602', true, 3, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 2, '602', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 3, '602', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 4, '602', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 1, '601.2', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 2, '601.2', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 3, '601.2', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 4, '601.2', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 5, '601.2', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 6, '601.2', true, 3, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 1, '601.3', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 2, '601.3', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 3, '601.3', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 4, '601.3', true, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 5, '601.3', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 6, '601.3', true, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 7, '601.3', true, 3, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 20, 1, '100', true, 3, NOW(), NOW());
