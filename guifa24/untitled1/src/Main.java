import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Student student = new Student("name",20,3.0);
        Student student1 = new Student("name1",20,3.0);
        Student student2 = new Student("name2",20,3.0);
        Student student3 = new Student("name3",20,3.0);

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);




        FileOutputStream fileOutputStream=new FileOutputStream("student.ser");
        ObjectOutputStream ostream=new ObjectOutputStream(fileOutputStream);
        ostream.writeObject(list);
        ostream.close();
        fileOutputStream.close();



        FileInputStream fileInputStream=new FileInputStream("student.ser");
        ObjectInputStream istream=new ObjectInputStream(fileInputStream);
        ArrayList<Student> studentRead=(ArrayList<Student>)istream.readObject();
        istream.close();

        for(Student st:studentRead)
            System.out.println(st.getName());


    }
}