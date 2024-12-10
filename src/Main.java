//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Author rand = new Author("Айн", "Рэнд");
    Author verne = new Author("Жюль", "Верн");

    Book theFountainhead = new Book("Источник", rand, 1943);
    Book theFountainhead2 = new Book("Источник", rand, 1943);
    Book theMysteriousIsland = new Book("Таинственный остров", verne, 1874);

        System.out.println(theFountainhead);
        System.out.println(theMysteriousIsland);

        System.out.println("Сравление theFountainhead "+ theFountainhead.equals(theFountainhead2));

        theFountainhead.setPublishingYear(1948);

        System.out.println(theFountainhead);
        System.out.println("Сравление theFountainhead "+ theFountainhead.equals(theFountainhead2));


    }
}