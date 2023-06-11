package hw3;

public class Market implements I_QueueBehaviour, I_MarketBehaviour, I_MyOwnIsOpen {
    private String goods;
    private int idBuyer;

    private int timeOpen;
    private int timeClose;


    public Market(String goods, String namePersonal, int idBuyer) {
        this.goods = goods;
        this.idBuyer = idBuyer;
    }

    public int getTimeOpen() {
        return timeOpen;
    }

    public int getTimeClose() {
        return timeClose;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(int idBuyer) {
        this.idBuyer = idBuyer;
    }

    @Override
    public void getInLine() {
        System.out.println("Встал в очередь...");
    }

    @Override
    public void leaveQueue() {
        System.out.println("Покинул очередь...");
    }

    @Override
    public void goAheade() {
        System.out.println("Продвинулся в очереди...");
    }

    @Override
    public void addPerson() {
        System.out.println("Очередь увеличена на 1 человека...");
    }

    @Override
    public void removePerson() {
        System.out.println("Очередь уменьшилась на 1 человека...");
    }

    I_MyOwnIsOpen<Integer> time = x -> (x >= 8 && x <= 20);

    @Override
    public boolean isOpen(int timeNow) {
        if (time.isOpen(timeNow)) {
            System.out.println("Рынок открыт, добро пожаловать!");
            return true;
        } else {
            System.out.println("Мы сожалеем, рынок закрыт, часы работы с 8 до 20");
            return false;
        }
    }

    public void update() {
        acceptOrder();
        giveOrder();
        System.out.println("Состояние магазина обновлено, все заказы получены, все заказы отданы.");
    }


    private void acceptOrder() {
        System.out.println("Заказ принят...");
    }

    private void giveOrder() {
        System.out.println("Заказ отдан...");
    }

}
