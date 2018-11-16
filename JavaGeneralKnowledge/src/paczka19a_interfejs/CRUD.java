package paczka19a_interfejs;

public interface CRUD {
	
	//CRUD, czyli zestaw metod do podstawowych operacji na encji bazodanowej (create, read, update, delete)

	
	 String getAll();
	 String getOne();
	 String insert();
	 String update();
	 String delete();
	
}
