package CodeAcademy.Zilvinas.HashSetAndHashMap.tasksHashMap.task4;

import java.util.HashMap;
import java.util.Scanner;

class Program {

    private static Integer count=0;

    void mainRun() {

        HashMap<Integer, Student> mapOfStudents = new HashMap<>();
        Integer temp = 0;
        while (temp != 3) {
            temp = questionsForMainRun();
            switch (temp) {
                case 1 -> EnterStudent(mapOfStudents);
                case 2 -> GetStudentByKey(mapOfStudents);
                case 3 -> System.out.println("The end");
                default -> System.out.println("Entered wrong command try again");
            }
        }
    }

    //Getting student from the map by the Key
    private void GetStudentByKey(HashMap<Integer, Student> mapOfStudents) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID");
        Integer ID = scanner.nextInt();

        if(mapOfStudents.containsKey(ID)){
            System.out.println("Name: " + mapOfStudents.get(ID).getName());
            System.out.println("Surname: " + mapOfStudents.get(ID).getSurname());
            System.out.println("University: " + mapOfStudents.get(ID).getUniversity());
        }else {
            System.out.println("There are no such student in Map with this key " + ID);
        }
    }

    //Adding student to the Map
    private void EnterStudent(HashMap<Integer, Student> mapOfStudents) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter student name");
        student.setName(scanner.nextLine());

        System.out.println("Enter student surname");
        student.setSurname(scanner.nextLine());

        System.out.println("Enter student university");
        student.setUniversity(scanner.nextLine());

        mapOfStudents.put(count , student);

        count++;
    }

    //Getting Integer for switch
    private Integer questionsForMainRun() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                [1]-enter student
                [2]-get student by key
                [3]-end program
                """);
        return scanner.nextInt();
    }


}
