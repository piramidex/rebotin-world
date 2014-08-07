package edu.upb.lp.rebotinol.controller;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.observers.RebotinolButtonsObserver;

/**
 * 
 * @author Alexis Marechal
 *
 */
//TODO javadoc
public class RebotinolButtonsController {
	private List<RebotinolButtonsObserver> _observers = new ArrayList<RebotinolButtonsObserver>();
	private boolean _forwardActive;
	private boolean _backwardActive;
	private boolean _errorMet;
	private boolean _programStarted;
	private boolean _programFinished;
	
	/**
	 * Register an observer, following the Observer design pattern.
	 * 
	 * @param observer
	 *            The observer to be registered.
	 */
	public void registerObserver(RebotinolButtonsObserver observer) {
		_observers.add(observer);
	}
	
	public void programStarted() {
		_programStarted = true;
		checkButtons();
	}
	
	public void programUnStarted() {
		_programStarted = false;
		checkButtons();
	}
	
	public void programFinished() {
		_programFinished = true;
		checkButtons();
	}
	
	public void programUnFinished() {
		_programFinished = false;
		checkButtons();
	}
	
	public void forwardStarted() {
		_forwardActive = true;
		checkButtons();
	}
	
	public void forwardFinished() {
		_forwardActive = false;
		checkButtons();
	}
	
	public void backwardStarted() {
		_backwardActive = true;
		checkButtons();
	}
	
	public void backwardFinished() {
		_backwardActive = true;
		checkButtons();
	}
	
	public void errorMet() {
		_errorMet = true;
		checkButtons();
	}
	
	public void errorSolved() {
		_errorMet = false;
		checkButtons();
	}
	
	private void checkButtons() {
		boolean pause = _forwardActive || _backwardActive;
		boolean previous = _programStarted && !pause;
		boolean playBack = previous;
		boolean play = !_errorMet && !_programFinished && !pause;
		boolean next = play;
		for (RebotinolButtonsObserver obs : _observers) {
			obs.activatePause(pause);
			obs.activatePrevious(previous);
			obs.activatePlayBack(playBack);
			obs.activatePlay(play);
			obs.activateNext(next);
		}
	}
}
