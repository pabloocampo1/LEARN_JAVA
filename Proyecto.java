import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto {
    public static boolean volverAlMenu() {

        Scanner scam = new Scanner(System.in);
        System.out.println("Desea volver al menu? (si/no)");
        String option = scam.nextLine();
        if(option.equals("si")) {
            return true;
        }
        return false;
    };

    public static void editarTarea(ArrayList<String> arr){
        mostrarTareas(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println( "digite el numero de la tarea a editar: ");
        int opcionTarea = scanner.nextInt();
        scanner.nextLine();

        System.out.println("edita: ");
        String nuevaTarea = scanner.nextLine();

        try {
            arr.set(opcionTarea, nuevaTarea);
        } catch (Exception e) {
            System.out.println("el numero de la tarea no existe");
        }
    };

    public static void eliminarTarea(ArrayList<String> arr){
        mostrarTareas(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println( "digite el numero de la tarea a elscannernar: ");
        int opcionTarea = scanner.nextInt();
        String tareaAEliminar = arr.get(opcionTarea);
        try {
            arr.remove(opcionTarea);
        } catch (Exception e) {
            System.out.println("el numero de la tarea no existe");
        }
        for (String string : arr) {
            if (string == tareaAEliminar) {
                System.out.println("la tarea " + tareaAEliminar + "aun esta o esta repetida");
                return;
            };
        }
        System.out.println("se elimino correctamente.");
    };

    public static void mostrarTareas(ArrayList<String> arr){
        if (arr.size() < 1) {
            System.out.println("no hay tareas");
            return;
        }
        System.out.println("tareas: ");
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(i + ":" + arr.get(i));
        };
        
    }

    public static void agregarTareas(ArrayList<String> tasks){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite el nombre de la tarea: ");
        String tarea = scanner.nextLine();
        tasks.add(tarea);
        boolean volver = volverAlMenu();
        if (!volver) {
            agregarTareas(tasks);
        }
    };
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        while (true) {
            System.out.println("-menu-");
            System.out.println("1. agregar tarea");
            System.out.println("2. editar una tarea");
            System.out.println("3. eliminar una tarea");
            System.out.println("4. ver todas las tareas");
            System.out.println("5. salir");
            System.out.println("__________________________________________");

            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese la opcion:");
            int option = scanner.nextInt();

            if(option == 1) {
                agregarTareas(tareas);
            }else if(option == 4){
                mostrarTareas(tareas);
            }else if(option == 2){
                editarTarea(tareas);
            }else if(option == 3){
                eliminarTarea(tareas);
            }else if(option == 5){
                scanner.close();
                break;
            }
            
        }
    }
}
