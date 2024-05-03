package modelo

import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager

class claseConexion {

    fun cadenaConexion(): Connection? {
        try {
            val ip = "jdbc:oracle:thin:@10.10.0.144:1521:xe"
            val usuario = "system"
            val password = "desarrollo"

            val conexion = DriverManager.getConnection(ip, usuario, password)
            return conexion
        }
        catch (e: Exception){
            println("Error: $e")
            return null
        }
    }


}