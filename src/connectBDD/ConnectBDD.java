package connectBDD;

import java.sql.*;

public class ConnectBDD {
	public static void main(String[] args) { 
		actionBase();
	}
	
	public static void actionBase(){		
		String url = "jdbc:mysql://localhost/test";
		String user = "root";
		String passwd = "";
		
		Connection cn = null;
		Statement st = null;
		ResultSet result = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			cn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion effective !");      
			
			//Création d'un objet Statement
		    st = cn.createStatement();
		    
		    //L'objet ResultSet contient le résultat de la requête SQL
		    result = st.executeQuery("SELECT * FROM personne ;");
		    
		    //On récupère les MetaData
		    ResultSetMetaData resultMeta = result.getMetaData(); 
		    
		    while(result.next()){
		    	System.out.println("nom: "+result.getString(1)+" prenom: "+result.getString(2));
		    }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				result.close();
			    st.close();
			    cn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

