package com.java.employ.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.java.employ.model.Employ;

public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
	}
	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}

	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employUpdated) {
		Employ employFound = searchEmployDao(employUpdated.getEmpno());
		if (employFound!=null) {
			employFound.setName(employUpdated.getName());
			employFound.setDob(employUpdated.getDob());
			employFound.setGender(employUpdated.getGender());
			employFound.setDept(employUpdated.getDept());
			employFound.setDesig(employUpdated.getDesig());
			employFound.setBasic(employUpdated.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String writeEmployFileDao() throws IOException {
		FileOutputStream fout = new FileOutputStream("c:/files/output.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(employList);
		objout.close();
		fout.close();
		return "Data Stored Successfully...";
	}

	@Override
	public String readEmployFileDao() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("c:/files/output.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		employList = (List<Employ>)objin.readObject();
		objin.close();
		fin.close();
		return "Data Retrieved Successfully...";
	}

}
