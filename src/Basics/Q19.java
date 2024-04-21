package Basics;

// Java control flow "do-while loop"

class Q19{
    public static void main(String args[]){
        int i = 0;
        // While
        while (i <10) {
            System.out.println("While : " + i);
            i++;
        }

        System.out.println("---------------");
        int j = 0;
        // do-while
        do {
            System.out.println("do while : " + j);
            j++;
        } while (j < 10);
    }
}

