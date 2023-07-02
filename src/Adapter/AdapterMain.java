package Adapter;

import Adapter.ex01.Print;
import Adapter.ex01.PrintBanner;

public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Adapter.ex02.Print p2 = new Adapter.ex02.PrintBanner("Hello2");
        p2.printWeak();
        p2.printStrong();
    }
}
