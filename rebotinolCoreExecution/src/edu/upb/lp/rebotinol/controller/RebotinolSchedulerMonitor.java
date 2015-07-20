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

	public void waitPlayFinished(RebotinolController controller) throws InterruptedException {
		synchronized (this) {
			while ((!(controller.getProgram().isFinished())) && (!(controller.hasRebotinolErrorOccurred()))) {
				wait();
			}
		}
	}

	public void waitPlayBackFinished(RebotinolController controller) throws InterruptedException {
		synchronized (this) {
			while (controller.getProgram().isStarted()) {
				wait();
			}
		}
	}

	public void notifyPlayOrPlayBackStopped() {
		synchronized (this) {
			notifyAll();
		}
	}

}
