# Core_Java_Project
1] "object lock" ensures that all the threads depending on the same object are synchronized.(using this keyword)
2] "object lock" ensures that all the threads depending on the same object are synchronized.(using Object of Object class).
3] Why Object Lock is Not Working in case of Lock_3 Program
   Ans--> Two different object shares a comman object lock
Solution --> create constructor and pass Object of Object class so that the two or more thread can be locked 
using one and only one comman object lock
see program Lock_3
Conclusion -->The two Threads with two different object has been synchronized
Hence two or more threads will synchronize if they have one and only one object lock in Comman.

4]The Program 4 viz. Lock_4 concludes that two or more threads will synchronize if they have one and only
  one object lock in Comman.
5] The 5th program answers the Question --> Can a thread acquire multiple 
   lock at the same time?
   Ans.] The answer to this question is Yes.
   This is my Commit
   This is Commit through Branch2

 
