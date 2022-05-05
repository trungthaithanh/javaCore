create database qlbansach;
use qlbanhsach;

create table khachhang(
	makh int auto_increment, 
    taikhoan nvarchar(255),
    email nvarchar(255),
	diachi nvarchar(255),
    dienthoai nvarchar(100),
	gioitinh nvarchar(4),
    hoten nvarchar(150),
	primary key(makh)
);

create table chude(
	machude int auto_increment,
    tenchude nvarchar(255),
    primary key(machude)
);

create table nhaxuatban(
	mansx int auto_increment,
    tennsb nvarchar(150),
    dienthoai nvarchar(100),
    diachi nvarchar(255),
    primary key(mansx)
);

create table tacgia(
	matacgia int auto_increment,
    tentacgia nvarchar(150),
    dienthoai nvarchar(100),
    tieusu nvarchar(255),
	diachi nvarchar(255),
	primary key(matacgia)
);

create table donhang(
	madonhang int auto_increment,
    dathanhtoan boolean,
    ngaygiao datetime,
    ngaydat datetime,
    tinhtranggh nvarchar(100),
    makh int,
    primary key(madonhang),
    constraint fk_makh foreign key(makh) references khachhang(makh)
);

create table sach(
	masach int auto_increment,
    tensach nvarchar(100),
    giaban int,
    mota nvarchar(255),
    anhbia varbinary(255),
    ngaycapnhap datetime,
    soluongton int,
    machude int,
    mansx int,
    primary key(masach),
    constraint fk_machude foreign key(machude) references chude(machude),
    constraint fk_masx foreign key(mansx) references nhaxuatban(mansx)
);

create table gom(
	madonhang int,
    masach int,
    soluong int,
    dongia int,
    primary key(madonhang,masach),
    constraint fk_madonhang foreign key(madonhang) references donhang(madonhang),
    constraint fk_masach_gom foreign key(masach) references sach(masach)
);

create table thamgia(
	matacgia int,
    masach int,
    vaitro nvarchar(100),
    vitri nvarchar(100),
    primary key(matacgia,masach),
    constraint fk_matacgia foreign key(matacgia) references tacgia(matacgia),
    constraint fk_masach_thamgia foreign key(masach) references sach(masach)
);
