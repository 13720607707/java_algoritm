package algorithm.test;

import algorithm.uf.UF_Tree_Weighted;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traffic_Project_Test {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(Traffic_Project_Test.class.getClassLoader().getResourceAsStream("traffic_project.txt")));
        int totalNumber = Integer.parseInt(br.readLine());

         UF_Tree_Weighted UF= new UF_Tree_Weighted(totalNumber);
         int roadNumber = Integer.parseInt(br.readLine());
         for (int i =1;i<=roadNumber;i++){
             String line = br.readLine();
             String[] str = line.split(" ");
             int p =Integer.parseInt(str[0]);
             int q = Integer.parseInt(str[1]);
             UF.union(p,q);



         }
         int road = UF.count()-1;
        System.out.println("还需要修建"+road);

    }
}
