CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NOT NULL,
  `created_date` date DEFAULT NULL,
  `status` int DEFAULT NULL,
  `level` enum('FRESHER','JUNIOR','SENIOR') DEFAULT NULL,
  `size` enum('M','L','XL') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
);

CREATE TABLE `group` (
  `id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ;

CREATE TABLE `order` (
  `customer_id` int NOT NULL,
  `product_id` int NOT NULL,
  `total_money` double DEFAULT NULL,
  PRIMARY KEY (`customer_id`,`product_id`)
);