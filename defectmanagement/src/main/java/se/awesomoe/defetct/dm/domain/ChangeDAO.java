package se.awesomoe.defetct.dm.domain;



import se.awesomoe.defetct.api.bo.Change;

import java.io.Serializable;
import javax.persistence.*;

 
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "DM_CHANGE")
public class ChangeDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cid;
	private String information;
	private Date createdDate;
	private Date finishedDate;
	private String agentNr;
    private String severity;
	
	 
	@Column(name = "CHANGE_INFORMATION")
	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Column(name = "CHANGE_CREATEDDATE")
 	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CHANGE_FINISHEDDATE")
 	public Date getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
	}

	@Column(name = "CHANGE_AGENTNR")
	public String getAgentNr() {
		return agentNr;
	}

 	public void setAgentNr(String agentNr) {
		this.agentNr = agentNr;
	}

	public Long getCid() {
		return cid;
	}

	@Id
	@GeneratedValue
	@Column(name = "CHANGE_ID")
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getSeverity() {
		return severity;
	}

	@Column(name = "CHANGE_SEVERITY")
	public void setSeverity(String severity) {
		this.severity = severity;
	}

 	/**
 	 * Handle to move data from  DB to API.
 	 * @param ch
 	 * @return
 	 */
 	public ChangeDAO fromBOtoDAO(Change ch ){
 		ChangeDAO dao = new ChangeDAO();
 		dao.setCid(ch.getId());
 		dao.setAgentNr(ch.getAgentNr());
 		dao.setFinishedDate(ch.getFinishedDate());
 		dao.setInformation(ch.getInformation());
        dao.setCreatedDate(ch.getCreatedDate());
  		return dao;
 	}
  	/**
 	 * Handle to convert dao to bo.
 	 * 
 	 * @return
 	 */
 	public Change asChange() {
 		Change ch = new Change();
 		ch.setAgentNr(this.agentNr);
 		ch.setCreatedDate(this.createdDate);
 		ch.setId(this.cid);
 		ch.setFinishedDate(this.finishedDate);
 		return ch;
  	}
 	
}
