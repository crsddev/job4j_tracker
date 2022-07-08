package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение ошибки: " + message);
    }

    public static void main(String[] args) {
        Error firstEr = new Error();
        Error secondEr = new Error(true, 404, "Not Found");
        Error thirdEr = new Error(true, 405, "Method Not Allowed");
        firstEr.printInfo();
        secondEr.printInfo();
        thirdEr.printInfo();
    }
}
