package models;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        while (true){
            System.out.println("-----CAPTEND-----");
            System.out.println("[1] - Realizar Login");
            System.out.println("[2] - Realizar Cadastro");
            System.out.println("[3] - Sair");
            option = input.nextInt();
            if(option == 1){
                input.nextLine();
                System.out.println("Digite seu email"); //arthur@gmail.com
                String email = input.nextLine();
                System.out.println("Digite sua senha"); //123456
                String password = input.nextLine();
                User a = Database.getInstance().getUserByEmail(email);
                if(a.getPassword().equals(password)){
                    if(a instanceof Admin){
                        while (true){
                            System.out.println("login como administrador");
                            System.out.println("Bem-vindo, " + a.getName());

                            System.out.println("[1] - Cadastrar Produto");
                            System.out.println("[2] - Remover Produto");
                            System.out.println("[3] - Promover Usuário");
                            System.out.println("[4] - Alterar Nome");
                            System.out.println("[5] - Alterar Senha");
                            System.out.println("[0] - Sair");
                            option = input.nextInt();
                            if(option == 1){

                            }else if(option == 2){

                            }else if(option == 3){

                            }else if(option == 4){
                                System.out.println("Digite o nome para qual deseja alterar");
                                String newName = input.nextLine();
                                a.changeName(newName);
                            }else if(option == 5){
                                System.out.println("Primeiro, digite sua senha atual");
                                password = input.nextLine();
                                if(password.equals(a.getPassword())){
                                    System.out.println("Digite sua nova senha");
                                    password = input.nextLine();
                                    a.changePassword(password);
                                }
                            }else if(option == 0){
                                break;
                            }
                        }

                    }else{
                        while (true){
                            System.out.println("login como cliente");
                            System.out.println("Bem-vindo, " + a.getName());
                            System.out.println("[1] - Comprar produto");
                            System.out.println("[2] - Remover Produto do carrinho");
                            System.out.println("[3] - Ver carrinho");
                            System.out.println("[4] - Pagar");
                            System.out.println("[5] - Alterar Nome");
                            System.out.println("[6] - Alterar Senha");
                            System.out.println("[0] - Sair");
                            option = input.nextInt();
                            if(option == 1){

                            }else if(option == 2){

                            }else if(option == 3){

                            }else if(option == 4){

                            }else if(option == 5){
                                System.out.println("Digite o nome para qual deseja alterar");
                                String newName = input.nextLine();
                                a.changeName(newName);
                            }else if(option == 6){
                                System.out.println("Primeiro, digite sua senha atual");
                                password = input.nextLine();
                                if(password.equals(a.getPassword())){
                                    System.out.println("Digite sua nova senha");
                                    password = input.nextLine();
                                    a.changePassword(password);
                                }
                            }else if(option == 0){
                                break;
                            }
                        }
                    }
                }else{
                    System.out.println("senha incorreta");
                }


            }else if(option == 2){
                String name = input.nextLine();

            }else if(option == 3){
                break;
            }
        }

    }
}
