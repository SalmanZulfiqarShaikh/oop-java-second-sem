package finalExamStudy.OOPs;

public class bookebookshit {
    public static void main(String args[]){
       electronicBook ebook = new electronicBook();
       ebook.setTitle("Java Programming");
         ebook.setAuthor("Mukesh Ambani");
         ebook.setPrice(69.00);
            ebook.setFileSize(200);


            ebook.displayInfo("BookInfo:");
            ebook.download();

    }
}


abstract class book {
    private String title;
    private String author;
    private double price;


    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

    public book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    abstract int pages();


}

 class electronicBook extends book{
    private int fileSize; 


    public void setFileSize(int fileSize) {
        if(fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            System.out.println("File size must be positive.");
        }
    }

    public void displayInfo(String msg) {
        System.out.println(msg);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Pages: " + pages());
    }


    public void download() {
        System.out.println("Downloading " + getTitle() + "...");
        System.out.println("Download complete!");
    }

    @Override
    int pages() {
        return 1500; 
    }
}

