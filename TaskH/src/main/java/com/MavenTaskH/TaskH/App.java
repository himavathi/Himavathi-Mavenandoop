package com.MavenTaskH.TaskH;

import java.util.Scanner;

public class App 
{
    	void chocolates(String a[],int b[])
    	{
    		int l=a.length,sum=0;
    		System.out.println("\nOutput of the Program:\n");
    		System.out.println("The Chocolates Present are:");
    		for(int i=0;i<l;i++)
    		{
    			System.out.println("\t\t\t    "+a[i]);
    		}
    		for(int i=0;i<l;i++)
    		{
    			sum=sum+b[i];
    		}
    		System.out.println("\nTotal Weight of the Chocolates is:"+sum);
    		System.out.println("\nAfter Sorting is:");
    		for(int i=0;i<l;i++)
    		{
    			for(int j=0;j<l-1;j++)
    			{
    				if((a[j].compareTo(a[j+1]))>0)
    				{
    					String temp=a[j];
    					a[j]=a[j+1];
    					a[j+1]=temp;
    				}
    			}
    		}
    		for(int i=0;i<l;i++)
    		{
    			System.out.println("\t\t\t\t  "+a[i]);
    		}
    	}
 }
    class EpamHomeTask
    {
    	public void main(String arg[])
    	{
    		App obj=new App();
    		Scanner s=new Scanner(System.in);
    		System.out.println("Enter the number of chocolates:");
    		int num=s.nextInt();
    		String astr[]=new String[num];
    		int wa[]=new int[num];
    		for(int i=0;i<num;i++)
    		{
    			System.out.println("Chocolate Name:"+(i+1));
    			astr[i]=s.next();
    			System.out.println("Chocolate Weight:"+(i+1));
    			wa[i]=s.nextInt();
    		}
    		obj.chocolates(astr,wa);
    		s.close();
    	}

    }
        	
 
