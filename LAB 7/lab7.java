import java.util.Arrays;
import java.util.*;
import java.io.*;
class lab7{
    static float irismean (float [] num){
        float sum = 0;
        for(int i =0; i<num.length;i++){
            sum += num[i];
        }
        float mean = sum/num.length;
        return mean;
    }
    static float irismedian(float[] num) {
        Arrays.sort(num);
        if (num.length % 2 == 0) {
            float median = (num[num.length / 2] + num[(num.length / 2) - 1]) / 2;
            return median;
        } else {
            float median = num[(num.length / 2)];
            return median;
        }
    }
    public static float irismode(float[] num){
        ;
        
        int co = 0;
        float element =0;
        float elementX;
        
        for (int i = 0; i < num.length; i++){
            elementX =num[i];
            int coX=0;
            for (int j = 0; j < num.length; j++){
                if(num[j]==num[i]){
                    coX++;
                 }
                

            }if(coX>co){
                co=coX;
                element=elementX;
            }
        }
       return element;
    }
    
   
    
    static float irismax(float [] num){
    
        Arrays.sort(num);
        float max = num[(num.length -1)];
        return max;

    }
    static float irismin( float[] num){
        
        Arrays.sort(num);
        float min = num[0];
        return min;
    }
   

    public static void main (String [] args){


        File file = new File("output.txt");
        try {
            
            FileWriter writer = new FileWriter(file, true);
           
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
        float[] sepal_length = new float[150];
        float[] sepal_width = new float[150];
        float[] petal_length = new float[150];
        float[] petal_width = new float[150];
        File file = new File("Iris.csv");
        Scanner sc = new Scanner(file);
        
        
        int i = 0;
        while (sc.hasNextLine()) {
            
            String temp = sc.nextLine();
            
            String[] ary = temp.split(",");
            
            sepal_length[i] = Float.parseFloat(ary[1]);
            sepal_width[i] = Float.parseFloat(ary[2]);
            petal_length[i] = Float.parseFloat(ary[3]);
            petal_width[i] = Float.parseFloat(ary[4]);
            
            i++; // Increment the index variable
        }
        
        sc.close();
        
        
        
        
        
        
        

        

       
        System.out.println("                         SUMMARY                       ");
        System.out.println("--------------------------------------------------------");
        System.out.println("NAME   MEAN    MEDIAN    MODE   MAXIMUM  MINIMUM  ");
        System.out.println("Sepal Length"+irismean(sepal_length)+" "+irismedian(sepal_length)+" "+irismode(sepal_length)+" "+irismin(sepal_length)+" "+irismax(sepal_length));
        System.out.println("Sepal Width"+irismean(sepal_width)+" "+irismedian(sepal_width)+" "+irismode(sepal_width)+" "+irismin(sepal_width)+" "+irismax(sepal_width));
        System.out.println("Petal Length"+irismean(petal_length)+" "+irismedian(petal_length)+" "+irismode(petal_length)+" "+irismin(petal_length)+" "+irismax(petal_length));
        System.out.println("Petal Width"+irismean(petal_width)+" "+irismedian(petal_width)+" "+irismode(petal_width)+" "+irismin(petal_width)+" "+irismax(petal_width));

            float[] setosas_length = new float[50];
            float[] setosas_width = new float[50];
            float[] setosap_length = new float[50];
            float[] setosap_width = new float[50];

            for(int p = 0;p<50;p++){
                setosas_length[p] = sepal_length[p];
                setosas_width[p] = sepal_width[p];
                setosap_length[p] = petal_length[p];
                setosap_width[p] = petal_width[p]; 
            }

            System.out.println(setosap_length[2]);

            System.out.println("                 SETOSA                ");

            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+irismean(setosas_length)+"      "+irismedian(setosas_length)+"        "+irismode(setosas_length)+"         "+irismin(setosas_length)+"     "+irismax(setosas_length));
            System.out.println("Sepal Width   "+irismean(setosas_width)+"     "+irismedian(setosas_width)+"        "+irismode(setosas_width)+"         "+irismin(setosas_width)+"           "+irismax(setosas_width));
            System.out.println("Petal Length  "+irismean(setosap_length)+"     "+irismedian(setosap_length)+"        "+irismode(setosap_length)+"         "+irismin(setosap_length)+"      "+irismax(setosap_length));
            System.out.println("Petal Width   "+irismean(setosap_width)+"    "+irismedian(setosap_width)+"        "+irismode(setosap_width)+"         "+irismin(setosap_width)+"           "+irismax(setosap_width));


            float[] versis_length = new float[50];
            float[] versis_width = new float[50];
            float[] versip_length = new float[50];
            float[] versip_width = new float[50];

            for(int p = 0;p<50;p++){
                versis_length[p] = sepal_length[p+50];
                versis_width[p] = sepal_width[p+50];
                versip_length[p] = petal_length[p+50];
                versip_width[p] = petal_width[p+50]; 
            }

            
            System.out.println("                     SUMMARY OF VERSICOLOR                     ");
 
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+irismean(versis_length)+"      "+irismedian(versis_length)+"   "+irismode(versis_length)+" "+irismin(versis_length)+"  "+irismax(versis_length));
            System.out.println("Sepal Width   "+irismean(versis_width)+"       "+irismedian(versis_width)+"    "+irismode(versis_width)+"  "+irismin(versis_width)+" "+irismax(versis_width));
            System.out.println("Petal Length  "+irismean(versip_length)+"  "+irismedian(versip_length)+"    "+irismode(versip_length)+" "+irismin(versip_length)+"  "+irismax(versip_length));
            System.out.println("Petal Width   "+irismean(versip_width)+"  "+irismedian(versip_width)+"     "+irismode(versip_width)+"     "+irismin(versip_width)+"  "+irismax(versip_width));


            float[] virgis_length = new float[50];
            float[] virgis_width = new float[50];
            float[] virgip_length = new float[50];
            float[] virgip_width = new float[50];

            for(int p = 0;p<50;p++){
                virgis_length[p] = sepal_length[p+100];
                virgis_width[p] = sepal_width[p+100];
                virgip_length[p] = petal_length[p+100];
                virgip_width[p] = petal_width[p+100]; 
            }

            
            System.out.println("                     SUMMARY OF VIRGINICA                        ");
           
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+irismean(virgis_length)+" "+irismedian(virgis_length)+"  "+irismode(virgis_length)+" "+irismin(virgis_length)+"  "+irismax(virgis_length));
            System.out.println("Sepal Width   "+irismean(virgis_width)+"  "+irismedian(virgis_width)+" "+irismode(virgis_width)+" "+irismin(virgis_width)+"   "+irismax(virgis_width));
            System.out.println("Petal Length  "+irismean(virgip_length)+" "+irismedian(virgip_length)+"  "+irismode(virgip_length)+" "+irismin(virgip_length)+" "+irismax(virgip_length));
            System.out.println("Petal Width   "+irismean(virgip_width)+" "+irismedian(virgip_width)+" "+irismode(virgip_width)+" "+irismin(virgip_width)+"  "+irismax(virgip_width));
            try {
                FileWriter writer = new FileWriter("output.txt", true); // true means append to file if it exists
            
                writer.write("SUMMARY\n");
                writer.write("NAME\tMEAN\tMEDIAN\tMODE\tMAXIMUM\tMINIMUM\n");
                writer.write("Sepal Length\t" + irismean(sepal_length) + "\t" + irismedian(sepal_length) + "\t" + irismode(sepal_length) + "\t" + irismin(sepal_length) + "\t" + irismax(sepal_length) + "\n");
                writer.write("Sepal Width\t" + irismean(sepal_width) + "\t" + irismedian(sepal_width) + "\t" + irismode(sepal_width) + "\t" + irismin(sepal_width) + "\t" + irismax(sepal_width) + "\n");
                writer.write("Petal Length\t" + irismean(petal_length) + "\t" + irismedian(petal_length) + "\t" + irismode(petal_length) + "\t" + irismin(petal_length) + "\t" + irismax(petal_length) + "\n");
                writer.write("Petal Width\t" + irismean(petal_width) + "\t" + irismedian(petal_width) + "\t" + irismode(petal_width) + "\t" + irismin(petal_width) + "\t" + irismax(petal_width) + "\n");
            
                writer.write("SETOSA\n");
                writer.write("NAME\tMEAN\tMEDIAN\tMODE\tMAXIMUM\tMINIMUM\n");
                writer.write("Sepal Length\t" + irismean(setosas_length) + "\t" + irismedian(setosas_length) + "\t" + irismode(setosas_length) + "\t" + irismin(setosas_length) + "\t" + irismax(setosas_length) + "\n");
                writer.write("Sepal Width\t" + irismean(setosas_width) + "\t" + irismedian(setosas_width) + "\t" + irismode(setosas_width) + "\t" + irismin(setosas_width) + "\t" + irismax(setosas_width) + "\n");
                writer.write("Petal Length\t" + irismean(setosap_length) + "\t" + irismedian(setosap_length) + "\t" + irismode(setosap_length) + "\t" + irismin(setosap_length) + "\t" + irismax(setosap_length) + "\n");
                writer.write("Petal Width\t" + irismean(setosap_width) + "\t" + irismedian(setosap_width) + "\t" + irismode(setosap_width) + "\t" + irismin(setosap_width) + "\t" + irismax(setosap_width) + "\n");
            
                writer.write("VERSICOLOR\n");
                writer.write("NAME\tMEAN\tMEDIAN\tMODE\tMAXIMUM\tMINIMUM\n");
                writer.write("Sepal Length\t" + irismean(versis_length) + "\t" + irismedian(versis_length) + "\t" + irismode(versis_length) + "\t" + irismin(versis_length) + "\t" + irismax(versis_length) + "\n");
                writer.write("Sepal Width\t" + irismean(versis_width) + "\t" + irismedian(versis_width) + "\t" + irismode(versis_length) + "\t" + irismin(versis_length) + "\t" + irismax(versis_length) + "\n");
            
            }
    }

}
