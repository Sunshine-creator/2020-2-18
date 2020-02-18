package cwww;
public class Student {
      public   String id;
      public  String name;
      public  double score;
      public  void print() {
        System.out.println("id :" + this.id +
                ",name:" +this. name
                + ",score:" + this.score);
    }
        public static void main(String[] args){
            Student student = new Student();
            student.score= 100.0;
            student.id =  "417090";
            student.name =  "kevin";
            student.print();
        }
    }

