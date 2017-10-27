package DataStructures;

import java.util.*;

/*Sample Input 0

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Sample Output 0

Dan
Ashley
Shafaet
Maria
*/
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Priorities {
        public List < Student > getStudents(List < String > events) {
            PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getPri).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
            List < Student > students = new ArrayList < Student > ();
            for (String e: events) {
                Scanner in =new Scanner(e);
                String event = in.next();
                if (event.equals("ENTER")) {
                    String name = in.next();
                    float cgpa = in.nextFloat();
                    int token = in.nextInt();

                    Student student = new Student(name, cgpa, token);
                    student_queue.add(student);
                } else if (event.equals("SERVED")) {
                    Student first = student_queue.poll();
                } in .close();
            }
            Student first = student_queue.poll();
            if (first == null) {
                return students;
            } else {
                while (first != null) {

                    students.add(first);
                    first = student_queue.poll();

                }
                return students;
            }

        }
    }

     static class Student {
        String name;
        int id;
        double pri;

        public Student(String name, double pri, int id) {
            this.name = name;
            this.id = id;
            this.pri = pri;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getPri() {
            return pri;
        }

        public void setPri(double pri) {
            this.pri = pri;
        }

        public String getName() {
            return name;
        }
    }
}
