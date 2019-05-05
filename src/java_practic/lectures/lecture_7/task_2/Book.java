package java_practic.lectures.lecture_7.task_2;

class Book {
    private String author;
    private int year;
    private String name;
    public  static String text = "Hello world";


    Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    Book(String name){
        this.name = name;
    }

    Book(String author, int year){
        this.author = author;
        this.year = year;
    }
    Book(int year){
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public String setAuthor(String author){
        return this.author = author;
    }
    public int getYear(){
        return year;
    }
    public int setYear(int year){
        return this.year = year;
    }

}
