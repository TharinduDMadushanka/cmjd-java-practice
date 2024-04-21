package Basics;

// Return key word

class Q22{
    public static void main(String args[]){
        System.out.println("start main");

        for(int i = 0; i < 10; i++){
            if(i== 5){ // when i == 5 then stop iterate and stop te loop
                return;
            }
            System.out.println("i : " + i);
        }

        System.out.println("end main"); // this will  exicute
    }
}
