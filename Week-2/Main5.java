
// Composition : Full ownership

class Book{
    String title;
    Book(String title){
        this.title=title;
    }
}

class Library{
    String name;
    Book book;
    Library(String name, String title){
        this.name = name;
        this.book = new Book(title);              // Library creates the Book inside its constructor. So Book is owned by Library.

    }
    void show(){
        System.out.println(name + " has " + book.title);
    }
}


public class Main5 {
    public static void main(String[] args){
        Library l=new Library("Central Library", "Java");
        l.show();
    }
    
}

// Part (Book) is created and controlled by whole (Library).
// Strong has-a relationship in this code model.
