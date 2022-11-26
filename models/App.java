package models;

import models.product.Product;

import java.util.Date;
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
                                System.out.println("----Criar Novo Boné----");
                                System.out.println("Digite o Nome do boné");
                                String capName = input.nextLine();
                                System.out.println("Digite o ID do boné");
                                int capId = input.nextInt();
                                if(Database.getInstance().getProductByID(capId) != null){
                                    System.out.println("um boné com este id já esta cadastrado");
                                }else{
                                    System.out.println("Digite o preço original do boné");
                                    float originalPrice = input.nextFloat();
                                    System.out.println("Digite o preço atual do boné");
                                    float currentPrice = input.nextFloat();
                                    System.out.println("Digite o tipo do boné entre:");
                                    System.out.println("TRUCKER");
                                    System.out.println("FLAT_BRIM");
                                    System.out.println("CURVED_BRIM");
                                    System.out.println("SNAPBACK");
                                    System.out.println("DAD_HAT");
                                    System.out.println("PANEL");
                                    System.out.println("STRAPBACK");
                                    Product.CapType type = Product.CapType.valueOf(input.nextLine().toUpperCase());
                                    System.out.println("Quantas cores estão disponíveis para este boné?");
                                    int colorsAmount = input.nextInt();
                                    String[] colors = new String[colorsAmount];
                                    for(int i = 0; i < colorsAmount; i++){
                                        System.out.println("Digite a cor");
                                        colors[i] = input.nextLine();
                                    }
                                    System.out.println("Digite a sua chave de acesso");
                                    String accessKey = input.nextLine();
                                    if(accessKey.equals(((Admin) a).getAccessKey())){
                                        ((Admin) a).createCap(capName, capId, originalPrice, currentPrice, type, colors);
                                    }
                                }
                            }else if(option == 2){
                                System.out.println("Digite o ID do boné a ser removido");
                                int capId = input.nextInt();
                                System.out.println("Digite a sua chave de acesso");
                                String accessKey = input.nextLine();
                                if(accessKey.equals(((Admin) a).getAccessKey())){
                                    ((Admin) a).removeCap(capId);
                                }else{
                                    System.out.println("Chave de acesso inválida");
                                }
                            }else if(option == 3){
                                System.out.println("Digite o email do usuário a ser promovido");
                                email = input.nextLine();
                                System.out.println("Digite a chave de acesso para este usuário");
                                String userAccessKey = input.nextLine();
                                System.out.println("Digite a sua chave de acesso");
                                String accessKey = input.nextLine();
                                if(accessKey.equals(((Admin) a).getAccessKey())){
                                    ((Admin) a).promoteUser(email, userAccessKey);
                                }else{
                                    System.out.println("Chave de acesso inválida");
                                }
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
