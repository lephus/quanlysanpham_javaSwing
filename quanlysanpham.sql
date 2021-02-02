-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 02, 2021 lúc 04:28 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysanpham`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MaCTHD` smallint(6) DEFAULT NULL,
  `MaHoaDon` smallint(6) DEFAULT NULL,
  `MaSanPham` tinyint(4) DEFAULT NULL,
  `SoLuong` tinyint(4) DEFAULT NULL,
  `TongTien` decimal(12,4) DEFAULT NULL,
  `GhiChu` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MaCTHD`, `MaHoaDon`, `MaSanPham`, `SoLuong`, `TongTien`, `GhiChu`) VALUES
(11, 7, 5, 1, '21000000.0000', ''),
(15, 13, 3, 1, '1890000.0000', ''),
(19, 17, 4, 1, '1300000.0000', ''),
(20, 13, 30, 1, '1100000.0000', ''),
(1020, 1021, 1, 3, '3900000.0000', ''),
(1021, 1021, 1, 5, '6500000.0000', ''),
(1022, 7, 6, 1, '7490000.0000', ''),
(1023, 7, 9, 1, '1200000.0000', ''),
(1024, 7, 30, 1, '1100000.0000', ''),
(1025, 20, 9, 1, '1200000.0000', ''),
(1026, 20, 28, 1, '14000000.0000', ''),
(1027, 1021, 28, 3, '42000000.0000', ''),
(1029, 1022, 49, 1, '400000.0000', ''),
(1030, 1022, 49, 1, '400000.0000', ''),
(1031, 1022, 45, 1, '1960000.0000', ''),
(1032, 13, 7, 1, '1800000.0000', ''),
(1033, 1023, 1, 1, '7890000.0000', ''),
(1034, 1024, 1, 1, '7890000.0000', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaCTPN` tinyint(4) DEFAULT NULL,
  `MaPhieuNhap` tinyint(4) DEFAULT NULL,
  `MaSanPham` tinyint(4) DEFAULT NULL,
  `SoLuong` smallint(6) DEFAULT NULL,
  `TongTien` decimal(11,4) DEFAULT NULL,
  `ChuThich` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaCTPN`, `MaPhieuNhap`, `MaSanPham`, `SoLuong`, `TongTien`, `ChuThich`) VALUES
(1, 1, 3, 100, '1000000.0000', ''),
(2, 1, 43, 1, '7890000.0000', ''),
(3, 2, 1, 1, '7890000.0000', ''),
(4, 2, 1, 1, '7890000.0000', ''),
(5, 7, 6, 1, '7890000.0000', ''),
(6, 7, 6, 1, '7490000.0000', ''),
(7, 7, 6, 1, '7890000.0000', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.chucvu`
--

CREATE TABLE `chucvu` (
  `MaChucVu` tinyint(4) DEFAULT NULL,
  `TenChucVu` varchar(14) DEFAULT NULL,
  `GhiChu` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.chucvu`
--

INSERT INTO `chucvu` (`MaChucVu`, `TenChucVu`, `GhiChu`) VALUES
(1, 'Giam Đoc', ''),
(2, 'Thu Ngan', ''),
(3, 'Ke Toan', ''),
(4, 'Bao Ve', ''),
(5, 'Le Tan', ''),
(6, 'SEO', ''),
(7, 'Quan Ly ', ''),
(8, 'Lao Cong', ''),
(9, 'Kiem Soat Vien', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hangsanxuat`
--

CREATE TABLE `hangsanxuat` (
  `MaHangSanXuat` tinyint(4) DEFAULT NULL,
  `TenHangSanXuat` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.hangsanxuat`
--

INSERT INTO `hangsanxuat` (`MaHangSanXuat`, `TenHangSanXuat`) VALUES
(1, 'Louis Vuitton'),
(2, 'CHANEL'),
(3, 'PRADA'),
(4, 'DIOR'),
(5, 'HERMES'),
(6, 'BURBERRY'),
(7, 'GUCCI'),
(8, 'VERSACE'),
(9, 'DOLCE'),
(10, 'GABBANA'),
(11, 'DOLCE & GABBANA'),
(12, 'ARMANI'),
(13, 'FENDI'),
(14, 'BOTTEGA VENETA'),
(15, 'Givenchy'),
(16, 'Yves Saint Laurent'),
(17, 'ZTE'),
(18, 'GUCCI DELL'),
(19, 'GUCCI ASUS');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.hoadon`
--

CREATE TABLE `hoadon` (
  `MaHoaDon` smallint(6) DEFAULT NULL,
  `MaKhachHang` tinyint(4) DEFAULT NULL,
  `MaNhanVien` tinyint(4) DEFAULT NULL,
  `NgayLapHoaDon` varchar(10) DEFAULT NULL,
  `TongTien` decimal(12,4) DEFAULT NULL,
  `GhiChu` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.hoadon`
--

INSERT INTO `hoadon` (`MaHoaDon`, `MaKhachHang`, `MaNhanVien`, `NgayLapHoaDon`, `TongTien`, `GhiChu`) VALUES
(7, 6, 11, '2016-07-03', '30790000.0000', ''),
(13, 11, 6, '2016-07-03', '4790000.0000', 'huy'),
(17, 12, 11, '2016-07-03', '1300000.0000', ''),
(20, 14, 11, '2016-07-03', '15200000.0000', ''),
(1021, 6, 11, '2016-07-04', '52400000.0000', ''),
(1022, 15, 11, '2016-07-04', '2760000.0000', ''),
(1023, 15, 11, '2016-07-05', '7890000.0000', ''),
(1024, 15, 11, '2016-07-05', '7890000.0000', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKhachHang` tinyint(4) DEFAULT NULL,
  `TenKhachHang` varchar(17) DEFAULT NULL,
  `Ngaysinh` varchar(10) DEFAULT NULL,
  `GioiTinh` tinyint(4) DEFAULT NULL,
  `DiaChi` varchar(37) DEFAULT NULL,
  `SDT` bigint(20) DEFAULT NULL,
  `LoaiKhachHang` tinyint(4) DEFAULT NULL,
  `GhiChu` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKhachHang`, `TenKhachHang`, `Ngaysinh`, `GioiTinh`, `DiaChi`, `SDT`, `LoaiKhachHang`, `GhiChu`) VALUES
(6, 'Nguyen Thanh Tung', '1996-03-02', 0, 'Thai Binh', 909898964, 1, '          '),
(11, 'Le Huu Phu', '1986-09-02', 1, 'Quang Nam', 745322222, 3, '          '),
(12, 'duc cuong', '1980-04-10', 0, 'Ha Noi', 914232372, 3, 'moi them  '),
(14, 'Pham Hong Ha', '1992-06-09', 0, '102 nguyen tat thanh-TP buon Ma Thuat', 166542753, 2, '          '),
(15, 'Hoang Raper', '2000-06-09', 1, ' Hai Phong', 166554322, 1, '          '),
(18, 'Pham Hong Ha', '1992-06-09', 0, '102 nguyen tat thanh-TP buôn Ma Thuat', 166542753, 2, '          '),
(19, 'pham hoang huy', '2010-05-03', 1, '5433', 6445654, 2, '          '),
(20, 'pham hoang huy', '2010-05-03', 1, '5433', 6445654, 2, '          '),
(21, 'Le huu Phu 2', '2011-07-06', 1, '656445', 12334567890, 2, 'gfg       ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.loaikhachhang`
--

CREATE TABLE `loaikhachhang` (
  `MaLoaiKhachHang` tinyint(4) DEFAULT NULL,
  `TenLoaiKhachHang` varchar(9) DEFAULT NULL,
  `GhiChu` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `loaikhachhang`
--

INSERT INTO `loaikhachhang` (`MaLoaiKhachHang`, `TenLoaiKhachHang`, `GhiChu`) VALUES
(1, 'vip', 'giảm 10%'),
(2, 'thường', 'giảm 0%'),
(3, 'sinh viên', 'giảm 5%');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `MaLoaiSanPham` tinyint(4) DEFAULT NULL,
  `TenLoaiSanPham` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`MaLoaiSanPham`, `TenLoaiSanPham`) VALUES
(1, 'Tre em'),
(2, 'Thieu Nien'),
(3, 'Nguoi Lon'),
(4, 'The Thao'),
(5, 'Sang Trong'),
(9, 'Gon Nhe');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` tinyint(4) DEFAULT NULL,
  `TenNhanVien` varchar(17) DEFAULT NULL,
  `NgaySinh` varchar(10) DEFAULT NULL,
  `GioiTinh` tinyint(4) DEFAULT NULL,
  `NgayVaoLam` varchar(10) DEFAULT NULL,
  `ChucVu` tinyint(4) DEFAULT NULL,
  `DiaChi` varchar(24) DEFAULT NULL,
  `SoDT` varchar(11) DEFAULT NULL,
  `GhiChu` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `NgaySinh`, `GioiTinh`, `NgayVaoLam`, `ChucVu`, `DiaChi`, `SoDT`, `GhiChu`) VALUES
(1, 'Pham Hoang Huy', '1996-12-25', 1, '2016-01-01', 1, '51- 102 Nguyen Tat Thanh', '01293223225', 'chuc cao nhat co the'),
(3, 'Pham Van Toan', '1997-01-02', 0, '2011-03-05', 2, 'chua co', '01293223225', 'chua co'),
(6, 'Nguyen Truc Nhan', '1990-06-10', 1, '2014-12-03', 5, 'Ha Noi ', '091425635', ''),
(8, 'Pham Bang Bang', '1896-03-02', 0, '2015-05-04', 5, 'viet nam', '01652343643', ''),
(10, 'Nguyen Thanh Tung', '1994-07-05', 1, '2015-09-07', 1, 'Thai Binh', '09090909090', ''),
(11, 'Luong Bich Huu', '1988-06-23', 0, '2015-06-04', 3, 'Trung Quoc', '46789976654', ''),
(13, 'Khoi My', '1984-06-03', 0, '2015-06-03', 6, 'buon Ma Thuat', '', ''),
(14, 'Nguyen thi Hong', '1997-08-07', 0, '2011-03-05', 2, 'buon ma thuot', '01293223225', '\r\n'),
(15, 'nguyen Van Hung', '1994-03-02', 1, '2011-03-05', 4, 'easup', '01653454267', ''),
(18, 'Pham Van Nguyen', '1997-01-02', 1, '2014-03-05', 4, 'ha noi', '0921457432', ''),
(22, 'my my', '1984-06-03', 0, '2015-06-03', 6, 'buon Ma Thuat', '01293223225', ''),
(23, 'nguyen Van Hung', '1994-03-02', 1, '2011-03-05', 5, 'easup', '01653454267', ''),
(24, 'ly ly', '1984-06-03', 0, '2015-06-03', 6, 'Da Nang', '01293223225', ''),
(25, 'Nguyen Truc Nhan', '1990-06-10', 1, '2014-12-03', 5, 'Ha Noi ', '091425635', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaphanphoi`
--

CREATE TABLE `nhaphanphoi` (
  `MaNhaPhanPhoi` tinyint(4) DEFAULT NULL,
  `TenNhaPhanPhoi` varchar(11) DEFAULT NULL,
  `DiaChi` varchar(21) DEFAULT NULL,
  `SDT` bigint(20) DEFAULT NULL,
  `Email` varchar(24) DEFAULT NULL,
  `ChuThich` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.nhaphanphoi`
--

INSERT INTO `nhaphanphoi` (`MaNhaPhanPhoi`, `TenNhaPhanPhoi`, `DiaChi`, `SDT`, `Email`, `ChuThich`) VALUES
(1, 'FPT Trading', 'Ho Chi Minh', 98674322, 'motcucgach7796@gmail.com', ''),
(2, 'docomo', 'Trung Quoc ', 34657865434, 'dcomo197@gmail.com', ''),
(8, 'FPTShop', 'Viet Nam', 34657865434, 'dcomo197@gmail.com', ''),
(10, 'ZTE', 'Quang đong Trung quoc', 1293223225, 'ZTEhuy@gmail.com', ''),
(11, 'FPTShop', 'Viet Nam', 34657865434, 'dcomo197@gmail.com', '          '),
(12, 'FPTShop', 'Viet Nam', 34657865434, 'dcomo197@gmail.com', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPhieuNhap` tinyint(4) DEFAULT NULL,
  `MaNhanVien` tinyint(4) DEFAULT NULL,
  `MaNhaPhanPhoi` tinyint(4) DEFAULT NULL,
  `TongTien` decimal(10,4) DEFAULT NULL,
  `NgayNhap` varchar(10) DEFAULT NULL,
  `ChuThich` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.phieunhap`
--

INSERT INTO `phieunhap` (`MaPhieuNhap`, `MaNhanVien`, `MaNhaPhanPhoi`, `TongTien`, `NgayNhap`, `ChuThich`) VALUES
(1, 11, 2, '100000.0000', '2016-04-03', ''),
(2, 11, 2, '100000.0000', '2016-01-01', ''),
(3, 11, 2, '100000.0000', '2016-07-01', ''),
(7, 11, 2, '100000.0000', '2016-04-03', ''),
(10, 3, 2, '0.0000', '2015-02-02', ''),
(11, 3, 2, '0.0000', '2015-02-02', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.quyen`
--

CREATE TABLE `quyen` (
  `MaQuyen` tinyint(4) DEFAULT NULL,
  `TenQuyen` varchar(13) DEFAULT NULL,
  `ChuThich` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.quyen`
--

INSERT INTO `quyen` (`MaQuyen`, `TenQuyen`, `ChuThich`) VALUES
(1, 'Quan Tri Vien', ''),
(2, 'Ke Toan', ''),
(3, 'Thu Ngan', ''),
(4, 'Bao Ve', ''),
(5, 'SEO', ''),
(6, 'Giam Đoc', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.sanpham`
--

CREATE TABLE `sanpham` (
  `MaSanPham` tinyint(4) DEFAULT NULL,
  `TenSanPham` varchar(32) DEFAULT NULL,
  `LoaiSanPham` tinyint(4) DEFAULT NULL,
  `HangSanXuat` tinyint(4) DEFAULT NULL,
  `GiaNhap` decimal(13,4) DEFAULT NULL,
  `GiaBan` decimal(13,4) DEFAULT NULL,
  `TonKho` smallint(6) DEFAULT NULL,
  `TrangThai` tinyint(4) DEFAULT NULL,
  `Image` varchar(15) DEFAULT NULL,
  `ChuThich` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.sanpham`
--

INSERT INTO `sanpham` (`MaSanPham`, `TenSanPham`, `LoaiSanPham`, `HangSanXuat`, `GiaNhap`, `GiaBan`, `TonKho`, `TrangThai`, `Image`, `ChuThich`) VALUES
(1, 'Ao khach supper', 2, 4, '7390000.0000', '7890000.0000', 34, 1, 'sonnu m4 w1.png', ''),
(3, 'Quan 10', 2, 3, '1800000.0000', '1890000.0000', 100, 1, '', ''),
(4, 'Ao Thun rong', 2, 1, '1300000.0000', '1300000.0000', 10, 1, '', ''),
(5, 'Vay auto', 2, 13, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(6, 'Quan Dui', 2, 1, '700000.0000', '7490000.0000', 100, 1, '', ''),
(7, 'Quan Dai', 2, 1, '1500000.0000', '1800000.0000', 10, 1, '', ''),
(8, 'Ao So Mi', 2, 13, '15000000.0000', '17000000.0000', 100, 1, '', ''),
(9, 'Quan Ong A7', 2, 1, '1000000.0000', '1200000.0000', 100, 1, '', ''),
(10, 'Ao Ao 2016', 2, 1, '8490000.0000', '9000000.0000', 100, 1, '', ''),
(12, 'Quan s6 edge', 1, 1, '12000000.0000', '12600000.0000', 100, 1, '', ''),
(13, 'Ao s6 edge plus', 2, 1, '10000000.0000', '11000000.0000', 100, 1, '', ''),
(19, 'Vay j3', 2, 1, '20000000.0000', '21000000.0000', 100, 0, '', ''),
(20, 'Vay one m9', 2, 3, '1000000.0000', '1200000.0000', 100, 1, '', ''),
(21, 'Ao one m8', 2, 3, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(22, 'Quan one m7', 2, 3, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(23, 'Quan one a9', 2, 3, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(24, 'Ao one buttefly ', 2, 3, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(25, 'vay one buttefly 2', 2, 3, '20000000.0000', '21000000.0000', 65, 1, '', ''),
(26, 'Vay one derise 826', 2, 3, '20000000.0000', '21000000.0000', 100, 1, '', ''),
(27, 'Gay aa', 5, 16, '10000000.0000', '14000000.0000', 100, 1, '', ''),
(28, 'Giay the thao', 5, 17, '10000000.0000', '14000000.0000', 100, 1, '', ''),
(29, 'Giay Dinh', 5, 16, '10000000.0000', '14000000.0000', 100, 1, '', ''),
(30, 'vay qw', 5, 16, '900000.0000', '1100000.0000', 17, 1, '', ''),
(31, 'Ao alo', 3, 13, '1800000.0000', '1960000.0000', 89, 1, '', ''),
(32, 'Vay steel case', 4, 13, '100000000.0000', '144900000.0000', 13, 1, '', ''),
(33, 'samsung gear s1', 4, 1, '140000000.0000', '160000000.0000', 100, 1, '', ''),
(34, 'samsung gear s2', 4, 1, '10000000.0000', '12000000.0000', 100, 1, '', ''),
(35, 'samsung gear s2 classic', 4, 1, '11000000.0000', '119900000.0000', 100, 1, '', ''),
(36, 'masstel 730', 3, 17, '8500000.0000', '8900000.0000', 100, 1, '', ''),
(37, 'masstel 720', 3, 17, '100000000.0000', '160000000.0000', 100, 1, '', ''),
(38, 'Vay tab 3 8inch', 3, 7, '8000000.0000', '8500000.0000', 100, 1, '', ''),
(39, 'Quan tab 3 7', 3, 7, '3490000.0000', '3990000.0000', 100, 1, '', ''),
(40, 'Ao mediapad', 3, 5, '7000000.0000', '8000000.0000', 100, 1, '', ''),
(41, 'Ao mediapad t1-8', 3, 5, '130000000.0000', '160000000.0000', 100, 1, '', ''),
(42, 'nolia 1020', 1, 11, '299000.0000', '400000.0000', 100, 1, '', ''),
(43, 'nolia 1280', 1, 11, '3000.0000', '5000.0000', 100, 1, '', ''),
(44, 'ổ cứng samsung ssd 128gb', 9, 1, '8000000.0000', '9600000.0000', 100, 1, '', ''),
(45, 'pro nch', 3, 13, '1800000.0000', '1960000.0000', 100, 1, '', ''),
(46, 'Quans6 edge plus', 2, 1, '10000000.0000', '11000000.0000', 100, 1, '', ''),
(47, 'Quan gplus', 2, 1, '10000000.0000', '11000000.0000', 100, 1, '', ''),
(48, 'Vay s6 edge plus', 2, 1, '10000000.0000', '11000000.0000', 100, 1, '', ''),
(49, 'nolia 1020', 1, 11, '299000.0000', '400000.0000', 100, 1, '', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.sysdiagrams`
--

CREATE TABLE `sysdiagrams` (
  `name` varchar(9) DEFAULT NULL,
  `principal_id` tinyint(4) DEFAULT NULL,
  `diagram_id` tinyint(4) DEFAULT NULL,
  `version` tinyint(4) DEFAULT NULL,
  `definition` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.sysdiagrams`
--

INSERT INTO `sysdiagrams` (`name`, `principal_id`, `diagram_id`, `version`, `definition`) VALUES
('Diagram_0', 1, 1, 1, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dbo.users`
--

CREATE TABLE `users` (
  `ID` tinyint(4) DEFAULT NULL,
  `MaNhanVien` tinyint(4) DEFAULT NULL,
  `TenDangNhap` varchar(8) DEFAULT NULL,
  `Password` varchar(8) DEFAULT NULL,
  `Quyen` tinyint(4) DEFAULT NULL,
  `ChuThich` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dbo.users`
--

INSERT INTO `users` (`ID`, `MaNhanVien`, `TenDangNhap`, `Password`, `Quyen`, `ChuThich`) VALUES
(1, 1, 'admin', 'admin', 1, 'nguoi co tham quyen cao nhat'),
(2, 3, 'cuongnp', 'cuongnp', 2, ''),
(3, 6, 'Nhan1212', 'Nhan1212', 3, ''),
(5, 6, 'huyhuy12', 'HUYhuy12', 5, ' '),
(6, 13, 'khoimy12', 'Khoimy12', 5, ' '),
(7, 6, 'huyhuy12', 'HUYhuy12', 5, ' ');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
