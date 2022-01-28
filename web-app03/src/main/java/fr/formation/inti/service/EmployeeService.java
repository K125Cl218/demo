package fr.formation.inti.service;

import fr.formation.inti.dao.EmployeeDaoImpl;
import fr.formation.inti.dao.IGenericDao;
import fr.formation.inti.entity.Employee;

/*
 * couche de service
 * cree la logique metier
 * methodes avec des noms clairs pour une utilisation directe
 * C'est ici qu'on begin et commit/rollback les transactions
 */
public class EmployeeService {
	private IGenericDao<Employee, Integer> dao = new EmployeeDaoImpl();
	
	public Integer ajouterEmployee(Employee emp) {
		Integer empId = (Integer) dao.save(emp);
		return empId;
	}
}
