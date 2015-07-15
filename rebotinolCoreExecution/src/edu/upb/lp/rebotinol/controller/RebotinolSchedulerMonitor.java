package edu.upb.lp.rebotinol.controller;

import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;

public class RebotinolSchedulerMonitor {

	private static RebotinolSchedulerMonitor _instance = null;

	private RebotinolSchedulerMonitor() {
	}

	public static RebotinolSchedulerMonitor get_instance() {
		if (_instance == null)
			_instance = new RebotinolSchedulerMonitor();
		return _instance;
	}

	public void waitPlayFinished(RebotinolProgram program) throws InterruptedException {
		synchronized (this) {
			while (!(program.isFinished())) {
				wait();
			}
		}
	}

	public void waitPlayBackFinished(RebotinolProgram program) throws InterruptedException {
		synchronized (this) {
			while (program.isStarted()) {
				wait();
			}
		}
	}

	public void notifyPlayOrPlayBackFinished() {
		synchronized (this) {
			notifyAll();
		}
	}

}
