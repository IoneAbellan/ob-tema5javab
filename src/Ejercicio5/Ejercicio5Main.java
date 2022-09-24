package Ejercicio5;

public class Ejercicio5Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }


}
