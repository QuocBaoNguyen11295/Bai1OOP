package Staff;

import Officer.Officer_base;

public class Staff_class extends Officer_base {
    private String HoTenStaff;
    private String TuoiStaff;
    private String GioiTinhStaff;
    private String DiaChiStaff;
    private String CongViecStaff;
    public Staff_class(String hoTenStaff,String tuoiStaff,String gioiTinhStaff,String diaChiStaff,String congViecStaff){
        super(hoTenStaff,tuoiStaff,gioiTinhStaff,diaChiStaff);
        this.CongViecStaff = congViecStaff;
    }

    public void setCongViecStaff(String congViecStaff) {
        CongViecStaff = congViecStaff;
    }

    public String getCongViecStaff() {
        return CongViecStaff;
    }
}
