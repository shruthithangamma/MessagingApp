package appTest;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import model.Message;

import org.junit.Test;

import tools.DBUtil;

public class MessageAppTextareaLengthTest {

	@Test
	public void test() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try{
			List<Message> msg = em.createQuery("select d from Message d where LENGTH(d.message) > 140").getResultList();
			assertEquals(0 , msg.size());
		}catch(Exception e){
			fail("Not yet implemented"+e.getMessage());
		}
	}

}
