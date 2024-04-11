- Create class named as BankService

	 1. Define simulation queues in a BankService. 
	 2. Queues hold references to Customer and Teller objects
	 3. Customer (FIFO) queue is used to hold waiting customers. If the queue is too long
 	(i.e. >  customerQLimit), customer goes away without entering customer queue
 	 4. There are several tellers in a BankService. Use PriorityQueue to hold BUSY tellers 
 	 	and FIFO queue to hold FREE tellers, i.e. a teller that is FREE for the longest time 
 	 	should start be used first.

 	 5. To handle teller in PriorityQueue, we need to define comparator for comparing 2 teller objects. 
 	 	Here is a constructor from Java API:
 			PriorityQueue(int initialCapacity, Comparator<? super E> comparator)

 	 6. For priority queue, the default compare function is "natural ordering"
 		i.e. for numbers, minimum value is returned first

 	 7. User can define own comparator class for PriorityQueue.	For teller objects, we like to have smallest end busy interval time first.

 		The following class defines compare() for two tellers :
 		
 		class CompareTeller implements Comparator<Teller>
		{
		    @Override
		    public int compare(Teller o1, Teller o2)
		    {
		        return o1.getEndBusyIntervalTime() - o2.getEndBusyIntervalTime();
		    }
		}