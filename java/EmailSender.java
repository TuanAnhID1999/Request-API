class EmailSender {
    public static final String FROM_EMAIL = "abc@gmail.com";
    public static final String TO_EMAIL = "nguyetnta@gmail.com";
    public static final String TITLE_TEMPLATE = "[%s] Message Center Report";

    public void send(String content) {
        System.out.println("Send email successfully!");
        System.out.println("From: " + FROM_EMAIL);
        System.out.println("To: " + TO_EMAIL);
        System.out.println("Title: " + TITLE_TEMPLATE);
        System.out.println("Body: " + content);

    }
}
