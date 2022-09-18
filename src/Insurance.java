import java.util.Date;

public abstract class Insurance {

    private String name;
    private double price;
    private Date start;
    private Date finish;

    public Insurance(String name,Date start,Date finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Insurance(String name, double price, Date start, Date finish) {
        this.name = name;
        this.price = price;
        this.start = start;
        this.finish = finish;
    }



    abstract void calculate(String insuranceType);


}

    class HealthInsurance extends Insurance {


        public HealthInsurance(String insuranceType) {
            super("HealthInsurance ",  new Date(), new Date());
            calculate(insuranceType);
        }

        public void calculate(String insuranceType) {
            double price=999.99;
            if(insuranceType.equals("Individual"))
            {
                setPrice(price);
            }
            if(insuranceType.equals("Enterprise")){
                setPrice(price*0.4);
            }
        }
    }


    class ResidenceInsurance extends Insurance{

        public ResidenceInsurance(String insuranceType) {
            super("HealthInsurance ",  new Date(), new Date());
            calculate(insuranceType);
        }

        @Override
        public void calculate(String insuranceType) {
            double price=399.99;
            if(insuranceType.equals("Individual"))
            {
                setPrice(price);
            }
            if(insuranceType.equals("Enterprise")){
                setPrice(price*0.3);
            }
        }
    }


    class TravelInsurance extends Insurance{


        public  TravelInsurance(String insuranceType) {
            super("HealthInsurance ",  new Date(), new Date());
            calculate(insuranceType);
        }

        @Override
        public void calculate(String insuranceType) {
            double price=799.99;
            if(insuranceType.equals("Individual"))
            {
                setPrice(price);
            }
            if(insuranceType.equals("Enterprise")){
                setPrice(price*0.5);
            }
        }

    }


    class CarInsurance extends Insurance{


        public  CarInsurance(String insuranceType) {
            super("HealthInsurance ",  new Date(), new Date());
            calculate(insuranceType);
        }


        @Override
        public void calculate(String insuranceType) {
            double price=199.99;
            if(insuranceType.equals("Individual"))
            {
                setPrice(price);
            }
            if(insuranceType.equals("Enterprise")){
                setPrice(price*0.7);
            }
        }

    }




