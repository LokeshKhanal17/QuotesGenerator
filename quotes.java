package QuotesGenerator;

import java.util.Locale.Category;

public class quotes {
    private Integer id;
    private  String text;
    private String author;
    public Category category;

    //constructor 
    public quotes(Integer id,String text, String author,Category category){
        this.id =id;
        this.text=text;
        this.author=author;
        this.category = category;
    }
    //Getter 
    public Integer getId(){
        return this.id;
    }
    public String getText(){
        return this.text;
    }
    public String getAuthor(){
        return this.author;
    }
    public Category getCategory(){
        return this.category;
    }
    //String Formate 
    @Override
    public String toString(){
        return "Quote{" +
        "id=" + id +
        ", text='" + text + '\'' +
        ", author='" + author + '\'' +
        ", category=" + category +
        '}';
    }

public enum Category{
    INSPIRATIONAL,
        SPIRITUAL,
        MOTIVATIONAL,
        RELIGIOUS,
}

    
}

