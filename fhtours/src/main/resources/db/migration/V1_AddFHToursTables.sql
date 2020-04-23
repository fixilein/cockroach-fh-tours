
CREATE TABLE Bus
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
name STRING,
brand STRING
);

CREATE TABLE Driver
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
name STRING
);

CREATE TABLE Customer
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
name STRING,
address STRING,
phone STRING
);

CREATE TABLE Location
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
name STRING
);

CREATE TABLE Trip
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
date DATE,
driver UUID,
bus UUID,
destination UUID
);


CREATE TABLE Booking
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
bookedDate DATE,
price DECIMAL,
paymentOption STRING,
paymentDate DATE,
trip UUID,
customer UUID
);
