DROP TABLE IF EXISTS unicorn;

CREATE TABLE unicorn (
  name VARCHAR(250) PRIMARY KEY,
  description VARCHAR(250) NOT NULL,
  color VARCHAR(250) DEFAULT NULL,
  base_price INTEGER(16) DEFAULT NULL
);

INSERT INTO unicorn (name, description, color) VALUES
('Doudou', 'A cool little Unicorn', 'Pink'),
('Jasper', 'A unicorn that can pass through walls', 'White'),
('Prancer', 'A unicorn that cannot help doing pranks', 'Orange'),
('Willow', 'A unicorn that loves surfing in Malibu', 'Yellow'),
('OzzyOz', 'A hard rocking unicorn', 'Green'),
('Slayer', 'A fan of Game of Thrones', 'Blue');