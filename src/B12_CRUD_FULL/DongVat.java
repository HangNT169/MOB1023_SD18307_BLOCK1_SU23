package B12_CRUD_FULL;

import java.io.Serializable;

/**
 *
 * @author cuongnguyenba
 */
public class DongVat implements Serializable{

    private String maDV;
    private String tenDongVat;
    private int canNang;
    private boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDongVat, int canNang, boolean gioiTinh) {
        this.maDV = maDV;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
