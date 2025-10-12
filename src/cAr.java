public class cAr {
    int noOfWheels;
    String CoLor;
    float MaxSpeed;
    float currentFuelInLiters;
    int noOSeats;



    public void drive(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out off fuel");
        }else if(currentFuelInLiters<=5){
            System.out.println("Car is Reserved mode");
            currentFuelInLiters--;
        }else {

        System.out.println("Car is runing");
        currentFuelInLiters--;}
    }
    public void AddFuel(float Fule){
        currentFuelInLiters +=Fule;

    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    public void CarStop(){
        System.out.println("Car Stop");
    }

    public void setCurrentFuelInLiters(float currentFuelInLiters) {
        this.currentFuelInLiters = currentFuelInLiters;
    }
}