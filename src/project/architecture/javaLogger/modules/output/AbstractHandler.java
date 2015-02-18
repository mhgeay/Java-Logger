package project.architecture.javaLogger.modules.output;

import project.architecture.javaLogger.modules.core.Level;

/**
 * @author kadary
 * @version 1.0
 */
public abstract class AbstractHandler implements Handler {

	public abstract void log(Level level, String message, String fqcn, String handler, Formater formater);
	public abstract void log(Level level, String message, String fqcn, String handler, Formater formater, Level levelFixed);
	public abstract void log(Level level, String message, String fqcn, String handler, Formater formater, boolean forceLogging);

}
