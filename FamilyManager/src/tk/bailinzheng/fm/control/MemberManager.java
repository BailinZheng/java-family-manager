package tk.bailinzheng.fm.control;

import tk.bailinzheng.fm.model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
    public void addMember(ArrayList<Member> mar){
        Scanner sc = new Scanner(System.in);
        System.out.println("please write the member's id");
        String mid = sc.nextLine();
        System.out.println("please write the member's amount");
        String mAmount = sc.nextLine();

        Member m = new Member();
        m.setMid(mid);

        m.setMamount(mAmount);
        mar.add(m);
        System.out.println("it worked");
    }

    public void change(ArrayList<Member> mar){
        Scanner sc = new Scanner(System.in);
        System.out.println("please write down the member id you want to change");
        String mid = sc.nextLine();
        System.out.println("please write down the new amount");
        String mAmount = sc.nextLine();

        Member m = new Member();
        m.setMid(mid);
        m.setMamount(mAmount);

        for(int i=0; i< mar.size(); i++){
            Member member = mar.get(i);
            if(member.getMid().equals(mid)){
                mar.set(i,m);
                break;
            }
        }
        System.out.println("it worked");
    }

    public void delete(ArrayList<Member> mar){
        Scanner sc = new Scanner(System.in);
        System.out.println("please write which id you want to delete");
        String mid = sc.nextLine();
        for(int i=0; i< mar.size(); i++){
            Member m = mar.get(i);
            if(m.getMid().equals(mid)){
                mar.remove(i);
                break;
            }
        }
        System.out.println("it worked");
    }

    public void form(ArrayList<Member> mar){
        if(mar.size() == 0 ){
            System.out.println("NO data");
        }
        System.out.println("memberid\tamount");
        for (int i = 0; i < mar.size(); i++){
            Member m = mar.get(i);
            System.out.println(m.getMid() + "\t" + m.getMamount());
        }
    }
}
