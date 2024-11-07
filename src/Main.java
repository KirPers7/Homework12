public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Роджер", "Желязны");
        Author author2 = new Author("Ник", "Перумов");
        Author author3 = new Author("Гарри", "Гаррисон");
        Author author4 = new Author("Айзек", "Азимов");

        Book book1 = new Book("Алмазный меч, деревянный меч", author2, 1998);
        Book book2 = new Book("Крыса из нержавеющей стали", author3, 1970);
        Book book3 = new Book("Основание", author4, 1951);
        Book book4 = new Book("Этот бессмертный", author1, 1965);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        System.out.println(author2.equals(author3));

        System.out.println(book1.equals(book4));
    }
}