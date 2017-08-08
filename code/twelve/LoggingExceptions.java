//12.4.1 �쳣���¼��־
package twelve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*private static Logger logger = Logger.getLogger("LoggingException");
 * ������һ��String�����������Logger���� ͨ���������صİ��������� ���Logger����Ὣ��������͵�System.err
 * ʹ������־��Ϣ��¼��Ϣsevere()��Loggerд��
 * 
 * 
 * 
 * 
 * 
 * */
class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}

		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught "+e);
		}
	}
}
/*
 * 
 ���� 08, 2017 3:04:04 ���� twelve.LoggingException <init>
����: twelve.LoggingException
	at twelve.LoggingExceptions.main(LoggingExceptions.java:23)

Caught twelve.LoggingException
���� 08, 2017 3:04:04 ���� twelve.LoggingException <init>
����: twelve.LoggingException
	at twelve.LoggingExceptions.main(LoggingExceptions.java:29)

Caught twelve.LoggingException

 * */
