package models;

import java.util.Scanner;
import models.product.*;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner altInput = new Scanner(System.in);
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
                            Cart cart = new Cart(null);
                            if(option == 1){
                                System.out.println("Digite o ID do produto");
                                int capId = input.nextInt();
                                Product cap = Database.getInstance().getProductByID(capId);
                                cart.addItem(cap);
                            }else if(option == 2){
                                System.out.println("Digite o ID do produto");
                                int capId = input.nextInt();
                                cart.removeCap(capId);
                            }else if(option == 3){
                                for (Product c : cart.getItems()) {
                                    System.out.println(c.getName());
                                }
                            }else if(option == 4){
                                Pix pix = new Pix();
                                Boleto boleto = new Boleto();
                                System.out.println("Deseja pagar no pix ou boleto?");
                                String op = input.nextLine();
                                Pagamento pagamento = new Pagamento(boleto);
                                if (op.equalsIgnoreCase("pix")){
                                    pagamento.setMetodoPagamento(pix);
                                } 
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
                System.out.println("Digite seu nome"); //joao arthur
                String name = altInput.nextLine();
                System.out.println("Digite seu email"); //arthur@gmail.com
                String email = altInput.nextLine();
                System.out.println("Digite sua senha"); //123456
                String password = altInput.nextLine();
                System.out.println("Digite sua data de nascimento"); //14/05/2002
                String birthDate = altInput.nextLine();
                Database.getInstance().createUser(name, email, password, password, birthDate);
            }else if(option == 3){
                break;
            }
        }

    }
}
