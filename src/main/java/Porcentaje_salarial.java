import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porcentaje_salarial {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****REGISTRO DE EMPLEADOS*****");

        boolean aux = true;

        while (aux) {

            System.out.println("1. Calcular rango salarial de 18 a 30 años: ");
            System.out.println("2. Calcular rango salarial de 31 a 60: ");
            System.out.println("3. Terminar");

            System.out.println("Ingrese un numero entre 1 - 3: ");
            int result = Integer.parseInt(scanner.nextLine());

            switch (result) {
                case 1:

                    List<Funcionarios> funcionario = Select_One();

                    if (funcionario.equals("")) {
                        System.out.println("Este funcionario no se encuentra registrado");
                    } else {
                        for (int i = 0; i < funcionario.size(); i++) {
                            double average = funcionario.get(i).getSalary() + (funcionario.get(i).getSalary() * 0.05);
                            System.out.println("Este es el salario a pagar: " + average + " Nombre: " + funcionario.get(i).getName());
                        }

                    }
                    break;

                case 2:

                    List<Funcionarios> funcionarios = Select_funcionary();

                    if (funcionarios.equals("")) {
                        System.out.println("Este funcionario no se encuentra registrado");
                    } else {
                        for (int i = 0; i < funcionarios.size(); i++) {
                            double average = funcionarios.get(i).getSalary() + (funcionarios.get(i).getSalary() * 0.08);
                            System.out.println("Este es el salario a pagar: " + average + " Nombre: " + funcionarios.get(i).getName());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Finalizando...");

                    aux = false;

                    break;

                default:

                    System.out.println("Ingrese un numero valido");

            }
        }
    }

    private static List<Funcionarios> Select_funcionary() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/empleados";
        String username = "root";
        String password = "";

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);

        String consultaSQL = "SELECT * FROM rango_salarial WHERE edad >=31 AND edad <=60";

        PreparedStatement statement = connection.prepareStatement(consultaSQL);

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        List<Funcionarios> list_funcionary = new ArrayList<>();

        // Procesar el resultado si existe
        while (resultSet.next()) {
            String codigo = resultSet.getString("codigo");
            String nombre = resultSet.getString("nombre");
            double salario = Double.parseDouble(resultSet.getString("salario"));
            String edad = resultSet.getString("edad");
            String direccion = resultSet.getString("direccion");
            String departamento = resultSet.getString("departamento");
            String cargo = resultSet.getString("cargo");

            Funcionarios funcionarios = new Funcionarios(codigo, nombre, salario, edad, direccion, departamento, cargo);

            list_funcionary.add(funcionarios);
        }

        // Cerrar recursos
        resultSet.close();
        statement.close();
        connection.close();

        return list_funcionary;

    }

    private static List<Funcionarios> Select_One() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/empleados";
        String username = "root";
        String password = "";

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);

        String consultaSQL = "SELECT * FROM rango_salarial WHERE edad BETWEEN 18 AND 30";

        PreparedStatement statement = connection.prepareStatement(consultaSQL);

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        List<Funcionarios> list_funcionary = new ArrayList<>();

        // Procesar el resultado si existe
        while(resultSet.next()) {
            String codigo = resultSet.getString("codigo");
            String nombre = resultSet.getString("nombre");
            double salario = Double.parseDouble(resultSet.getString("salario"));
            String edad = resultSet.getString("edad");
            String direccion = resultSet.getString("direccion");
            String departamento = resultSet.getString("departamento");
            String cargo = resultSet.getString("cargo");

            Funcionarios funcionarios = new Funcionarios(codigo, nombre, salario, edad, direccion, departamento, cargo);

            list_funcionary.add(funcionarios);
        }

        // Cerrar recursos
        resultSet.close();
        statement.close();
        connection.close();

        return list_funcionary;

    }
}


