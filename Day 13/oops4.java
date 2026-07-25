package OOPS_Day_2;
class car{
        void station(){
            System.out.println("Petrol station");
        }
    }
    class EVCAR extends car{
        void station(){
            System.out.println("EVCAR station");
        }
    }
    class PETROLCAR extends car{
        void station(){
            System.out.println("Petrol station is not working");
        }
    }
    public class oops4{
    public static void main(String[] args) {
        EVCAR evcar = new EVCAR();
        PETROLCAR petrolcar = new PETROLCAR();
        evcar.station();
        petrolcar.station();
    }
    }
