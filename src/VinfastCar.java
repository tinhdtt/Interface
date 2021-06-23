public class VinfastCar implements TypeOfCar, FuelForCar {
    @Override
    public void gasoline() {
        System.out.println("+ Chạy bằng xăng");
    }

    @Override
    public void oil() {

        System.out.println("+ Chạy bằng dầu");
    }

    @Override
    public void electric() {
        System.out.println("+ Chạy bằng điện");
    }

    @Override
    public void hydrogenGas() {
        System.out.println("+ Chạy bằng khí hydro");
    }

    @Override
    public void manualCar() {
        System.out.println("+ Không phải xe tự động");
    }

    @Override
    public void automaticCar() {
        System.out.println("+ Xe tự động");
    }
}
