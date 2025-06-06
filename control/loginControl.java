package control;

public class loginControl {
    
    String[][] datos = {
        {"drmorales", "1234"},{"jlopez", "abcd"},{"amartinez", "pass2025"},
        {"cperez", "qwerty"},{"lgarcia", "admin123"},{"rfernandez", "secure!"},
        {"mmendoza", "clave987"},{"asolano", "contraseña1"},{"vnavarro", "login2025"},
        {"gcastillo", "miPass#7"},{"tjimenez", "root2025"}
    };
    
    public boolean validacionDatos(String Eusuario, String Econtrasenna) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][0].equals(Eusuario) && datos[i][1].equals(Econtrasenna)) {
                return true; // Coincidencia encontrada, acceso permitido
            }
        }
        return false; // No se encontró ninguna coincidencia
    }
}
