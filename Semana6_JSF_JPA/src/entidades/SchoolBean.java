package entidades;

import java.util.List;

import javax.faces.bean.ManagedBean;

import operations.DatabaseOperations;

@ManagedBean
public class SchoolBean {
	private int id;
	private String name;
	private String editSchoolId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEditSchoolId() {
		return editSchoolId;
	}
	public void setEditSchoolId(String editSchoolId) {
		this.editSchoolId = editSchoolId;
	}
	
	//invocacion a operaciones CRUD
	public List schoolListFromDb() {
		return DatabaseOperations.getAllSchools();
		
	}
	

}
