-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 20-Nov-2018 às 15:08
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdlocadoraloop`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `pk_id_cliente` bigint(20) UNSIGNED NOT NULL,
  `cli_nome` varchar(200) NOT NULL,
  `cli_cidade` varchar(50) NOT NULL,
  `cli_uf` varchar(2) NOT NULL,
  `cli_endereco` varchar(80) NOT NULL,
  `cli_bairro` varchar(40) NOT NULL,
  `cli_cep` varchar(9) NOT NULL,
  `cli_celular` varchar(14) NOT NULL,
  `cli_cpf` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`pk_id_cliente`, `cli_nome`, `cli_cidade`, `cli_uf`, `cli_endereco`, `cli_bairro`, `cli_cep`, `cli_celular`, `cli_cpf`) VALUES
(1, 'Rodrigo', 'boa vista', 'RR', 'rua op xxxiii', 'operario', '69316-322', '(95)99167-8208', '034.042.152-57'),
(3, 'Leandro', 'Mucajaí', 'RR', 'sei lá', 'tbm nao sei', '66666-666', '(99)99999-9999', '000.000.000-00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_filmes`
--

CREATE TABLE `tbl_filmes` (
  `pk_id_filme` bigint(20) UNSIGNED NOT NULL,
  `fil_titulo` varchar(80) NOT NULL,
  `fil_diretor` varchar(50) NOT NULL,
  `fil_ano` varchar(49) NOT NULL,
  `fil_genero` varchar(20) NOT NULL,
  `fil_valorReserva` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_filmes`
--

INSERT INTO `tbl_filmes` (`pk_id_filme`, `fil_titulo`, `fil_diretor`, `fil_ano`, `fil_genero`, `fil_valorReserva`) VALUES
(1, 'Senhor dos aneis', 'sdfsdf', '2007', 'Ação', 4.5),
(2, 'A era do gelo', 'lolo', '2007', 'Animação', 4.5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_reserva`
--

CREATE TABLE `tbl_reserva` (
  `pk_id_reserva` bigint(20) UNSIGNED NOT NULL,
  `fk_res_cliente` bigint(20) UNSIGNED NOT NULL,
  `res_data` date NOT NULL,
  `res_valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_reserva`
--

INSERT INTO `tbl_reserva` (`pk_id_reserva`, `fk_res_cliente`, `res_data`, `res_valor`) VALUES
(2, 1, '2018-11-18', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_reserva_filmes`
--

CREATE TABLE `tbl_reserva_filmes` (
  `pk_id_reserva_filme` bigint(20) UNSIGNED NOT NULL,
  `fk_filme` bigint(20) UNSIGNED NOT NULL,
  `fk_reserva` bigint(20) UNSIGNED NOT NULL,
  `res_filme_qtd` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` bigint(20) UNSIGNED NOT NULL,
  `usu_nome` varchar(150) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`pk_id_usuario`, `usu_nome`, `usu_login`, `usu_senha`) VALUES
(1, 'Leandro', 'leandro123', 'lele12'),
(2, 'Rodrigo', 'RodrigoO', '12345'),
(3, 'Sistema', 'admin', 'admin'),
(4, 'Teste', 'Test', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`pk_id_cliente`),
  ADD UNIQUE KEY `id_cliente` (`pk_id_cliente`);

--
-- Indexes for table `tbl_filmes`
--
ALTER TABLE `tbl_filmes`
  ADD PRIMARY KEY (`pk_id_filme`),
  ADD UNIQUE KEY `pk_id_filme` (`pk_id_filme`);

--
-- Indexes for table `tbl_reserva`
--
ALTER TABLE `tbl_reserva`
  ADD PRIMARY KEY (`pk_id_reserva`),
  ADD KEY `fkcliente` (`fk_res_cliente`);

--
-- Indexes for table `tbl_reserva_filmes`
--
ALTER TABLE `tbl_reserva_filmes`
  ADD PRIMARY KEY (`pk_id_reserva_filme`),
  ADD KEY `fkfilme` (`fk_filme`),
  ADD KEY `fkreserva` (`fk_reserva`);

--
-- Indexes for table `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`pk_id_usuario`),
  ADD UNIQUE KEY `id_usuario` (`pk_id_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  MODIFY `pk_id_cliente` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_filmes`
--
ALTER TABLE `tbl_filmes`
  MODIFY `pk_id_filme` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_reserva`
--
ALTER TABLE `tbl_reserva`
  MODIFY `pk_id_reserva` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_reserva_filmes`
--
ALTER TABLE `tbl_reserva_filmes`
  MODIFY `pk_id_reserva_filme` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `pk_id_usuario` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
