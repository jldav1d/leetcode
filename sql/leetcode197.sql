-- 197. Rising Temperature

SELECT w1.id as id FROM Weather w1
INNER JOIN Weather w2 
    -- match each date with its corresponding previous date
    ON w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature; 