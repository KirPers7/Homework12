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

        System.out.println("Интересная книга : \"" + book1.getBookName() + "\" " + book1.getBookAuthor().getAuthorName()
                + " " + book1.getBookAuthor().getAuthorSurname() + " " + book1.getPublicationYear());
        System.out.println("Интересная книга : \"" + book2.getBookName() + "\" " + book2.getBookAuthor().getAuthorName()
                + " " + book2.getBookAuthor().getAuthorSurname() + " " + book2.getPublicationYear());
        System.out.println("Интересная книга : \"" + book3.getBookName() + "\" " + book3.getBookAuthor().getAuthorName()
                + " " + book3.getBookAuthor().getAuthorSurname() + " " + book3.getPublicationYear());
        System.out.println("Интересная книга : \"" + book4.getBookName() + "\" " + book4.getBookAuthor().getAuthorName()
                + " " + book4.getBookAuthor().getAuthorSurname() + " " + book4.getPublicationYear());
    }
}