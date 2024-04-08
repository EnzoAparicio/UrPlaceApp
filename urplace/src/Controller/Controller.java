package Controller;

import static spark.Spark.*;

public class Controller {
    public static void main(String[] args) {
        // Define una ruta GET
        get("/hello", (req, res) -> "¡Hola Mundo!");
        
        // Define una ruta POST
        post("/submit", (req, res) -> {
            String data = req.body();
            return "Datos recibidos: " + data;
        });
    }
}
