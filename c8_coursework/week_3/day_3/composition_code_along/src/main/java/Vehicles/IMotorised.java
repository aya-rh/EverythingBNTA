package Vehicles;

public interface IMotorised {
    void startEngine();
    void stopEngine();
    int getHp();
    void setHp(int hp);
    void setFuelLevel(int level);
    int getFuelLevel();
}
