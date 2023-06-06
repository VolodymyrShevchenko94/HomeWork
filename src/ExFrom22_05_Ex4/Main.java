package ExFrom22_05_Ex4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите номер лицензии : pro или exp");
        Scanner sc = new Scanner(System.in);
        String license = sc.nextLine();
        switch (license) {
            case "pro" :
                ProDocumentWorker pro = new ProDocumentWorker();
                pro.openDocument();
                pro.saveDocument();
                pro.editDocument();
                break;

            case "exp" :
                ExpertDocumentWorker exp = new ExpertDocumentWorker();
                exp.saveDocument();
                break;
            default: DocumentWorker doc = new DocumentWorker();
            doc.openDocument();
            doc.saveDocument();
            doc.editDocument();


            }
        }



    }
