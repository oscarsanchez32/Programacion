/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSocio;

/**
 *
 * @author oscar
 */
public class GestionSocios {
    private ArrayList<Socio> tablaSocios = new ArrayList<Socio>();
    
    public void main (String [] args){
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Bienvenido a la gestión de los socios.");
        System.out.println("");
        System.out.println("Aquí tiene el menú de gestión");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
        System.out.println("4. Listado por DNI");
        System.out.println("5. Listado por antigüedad");
        System.out.println("6. Salir");
        System.out.println("");
        System.out.println("Introduzca la opción deseada");
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                    altaSocio(sc);
                    break;
            case 2:
                    bajaSocio(sc);
                    break;
            case 3:
                    modificacionSocio(sc);
                    break;
            case 4:
                    listadoPorDNI();
                    break;
            case 5:
                    listadoPorAntiguedad();
                    break;
            case 6:
                    guardarSocios();
                    System.out.println("Gracias, ha sido guardado");
                    break;
            default:
                    System.out.println("Opción no válida");
                    break;
        }
        } while (opcion =! 6);
        
    }
    private static void cargarSocios() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            socios = (ArrayList<Socio>) in.readObject();
            System.out.println("Socios cargados desde el fichero socios.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se ha podido cargar el fichero socios.dat. Se creará uno nuevo.");
        }
    }

    private static void guardarSocios() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
            System.out.println("Socios guardados en el fichero socios.dat");
        } catch (IOException e) {
            System.out.println("No se ha podido guardar los socios en el fichero socios.dat");
        }
    }

    private static void altaSocio(Scanner sc) {
        System.out.println("Alta de Socio");
        System.out.println("");
        System.out.print("Introduzca el DNI del socio: ");
        String dni = sc.nextLine();
        if (existeSocio(dni)) {
            System.out.println("Ya existe un socio con ese DNI");
            return;
        }
        System.out.print("Introduzca el nombre del socio: ");
        String nombre = sc.nextLine();
        Socio socio = new Socio(dni, nombre);
        socio.add(socio);
        System.out.println("Socio dado de alta correctamente");
    }

    private static void bajaSocio(Scanner sc) {
        System.out.println("Baja de Socio");
        System.out.println("");
        System.out.print("Introduzca el DNI del socio a dar de baja: ");
        String dni = sc.nextLine();
        Socio socioEncontrado = null;
    for (Socio s : socio) {
        if (s.getDni().equals(dni)) {
            socioEncontrado = s;
            break;
        }
    }
    if (socioEncontrado != null) {
        socio.remove(socioEncontrado);
        System.out.println("El socio con DNI " + dni + " ha sido dado de baja.");
    } else {
        System.out.println("No se encontró ningún socio con el DNI proporcionado.");
    }
    
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
    out.writeObject(socio);
        } catch (IOException e) {
        System.out.println("Error al guardar los datos en el archivo socios.dat.");
        e.printStackTrace();
    }

}
    
}

    
}
