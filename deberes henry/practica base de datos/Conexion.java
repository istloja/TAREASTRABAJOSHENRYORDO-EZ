package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    public void conexion(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection valor = DriverManager.getConnection("jdbc:mysql://localhost/Futbol_db", usuario, clave);
            Connection valor1 = DriverManager.getConnection("jdbc:mysql://localhost/Futbol", usuario, usuario);
            System.out.println(valor.getCatalog());
            Statement s = valor.createStatement();
            //Inicializamops la consulta
            ResultSet resultado = s.executeQuery("Select * from persona");

            while (resultado.next()) {
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Escribir(String usuario, String clave, int idpersona, String nombre, String apellido, String cedula, int edad) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection valor = DriverManager.getConnection("jdbc:mysql://localhost/Futbol_db", usuario, clave);
            PreparedStatement s = valor.prepareStatement("insert into persona values (?,?,?,?) ");
            s.setInt(3, idpersona);
            s.setString(4, nombre);
            s.setString(5, apellido);
            s.setString(6, cedula);
            s.setInt(7, edad);

            s.executeUpdate();

        } catch (Exception e) {
        }

    }

    public void actualizar(String usuario, String clave, int idpersona, String nombre, String apellido, String cedula) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection valor = DriverManager.getConnection("jdbc:mysql://localhost/Futbol_db", usuario, clave);
            PreparedStatement s = valor.prepareStatement("UPDATE persona set nombre=?, apellido=?, cedula=? where idpersona=? ");
            s.setString(1, nombre);
            s.setString(2, apellido);
            s.setString(3, cedula);
            s.setInt(4, idpersona);
            s.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void eliminar(String usuario, String clave, int idpersona) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection valor = DriverManager.getConnection("jdbc:mysql://localhost/Futbol_db", usuario, clave);
            PreparedStatement s = valor.prepareStatement("DELETE from persona where idpersona=? ");
            s.setInt(1, idpersona);

            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        Conexion valor = new Conexion();
//        valor.conexion("root", "root");
//        valor.Escribir("root", "root", 1, "Carlos", "Lopez", "0114324464");
        valor.actualizar("root", "root", 645364, "Pepe", "Ordoñez", "112345564");
        valor.eliminar("root", "root", 645364);

    }
}
