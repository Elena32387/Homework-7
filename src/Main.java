//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Author rand = new Author("Айн", "Рэнд");
    Author verne = new Author("Жюль", "Верн");
    Book theFountainhead = new Book("Источник", rand, 1943);
    Book theMysteriousIsland = new Book("Таинственный остров", verne, 1874);

        System.out.println(theFountainhead.getTitle()+ " " +theFountainhead.getPublishingYear());
        System.out.println(theMysteriousIsland.getTitle()+ " " +theMysteriousIsland.getPublishingYear());

        theFountainhead.setPublishingYear(1948);
        System.out.println(theFountainhead.getTitle()+ " " +theFountainhead.getPublishingYear());


    }
}