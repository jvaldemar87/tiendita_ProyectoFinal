SELECT id_producto, SUM(cantidad) as ventas from vendidos GROUP by id_producto ORDER BY ventas DESC 
SELECT id_producto, SUM(cantidad) as ventas from vendidos GROUP by id_producto ORDER BY `ventas` ASC





 -- MAS VENDO --
SELECT
ven.id_producto,
pro.nombre,
pro.costo,
pro.descuento,
SUM(ven.cantidad) as ventas
from vendidos ven
LEFT JOIN producto pro
on ven.id_producto = pro.id
GROUP by id_producto  
ORDER BY ventas  DESC
limit 1


-- MENOS VENDIDO --
SELECT
ven.id_producto,
pro.nombre,
pro.costo,
pro.descuento,
SUM(ven.cantidad) as ventas
from vendidos ven
LEFT JOIN producto pro
on ven.id_producto = pro.id
GROUP by id_producto  
ORDER BY ventas  ASC
limit 1

-- MAYOR UTILIDAD --

SELECT id,nombre,(precio-costo-descuento) AS utilidad from producto  
ORDER BY `utilidad`  DESC 
LIMIT 1