public class Doctor {
    //Ingredientes
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo un Objeto Doctor");
        id++;
    }


    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("El id del doctor es: " + id);
    }

}
