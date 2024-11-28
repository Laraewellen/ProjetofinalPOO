package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("DefesaCivil");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
