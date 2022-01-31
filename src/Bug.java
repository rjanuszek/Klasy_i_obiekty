public class Bug {
    String descriptionBug;
    String addressEmail;
    int priorityBug;
    boolean isOpen;

    Bug(String descriptionBug, String addressEmail, int priorityBug) {
        this.descriptionBug = descriptionBug;
        this.addressEmail = addressEmail;
        this.priorityBug = priorityBug;
        this.isOpen = false;
    }

    void getAllInfoBug() {
        System.out.println(descriptionBug + " " + addressEmail + " " + priorityBug + " " + isOpen);
    }

    void whoReport() {
        System.out.println("Bug został zgłoszony przez: " + addressEmail);
    }

    int getPriorityBug() {
        return priorityBug;
    }

    void statusBug() {
        System.out.println("Bug ma status: " + isOpen);
    }
}
