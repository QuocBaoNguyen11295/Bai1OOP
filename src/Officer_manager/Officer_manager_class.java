package Officer_manager;

import Officer.Officer_base;

import java.util.ArrayList;
import java.util.List;

public class Officer_manager_class {
    private List<Officer_base> officer_list;
    public Officer_manager_class(){
        officer_list = new ArrayList<>();
    }

    public void addOfficer(Officer_base officer){
        officer_list.add(officer);
    }

    public Officer_base searchOfficerByName(String name){
        for(Officer_base officer: officer_list){
            if(officer.getHoTen().equalsIgnoreCase(name)){
                return officer;
            }
        }
        return null;
    }

    public void showOfficerInfoList(){
        for(Officer_base officer: officer_list){
            System.out.println(officer.toString());
        }
    }
}
