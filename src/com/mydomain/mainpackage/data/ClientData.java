package com.mydomain.mainpackage.data;

import java.sql.SQLException;

import ca.senecacollege.prg556.hocorba.bean.Client;
import ca.senecacollege.prg556.hocorba.dao.ClientDAO;

//import com.sun.jersey.api.client.Client;

public class ClientData implements ClientDAO{

	public ClientData() {
		// TODO Auto-generated constructor stub
	}
	public Client getClient(int id) throws SQLException 
	{
		int id1 = 1;
		int id2 = 2;
		int id3 = 3;
		
		if(id == id1)
		{
			return new Client(id1,"Vishesh","Mendiratta");
		}
		if(id == id2)
		{
			return new Client(id2, "Vedant", "Mendiratta");
		}
		if(id == id3)
		{
			return new Client(id3,"Serj","Sililian");
		}
		else
			return null;
	}
	public Client validateClient(String username, String password) throws SQLException
	{
		String username1 = "vishesh_m";
		String password1 = "vishesh_passwpord";
		
		String username2 = "serj_s";
		String password2 = "serj_password";
		
		String username3 = "vedant_m";
		String password3 = "vedant_p";
	}
}
