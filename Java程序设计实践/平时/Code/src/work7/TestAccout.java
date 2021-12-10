package work7;

import java.util.Date;
import java.util.ArrayList;

public class TestAccout {
    public static void main(String[] args) {
        // 用于为账户存储交易
        // ArrayList<Object> transactions=new ArrayList<>();

        Account object = new Account("George", 1122, 1000);
        object.setAnnualInterestRate(0.015);

        object.deposit(30);
        object.deposit(40);
        object.deposit(50);

        object.withDraw(5);
        object.withDraw(4);
        object.withDraw(2);

        System.out.println("账户持有者名字： " + object.getName()
                + "\n利率: " + object.getAnnualInterestRate()
                + "\n收支额： " + object.getBalance()
                + "\n所有的交易:" + object.toString());
    }
}

class Account {
    private String name;

    // 用于为账户存储交易
    private ArrayList<Object> transactions = new ArrayList<>();

    private int id = 0;// 用户名
    private double balance = 0;// 余额
    private double annualInteresRate = 0;// 当前利率
    private Date dateCreated;// 存储开户日期

    // 无参构造方法
    public Account() {
        Date dateCreated = new Date();
        this.dateCreated = dateCreated;

    }

    // 有参构造方法
    public Account(int id, double balance) {
        Date dateCreated = new Date();
        this.dateCreated = dateCreated;
        this.id = id;
        this.balance = balance;
    }

    // 一个新的有参构造方法
    public Account(String name, int id, double balance) {
        Date dateCreated = new Date();
        this.dateCreated = dateCreated;
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInteresRate = annualInterestRate;
    }

    public int getId() {
        return id;

    }

    public double getBalance() {
        return balance;

    }

    public String getName() {
        return name;

    }

    public double getAnnualInterestRate() {
        return annualInteresRate;

    }

    public double getMonthlyInterestRate() {
        return annualInteresRate / 12;

    }

    public String getDateCreated() {
        return dateCreated.toString();

    }

    // 取钱
    public double withDraw(double withDarw) {

        // 创建一笔取钱交易
        Transaction withDrawTransacte = new Transaction('W', withDarw, (this.balance = this.balance - withDarw),
                "取款：" + withDarw + "美元");
        transactions.add(withDrawTransacte.getDescription());

        return this.balance;

    }

    // 存钱
    public double deposit(double deposit) {
        // 创建一笔存钱交易
        Transaction depositTransacte = new Transaction('D', deposit, (this.balance = this.balance + deposit),
                "存款：" + deposit + "美元");
        transactions.add(depositTransacte.getDescription());

        return this.balance;
    }

    public String toString() {
        return "\n日期： " + getDateCreated() + "\n" + transactions.toString();

    }
}

class Transaction {
    // 交易日期
    private Date date;

    // 交易类型，例如'W','D'
    private char type;

    // 交易量
    private double amount;

    // 交易后的新余额
    private double balance;

    // 交易描述
    private String description;

    // 一个有参构造方法
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        // 创建一个交易日期
        this.date = new Date();
    }

    // 获得交易日期
    public String getDate() {
        return date.toString();

    }

    // 设置交易日期
    public void setDate(long eclapseTime) {
        date.setTime(eclapseTime);
    }

    // 交易类型：‘W’——取款，‘D’——存款
    public char getType() {
        return type;

    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;
    }
}