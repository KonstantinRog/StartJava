SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status = 'Life';
SELECT * FROM Jaegers WHERE mark = '1' OR mark = '3';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers) OR 
                            kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Live';
DELETE FROM Jaegers WHERE status = 'Destroyed';