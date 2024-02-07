package Car;
import java.util.Scanner;
public class Car {
    private String brand;
    private String model;
    private String year;
    private String cc;
    Scanner key=new Scanner(System.in);
    
    public Car(){
        set_brand(brand);
        set_model(model);
        set_year(year);
        set_cc(cc);
    }
    
    public String get_brand() {
        return brand;
    }
    
    public void set_brand(String brand) {
        System.out.println("Type the brand");
        this.brand=key.nextLine();
    }
    
    public String get_model() {
        return model;
    }
    public void set_model(String model) {
        System.out.println("Type the model");
        this.model=key.nextLine();
    }
    
    public String get_year() {
        return year;
    }
    
    public void set_year(String year) {
        System.out.println("Type the year");
        this.year=key.nextLine();
    }
    
    public String get_cc() {
        return cc;
    }
    
    public void set_cc(String cc) {
        System.out.println("Type the cc");
        this.cc=key.nextLine();
    }
    public String get_details(){
        return "\n----------------"+"\nModel: "+model+"\nBrand: "+brand+"\nYear: "+year+"\nCc: "+cc+"\n----------------";
    }

}
