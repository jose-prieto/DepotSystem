package DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

//import DBController.DBConnection;
public class MaterialCRUD {

    DBConnection connectivity = new DBConnection();
    PreparedStatement ps;
    ResultSet res;
    
    
    public String ConsultMaterial(String name) {
        
        Connection con = null;
        List result = new ArrayList();
        String hola = null;
        
        try {
            con = connectivity.getConnection();

            ps = con.prepareStatement("SELECT * FROM products WHERE Product = '" + name + "'");
            res = ps.executeQuery();
            
            hola = res.getString("Provider");
            result.add(res.getString("Provider"));
            result.add(res.getString("Department"));
            result.add(res.getString("Quant"));
            result.add(res.getString("MinQuant"));

            if (!res.next()) {
                System.out.println("No Existen Datos");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return hola;
    }

    public void AddNewMaterial() {
        try {
            Connection con = null;
            con = connectivity.getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM users");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, res.getString("UserName") + " ");
            } else {
                System.out.println("No Existen Datos");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
