
CREATE TABLE bus
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING,
    brand STRING
);

INSERT INTO bus (name, brand)
VALUES ('TestBus', 'Audi');

CREATE TABLE busdriver
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING
);

INSERT INTO busdriver (name) VALUES ('Test Driver');

CREATE TABLE customer
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING,
    address STRING DEFAULT '',
    phone STRING DEFAULT ''
);

CREATE TABLE location
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING
);

CREATE TABLE trip
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    date DATE,
    driver UUID,
    bus UUID,
    destination UUID
);

CREATE TABLE booking
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    booked_date DATE,
    price DECIMAL,
    payment_option STRING,
    payment_date DATE,
    trip UUID,
    customer UUID
);
