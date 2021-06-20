package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
*Permitir ao usuário criar seu login de acesso.
* O login não pode usar as palavras "admin" "administrador".
* Se tudo ocorrer bem, printar "< nome do usuário > cadastrado com sucesso" se não "Usuário inválido"
*  */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList();

        frutas.add("melao");
        frutas.add("uva");
        frutas.add("melancia");

        System.out.println(frutas);
    }
}
