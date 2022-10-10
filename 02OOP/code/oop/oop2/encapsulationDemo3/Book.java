package com.yj.nz.oop.oop2.encapsulationDemo3;
/*
1私有的属性
2共有的针对于每个属性的get和set方法
3get和set方法的方法名 是 get/set  + 属性名(首字母要大写)
 */
public class Book {



//    作者
    private String author;
//    书名
    private String bookName;
//    价格
    private double price;
//    出版时间
    private String publishDate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice(){
        return price;
    }
    /*一般定义一个类的时候我们会准备两个构造方法
    * 1参数缺省的构造方法
    * 2包含全部实例成员变量的构造方法
    * */
    public Book(){

    }

    public Book(String author, String bookName, double price, String publishDate) {
        this.author = author;
        this.bookName = bookName;
        this.price = price;
        this.publishDate = publishDate;
    }

    //  显示书本信息的方法
    public void showBook(){
        System.out.println("书名:"+bookName+"\t作者:"+author+"\t价格:"+price+"\t出版时间:"+publishDate);
    }


    public static void main(String[] args) {
        Book book=new Book("金庸", "沙雕英雄传", 20.0, "2020-2-2");
        Book book2=new Book();
        book2.setBookName("金瓶梅");
        book2.setAuthor("兰陵笑笑生");
        book2.setPrice(100);
        book2.setPublishDate("2020-1-1");

        book.showBook();
        book2.showBook();
    }

}
