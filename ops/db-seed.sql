-- ext
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create postgre databases
--- Order
CREATE USER "order_user";
ALTER USER order_user WITH PASSWORD 'pass';
CREATE DATABASE "order_db" ENCODING 'UTF8' LC_COLLATE = 'en-US' LC_CTYPE = 'en-US' TEMPLATE template0;
GRANT ALL PRIVILEGES ON DATABASE order_db TO "order_user";

-- Payment
CREATE USER "payment_user";
ALTER USER payment_user WITH PASSWORD 'pass';
CREATE DATABASE "payment_db" ENCODING 'UTF8' LC_COLLATE = 'en-US' LC_CTYPE = 'en-US' TEMPLATE template0;
GRANT ALL PRIVILEGES ON DATABASE payment_db TO "payment_user";

 -- Product
 CREATE USER "product_user";
 ALTER USER product_user WITH PASSWORD 'pass';
 CREATE DATABASE "product_db" ENCODING 'UTF8' LC_COLLATE = 'en-US' LC_CTYPE = 'en-US' TEMPLATE template0;
 GRANT ALL PRIVILEGES ON DATABASE product_db TO "product_user";

