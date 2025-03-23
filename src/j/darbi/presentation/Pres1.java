package j.darbi.presentation;

import j.darbi.dao.DaoImpl;
import j.darbi.dao.IDao;
import j.darbi.ext.DaoImplV2;
import j.darbi.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao); //injection des dependances via le setter
        System.out.println("RES=" + metier.calcul());
    }
}
