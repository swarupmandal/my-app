package org.hibernate.tutorial.app;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

	public EventManager() {
		System.out.println("EVENT MANAGER STARTED...");

	}

	public static void main(String[] args) {

		EventManager eventManager = new EventManager();
		if (args[0].equals("store")) {
			eventManager.createAndStoreEvent("Cricket", new Date());
			eventManager.createAndStoreEvent("Football", new Date());
		}
		
		if (args[0].equals("list")) {
			eventManager.listEvent();
		}
		
		HibernateUtil.getSessionFactory().close();
	}

	private void createAndStoreEvent(String title, Date date) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Event event = new Event();
		event.setTitle(title);
		event.setDate(date);
		session.save(event);

		session.getTransaction().commit();

	}
	
	private List<Event> listEvent(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Event> events = session.createQuery("from Event").list();
		
		System.out.println("List Size >>> >> > " +events.size());
		
		for(Event e : events){
			System.out.println("ID > " + e.getId() + " Title > " + e.getTitle() + " Date > " + e.getDate());
		}
		
		session.getTransaction().commit();
		
		return events;
		
	}
	
	
	

}
