package Basics;

// Encapsulation

class Car{
    private int speed = 0;
    private boolean isStart;

    public void incrementSpeed(){
        if(isStart){
            this.speed += 10;
        }
    }

    public void setIsStart(boolean isStart){
        if(isStart == false){
            this.speed = 0;
        }
        this.isStart = isStart;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean getIsStart(){
        return this.isStart;
    }
}

class Q32 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Speed : " + car.getSpeed());
        System.out.println("Is Start : " + car.getIsStart());

        car.setIsStart(true);
        car.incrementSpeed();
        System.out.println("Speed : " + car.getSpeed());
        System.out.println("Is Start : " + car.getIsStart());

        car.setIsStart(false);
        System.out.println("Speed : " + car.getSpeed());
        System.out.println("Is Start : " + car.getIsStart());
    }
}

