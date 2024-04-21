package Basics;

// Break key word

class Q20{
    public static void main(String args[]){
        System.out.println("start main");

        for(int i = 0; i < 10; i++){
            if(i == 5){ // when i == 5 to then stop the iteration  and jump out in to loop
                break;
            }
            System.out.println("i : " + i);
        }

        System.out.println("end main"); // this will exhicute
    }
}

