package appTest;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import model.Message;

import org.junit.Test;

import tools.DBUtil;

public class MessageAppTest {

	@Test
	public void test() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try{
			Message msg = em.find(Message.class, 1753l);
			assertEquals("3" , msg.getName());
		}catch(Exception e){
			fail("Not yet implemented"+e.getMessage());
		}
		;
	}

}