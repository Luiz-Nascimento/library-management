package entities;

public interface Menu {

    public static String showUserMenu() {
        return "Welcome to the Luiz's Library Management System\n" +
                "Type the number of the option you want to choose:\n" +
                "1- Consult avaliable books\n" +
                "2- Return book\n" +
                "3- End program\n";
    }

    public static String showAdminMenu() {
        return "Welcome Admin of the Luiz's Library Management System\n" +
                "Type the number of the option you want to choose:\n" +
                "1- Register book\n" +
                "2- Remove book";
    }

    public static String loginMenu() {
        return "Welcome to Luiz's Library Management System!\n" +
                "1- Login\n" +
                "2- Register\n";
    }

    public static String loginMenu2() {
        return "1- Common user \n" +
                "2- Administrator";
    }



}
