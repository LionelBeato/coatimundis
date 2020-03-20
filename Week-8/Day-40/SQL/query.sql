
-- this is a subquery, or subselect
-- note how I used the select keyword twice

SELECT *
FROM test.MOCK_DATA
WHERE id IN (SELECT id
                FROM test.MOCK_DATA
                WHERE city = 'San Francisco');

-- Transactions

-- a Transaction is the most atomic unit of work in SQL
-- it can be defined by multiple or a single statement
-- TRANSACTIONS need to be the following:
-- Atomic - the transaction is treated as a single unit
-- Isolated - concurrent transactions will act as if they were sequential
-- Consistent - transactions are valid when changing one state to another
-- Durable - transactions will persist and are recorded

-- This is known as ACID
-- Views

-- you can create a virtual table using the VIEW keyword
-- this table is not directly stored in memory

CREATE VIEW test_view AS
    SELECT test.MOCK_DATA.animal_name, test.MOCK_DATA.city
FROM test.MOCK_DATA;

-- Triggers

-- Triggers allow you to perform certain actions on certain tables given a condition
-- It's a powerful tool that showcases the extent of the SQL languages.
