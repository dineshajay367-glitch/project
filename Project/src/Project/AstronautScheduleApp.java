package Project;
import java.util.*;
public class AstronautScheduleApp {
	public static void main(String[] args)
	{  	Scanner sc=new Scanner (System.in);
		ScheduleManager instance= ScheduleManager.getInstance();
		boolean flag=true;
		while(flag)
		{	System.out.println("1.AddTask/2.RemoveTask/3.ViewTask");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{  System.out.println("Enter Description");
				   String Description=sc.next();
				   System.out.println("Enter StartTime");
				   String StartTime=sc.next();
				   System.out.println("Enter EndTime");
				   String EndTime=sc.next();
				   System.out.println("Enter Priority");
				   String Priority=sc.next();
					instance.addTask(Description, StartTime, EndTime, Priority);
					break;
				}
				case 2:
				{
					instance.removeTask(sc.next());
					break;
				}
				case 3:
				{
					instance.viewTask();
					break;
				}
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
		
		}
		sc.close();
	}
}
