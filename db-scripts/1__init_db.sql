CREATE SCHEMA mysql_json_db;

USE mysql_json_db;

CREATE TABLE ITEMS (
  ID BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(150) NOT NULL,
  JSON_DATA JSON
);

# Insert some data into ITEMS table
INSERT INTO ITEMS (TITLE, JSON_DATA)
VALUES ('Item one', '{"description": "Item one description", "price": "1.25"}');
