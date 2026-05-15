-- 607. Sales Person

-- Write a solution to find the names of all the salespersons who did not have any orders related to the company with the name "RED".
-- filter the people who sold to RED first then invert

SELECT
    sp.name
FROM 
    SalesPerson sp
WHERE sp.sales_id NOT IN (
    SELECT o.sales_id FROM Orders o
    INNER JOIN Company c ON c.com_id = o.com_id
    AND c.name = 'RED'
)