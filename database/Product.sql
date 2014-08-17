create schema orion;

CREATE  TABLE `orion`.`product` (
  `id` BIGINT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `price` DOUBLE NULL ,
  PRIMARY KEY (`id`) );
  
  
  INSERT INTO `orion`.`product` (`id`, `name`, `price`) VALUES ('1', 'BMW', '7.5');
  INSERT INTO `orion`.`product` (`id`, `name`, `price`) VALUES ('2', 'Toyota', '6');
  INSERT INTO `orion`.`product` (`id`, `name`, `price`) VALUES ('3', 'Jeep', '6.2');