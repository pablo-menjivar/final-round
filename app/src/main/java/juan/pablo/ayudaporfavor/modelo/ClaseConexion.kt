package juan.pablo.ayudaporfavor.modelo

import java.sql.Connection
import java.sql.DriverManager
class ClaseConexion {
    fun cadenaConexion(): Connection?{
        try {
            val ip = "jdbc:oracle:thin:@192.168.1.20:1521:xe"
            val usuario = "system"
            val contrasena = "Bimbimcito135@"

            val conexion = DriverManager.getConnection(ip, usuario, contrasena)
            return conexion
        }catch (e: Exception){
            println("Este es el error: $e")
            return null
        }
    }
}