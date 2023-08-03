package Day08.Ex01_UpDownCasting;

class Job {}
class Developer extends Job{}
class Designer extends Job{}
class Doctor extends Job{}

public class InstanceOf {
	
	public static String checkJob(Job job) {
		if( job instanceof Developer ) {
			Developer developer = (Developer) job;
			return "개발자입니다.";
		}
		if( job instanceof Designer ) {
			Designer designer = (Designer) job;
			return "디자이너입니다";
		}
		if( job instanceof Doctor ) {
			Doctor doctor = (Doctor) job;
			return "의사입니다.";
		}
			return "무직입니다";
	}
	
	public static void main(String[] args) {
		Job job1 = new Developer();
		Job job2 = new Designer();
		Job job3 = new Doctor();
		
		System.out.println("job1 : " + checkJob(job1));
		System.out.println("job2 : " + checkJob(job2));
		System.out.println("job3 : " + checkJob(job3));
	}
	
	
	
	
}
