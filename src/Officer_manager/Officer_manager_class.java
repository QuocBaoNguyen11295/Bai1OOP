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
        if(officer_list.size() == 0){
            System.err.println("No officer exists in the list!");
        }else{
            for(int i = 0;i < officer_list.size();i++) {
                System.out.println(officer_list.get(i).toString());
            }
        }
    }
}
