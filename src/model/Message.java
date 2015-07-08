package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "MESSAGE" database table.
 * 
 */
@Entity
@Table(name="\"MESSAGE\"", schema="TESTUSER")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="\"MESSAGE\"")
	private String message;

	@Temporal(TemporalType.TIMESTAMP)
	private Date messagedate;

	private String name;

	public Message() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getMessagedate() {
		return this.messagedate;
	}

	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}