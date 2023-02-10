import java.util.*;
class PerishableItems{
    int Samosa, Chaat, VegNoodles, Eggs;          //Variables in which Admin(CanteenOwner) Will Enter The Present Stock.
    String SS, SC , SVN, SE;                      //Variables in which sales will be entered under ranges.
    int a,b,c,d;                                  //Variables in which estimate orders will be stored.
    Scanner sc= new Scanner(System.in);
    Calendar cal = Calendar.getInstance();     //Function used for importing months for estimation according to weather.
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    void setquant(){                          //Function for entering present stock.
        System.out.println("Please Enter the current quantity of the items available.");
        System.out.println("Samosa:");
        int Samosa=sc.nextInt();
        System.out.println("Chaat:");
        int Chaat=sc.nextInt();
        System.out.println("VegNoodles:");
        int VegNoodles=sc.nextInt();
        System.out.println("Eggs:");
        int Eggs=sc.nextInt();
    }
    void getsale(){                           //Function for entering sales
        System.out.println("Please Enter the Average Sales Of The Items Sold\nUse 1.Poor 2.Average 3.Good 4.Outstanding");
        System.out.println("Samosa:");
        SS=sc.nextLine();
        System.out.println("Chaat:");
        SC=sc.nextLine();
        System.out.println("VegNoodles:");
        SVN=sc.nextLine();
        System.out.println("Eggs:");
        SE=sc.nextLine();
    }
    void getest(){                          //Function for getting order suggestions.
        System.out.println("The order estimate of each product is as follows:");
        if (Samosa<=10 && SS=="Good")
            System.out.println(" Samosa : Immediately order raw materials according to 100 Samosa sales everyday.According to records sales will increase further.");
        else
            System.out.println(" Samosa : Order less material as they sales is not going as expected.");
        if (SC=="Good" && (month==0 && month<=4))
            System.out.println(" Chaat : You can order raw materials in good quantity as sales is going good & weather is also moderate");
        else
            System.out.println("Chaat : Order raw material in limited quantity as weather is getting hot and materials can get rotten. Order again when needed.");
        if (VegNoodles<=25 && SVN=="Average")
            System.out.println("Veg Noodles : Order Limited quantity as it does not gets affected by weather so sales will not be a major factor");
        else
            System.out.println(" Veg Noodles : Order according to 50 plates everyday. Sales is going good.");
        if (Eggs<=20 &&  (month==0 && month<=4) )
            System.out.println(" Veg Noodles : Order 20 cartons more as weather is moderate.");
        }
    void setorder(){                        //Function for setting orders for each item.
        System.out.println("Sir, now you can set the order the order accordingly your estimate.");
        System.out.println("Samosa:");
        int a=sc.nextInt();
        System.out.println("Chaat:");
        int b=sc.nextInt();
        System.out.println("VegNoodles:");
        int c=sc.nextInt();
        System.out.println("Eggs:");
        int d=sc.nextInt();
    }
    void getorder(){                         //Function for viewing orders to be placed.
        System.out.println("Sir, following is the order to be placed:");
        System.out.println("Samosa-"+a);
        System.out.println("Chaat-"+b);
        System.out.println("Veg Noodles-"+c);
        System.out.println("Eggs-"+d);
    }
    }

class NPerishableItems{
    int FrenchFries, Colddrink, Icecream, Wafers; //Variables in which Admin(CanteenOwner) Will Enter The Present Stock.
    String SFF, SCD, SIC, SW;                               //Variables in which sales will be entered under ranges.
    int a,b,c,d;                                            //Variables in which estimate orders will be stored.
    Scanner sc= new Scanner(System.in);
    Calendar cal = Calendar.getInstance();     //Function used for importing months for estimation according to weather.
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    void setquantity(){                                 //Function for entering present stock.
        System.out.println("Please Enter the current quantity of the items available.");
        System.out.println("FrenchFries:");
        int FrenchFries=sc.nextInt();
        System.out.println("Colddrink:");
        int Colddrink=sc.nextInt();
        System.out.println("Icecream:");
        int Icecream=sc.nextInt();
        System.out.println("Wafers");
        int Wafers=sc.nextInt();
    }
    void getsales(){                                  //Function for entering sales
        System.out.println("Please Enter the Average Sales Of The Items Sold\nUse 1.Poor 2.Average 3.Good 4.Outsatanding");
        System.out.println("French Fries:");
        SFF=sc.nextLine();
        System.out.println("ColdDrink:");
        SCD=sc.nextLine();
        System.out.println("Icecream:");
        SIC=sc.nextLine();
        System.out.println("Wafers:");
        SW=sc.nextLine();
    }
    void gettest(){                                   //Function for getting order suggestions.
        System.out.println("The order estimate of each product is as follows:");
        if (SFF=="Good")
            System.out.println(" French Fries : Immediately order raw materialse.According to records sales can increase further.");
        else
            System.out.println("French Fries :Order less material as they sales is not going as expected.");
        if (SCD=="Good" && (month==4 && month<=9))
            System.out.println("Cold Drink : You can order raw materials in good quantity as sales is going good & weather is not a factor here.");
        else
            System.out.println("Cold Drink : Order raw material in limited quantity as sales is not good also weather is getting cold. Order again when needed.");
        if (Icecream<=25 && SIC=="Good" && (month==4 && month<=9))
            System.out.println("Ice Cream : Order Immediately as sales is going good due to comming hot weather");
        else
            System.out.println("Ice Cream : Order less as weather can be a sales decreasing factor.");
        if (Wafers<=40)
            System.out.println("Wafers : Order 20 cartons more as it can be sold overtime.");
    }
    void setsorder(){                                  //Function for setting orders for each item.
        System.out.println("Sir, now you can set the order the order accordingly your estimate.");
        System.out.println("French Fries:");
        int a=sc.nextInt();
        System.out.println("ColdDrink:");
        int b=sc.nextInt();
        System.out.println("Icecream:");
        int c=sc.nextInt();
        System.out.println("Wafers:");
        int d=sc.nextInt();
}
    void getsorder(){                                //Function for viewing orders to be placed.
        System.out.println("Sir, following is the order to be placed:");
        System.out.println("French Fries-"+a);
        System.out.println("ColdDrink-"+b);
        System.out.println("Icecream-"+c);
        System.out.println("Wafers-"+d);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PerishableItems p1 = new PerishableItems();                                //Object Of Perishable Class Created.
        NPerishableItems p2 = new NPerishableItems();                              //Object Of Non-Perishable Class Created.

        System.out.println("Welcome To Eatables!\nYou Order We Deliver");
        System.out.println("Kindly Enter Your Username To Proceed");

        String username = sc.nextLine();
        System.out.println("Kindly Enter Your Password To Proceed");
        int password = sc.nextInt();
        if (Objects.equals(username,"Aniket") && password==1234) {
            System.out.println("Welcome Back! Admin.");
            while(true) {
                System.out.println("What Operation Do You Want To Perform?\n");
                System.out.println("Press the following for Perishable Items-\n 1: EnterQuantity, 2:EnterSales, 3:GetEstimate, 4:SetOrder\nPress the following for Non-Perishable Items-\n 5:EnterQuantity, 6:EnterSales, 7:GetEstimate, 8:SetOrder");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        p1.setquant();
                        break;
                    case 2:
                        p1.getsale();
                        break;
                    case 3:
                        p1.getest();
                        break;
                    case 4:
                        p1.setorder();
                        break;
                    case 5:
                        p2.setquantity();
                        break;
                    case 6:
                        p2.getsales();
                        break;
                    case 7:
                        p2.gettest();
                        break;
                    case 8:
                        p2.setsorder();
                        break;
                    case 9:
                        System.out.println("Please Enter Valid Input");
                        break;
                }
            }
        }
        else if (Objects.equals(username,"Manager") && password==5678) {
            System.out.println("Welcome Back! Manager.Following is the quantity of raw material to be ordered.");
            p1.getorder();
            p2.getsorder();
        }
        else
            System.out.println("Invalid Username Entered");
    }
}