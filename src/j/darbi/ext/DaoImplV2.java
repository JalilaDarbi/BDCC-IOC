package j.darbi.ext;

import j.darbi.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs...");
        double t = 22;
        return t;
    }
}
