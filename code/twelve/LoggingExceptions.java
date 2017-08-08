//12.4.1 异常与记录日志
package twelve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*private static Logger logger = Logger.getLogger("LoggingException");
 * 创建了一个String参数相关联的Logger对象 通常与错误相关的包名与类名 这个Logger对象会将其输出发送到System.err
 * 使用与日志消息记录消息severe()向Logger写入
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
 八月 08, 2017 3:04:04 下午 twelve.LoggingException <init>
严重: twelve.LoggingException
	at twelve.LoggingExceptions.main(LoggingExceptions.java:23)

Caught twelve.LoggingException
八月 08, 2017 3:04:04 下午 twelve.LoggingException <init>
严重: twelve.LoggingException
	at twelve.LoggingExceptions.main(LoggingExceptions.java:29)

Caught twelve.LoggingException

 * */
