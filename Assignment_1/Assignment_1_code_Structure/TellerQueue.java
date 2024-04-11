
public class TellerQueue implements Queue 
{
	// start time and end time of current interval
    private int startTime;
    private int endTime;

    // teller id and current customer which is served by this teller
    private int tellerID;
    private Customer currentCustomer;

    // for keeping statistical data
    private int totalFreeTime;
    private int totalBusyTime;
    private int totalCustomers;
    

    TellerQueue(int tellerId)
    {
        tellerID = tellerId;
    }
    
    int getTellerID()
    {
        return tellerID;
    }

    Customer getCustomer()
    {
        return currentCustomer;
    }

    
    int getEndBusyIntervalTime()
    {
        // return end time of busy interval
        return endTime;
    }
    
    void freeToBusy (Customer currentCustomer, int currentTime)
    {
        // Main goal : switch from free interval to busy interval
        //
        // end free interval, start busy interval
        // steps : update totalFreeTime
        //         set startTime, endTime, currentCustomer
        //         update totalCustomers

        totalFreeTime += (currentTime - startTime);
        startTime = currentTime;
        endTime = startTime + currentCustomer.getTransactionTime();
        this.currentCustomer = currentCustomer;
        totalCustomers++;
    }
    
    Customer busyToFree ()
    {
        // Main goal : switch from busy interval to free interval
        //
        // steps : update totalBusyTime
        //         set startTime
        //         return currentCustomer

        totalBusyTime += (endTime - startTime);
        startTime = endTime;
        return currentCustomer;
    }
    
    void setEndIntervalTime (int endsimulationtime, int intervalType)
    {
        // for end of simulation
        // set endTime,
        // for FREE interval, update totalFreeTime
        // for BUSY interval, update totalBusyTime

        endTime = endsimulationtime;

        if (intervalType == 0) {
            totalFreeTime += endTime - startTime;
        } else {
            totalBusyTime += endTime - startTime;
        }
    }
    
    void printStatistics ()
    {
        // print teller statistics, see project statement

        System.out.println("\t\tTeller ID                : "+tellerID);
        System.out.println("\t\tTotal free time          : "+totalFreeTime);
        System.out.println("\t\tTotal busy time          : "+totalBusyTime);
        System.out.println("\t\tTotal # of customers     : "+totalCustomers);

        if (totalCustomers > 0) {
            System.out.format("\t\tAverage transaction time : %.2f\n",
                    (totalBusyTime*1.0)/totalCustomers);
        }
        System.out.println();
    }
    
    
	@Override
	public void enqueue(Customer x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	

}//end class
