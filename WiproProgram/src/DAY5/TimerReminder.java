package DAY5;

//File: TimerReminder.java

abstract class TaskReminder {
 // Abstract method: subclasses define what task to remind about
 abstract void nextTask();

 // Concrete method: waits 1 hour, then reminds
 public void startTimer() {
     try {
         System.out.println("✅ Timer started! I will remind you after 1 hour...");
         
         // For real use: 1 hour = 3600000 milliseconds
         Thread.sleep(3600000);
         
         // For quick demo/testing, use smaller value:
         // Thread.sleep(5000); // 5 seconds

         nextTask(); // call the reminder
     } catch (InterruptedException e) {
         System.out.println("⚠️ Timer was interrupted.");
     }
 }
}

//Concrete class: define the specific task
class SpecificTaskReminder extends TaskReminder {
 private String task;

 public SpecificTaskReminder(String task) {
     this.task = task;
 }

 @Override
 void nextTask() {
     System.out.println("⏰ Time's up! Reminder: " + task);
 }
}

//Main class
public class TimerReminder {
 public static void main(String[] args) {
     // Create reminder for a specific task
     SpecificTaskReminder reminder = new SpecificTaskReminder("Submit your project report.");

     // Start the timer
     reminder.startTimer();
 }
}
