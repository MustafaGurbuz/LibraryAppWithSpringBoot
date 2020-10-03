package com.kodzamani.libraryprojectwithdb.dataBaseVariables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    private String bookAuthorName;
    private String bookSerialNumber;
    private String publisher;

    public Books() {
    }


    public Books(String bookName, String bookAuthorName, String bookSerialNumber, String publisher){
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookSerialNumber = bookSerialNumber;
        this.publisher = publisher;
    }
    public long getId(){
        return id;
    }
    public void setID(long id){
        this.id = id;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookAuthorName(){
        return bookAuthorName;
    }
    public void setBookAuthorName(String bookAuthorName){
        this.bookAuthorName = bookAuthorName;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getBookSerialNumber(){
        return bookSerialNumber;
    }
    public void setBookSerialNumber(String bookSerialNumber){
        this.bookSerialNumber = bookSerialNumber;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookSerialNumber='" + bookSerialNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
