-- 183. Customers Who Never Order

SELECT c.name Customers FROM CUSTOMERS c
WHERE c.id NOT IN (SELECT o.customerId FROM ORDERS o);