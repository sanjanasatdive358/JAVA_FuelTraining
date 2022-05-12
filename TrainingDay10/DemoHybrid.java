/*A HighSchool application has two classes: the Person superclass and the Student subclass. Using 
inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher 
will be like Person but will have additional properties such as salary (the amount the teacher 
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). The 
CollegeStudent class will extend the Student class by adding a year (current level in college) and 
major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/

//Hybrid inheritance

class Person
{
   String add,name;
   Person(String add,String name)
   {
      this.add=add;
      this.name=name;
   }
   String getAdd()
   {
      return add;
   }
    String getName()
   {
      return name;
   }
}

class Student extends Person
{
   int sid;
   float perc;
   Student(String add,String name,int sid,float perc)
   {
      super(add,name);
      this.sid=sid;
      this.perc=perc;
   }
   int getSid()
   {
      return sid;
   }
   float getPerc()
   {
      return perc;
   }


}

class Teacher extends Person
{
   float sal;
   String sub;
   int tid;
   Teacher(String add,String name,float sal,String sub,int tid)
   {
      super(add,name);
      this.sal=sal;
      this.sub=sub;
      this.tid=tid;
   }
   float getSal()
   {
      return sal;
   }
   String getsub()
   {
      return sub;
   }
   int getTid()
   {
      return tid;
   }
}

class CollegeStd extends Student
{
   int year;
   String major;
   CollegeStd(int sid,float perc,int year,String major)
   {
      super(sid,perc);
      this.year=year;
      this.major=major;
   }
   int getYear()
   {
      return year;
   }
   String getMajor()
   {
      return major;
   }
}

public class DemoHybrid
{
   public static void main(String args[])
   {
   
   }


}