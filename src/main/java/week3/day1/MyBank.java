package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyBank {
public static void main(String[] args) {
	ChromeDriver
//	HDFCBANK bank = new HDFCBANK();
	RBI bank = new HDFCBANK();
	bank.openSavingsAc();
	bank.provideCreditCard();
}
}
