/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUL;

import Entity.Hoadon;
import javax.swing.table.DefaultTableModel;
import GUI.QuanLyHoaDonJPanel;
import java.util.ArrayList;
import java.util.List;
import DAO.HoaDonDAO;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN ASUS
 */
public class SerHoaDon {

    HoaDonDAO dao = new HoaDonDAO();

    public void filltotablehoadon() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai1();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
    public void filltotablehoadon_chuathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai1_chuathanhtoan();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
     public void filltotablehoadon_dathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai1_dathanhtoan();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }

    public void filltotablehoadonhuy() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
     public void filltotablehoadonhuy_chuathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0_chuathanhtoan();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
        public void filltotablehoadonhuy_dathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0_dathanhtoan();
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }

    public void Find() {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.jDateChooser1.getDate();
        Date b = QuanLyHoaDonJPanel.jDateChooser2.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong(a, b);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong(a, b);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
    public void Find_dathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.jDateChooser1.getDate();
        Date b = QuanLyHoaDonJPanel.jDateChooser2.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong_dathanhtoan(a, b);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong_dathanhtoan(a, b);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
     public void Find_chuathanhtoan() {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.jDateChooser1.getDate();
        Date b = QuanLyHoaDonJPanel.jDateChooser2.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong_chuathanhtoan(a, b);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong_chuathanhtoan(a, b);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }

    public void Find_1ngay(Date a) {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay(a);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay(a);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
    public void Find_1ngay_dathanhtoan(Date a) {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay_dathanhtoan(a);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay_dathanhtoan(a);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
     public void Find_1ngay_chuathanhtoan(Date a) {
        List<Hoadon> list = new ArrayList<>();
        List<Hoadon> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay_chuathanhtoan(a);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay_chuathanhtoan(a);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }

    public void fillTableSearch(String keyword) {
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model1.setRowCount(0);
        try {

            List<Hoadon> list = dao.selectAll_SQL_Find_HoatDong_keyword(keyword);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
        try {

            List<Hoadon> list1 = dao.selectAll_SQL_Find_koHoatDong_keyword(keyword);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    public void fillTableSearch_IDMaNV(String keyword) {
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model1.setRowCount(0);
        try {

            List<Hoadon> list = dao.select_all_sql_find_HoatDong_keyword_IDMaNV(keyword);
            for (Hoadon hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
        try {

            List<Hoadon> list1 = dao.select_all_sql_find_KoHoatDong_keyword_IDMaNV(keyword);
            for (Hoadon hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    public void huydon(int a) {
        Hoadon hd = dao.selectById(a);
        hd.setTrangThai(false);
        dao.updateTrangThai(hd);
        filltotablehoadon();
        filltotablehoadonhuy();
    }
    public void huydon1(int a,String tennv,String noidung) {
        Hoadon hd = dao.selectById(a);
        hd.setTrangThai(false);
        dao.updateTrangThai1(hd,tennv,noidung);
        filltotablehoadon();
        filltotablehoadonhuy();
    }
     public void hoantacdon(int a) {
        Hoadon hd = dao.selectById(a);
        hd.setTrangThai(true);
        dao.updateTrangThai(hd);
        filltotablehoadon();
        filltotablehoadonhuy();
    }
}
