package Basics;

// Continue key word

class Q21{
    public static void main(String args[]){
        System.out.println("start main");

        for(int i = 0; i < 10; i++){
            if(i == 5){ // when i == 5 , nothing happen iterate again from i == 10
                continue;
            }
            System.out.println("i : " + i);
        }

        System.out.println("end main"); // this will exicute
    }
}

