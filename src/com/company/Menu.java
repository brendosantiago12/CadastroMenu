package com.company;
/*
* Criar sistema com três menus ( Cadastrar, listar, sair )
* No cadastrar deve conter 4 campos: Nome, idade, geneo, CPF;
* Em listar devemos mostrar a lista dos cadastrados, caso esteja vazia, devemos dizer que não há cadastros;
* No 3 ele encerra a aplicação e me manda a mensagem "volte sempre";
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        String Input, Nome="", Idade="", Genero="", CPF="";

        ArrayList<String> Lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
//Validação de input, enquanto usuário não digita corretamente uma das opções, ele permanece no loop.
        while (true){
            System.out.println("No menu, digite uma das opções para prosseguir");
            System.out.println("CADASTRAR ------ realiza um cadastro");
            System.out.println("LISTAR ------ Lista os dados cadastrados no sistema");
            System.out.println("SAIR ------ Finaliza a sessão");
            Input = input.next();

            if (Input.equalsIgnoreCase("cadastrar")
                    || Input.equalsIgnoreCase("listar")
                    || Input.equalsIgnoreCase("sair") ){
                System.out.println("Você escolheu a opção " + Input);
                break;
            }else{
                System.out.println("Por favor, escolha uma das opções no menu");
            }
        }

// Destinação do usuário de acordo com input digitado.
        if (Input.equalsIgnoreCase("cadastrar")){
            cadastrar(Nome, Input, Idade, Genero, CPF, Lista, input);
        }
        else if(Input.equalsIgnoreCase("listar")){
            listar(Lista, Input, input);
        }
        else if(Input.equalsIgnoreCase("sair")){
            sair();
        }
    }
    public static void cadastrar(String Nome, String Input, String Idade, String Genero, String CPF, ArrayList Lista, Scanner input){
// Captura de dados e adição a lista.
        while (true){
            System.out.println("Dite o nome a ser cadastrado");
            Nome = input.next();
            System.out.println("Dite uma idade a ser cadastrado");
            Idade = input.next();
            System.out.println("Dite o genero");
            Genero = input.next();
            System.out.println("Dite o CPF");
            CPF = input.next();
            Lista.add(Nome+"--"+Idade+"--"+Genero+"--"+CPF);
            System.out.println("Para adc mais pessoas, digite Sim. Para finalizar o cadastro, digite Não");
            Input=input.next();
            if (Input.equalsIgnoreCase("nao")){
                break;
            }
        }
//Voltar ao menu ou finalizar sessão?
        while (true){
            System.out.println("Deseja voltar ao menu? (Sim/Não)");
            System.out.println("Obs: caso digite 'Não', a sessão será finalizada");
            Input=input.next();
            if (Input.equalsIgnoreCase("sim")){
                menu();
                break;
            }else if(Input.equalsIgnoreCase("nao")){
                sair();
                break;
            }
        }

    }
    public static void listar(ArrayList Lista,String Input,Scanner input){
// Verificando se possui elementos na lista
        if(Lista.size()!=0){
            for (Object element: Lista) {
                System.out.println(element);
            }
        }else{
            System.out.println("Lista de cadastro vazia");
        }

        //Voltar ao menu ou finalizar sessão?
        while (true){
            System.out.println("Deseja voltar ao menu? (Sim/Não)");
            Input=input.next();
            if (Input.equalsIgnoreCase("sim")){
                menu();
                break;
            }else if(Input.equalsIgnoreCase("nao")){
                sair();
                break;
            }
        }
    }
    public static void sair(){
        System.out.println("Sessão finalizada, volte sempre!");
    }
}
