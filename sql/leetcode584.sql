-- 584. Find Customer Referee 

SELECT C.name FROM Customer C
WHERE C.referee_id != 2 or C.referee_id IS NULL;