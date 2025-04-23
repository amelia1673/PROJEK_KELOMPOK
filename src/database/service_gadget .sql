-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Apr 2025 pada 08.31
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `service_gadget`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_aksesoris`
--

CREATE TABLE `tb_aksesoris` (
  `id_aksesoris` varchar(10) NOT NULL,
  `nama_aksesoris` varchar(30) NOT NULL,
  `harga_aksesoris` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_login`
--

CREATE TABLE `tb_login` (
  `id_teknisi` char(15) NOT NULL,
  `sandi` char(15) NOT NULL,
  `nama` char(25) NOT NULL,
  `jenkel` char(15) NOT NULL,
  `hp` char(15) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_login`
--

INSERT INTO `tb_login` (`id_teknisi`, `sandi`, `nama`, `jenkel`, `hp`, `alamat`) VALUES
('T01', '123', 'Ahmad Nur Latif Prayoga', 'Laki-Laki', '081949452687', 'Jl Jatipadang Raya, Pasar Minggu, Jakarta Selatan'),
('T02', '123', 'Ahmad Nur Latif Prayoga', 'Laki-Laki', '081949452687', 'Jl Jatipadang Raya, Pasar Minggu, Jakarta Selatan'),
('T03', '123', 'Yoga', 'Laki-Laki', '0819', 'jakarta');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_nota`
--

CREATE TABLE `tb_nota` (
  `id_nota` varchar(10) NOT NULL,
  `tanggal` date NOT NULL,
  `id_teknisi` varchar(10) NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL,
  `total_biaya` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_nota_detail`
--

CREATE TABLE `tb_nota_detail` (
  `id_nota` varchar(10) NOT NULL,
  `id_item` varchar(10) NOT NULL,
  `nama_item` varchar(30) NOT NULL,
  `harga` int(100) NOT NULL,
  `kuantitas` int(100) NOT NULL,
  `subtotal` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pelanggan`
--

CREATE TABLE `tb_pelanggan` (
  `id_pelanggan` char(15) NOT NULL,
  `nama_pelanggan` char(25) NOT NULL,
  `hp_pelanggan` char(15) NOT NULL,
  `jk_pelanggan` char(25) NOT NULL,
  `almt_pelanggan` text NOT NULL,
  `tanggal_pelanggan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_pelanggan`
--

INSERT INTO `tb_pelanggan` (`id_pelanggan`, `nama_pelanggan`, `hp_pelanggan`, `jk_pelanggan`, `almt_pelanggan`, `tanggal_pelanggan`) VALUES
('P1', 'Yoga', '111111', 'Laki-Laki', 'Jakarta', '2025-04-19'),
('P2', 'krisna', '111111', 'Laki-Laki', 'bandung', '2025-04-21'),
('P3', 'Yoga', '111111', 'Laki-Laki', 'Jakarta', '2025-04-21');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_service`
--

CREATE TABLE `tb_service` (
  `id_service` varchar(10) NOT NULL,
  `jenis_service` varchar(20) NOT NULL,
  `biaya_service` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_service`
--

INSERT INTO `tb_service` (`id_service`, `jenis_service`, `biaya_service`) VALUES
('S01', 'Ganti Baterai Laptop', 100000),
('S02', 'Ganti LCD Laptop', 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_sparepart`
--

CREATE TABLE `tb_sparepart` (
  `kd_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(200) NOT NULL,
  `harga_barang` int(100) NOT NULL,
  `jenis_barang` varchar(20) NOT NULL,
  `merk_barang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_sparepart`
--

INSERT INTO `tb_sparepart` (`kd_barang`, `nama_barang`, `harga_barang`, `jenis_barang`, `merk_barang`) VALUES
('B01', 'LCD Laptop Asus Vivobook Pro 14 OLED', 1000000, 'LCD', 'Asus'),
('B02', 'Baterai Laptop Asus Vivobook Pro 14 OLED', 1600000, 'Baterai', 'Asus');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_aksesoris`
--
ALTER TABLE `tb_aksesoris`
  ADD PRIMARY KEY (`id_aksesoris`);

--
-- Indeks untuk tabel `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`id_teknisi`);

--
-- Indeks untuk tabel `tb_nota`
--
ALTER TABLE `tb_nota`
  ADD PRIMARY KEY (`id_nota`),
  ADD KEY `id_pelanggan` (`id_pelanggan`),
  ADD KEY `id_teknisi` (`id_teknisi`);

--
-- Indeks untuk tabel `tb_nota_detail`
--
ALTER TABLE `tb_nota_detail`
  ADD KEY `id_nota` (`id_nota`),
  ADD KEY `id_item` (`id_item`);

--
-- Indeks untuk tabel `tb_pelanggan`
--
ALTER TABLE `tb_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `tb_service`
--
ALTER TABLE `tb_service`
  ADD PRIMARY KEY (`id_service`);

--
-- Indeks untuk tabel `tb_sparepart`
--
ALTER TABLE `tb_sparepart`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_nota`
--
ALTER TABLE `tb_nota`
  ADD CONSTRAINT `tb_nota_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `tb_pelanggan` (`id_pelanggan`),
  ADD CONSTRAINT `tb_nota_ibfk_2` FOREIGN KEY (`id_teknisi`) REFERENCES `tb_login` (`id_teknisi`);

--
-- Ketidakleluasaan untuk tabel `tb_nota_detail`
--
ALTER TABLE `tb_nota_detail`
  ADD CONSTRAINT `tb_nota_detail_ibfk_1` FOREIGN KEY (`id_nota`) REFERENCES `tb_nota` (`id_nota`),
  ADD CONSTRAINT `tb_nota_detail_ibfk_2` FOREIGN KEY (`id_item`) REFERENCES `tb_service` (`id_service`),
  ADD CONSTRAINT `tb_nota_detail_ibfk_3` FOREIGN KEY (`id_item`) REFERENCES `tb_sparepart` (`kd_barang`),
  ADD CONSTRAINT `tb_nota_detail_ibfk_4` FOREIGN KEY (`id_item`) REFERENCES `tb_aksesoris` (`id_aksesoris`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
