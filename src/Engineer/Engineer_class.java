package Engineer;

import Officer.Officer_base;

public class Engineer_class extends Officer_base {
    private String NganhDaoTaoEngineer;
    public Engineer_class(String hoTenEngineer,int tuoiEngineer,String gioiTinhEngineer, String diaChiEngineer, String nganhDaoTaoEngineer){
        super(hoTenEngineer,tuoiEngineer,gioiTinhEngineer,diaChiEngineer);
        this.NganhDaoTaoEngineer = nganhDaoTaoEngineer;
    }

    public void setNganhDaoTaoEngineer(String nganhDaoTaoEngineer) {
        NganhDaoTaoEngineer = nganhDaoTaoEngineer;
    }

    public String getNganhDaoTaoEngineer() {
        return NganhDaoTaoEngineer;
    }
    @Override
    public String toString(){
        return "Engineer{" +
                "Faculty=" + getNganhDaoTaoEngineer() +
                ", name='" + getHoTen() + '\'' +
                ", age=" + getTuoi() +
                ", gender='" + getGioiTinh() + '\'' +
                ", address='" + getDiaChi() + '\'' +
                '}';
    }
}
