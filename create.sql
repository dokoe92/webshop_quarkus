
    create sequence Item_SEQ start with 1 increment by 50;

    create sequence MyEntity_SEQ start with 1 increment by 50;

    create table Item (
        length integer,
        onStock boolean,
        shoe_size integer,
        value float(53),
        width integer,
        withHood boolean,
        id bigint not null,
        category varchar(31) not null,
        brand varchar(255) check (brand in ('NIKE','ADIDAS','LACOSTE','TOMMY_HILFIGER','BASIC','TRUSSARDI','PUMA')),
        colour varchar(255) check (colour in ('RED','BLUE','GREEN','YELLOW','WHITE','BLACK','GREY','BROWN')),
        name varchar(255),
        pantsStyle varchar(255) check (pantsStyle in ('REGULARFIT','SKINNYFIT','SLIMFIT')),
        size varchar(255) check (size in ('XS','S','M','L','XL','XXL','XXXL')),
        primary key (id)
    );

    create table MyEntity (
        id bigint not null,
        field varchar(255),
        primary key (id)
    );
INSERT INTO item (id, name, value, colour, onStock, brand, category, width, length, size, pantsstyle) VALUES (1, 'Pants1', 29.99, 'RED', true, 'NIKE', 'pants', 32, 32, null, 'REGULARFIT'),        (2, 'Pants3', 49.99, 'GREEN', true, 'LACOSTE', 'pants', 32, 34, null, 'SKINNYFIT'),        (3, 'Pants2', 39.99, 'BLUE', false, 'ADIDAS', 'pants', 34, 34, null, 'SLIMFIT'),        (4, 'Pants4', 35.99, 'YELLOW', true, 'PUMA', 'pants', 34, 32, null, 'REGULARFIT'),        (5, 'Pants5', 45.99, 'GREY', false, 'TRUSSARDI', 'pants', null, null, 'M', 'SKINNYFIT'),        (6, 'Pants6', 59.99, 'BLACK', true, 'TOMMY_HILFIGER', 'pants', null, null, 'L', 'SLIMFIT'),        (7, 'Pants7', 34.99, 'WHITE', false, 'BASIC', 'pants', 36, 32, null, 'REGULARFIT'),        (8, 'Pants8', 44.99, 'RED', true, 'NIKE', 'pants', 36, 34, null, 'SKINNYFIT'),        (9, 'Pants9', 39.99, 'BLACK', false, 'ADIDAS', 'pants', null, null, 'S', 'SLIMFIT'),        (10, 'Pants10', 29.99, 'GREY', true, 'LACOSTE', 'pants', 32, 30, null, 'REGULARFIT');
INSERT INTO Item (id, name, value, colour, onStock, brand, size, category) VALUES (11, 'T-Shirt Classic', 19.99, 'WHITE', true, 'NIKE', 'M', 'shirt'),        (12, 'Polo Blue', 29.99, 'BLUE', true, 'ADIDAS', 'L', 'shirt'),        (13, 'Striped Tee', 24.99, 'RED', false, 'LACOSTE', 'S', 'shirt'),        (14, 'Cotton White Shirt', 34.99, 'WHITE', true, 'TOMMY_HILFIGER', 'XL', 'shirt'),        (15, 'Black Tee', 14.99, 'BLACK', true, 'BASIC', 'M', 'shirt'),        (16, 'Graphic T-Shirt', 29.99, 'GREY', false, 'TRUSSARDI', 'L', 'shirt'),        (17, 'V-Neck Green', 22.99, 'GREEN', true, 'PUMA', 'S', 'shirt'),        (18, 'Long Sleeve Tee', 24.99, 'YELLOW', false, 'NIKE', 'M', 'shirt'),        (19, 'Round Neck Red', 19.99, 'RED', true, 'ADIDAS', 'L', 'shirt'),        (20, 'Printed T-Shirt', 21.99, 'BLACK', false, 'LACOSTE', 'M', 'shirt');
INSERT INTO Item (id, name, value, colour, onStock, brand, size, category, withhood) VALUES (21, 'Classic Hoodie', 49.99, 'BLACK', true, 'NIKE', 'M', 'pullover', true),        (22, 'Knit Sweater', 59.99, 'BLUE', true, 'ADIDAS', 'L', 'pullover', false),        (23, 'Winter Pullover', 64.99, 'GREY', false, 'LACOSTE', 'S', 'pullover', false),        (24, 'Zip-Up Hoodie', 54.99, 'WHITE', true, 'TOMMY_HILFIGER', 'XL', 'pullover', true),        (25, 'Basic Sweatshirt', 39.99, 'GREEN', true, 'BASIC', 'M', 'pullover', false),        (26, 'Turtleneck Sweater', 69.99, 'RED', false, 'TRUSSARDI', 'L', 'pullover', false),        (27, 'Crewneck Pullover', 44.99, 'YELLOW', true, 'PUMA', 'S', 'pullover', false),        (28, 'Sports Hoodie', 49.99, 'BLACK', false, 'NIKE', 'M', 'pullover', true),        (29, 'Wool Blend Sweater', 74.99, 'BLUE', true, 'ADIDAS', 'L', 'pullover', false),        (30, 'Cable Knit Pullover', 59.99, 'GREY', false, 'LACOSTE', 'M', 'pullover', false);
INSERT INTO Item (id, name, value, colour, onStock, brand, size, category, shoe_size) VALUES (31,'Sport Runners', 79.99, 'BLACK', true, 'NIKE', null, 'shoe', 42),        (32, 'Classic Sneakers', 69.99, 'WHITE', true, 'ADIDAS', null, 'shoe', 43),        (33, 'Casual Loafers', 89.99, 'BROWN', false, 'LACOSTE', null, 'shoe', 41),        (34,'High Top Sneakers', 99.99, 'BLUE', true, 'TOMMY_HILFIGER', null, 'shoe', 44),        (35, 'Gym Trainers', 74.99, 'BLACK', true, 'PUMA', 'M', 'shoe', null),        (36, 'Leather Boots', 129.99, 'BLACK', false, 'TRUSSARDI', 'L', 'shoe', null),        (37, 'Slip Ons', 59.99, 'GREY', true, 'BASIC', null, 'shoe', 43),        (38, 'Street Style Shoes', 84.99, 'RED', false, 'NIKE', null, 'shoe', 44),        (39, 'Hiking Boots', 139.99, 'GREEN', true, 'ADIDAS', null, 'shoe', 45),        (40, 'Formal Oxfords', 114.99, 'BLACK', false, 'LACOSTE', null, 'shoe', 42);
