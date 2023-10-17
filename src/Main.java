import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Dr. Simi" ;
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorDan = new Doctor();
        myDoctorDan.name = "Dr. Dan" ;
        myDoctorDan.showName();
        myDoctorDan.showId();

        showMenu();

    }


}