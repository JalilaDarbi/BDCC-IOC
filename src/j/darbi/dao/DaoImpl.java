package j.darbi.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double t = 15;
        return t;
    }
}
