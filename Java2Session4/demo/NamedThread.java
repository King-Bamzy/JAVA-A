/**
 * Creating threads using Thread class and using methods of the class
 */
package Java2Session4.demo;

/**
 * NamedThread is created as a subclass of the class Thread
 */
public class NamedThread extends Thread {
    String name;
    
    /**
     * This method of Thread class is overridden to specify the action
     * that will be done when the thread begins execution
     */
    public void run() {
        //Will store the number of threads
        int count = 0;
        while (count <= 3) {
            //Display the number of threads
            System.out.println(Thread.activeCount());
            //Display the name of the currently running thread
            name = Thread.currentThread().getName();
            count++;
            System.out.println(name);
            if (name.equals("Thread1"))
                System.out.println("Marimba");
            else
                System.out.println("Jini");
        } // Added missing closing brace for the while loop
    }

    public static void main(String args[]) {
        NamedThread objNamedThread = new NamedThread();
        objNamedThread.setName("Thread1");

        //Display the status of the thread, whether alive or not
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(objNamedThread.isAlive());
        
        /*invokes the start method which in turn will call
         * run and begin thread execution
         */
        objNamedThread.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(objNamedThread.isAlive());
    }
}