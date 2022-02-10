package Staff;

import Officer.Officer_base;

public class Staff_class extends Officer_base {
    private String CongViecStaff;
    public Staff_class(String hoTenStaff,int tuoiStaff,String gioiTinhStaff,String diaChiStaff,String congViecStaff){
        super(hoTenStaff,tuoiStaff,gioiTinhStaff,diaChiStaff);
        this.CongViecStaff = congViecStaff;
    }

    public void setCongViecStaff(String congViecStaff) {
        CongViecStaff = congViecStaff;
    }

    public String getCongViecStaff() {
        return CongViecStaff;
    }

    @Override
    public String toString(){
        return "Staff{" +
                "occupation=" + getCongViecStaff() +
                ", name='" + getHoTen() + '\'' +
                ", age=" + getTuoi() +
                ", gender='" + getGioiTinh() + '\'' +
                ", address='" + getDiaChi() + '\'' +
                '}';
    }
}
