SELECT id_producto, SUM(cantidad) as ventas from vendidos GROUP by id_producto ORDER BY ventas DESC 
SELECT id_producto, SUM(cantidad) as ventas from vendidos GROUP by id_producto ORDER BY `ventas` ASC



 -- MAS VENDO --
SELECT
ven.id_producto,
pro.nombre,
pro.precio,
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
pro.precio,
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

/////////////////////////////////////////////////////////////////////////////////

CREATE PROCEDURE `agregar_producto` 
(
	`prod_nombre` varchar(50),
	`prod_precio` float,
	`prod_costo` float, 
	`prod_descuento` float 
)
INSERT INTO producto 
( 
	`id`,
	`nombre`,
	`precio`, 
	`costo`, 
	`descuento`, 
	`fecha_inser`, 
	`fecha_modif`
)
VALUES
( 
	NULL,
	`prod_nombre`,
	`prod_precio`,
	`prod_costo`,
	`prod_descuento`, 
	NOW(), 
	NOW() 
)
CALL agregar_producto ('sopes', 32.26, 19.36, 5.68)

/////////////////////////////////////////////////////////////////////////////////
CREATE PROCEDURE `busca_producto`(
	`prod_nombre` varchar(50)
)
SELECT
id,nombre,precio,descuento
FROM producto
where nombre LIKE CONCAT('%',prod_nombre,'%')

CALL busca_producto('el')

//////////////////////////////////////////////////////////////////////////////////
CREATE PROCEDURE `actualiza_producto`(
	`prod_id` int,
	`prod_nombre` varchar(50),
	`prod_precio` float,
	`prod_descuento` float 
)
UPDATE `producto` SET 
`nombre` = '', 
`precio` = '',
`descuento` = '' 
WHERE `producto`.`id` = `prod_id`

CALL busca_producto(1,'agua2',42.65,19.43)
///////////////////////////////////////////////////////////////////////////////////
CREATE PROCEDURE `borra_producto`(
	`prod_id` int
)
DELETE FROM `producto`
WHERE `producto`.`id` = `prod_id`

CALL borra_producto(1)
///////////////////////////////////////////////////////////////////////////////////

