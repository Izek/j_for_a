package chapter_004;

public class LoggingApptCalendar2 {

	private ApptCalendar apptCal;

	public LoggingApptCalendar2(ApptCalendar apptCal) {
		this.apptCal = apptCal;
	}

	public void addAppt(Appt appt) {
		Logger.log(appt.toString());
		apptCal.addAppt(appt);
	}

	public void addAppts(Appt[] appts) {
		for (int i = 0; i < appts.length; i++)
			Logger.log(appts[i].toString());
		apptCal.addAppts(appts);
	}
}