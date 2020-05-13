package com.company;
import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente din lista: ");
        int n=scanner.nextInt();
        int i;
        String x;
        scanner.nextLine();
        for (i = 0; i < n; i++){
            System.out.print("Elementul #"+(i+1)+": ");
            x=scanner.nextLine();
            lista.add(x);
        }
        Collections.sort(lista);
        System.out.print("Elementele listei ordonate alfabetic sunt: ");
        for (i = 0; i < n; i++)
            System.out.print(lista.get(i)+" ");
    }
}