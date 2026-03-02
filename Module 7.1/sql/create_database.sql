DROP DATABASE IF EXISTS currencydb;
CREATE DATABASE currencydb

USE currencydb;

CREATE TABLE currency (
                          abbreviation VARCHAR(3) PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          rate_to_usd DECIMAL(10,6) NOT NULL
);

INSERT INTO currency VALUES
                         ('USD', 'US Dollar', 1.000000),
                         ('EUR', 'Euro', 1.170000),
                         ('GBP', 'British Pound', 1.340000),
                         ('JPY', 'Japanese Yen', 0.006400),
                         ('AUD', 'Australian Dollar', 0.710000),
                         ('CAD', 'Canadian Dollar', 0.730000),
                         ('CHF', 'Swiss Franc', 1.290000),
                         ('CNY', 'Chinese Yuan', 0.150000);


DROP USER IF EXISTS 'root'@'localhost';
CREATE USER 'root'@'localhost' IDENTIFIED BY 'salasana';
GRANT SELECT ON currencydb.currency TO 'root'@'localhost';