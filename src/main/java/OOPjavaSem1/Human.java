package OOPjavaSem1;

abstract class  Human {
     protected String FIO;
     protected String birthday;
     protected String die;
     protected String fatherFIO;
     protected String fatherBirthday;
     protected String motherFIO;
     protected String motherBirthday;

     protected Human(String FIO, String birthday, String die, String fatherFIO, String fatherBirthday,
                  String motherFIO, String motherBirthday) {
          this.FIO = FIO;
          this.birthday = birthday;
          this.die = die;
          this.fatherFIO = fatherFIO;
          this.fatherBirthday = fatherBirthday;
          this.motherFIO = motherFIO;
          this.motherBirthday = motherBirthday;
     }

     public void printInfo(){
          System.out.println(this.FIO);
          System.out.println(this.birthday);
     }
}
