package app;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Message;
import tools.DBUtil;

/**
 * Servlet implementation class MessageApp
 */
@WebServlet("/MessageApp")
public class MessageApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MessageApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		if(action.equals("recent")) { 
			Message msg = (Message) em.createQuery("select d from Message d order by d.messagedate DESC").setMaxResults(1).getSingleResult();
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("recent_msg.jsp").forward(request, response);
			
			
		} else if (action.equals("older")) {
			 List<Message> messages =  em.createQuery("select d from Message d").getResultList();
			 request.setAttribute("messages", messages);
			 request.getRequestDispatcher("Display.jsp").forward(request, response);
			
	
		} else {
			doPost(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		Timestamp datetime = new Timestamp(System.currentTimeMillis());
		Message msg = new Message();
		msg.setName(name);
		msg.setMessage(message);
		msg.setMessagedate(datetime);
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
		    em.persist(msg);
		    trans.commit();
		    List<Message> messages =  em.createQuery("select d from Message d order by d.messagedate DESC").getResultList();
		    request.setAttribute("messages", messages);
		} 
		catch(Exception e){
			System.out.println("Exception in MessageApp Servlet"+e.getMessage());
		}
		finally {
			
		  em.close();
		}
		request.getRequestDispatcher("/Display.jsp").forward(request, response);
		
	}
}
