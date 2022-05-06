package tk.bailinzheng.fm.control;

import org.apache.groovy.parser.antlr4.GroovyParser;
import tk.bailinzheng.fm.model.Finacial;
import tk.bailinzheng.fm.model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class TransactionDetails{

            public void addTran(ArrayList<Finacial> tda){
                Scanner sc = new Scanner(System.in);
                System.out.println("please write the member's id");
                String fid = sc.nextLine();
                System.out.println("please write the place");
                String fPlace = sc.nextLine();
                System.out.println("please write the flow");
                String fFlow = sc.nextLine();
                System.out.println("please write the thing");
                String fThing = sc.nextLine();

                Finacial f = new Finacial();
                f.setFid(fid);
                f.setFplace(fPlace);
                f.setFflow(fFlow);
                f.setFthing(fThing);
                tda.add(f);
                System.out.println("it worked");
            }

            public void seeTran(ArrayList<Finacial> tda){
                if(tda.size() == 0 ){
                    System.out.println("NO data");
                }
                System.out.println("memberid\tplace\tflow\tthing");
                for (int i = 0; i < tda.size(); i++){
                    Finacial f = tda.get(i);
                    System.out.println(f.getFid() + "\t" + f.getFplace() + "\t" + f.getFflow() + "\t" + f.getFthing());
        }
    }
}
