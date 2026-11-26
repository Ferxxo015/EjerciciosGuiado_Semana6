public class Main {
    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Facturación", "Python", 100, true);
        modulos[3] = new Modulo("Reportes", "SQL", 40, false);
        modulos[4] = new Modulo("Notificaciones", "JavaScript", 15, false);


        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);


        System.out.println("=== LISTADO DE MÓDULOS ===");
        System.out.println(analizador.listarModulos());

        System.out.println("Módulos terminados: " + analizador.contarTerminados());
        System.out.println("Progreso promedio del proyecto: " + analizador.calcularProgresoPromedio() + "%");


        System.out.println("\n=== BÚSQUEDA EXISTENTE ('Autenticación') ===");
        Modulo encontrado = analizador.buscarModulo("Autenticación");
        if (encontrado != null) {
            System.out.println("Encontrado -> " + encontrado.mostrarInformacion());
        } else {
            System.out.println("Módulo no encontrado.");
        }


        System.out.println("\n=== BÚSQUEDA INEXISTENTE ('Pagos') ===");
        Modulo noEncontrado = analizador.buscarModulo("Pagos");
        if (noEncontrado != null) {
            System.out.println("Encontrado -> " + noEncontrado.mostrarInformacion());
        } else {
            System.out.println("Resultado: null (El módulo no existe).");
        }


        System.out.println("\n=== DESAFÍO: MÓDULO CON MENOR PROGRESO ===");
        Modulo menor = analizador.obtenerMenorProgreso();
        if (menor != null) {
            System.out.println(menor.mostrarInformacion());
        }
    }
}
