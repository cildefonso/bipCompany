CREATE TABLE `company` (
  `user_Id` bigint(20) NOT NULL,
  `fullnamecompany` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cnpj` varchar(255) NOT NULL,
  `complementAddress` varchar(30) NOT NULL,  
  `numberAddress` bigint(10) NOT NULL,
  `main` VARCHAR(20) NOT NULL,
  `secondary` VARCHAR(20) NOT NULL,
  `idaddress` bigint(20) NOT NULL,
  `data_atualizacao` datetime NOT NULL,
  `data_criacao` datetime NOT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `company`
  ADD PRIMARY KEY (`user_Id`);
  
ALTER TABLE `company`
  MODIFY `user_Id` bigint(20) NOT NULL AUTO_INCREMENT;