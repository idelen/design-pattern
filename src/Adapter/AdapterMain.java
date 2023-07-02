package Adapter;

import Adapter.ex01.Print;
import Adapter.ex01.PrintBanner;

public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
