public class ZadanieDomowe {
    public static void main(String[] args) {

        Bug number1 = new Bug("Brak tooltipa", "tester_jeden@wp.pl", 1);
        number1.getAllInfoBug();
        number1.whoReport();
        number1.statusBug();
        int priorityBug = number1.getPriorityBug();
        System.out.println(priorityBug);
        
        number1.isOpen = true;
        number1.statusBug();
    }
}