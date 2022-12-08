package models;

public class TurboChargedCar extends Car {
    
    private Boolean turbo = false;

    public TurboChargedCar(String registration) {
        // First line
        super(registration);
    }

    @Override
    public void accelerate() {
        if (this.turbo) {
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vrroooooooooooooom!");
        } else {
            super.accelerate();
            System.out.println("Pffftt........");
        }

    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

}
