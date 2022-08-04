# Write your MySQL query statement below
SELECT C.name as Customers FROM Customers C  WHERE C.id  NOT IN (SELECT customerId FROM Orders)

# Write your MySQL query statement below
SELECT C.name as Customers FROM Customers C LEFT JOIN Orders O ON C.id = O.customerId WHERE O.customerId IS NULL