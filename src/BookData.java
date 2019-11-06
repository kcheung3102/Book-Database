public class BookData {
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    private String sku;
    private String bookTitle;
    private String author;
    private String description;
    private double price;

    public BookData(String sku, String bookTitle, String author, String description, double price) {
        this.sku = sku;
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public String toString() {

        return ("SKU: " + this.getSku() + " " + "Title: " + this.getBookTitle() + " " + "Author: " + this.getAuthor() + " " + "Description: " + this.getDescription()
        + " " + "Price: " + this.getPrice());

    }



  }



