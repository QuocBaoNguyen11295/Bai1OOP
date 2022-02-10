package Officer;

public class Officer_base {
    private String HoTen;
    private String Tuoi;
    private String GioiTinh;
    private String DiaChi;
    public Officer_base(String hoTen,String tuoi, String gioiTinh,String diaChi){
         HoTen = hoTen;
         Tuoi = tuoi;
         GioiTinh = gioiTinh;
         DiaChi = diaChi;
    }
    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public String getTuoi() {
        return Tuoi;
    }
}
