# MultiThreading
Exercises from Java Multithreading course by John Purcell
<br/><br/>
Course link on Udemy: https://www.udemy.com/java-multithreading/learn/v4/overview 

## Notes

1. **Hello World** - Ways of implemantation Thread (by interface and extanding Thread)
1. **Basic Thread Synchronization** - in this example it is shown that if we do not use volatile keyword for the field which is used by multiple threads then we can get strange results. In our example variable running was previously without volatile. In some cases (different machines, implementations of Java, JVM configurations) it can happen that JVM will decide to cache value of "running" and will assume it will be always true. In such case even if we will start shutdown() -> thread which is reading this value will not recognize change. Here we have two threads, one is main which is writing to variable, and Processor which is reading it. Thanks to volatile we ensure that value of this field will be not cached. 
1. **The synchronized keyword** - 
1. **Multiple lock: Using synchronized code blocks** - 
1. **Thread Pools** - 
1. **Countdown Latches** - 
1. **Producer-Consumer** - 
1. **Wait and Notify** - 
1. **Worked Example Using Low-Level Synchronization** - 
1. **Re-entrant Locks** - 
1. **Deadlock** - 
1. **Semaphores** - 
1. **Callable and Future** - 
1. **Interrupting Threads** - 
