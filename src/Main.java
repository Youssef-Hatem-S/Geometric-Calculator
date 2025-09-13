import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Yussef\\IdeaProjects\\Java project\\output.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Yussef\\IdeaProjects\\Java project\\input.txt"));
        String line=reader.readLine();
        reader.close();
        String []a= line.split(" ");
        int n = Integer.parseInt(a[0]);
        n*=2;
        double ans=0;
        Drawable []arr = new Drawable[n];
        for(int i = 1; i <= n; i+=2){
            String s= a[i];
            double x = Double.parseDouble(a[i+1]);
            if(s.equalsIgnoreCase("circle")){
                arr[i]= new Circle(x);
                Circle circle= (Circle)arr[i];
                ans+=circle.getArea();
            }
            else if(s.equalsIgnoreCase("cube")){
                arr[i]= new Cube(x);
                Cube cube= (Cube)arr[i];
                ans+=cube.getArea();
            }
        }
        writer.write(String.valueOf(ans));
        writer.close();
    }
}
