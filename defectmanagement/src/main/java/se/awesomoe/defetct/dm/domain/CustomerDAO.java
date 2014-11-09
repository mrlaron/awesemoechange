package se.awesomoe.defetct.dm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author lars.g.mellberg
 *
 */
@Entity
@Table(name = "DM_CUSTOMER")
public class CustomerDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8306189999584846759L;
	
	private Long customer_id;
	private String title;
	private String phone;
	private String firstName;
	private String secondName ;
	
	/**
	 * 
	 */
	public CustomerDAO() {
		
	}
	
	
	/**
	 * 
	 * @param customer_id
	 * @param title
	 * @param phone
	 * @param firstName
	 * @param secondName
	 */
	public CustomerDAO(Long customer_id, String title, String phone,
			String firstName, String secondName) {
		this.customer_id = customer_id;
		this.title = title;
		this.phone = phone;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Long getCustomer_id() {
		return customer_id;
	}
	
	/**
	 * 
	 * @param customer_id
	 */
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone() {
		return phone;
	}
	
	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	
	/**
	 * 
	 * @param secondName
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
	
	

}
