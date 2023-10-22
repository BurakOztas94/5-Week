import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Product {
    private int id;
    private int batteryPower;
    private String color;

    private static ArrayList<MobilePhone> mobilePhones = new ArrayList<> ();
    static Scanner scan = new Scanner (System.in);

    public MobilePhone (int id , String name , double price , double discountRate , int unitInStock , Brand brand , int storage , int ram , double screenSize , int batteryPower , String color)
        {
            super (id , name , price , discountRate , unitInStock , brand , storage , ram , screenSize);
            this.id = id;
            this.batteryPower = batteryPower;
            this.color = color;
        }

    static
        {
            mobilePhones.add (new MobilePhone (1 , "SAMSUNG GALAXY A51" , 3199.0 , 0.5 , 5 , Brand.selectBrand (7) , 128 , 6 , 6.5 , 4000 , "Black"));
            mobilePhones.add (new MobilePhone (2 , "iPhone 11 64 GB" , 7379.0 , 0 , 5 , Brand.selectBrand (0) , 64 , 6 , 6.1 , 3046 , "Blue"));
            mobilePhones.add (new MobilePhone (3 , "Redmi Note 10Pro 8 GB" , 4012 , 0.5 , 5 , Brand.selectBrand (8) , 128 , 12 , 6.5 , 4000 , "White"));
        }

    public static void phoneMenu ()
        {
            boolean showMenu = true;
            while (showMenu)
                {
                    System.out.println ("-----Phone Operations-----");
                    System.out.println ("1-List all Phones");
                    System.out.println ("2-Add a New Phone");
                    System.out.println ("3-Delete a Phone");
                    System.out.println ("0-Exit");
                    System.out.println ("--------------------------------");
                    System.out.print ("Make a choice: ");
                    int select = scan.nextInt ();

                    switch (select)
                        {
                            case 1:
                                printPhones ();
                                break;
                            case 2:
                                addPhone ();
                                System.out.println ("Product added successfully");
                                break;
                            case 3:
                                deletePhone ();
                                mobilePhones.size ();
                                System.out.println ("Product deleted successfully");
                                break;
                            case 0:
                                showMenu = false;
                                break;
                        }
                }
        }

    public static void printPhones ()
        {
            System.out.println ("1-List/Filter Phones");
            System.out.println ("2-Filter Phones By ID");
            System.out.println ("3-Filter Phones By Brand");
            System.out.print ("Make a choice: ");
            int number = scan.nextInt ();
            switch (number)
                {
                    case 1:
                        printAllPhones ();
                        break;
                    case 2:
                        System.out.print ("Enter an ID: ");
                        int id = scan.nextInt ();
                        filterPhoneById (id);
                        break;
                    case 3:
                        filterPhoneByBrand ();
                        break;
                }
        }

    public static void printAllPhones ()
        {
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format ("| %-3s | %-30s | %-10s    | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n" ,
                    "ID" , "Product Name" , "Price" , "Brand" , "Storage" , "Screen" , "Camera" , "Battery" , "RAM" , "Color");
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");

            for ( MobilePhone p : mobilePhones )
                {
                    System.out.format ("| %-3d | %-30s | %-10.2f TL | %-10s | %-10d | %-10.1f | %-10d | %-10d | %-10s |\n" ,
                            p.getId () , p.getName () , p.getPrice () , p.getBrand ().getBrandName () ,
                            p.getStorage () , p.getScreenSize () , p.getBatteryPower () , p.getRam () , p.getColor ());
                }
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    public static void filterPhoneById (int Id)
        {
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format ("| %-3s | %-30s | %-10s    | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n" ,
                    "ID" , "Product Name" , "Price" , "Brand" , "Storage" , "Screen" , "Camera" , "Battery" , "RAM" , "Color");
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
            boolean a = false;
            for ( MobilePhone p : mobilePhones )
                {
                    if ( p.getId () == Id )
                        {
                            System.out.format ("| %-3d | %-30s | %-10.2f TL | %-10s | %-10d | %-10.1f| %-10d | %-10d | %-10s |\n" ,
                                    p.getId () , p.getName () , p.getPrice () , p.getBrand ().getBrandName () ,
                                    p.getStorage () , p.getScreenSize () , p.getBatteryPower () , p.getRam () , p.getColor ());
                            a = true;
                        }
                }
            if ( !a )
                {
                    System.out.println ("Product ID not found");
                }
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    public static void filterPhoneByBrand ()
        {
            Brand.printBrands ();
            System.out.print ("Please choose a brand by its number : ");
            int selectBrandNumber = scan.nextInt () - 1;
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format ("| %-3s | %-30s | %-10s    | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n" ,
                    "ID" , "Product Name" , "Price" , "Brand" , "Storage" , "Screen" , "Camera" , "Battery" , "RAM" , "Color");
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
            boolean a = false;
            for ( MobilePhone p : mobilePhones )
                {
                    if ( p.getBrand ().getBrandName ().equals (Brand.filterBrand (selectBrandNumber)) )
                        {
                            System.out.format ("| %-3d | %-30s | %-10.2f TL | %-10s | %-10d | %-10.1f | %-10d | %-10d | %-10s |\n" ,
                                    p.getId () , p.getName () , p.getPrice () , p.getBrand ().getBrandName () ,
                                    p.getStorage () , p.getScreenSize () , p.getBatteryPower () , p.getRam () , p.getColor ());
                            a = true;
                        }
                }
            if ( !a )
                {
                    System.out.println ("Brand not found !");
                }
            System.out.println ("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    public static void addPhone ()
        {
            System.out.print ("Enter product name: ");
            String name = scan.next () + scan.nextLine ();
            System.out.print ("Enter product price: ");
            double price = scan.nextDouble ();
            System.out.print ("Enter product discount rate: ");
            double discountRate = scan.nextDouble ();
            System.out.print ("Enter product in stock: ");
            int unitInStock = scan.nextInt ();
            System.out.println ("--------Brands--------");
            Brand.printBrands ();
            System.out.print ("Please choose a brand of phone: ");
            int selectedBrand = scan.nextInt () - 1;
            while (!( selectedBrand >= 0 && selectedBrand < 9 ))
                {
                    System.out.println ("Invalid entry!");
                    System.out.print ("Please choose a brand of phone: ");
                    selectedBrand = scan.nextInt () - 1;
                }
            System.out.print ("Enter product storage: ");
            int storage = scan.nextInt ();
            System.out.print ("Enter product RAM: ");
            int ram = scan.nextInt ();
            System.out.print ("Enter product screen size (inch): ");
            double screenSize = scan.nextDouble ();
            System.out.print ("Enter product camera resolution: ");
            int camera = scan.nextInt ();
            System.out.print ("Enter product battery power: ");
            int batteryPower = scan.nextInt ();
            System.out.print ("Enter product color: ");
            String color = scan.next ();

            int maxId = 0;
            for ( MobilePhone p : mobilePhones )
                {
                    if ( p.getId () > maxId )
                        {
                            maxId = p.getId ();
                        }
                }

            // Assign the new phone an ID one integer higher than the maximum ID
            int newPhoneId = maxId + 1;

            mobilePhones.add (new MobilePhone (newPhoneId , name , price , discountRate , unitInStock , Brand.selectBrand (selectedBrand) , storage , ram , screenSize , batteryPower , color));
        }

    public static void deletePhone ()
        {
            printAllPhones ();
            System.out.print ("Select phone by ID to delete: ");
            int selectId = scan.nextInt ();
            for ( MobilePhone p : mobilePhones )
                {
                    if ( p.getId () == selectId )
                        {
                            mobilePhones.remove (p);
                            break;
                        }
                }
        }

    @Override
    public int getId ()
        {
            return id;
        }

    @Override
    public void setId (int id)
        {
            this.id = id;
        }

    public int getBatteryPower ()
        {
            return batteryPower;
        }

    public String getColor ()
        {
            return color;
        }
}
