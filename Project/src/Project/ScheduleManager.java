package Project;

import java.util.*;

public class ScheduleManager {
	private static ScheduleManager instance;
	private ScheduleManager()
	{
		System.out.println("Insatance is created");
	}
	public static ScheduleManager getInstance()
	{
		if(instance ==null)
		{
			synchronized(ScheduleManager.class)
			{
				if(instance==null)
				{
					instance=new ScheduleManager();
				}
			}
		}
		return instance;
	}
	List<Task> task=new ArrayList<>();
	public void addTask(String description,String startTime,String endTime,String priority)
	{ 
		TaskFactory t=new TaskFactory();
		Task newtask=t.addTask(description, startTime, endTime, priority);
		task.add(newtask);
		System.out.println("Task added SucessFully");
	}
	public void removeTask(String description)
	{
		for(int i=0;i<task.size();i++)
		{
			if(task.get(i).getDescription().equalsIgnoreCase(description))
			{
				task.remove(i);
				System.out.println("Task Removed SucessFully");
				break;
			}
		}
	}
	public void viewTask()
	{ if(task.size()==0)
	{
		System.out.println("No task is Available");
	}
		for(Task t:task)
		{
			t.Display();
		}
	}
}
