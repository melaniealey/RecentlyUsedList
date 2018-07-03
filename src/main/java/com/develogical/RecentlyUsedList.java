package com.develogical;


import java.util.ArrayList;

public class RecentlyUsedList{

	ArrayList recentNumbers = new ArrayList<>();


	public boolean isEmpty() {
		return recentNumbers.size() == 0;
	}

	public void add(int dialledNumber) {
	    recentNumbers.remove( (Object) dialledNumber); //if doesn't exist, leaves list unchanged, no error
		recentNumbers.add(dialledNumber);
	}

	public int retrieve(int index)
	{
//        if (index > recentNumbers.size()-1 || index < 0) throw new ArrayIndexOutOfBoundsException();
        return (int) recentNumbers.get(recentNumbers.size()-1-index);
	}

	public int getLenth()
	{
		return recentNumbers.size();
	}



}
