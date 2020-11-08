package ru.neoflex;

public class Search{ 
public static int search (int[] Array, int searchNumber){
	int searchIndex=-1;
	int firstIndex=0;
	int secondIndex=Array.length-1;
	
	while (firstIndex <= secondIndex)
	{
		int middleIndex = (firstIndex+secondIndex)/2;
		if (Array[middleIndex]==searchNumber)
		{
			return middleIndex;
		}
		else if (Array[middleIndex]<searchNumber)
		{
			firstIndex=middleIndex+1;
		}
		else if (Array[middleIndex]>searchNumber)
		{
			secondIndex=middleIndex-1;
		}
	}
	return -1;
}
}
