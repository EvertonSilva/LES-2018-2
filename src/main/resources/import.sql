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
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Crime e Castigo', '1234567890110', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Canção de Ninar', '1234567890111', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'O Homem Duplo', '1234567890112', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'A Discipline of Programming', '1234567890113', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Essays on Game Theory', '1234567890114', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'A Linguagem de Progamação Java', '1234567890115', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Padrões de Arquitetura de Aplicações Corporativas', '1234567890116', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'TDD Desenvolvimento Guiado por Testes', '1234567890117', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Código Limpo', '1234567890118', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());
INSERT INTO books (id, title, isbn, synopsis, enabled, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 'Humano, Demasiado Humano', '1234567890119', 'Lorem ipsum dolor sit amet', true, NOW(), NOW());

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

-- INSERT USERS
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (1, '455133554', 'aluno1@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (2, '255121553', 'aluno2@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (3, '342132569', 'aluno3@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (4, '105132258', 'aluno4@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (5, '456900357', 'aluno5@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (6, '490131201', 'aluno6@example.com', 'FD5675AE2E933B4070E682938203DCBB978966909CF03F3D9C4F271AD1B3107B', true, NOW(), NOW()); -- aluno123

INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (7, '014133441', 'prof1@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (8, '552220912', 'prof2@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (9, '637658983', 'prof3@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (10, '335556664', 'prof4@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (11, '923422565', 'prof5@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018
INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (12, '115121296', 'prof6@example.com', '0D7D6AD3BAA19059FBBBE395BF16DDC5EA22AA02009BEAEE75B5FAEBC41655C1', true, NOW(), NOW()); -- prof2018

-- INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (13, '06.983.217/0001-45', 'library@example.com', '7CAD70B3A3D901FEEE4BC469BC4A59333105AB43DBE52B12648E3D19584B35E1', true, NOW(), NOW()); -- library2018
-- INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (14, '04.583.218/0001-17', 'library@example.com', '7CAD70B3A3D901FEEE4BC469BC4A59333105AB43DBE52B12648E3D19584B35E1', true, NOW(), NOW()); -- library2018
-- INSERT INTO users (id, id_document, username, password, enabled, created_at, updated_at) VALUES (15, '01.724.632/0001-23', 'library@example.com', '7CAD70B3A3D901FEEE4BC469BC4A59333105AB43DBE52B12648E3D19584B35E1', true, NOW(), NOW()); -- library2018

-- INSERT ROLES
INSERT INTO user_roles (id, user_id, role_type, exemplars_amount, loan_days, enabled, created_at, updated_at) VALUES (1, 1, 'student', 3, 7, true, NOW(), NOW());
INSERT INTO user_roles (id, user_id, role_type, exemplars_amount, loan_days, enabled, created_at, updated_at) VALUES (2, 2, 'professor', 5, 14, true, NOW(), NOW());
-- INSERT INTO user_roles (id, user_id, role_type, exemplars_amount, loan_days, enabled, created_at, updated_at) VALUES (3, 3, 'library', 10, 180, true, NOW(), NOW());

-- INSERT LOANS
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (1, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 12, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (2, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 12, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (3, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 12, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (4, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 2, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (5, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 2, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (6, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 2, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (7, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 3, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (8, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 3, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (9, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 3, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (10, true, NOW(), (CURRENT_TIMESTAMP + interval '7 days'), 0, 4, NOW(), NOW());

INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (11, true, (CURRENT_TIMESTAMP - interval '8 days'), NOW(), 1, 4, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (12, true, (CURRENT_TIMESTAMP - interval '10 days'), NOW(), 1, 4, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (13, true, (CURRENT_TIMESTAMP - interval '12 days'), NOW(), 1, 5, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (14, true, (CURRENT_TIMESTAMP - interval '9 days'), NOW(), 1, 5, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (15, true, (CURRENT_TIMESTAMP - interval '10 days'), NOW(), 1, 5, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (16, true, (CURRENT_TIMESTAMP - interval '10 days'), NOW(), 1, 6, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (17, true, (CURRENT_TIMESTAMP - interval '15 days'), NOW(), 1, 6, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (18, true, (CURRENT_TIMESTAMP - interval '21 days'), NOW(), 1, 6, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (19, true, (CURRENT_TIMESTAMP - interval '30 days'), NOW(), 1, 7, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (20, true, (CURRENT_TIMESTAMP - interval '12 days'), NOW(), 1, 7, NOW(), NOW());

INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (21, true, '2018-10-10', '2018-10-17', 2, 7, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (22, true, '2018-09-10', '2018-09-17', 2, 7, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (23, true, '2018-07-10', '2018-07-17', 2, 7, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (24, true, '2018-02-10', '2018-02-17', 2, 8, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (25, true, '2018-03-10', '2018-03-17', 2, 8, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (26, true, '2018-05-10', '2018-09-17', 2, 8, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (27, true, '2018-07-10', '2018-07-17', 2, 8, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (28, true, '2018-08-10', '2018-08-17', 2, 8, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (29, true, '2018-08-10', '2018-08-17', 2, 9, NOW(), NOW());
INSERT INTO loans (id, enabled, start_date, end_date, loan_status, user_id, created_at, updated_at) VALUES (30, true, '2018-09-10', '2018-09-17', 2, 9, NOW(), NOW());

-- INSERT BOOK RETURNS
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (1, true, '2018-10-17', '2018-10-17', 7, 21, '2018-10-17', '2018-10-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (2, true, '2018-09-17', '2018-09-17', 7, 22, '2018-09-17', '2018-09-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (3, true, '2018-07-17', '2018-07-17', 7, 23, '2018-07-17', '2018-07-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (4, true, '2018-02-17', '2018-02-17', 8, 24, '2018-02-17', '2018-02-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (5, true, '2018-03-17', '2018-03-17', 8, 25, '2018-03-17', '2018-03-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (6, true, '2018-05-17', '2018-05-17', 8, 26, '2018-05-17', '2018-05-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (7, true, '2018-07-17', '2018-07-17', 8, 27, '2018-07-17', '2018-07-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (8, true, '2018-08-17', '2018-08-17', 8, 28, '2018-08-17', '2018-08-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (9, true, '2018-08-17', '2018-08-17', 9, 29, '2018-08-17', '2018-08-17');
INSERT INTO book_returns (id, enabled, start_date, end_date, user_id, loan_id, created_at, updated_at) VALUES (10, true, '2018-09-17', '2018-09-17', 9, 30, '2018-09-17', '2018-09-17');

-- INSERT EXEMPLARS
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 1, '800D11c1', true, 1, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 2, '800D11c2', true, 1, 2, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 3, '800D11c3', true, 1, 3, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 11, 4, '800D11c4', true, 1, 4, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 12, 1, '801P8c1', true, 1, 14, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 12, 2, '801P8c2', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 1, '802P12h1', true, 1, 5, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 2, '802P12h2', true, 1, 6, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 13, 3, '802P12h3', true, 1, 7, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 1, '601D15d1', true, 1, 8, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 2, '601D15d2', true, 1, 9, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 3, '601D15d3', true, 1, 10, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 14, 4, '601D15d4', true, 1, 11, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 1, '500N15e1', true, 1, 12, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 2, '500N15e2', true, 1, 13, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 15, 3, '500N15e3', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 16, 1, '601.1G23l1', true, 1, 15, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 16, 2, '601.1G23l2', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 1, '602F9p1', true, 1, 16, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 2, '602F9p2', true, 1, 17, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 3, '602F9p3', true, 1, 18, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 17, 4, '602F9p4', true, 0, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 1, '601.2B13t1', true, 1, 19, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 2, '601.2B13t2', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, loan_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 3, '601.2B13t3', true, 1, 20, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 4, '601.2B13t4', true, 0, 8, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 5, '601.2B13t5', true, 0, 1, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 18, 6, '601.2B13t6', true, 0, 2, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 1, '601.3M34c1', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 2, '601.3M34c2', true, 0, 3, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 3, '601.3M34c3', true, 0, 7, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 4, '601.3M34c4', true, 0, 4, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 5, '601.3M34c5', true, 0, 5, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 6, '601.3M34c6', true, 0, 9, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 19, 7, '601.3M34c7', true, 0, 6, NOW(), NOW());

INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 20, 1, '100N27h1', true, 0, NOW(), NOW());
INSERT INTO exemplars (id, publication_id, number, shelf_number, enabled, status, book_return_id, created_at, updated_at) VALUES (NEXTVAL('hibernate_sequence'), 20, 1, '100N27h2', true, 0, 10, NOW(), NOW());