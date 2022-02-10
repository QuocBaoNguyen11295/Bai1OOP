package Worker;

import Officer.Officer_base;

public class Worker_class extends Officer_base {
    private int LevelWorker;
    public Worker_class(String hoTenWorker,int tuoiWorker, String gioiTinhWorker, String diaChiWorker, int levelWorker){
        super(hoTenWorker,tuoiWorker,gioiTinhWorker,diaChiWorker);
        LevelWorker = levelWorker;
    }

    public void setLevelWorker(int levelWorker) {
        LevelWorker = levelWorker;
    }

    public int getLevelWorker() {
        return LevelWorker;
    }
    @Override
    public String toString(){
        return "Worker{" +
                "level=" + LevelWorker +
                ", name='" + getHoTen() + '\'' +
                ", age=" + getTuoi() +
                ", gender='" + getGioiTinh() + '\'' +
                ", address='" + getDiaChi() + '\'' +
                '}';
    }
}
