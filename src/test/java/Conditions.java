import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


@Test
public class Conditions extends BaseUI {

    public void test1() {
        String fruit = " apple";
        if (fruit.contains("apple")) {
            System.out.println("This is" + fruit);
        } else {
            System.out.println("No apple inside");
        }
    }

    @Test
    public void test2() {
        boolean requirement = true;

        if (requirement) {
            System.out.println("Boolean is true");
        } else {
            Assert.fail("Boolean is false");
        }

    }

    @Test
    public void iHaveShoppingArray() {
            String[] toBuy = {"butter", "bread ", "cheese", "wine", "coffee"};
            System.out.println();
            System.out.println(toBuy);
            System.out.println();
            for (String i : toBuy) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("First out of products: " + toBuy[0]);
            System.out.println("Second out of products: " + toBuy[1]);
            System.out.println("3rd out of products: " + toBuy[2]);
            System.out.println("4th out of products: " + toBuy[3]);
            System.out.println("Last one out of products: " + toBuy[4]);
            System.out.println(" ");

        }

        public void iCheckNumbersInMyArray() {
            int[] myNums = {1, -11, 111, -1111, 11111, 0};
            System.out.println();
            System.out.println(myNums);
            System.out.println();
            for (int i : myNums) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < myNums.length; i++) {

                if (myNums[i] < 0) {
                    System.out.println("myNums[i] " + myNums[i] + " is negative");
                } else if (myNums[i] == 0) {
                    System.out.println("myNums[i] " + myNums[i] + " is equals null");
                } else {
                    System.out.println("myNums[i] " + myNums[i] + " is positive");
                }
            }
        }

        public void iHaveArrayOfDaysOfAWeek() {
            String[] myWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println();
            for (String myDay : myWeek) {
                System.out.print(myDay + " ");
            }
            System.out.println();
            System.out.println("7th day of week is " + myWeek[6] + " and it is the best!");

        }

    @Test
    public void test3() {

        homePage.clickLinkJoinToday();
        homePage.getStartedPartOne();
        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is checked");
        }

    }

    @Test
    public void test5() {
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.homeURL);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));

        }

    }

}


