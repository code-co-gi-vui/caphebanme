CREATE DATABASE QUANLYCAPHEBANME
GO
USE QUANLYCAPHEBANME
GO 
DROP DATABASE QUANLYCAPHEBANME
CREATE TABLE NhanVien(
	ID_Nhanvien VARCHAR(10) PRIMARY KEY NOT NULL,
	TenNV NVARCHAR(50) NOT NULL,
	Gender BIT NOT NULL,
	Ngaysinh DATE NOT NULL,
	Diachi NVARCHAR(100),
	Email NVARCHAR(100),
	SDT VARCHAR(11),
	Username VARCHAR(50) NOT NULL,
	Pass VARCHAR(50) NOT NULL,
	Vaitro BIT DEFAULT 0,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)

GO 
CREATE TABLE HoaDon(
	ID_Hoadon INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	ID_Nhanvien VARCHAR(10) NOT NULL,
	Ngaytao DATETIME DEFAULT GETDATE(),
	Trangthai BIT DEFAULT 1,
	TTThanhtoan BIT DEFAULT 0,
	Thanhtien INT,
	Lydohuy NVARCHAR(100),
	Soluongsanphamhuy INT,
	ghichu NVARCHAR(100),
	SDT VARCHAR(11),
	Ten NVARCHAR(50),
	diaChi NVARCHAR(50),
	tenShip INT 
)
GO 
CREATE TABLE SanPham(
	ID_Sanpham VARCHAR(10) PRIMARY KEY NOT NULL,
	TenSP NVARCHAR(50) NOT NULL,
	Gia INT NOT NULL,
	ID_DonviSP VARCHAR(10) NOT NULL,
	ID_LoaiSP VARCHAR(10) NOT NULL,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)
GO 
CREATE TABLE LoaiSanPham(
	ID_LoaiSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenLoai NVARCHAR(20) NOT NULL,
)
GO 
CREATE TABLE DonViSanPham(
	ID_DonviSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenDonvi NVARCHAR(20) NOT NULL,
	Kichthuoc INT NOT NULL
)
GO 
CREATE TABLE Ban(
	ID_Ban INT NOT NULL PRIMARY KEY,
	Trangthai BIT, -- Bàn ảo = 0 là dùng để tạo đơn mang về và bàn thật = 1
	Hoatdong BIT, 
	Soluongcho INT, -- Số lượng chỗ ngồi trong 1 bàn
)
GO 
CREATE TABLE BanChiTiet(
	ID_Ban INT NOT NULL,
	ID_Hoadon INT NOT NULL,
	Thoidiemconguoi TIME,
	Donchinh BIT -- =0 đơn phụ không thực hiện thao tác =1 là đơn chính thực hiện thao tác
)
GO 
CREATE TABLE HoaDonChiTiet(
	ID_HoaDon INT NOT NULL,
	ID_SanPham VARCHAR(10) NOT NULL,
	Soluong INT NOT NULL,
	Gia INT NOT NULL,
	TongGia INT NOT NULL,
	TTthanhtoan BIT DEFAULT 0,
	Lydohuy NVARCHAR(100),
	ghichu NVARCHAR(100)
	--trang thai thanh toan
)
GO 
CREATE TABLE BanDat(
	ID_Ban INT NOT NULL,
	ID_NhanVien VARCHAR(10) NOT NULL, 
	TenKH NVARCHAR(50) NOT NULL,
	SDT VARCHAR(11) NOT NULL,
	Thoigian TIME NOT NULL
)
GO 
CREATE TABLE GiamGia(
	Id_GiamGia INT IDENTITY(1,1) PRIMARY KEY,
	Tensukien NVARCHAR(100),
	ID_Nhanvien VARCHAR(10),
	Ngaybd DATETIME,
	ngaykt DATETIME,	
)
GO
CREATE TABLE Giamgiachitiet(
	Id_GiamGia INT,
	ID_Sanpham VARCHAR(10),
	Giam INT
)
GO 
--Foreign key
ALTER TABLE dbo.HoaDon ADD FOREIGN KEY(ID_Nhanvien) REFERENCES dbo.NhanVien(ID_Nhanvien) --Hoadon
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_HoaDon) REFERENCES dbo.HoaDon(ID_Hoadon) --Hoadonchitiet
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_SanPham) REFERENCES dbo.SanPham(ID_Sanpham) --Hoadonchitiet
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_DonviSP) REFERENCES dbo.DonViSanPham(ID_DonviSP) --Sanpham
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_LoaiSP) REFERENCES dbo.LoaiSanPham(ID_LoaiSP) --SanPham
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --BanDat
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_NhanVien) REFERENCES dbo.NhanVien(ID_Nhanvien) --BanDat
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --banchitiet
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Hoadon) REFERENCES dbo.HoaDon(ID_Hoadon) --banchitiet
ALTER TABLE dbo.GiamGia ADD FOREIGN KEY(ID_Nhanvien) REFERENCES dbo.NhanVien(ID_Nhanvien) --GiamGia
ALTER TABLE dbo.Giamgiachitiet ADD FOREIGN KEY(Id_GiamGia) REFERENCES dbo.GiamGia(Id_GiamGia) --Giamgiachitiet
ALTER TABLE dbo.Giamgiachitiet ADD FOREIGN KEY(ID_Sanpham) REFERENCES dbo.SanPham(ID_Sanpham) --Giamgiachitiet
--

--Loaisanpham
INSERT dbo.LoaiSanPham VALUES('LSP1', N'Cà phê')
INSERT dbo.LoaiSanPham VALUES('LSP2', N'Sinh tố')
INSERT dbo.LoaiSanPham VALUES('LSP3', N'Nước ngọt')
INSERT dbo.LoaiSanPham VALUES('LSP4', N'Trà')
INSERT dbo.LoaiSanPham VALUES('LSP5', N'Sữa')
--Donvisanpham
INSERT dbo.DonViSanPham VALUES('DV1', N'Cốc',250)
--SanPHam
--INSERT dbo.SanPham VALUES ('SP1',N'Cà phê sữa',40000,'DV1','LSP1',1,N'')
--INSERT dbo.SanPham VALUES ('SP2',N'Sinh tố bơ',45000,'DV1','LSP2',1,N'')
--INSERT dbo.SanPham VALUES ('SP3',N'Nước Cam',20000,'DV1','LSP3',0,N'')
--INSERT dbo.SanPham VALUES ('SP4',N'Nutifood',30000,'DV1','LSP4',0,N'')

insert  SanPham values ('SP01',N'Cà phê trứng',20000,'DV1','LSP3',1,'cach-pha-cafe-trung.jpg')
insert  SanPham values ('SP02',N'Cà phê Ý Americano',20000,'DV1','LSP2',1,'CafeYAmericano.jpg')
insert  SanPham values ('SP03',N'cà phê đường',20000,'DV1','LSP4',1,'CafeYAmericano.jpg')
insert  SanPham values ('SP04',N'Cà phê ý mocha',20000,'DV1','LSP1',1,'CafeYMocha.jpg')
insert  SanPham values ('SP05',N'cà phê đen',20000,'DV1','LSP1',1,'capheden.png')
insert  SanPham values ('SP06',N'Cà phê FlatWhite',20000,'DV1','LSP1',1,'CapheFlatWhite.jpg')
insert  SanPham values ('SP07',N'Cà phê nhỏ rọt',15000,'DV1','LSP1',1,'caphenhorot.png')
insert  SanPham values ('SP08',N'Cà phê Latte',20000,'DV1','LSP2',1,'capheyLatte.jpg')
insert  SanPham values ('SP09',N'Capuchino',25000,'DV1','LSP1',1,'capuchino.jpg')
insert  SanPham values ('SP10',N'Cà phê ColdBrew',20000,'DV1','LSP1',1,'ColdBrewCofffee.jpg')
insert  SanPham values ('SP11',N'Cookie cream',24000,'DV1','LSP1',1,'Cookie-Cream.jpg')
insert  SanPham values ('SP12',N'Nước ngọt pepsi',22000,'DV1','LSP1',1,'lon-nuoc-ngot-pepsi.jpg')
insert  SanPham values ('SP13',N'Milk shke',30000,'DV1','LSP1',1,'milkshake.jpg')
insert  SanPham values ('SP14',N'7 up',21000,'DV1','LSP1',1,'nuoc-ngot-7up-thai-lon-330ml.jpg')
insert  SanPham values ('SP15',N'Coca cola',24000,'DV1','LSP1',1,'nuoc-ngot-coca-cola.jpg')
insert  SanPham values ('SP16',N'Smothies',23000,'DV1','LSP1',1,'smoothies-e1601295150109.jpg')
insert  SanPham values ('SP17',N'Socola đá xay',25000,'DV1','LSP1',1,'socola-da-xay.jpg')
insert  SanPham values ('SP18',N'Soda ý',20000,'DV1','LSP1',1,'soda-y.jpg')
insert  SanPham values ('SP19',N'Sprite',20000,'DV1','LSP1',1,'sprite.jpg')
insert  SanPham values ('SP20',N'Sữa tươi chân trâu',22000,'DV1','LSP1',1,'sua-tuoi-chan-trau-duong-den.jpg')
insert  SanPham values ('SP21',N'Trà dào chanh sả',20000,'DV1','LSP1',1,'tra-dao-chanh-sa-e1601333987367.jpg')
insert  SanPham values ('SP22',N'Trà hoa',25000,'DV1','LSP1',1,'tra-hoa-dau-biec-e1601334294642.jpg')
insert  SanPham values ('SP23',N'Trà hoa quả',22000,'DV1','LSP1',1,'tra-hoa-qua.jpg')
insert  SanPham values ('SP24',N'Trà phô mai kem sữa',25000,'DV1','LSP1',1,'tra-pho-mai-kem-sua.jpg')
insert  SanPham values ('SP25',N'Trà tranh leo',20000,'DV1','LSP1',1,'tra-xanh-chanh-leo-kim-quat-mat-ong.jpg')

--SELECT * FROM dbo.SanPham WHERE Trangthai = 1 AND ID_Sanpham = ?
--Giam
--INSERT dbo.GiamGia
--VALUES(N'tùy','NV1',GETDATE(),GETDATE())
--INSERT dbo.GiamGia
--VALUES(N'tùy','NV1','2002/10/11','2002/10/11')
--INSERT dbo.GiamGia
--VALUES(N'thứ 6','NV1',GETDATE(),GETDATE())
go
--Giam chi tiết
--INSERT dbo.Giamgiachitiet
--VALUES(2,'SP2',50)
--INSERT dbo.Giamgiachitiet
--VALUES(2,'SP1',20)
--INSERT dbo.Giamgiachitiet
--VALUES(2,'SP2',20)
--INSERT dbo.Giamgiachitiet
--VALUES(2,'SP1',50)
--Nhanvien
INSERT dbo.NhanVien VALUES('NV1',N'Vũ Văn Lanh',1,'2002/10/11',N'Hà nội',N'lanhvvph14774@gmail.com','0123456789','lanhmegai','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV2',N'Vũ Văn Lanh',1,'2002/10/11',N'Hà nội',N'lanhvvph14774@gmail.com','0123456789','lanhmegai','123456',1, 0,N'')
INSERT dbo.NhanVien VALUES('NV3',N'Vũ Văn Lanh',1,'2002/10/11',N'Hà nội',N'lanhvvph14774@gmail.com','0123456789','lanhmegai','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV4',N'Vũ Văn Lanh',1,'2002/10/11',N'Hà nội',N'lanhvvph14774@gmail.com','0123456789','lanhmegai','123456',1, 0,N'')
--Ban
--INSERT dbo.Ban VALUES(0,1,1,2)--TRang thai = 1 la mang ban su dung, Hoatdong = 1 la ban trong =0 la ban dang co nguoi
--INSERT dbo.Ban VALUES(15,0,1,2)
--SELECT * FROM dbo.Ban WHERE Trangthai = 1
--DELETE FROM dbo.HoaDon
--UPDATE dbo.Ban SET Hoatdong = 1 WHERE ID_Ban = 0
--HoaDon
--select*from HoaDon
--select*from HoaDonChiTiet
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,1) --Trangthai = 1 la hoatdong, Trangthai = 0 la huydon
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,0) --TTThanhtoan = 1 la da thanh toan = 0 chua thanh toan
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),0,0) --
--SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 0
GO 
CREATE PROC chuyendon (@mahd int)
AS
BEGIN 
	DELETE FROM dbo.BanChiTiet WHERE ID_Hoadon = @mahd
	DELETE FROM dbo.HoaDon WHERE ID_Hoadon = @mahd
END 