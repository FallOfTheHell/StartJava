\echo 'выведите всю таблицу'
SELECT * FROM Jaegers;

\echo 'отобразите только не уничтоженных роботов'
SELECT * FROM robots WHERE status <> 'destroyed';

\echo 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT * FROM Jaegers 
WHERE mark IN ('Mark-4', 'Mark-1');

\echo 'отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT * FROM Jaegers 
WHERE mark NOT IN ('Mark-4', 'Mark-1');

\echo 'отсортируйте таблицу по убыванию по столбцу mark'
SELECT * FROM Jaegers 
ORDER BY mark DESC;

\echo 'отобразите информацию о самом старом роботе'
SELECT * FROM Jaegers 
WHERE launch = (SElECT MIN(launch) FROM Jaegers);

\echo 'отобразите роботов, которые уничтожили больше всех kaiju'
SELECT * FROM Jaegers 
WHERE kaijuKill = (SElECT MAX(kaijuKill) FROM Jaegers);

\echo 'отобразите средний вес роботов'
SELECT AVG(weight) FROM Jaegers;

\echo 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';

\echo 'удалите уничтоженных роботов' 
DELETE FROM jaegers WHERE status = 'Destroyed';