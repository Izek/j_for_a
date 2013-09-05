package chapter_004;

class Logger {
	public static void log(Object o) {

		// LoggingApptCalendar class relies on a Logger class whose void
		// log(String msg) class method logs a string to a file (the details are
		// unimportant).

	}
}

public class LoggingApptCalendar extends ApptCalendar {
	// A constructor is not necessary because the Java compiler will add a
	// noargument constructor that calls the superclass's noargument
	// constructor by default.

	@Override
	public void addAppt(Appt appt) {
		Logger.log(appt.toString());
		super.addAppt(appt);
	}

	@Override
	public void addAppts(Appt[] appts) {
		for (int i = 0; i < appts.length; i++)
			Logger.log(appts[i].toString());
		super.addAppts(appts);
	}
}