package Ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}
