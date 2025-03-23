package j.darbi.metier;

import j.darbi.dao.DaoImpl;
import j.darbi.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    /**
     *
     * pour l injection dans l attribut
     * au moment de  instantiaion
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t *Math.PI/2 *Math.cos(t);
        return res;
    }

    /**
     *
     * pour l injection dans l attribut
     * apres instantiaion
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
