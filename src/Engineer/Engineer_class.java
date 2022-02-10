package Engineer;

import Officer.Officer_base;

public class Engineer_class extends Officer_base {
    private String HoTenEngineer;
    private String TuoiEngineer;
    private String GioiTinhEngineer;
    private String DiaChiEngineer;
    private String NganhDaoTaoEngineer;
    public Engineer_class(String hoTenEngineer,String tuoiEngineer,String gioiTinhEngineer, String diaChiEngineer, String nganhDaoTaoEngineer){
        super(hoTenEngineer,tuoiEngineer,gioiTinhEngineer,diaChiEngineer);
        this.NganhDaoTaoEngineer = nganhDaoTaoEngineer;
    }

    public void setNganhDaoTaoEngineer(String nganhDaoTaoEngineer) {
        NganhDaoTaoEngineer = nganhDaoTaoEngineer;
    }

    public String getNganhDaoTaoEngineer() {
        return NganhDaoTaoEngineer;
    }
}
