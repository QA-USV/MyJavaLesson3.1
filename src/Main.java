public class Main {

    public static void main(String[] args) {

        String airCompany = "Aэрофлот";
        String purchaseDate = "25.05.2022";
        int ticketPrice = 129;
        int bonus = 1;
        int sumPerBonus = 20;
        int bonusTotal = ticketPrice / sumPerBonus * bonus;
        System.out.println("За покупку " + purchaseDate + " билета компании " + airCompany + " Вам начислено бонусов: " + bonusTotal);

    }
}
