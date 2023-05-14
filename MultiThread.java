class Add extends Thread {
    public void run() {
        System.out.println("addition thread started");
        try {
            for (int i = 1; i <= 10; i++) {
                int j = 5;
                System.out.println(i + " + " + j + " = " + (i + j));
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("addition thread terminiated");
        }
        System.out.println("addition terminated");
    }
}

class Multi extends Thread {
    public void run() {
        System.out.println("\t\t multiplication thread started");
        try {
            for (int i = 1; i <=10; i++) {
                int j = 5;
                System.out.println("\t\t\t" + i + "x" + j + " = " + (i * j));
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("multiplication thread intrupted");
        }
        System.out.println("\t\t\tmultiplication thread terminiated");
    }
}

class MultiThread {
    public static void main(String args[]) {
        Add a = new Add();
        Multi m = new Multi();
        a.start();
        m.start();
    }
}

