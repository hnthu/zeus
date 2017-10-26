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

    private static class Priorities {

        public List<Student> getStudents(List<String> events) {
            int count = 0;
            PriorityQueue<Student> li = new PriorityQueue<Student>((o1, o2) -> {
                if (o1.getPri() != o2.getPri())
                    return o2.getPri() - o1.getPri() > 0 ? 1 : -1;
                if (o1.getName().compareToIgnoreCase(o2.getName()) != 0)
                    return o1.getName().compareToIgnoreCase(o2.getName());
                return o1.getId() - o2.getId();
            });
            for(String e: events) {
                String[] eventArr= e.split(" ");
                switch (eventArr[0]) {
                    case "ENTER":
                        li.offer(new Student(eventArr[1], Double.valueOf(eventArr[2]),Integer.valueOf(eventArr[3])));
                        break;
                    case "SERVED":
                        li.remove();
                        break;
                }
            }

            return new ArrayList(li);
        }
    }

    private static class Student {
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
