package fr.unicaen.am.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import domain.person.Person;
import domain.person.SQLPersonDAO;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserRole;

@Repository
public class PersonDAO extends SQLPersonDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final String db = "social_network";
	private static Connection link;
	static {
		try {
        	MysqlDataSource ds=new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setDatabaseName(db);
            link=ds.getConnection("root","root");
            if (!link.isValid(0)) {
                throw new SQLException("Failed to initialize a valid connection to database.");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public PersonDAO() throws SQLException {
		
		super(link,"user");
		//createTables();
	}
	
	@Override
	public User retrieve(String email){
		return (User)sessionFactory.getCurrentSession().createQuery("from User where email ='"+email+"'").uniqueResult();
	}
	
	@Override
	public void create(Person p, String password) throws Exception{
		//User user = new User(p.getName(),p.getFirstName(),p.getEmail());
		//user.setPassword(password);
		//user.setEnabled(true);
		sessionFactory.getCurrentSession().save((User)p);
		sessionFactory.getCurrentSession().save(new UserRole((User)p,"ROLE_USER"));
	}

}
