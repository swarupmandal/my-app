package org.hibernate.tutorial.app;

import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.domain.Person;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

	public EventManager() {
		System.out.println("EVENT MANAGER STARTED...");

	}

	public static void main(String[] args) {

		EventManager eventManager = new EventManager();
		/*if (args[0].equals("store")) {
			eventManager.createAndStoreEvent("Cricket", new Date());
			eventManager.createAndStoreEvent("Kabaddi", new Date());
		}
		
		if (args[0].equals("list")) {
			eventManager.listEvent();
		}*/
		
		//eventManager.createAndStoreEvent("Cricket", new Date());
		//eventManager.createAndStoreEvent("Kabaddi", new Date());
		//eventManager.listEvent();
		
		
		/*eventManager.storePerson("Mr. C", "mAx", 22);
		eventManager.storePerson("Mr. D", "dOnald", 23);
		eventManager.getPersonList();*/
		
		eventManager.addPersonToEvent(1l, 1l);
		
		HibernateUtil.getSessionFactory().close();
	}

	private void createAndStoreEvent(String title, Date date) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();

		Event event = new Event();
		event.setTitle(title);
		event.setDate(date);
		session.save(event);

		session.getTransaction().commit();

	}
	
	@SuppressWarnings("unchecked")
	private List<Event> listEvent(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		
		List<Event> events = session.createQuery("from Event").list();
		
		for(Event e : events){
			System.out.println("ID > " + e.getId() + " Title > " + e.getTitle() + " Date > " + e.getDate());
		}
		
		session.getTransaction().commit();
		
		return events;
		
	}
	
	
	private void storePerson(String firstName, String lastName, int age) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		
		Person person = new Person();
		person.setFirstname(firstName);
		person.setLastname(lastName);
		person.setAge(age);
		
		session.save(person);
		
		session.getTransaction().commit();
		
	}
	
	private List<Person> getPersonList(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		
		List<Person> list = session.createQuery("from Person").getResultList();
		for(Person p : list){
			System.out.println("ID > " + p.getId() + " First Name > " + p.getFirstname() + " Last Name > " + p.getLastname() + " Age > " + p.getAge());
		}
		
		session.getTransaction().commit();
		return list;
	}
	

	private void addPersonToEvent(Long personId, Long eventId) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		
		Person person = session.load(Person.class, personId);
		Event event = session.load(Event.class, eventId);
		
		person.getEventList().add(event);
		
		session.getTransaction().commit();
		
	}
}
