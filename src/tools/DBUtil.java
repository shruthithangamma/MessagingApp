package tools;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("MessageApp");
	public static EntityManagerFactory getEmFactory()
	{
		return emf;
	}
	
}
