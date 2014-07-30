package edu.upb.lp.rebotinol.view.program.executions;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RepExecution;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;

//TODO javadoc
public class ExecutionsPanel extends JPanel {
	/**
	 * Serial 
	 */
	private static final long serialVersionUID = -6371882724632943962L;

	protected RebotinolController _controller;
	protected SequentialInstructionExecution _program;
	protected JPanel _instrsPanel;
	
	public ExecutionsPanel(RebotinolController controller) {
		super();
		_controller = controller;
		_program = controller.getProgram();
		
		// create and configure instructions panel
		_instrsPanel = new JPanel();
        _instrsPanel.setBorder(BorderFactory.createEtchedBorder());
        _instrsPanel.setLayout(new BoxLayout(_instrsPanel, BoxLayout.PAGE_AXIS));
        _instrsPanel.setBackground(Color.WHITE);

        // add instructions views
        initCreateViews();
        _instrsPanel.add(Box.createVerticalGlue());
        
        // embed instructions panel into a scroll pane
        JScrollPane scrollPane = new JScrollPane(_instrsPanel);

        // executions panel contains everything
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(scrollPane);
	}
	


	protected void initCreateViews() {

		// process instructions of the programs to create views
		List<RebotinolInstructionExecution> instrs = _program.getSubExecutions();
		for(RebotinolInstructionExecution instr : instrs) {

			InstructionView subView = null;

			// create compound view if instruction is compound (sequential) 
			// and create views recursively
			if (instr instanceof RepExecution) {
				// create compound view
				subView = createViews((RepExecution) instr, null);
				
			}
			else if (instr instanceof SequentialInstructionExecution) {
				// create compound view
				subView = createViews((SequentialInstructionExecution) instr, null);
			}


			// create simple view if instruction is simple
			else {
				subView = new SimpleInstructionView(instr, _controller); 
			}

			// add instruction view to instructions panel
			_instrsPanel.add(subView);

		}
	}


	protected InstructionView createViews(SequentialInstructionExecution seqInstr, ComposedInstructionView parentView) {

		ComposedInstructionView view = null;
		if (parentView != null) view = new ComposedInstructionView(seqInstr, parentView, _controller);
		else view = new ComposedInstructionView(seqInstr, _controller);

		// process sub-instructions
		List<RebotinolInstructionExecution> instrs = seqInstr.getSubExecutions();
		for(RebotinolInstructionExecution instr : instrs) {

			InstructionView subView = null;

			// create compound view if instruction is compound (sequential) 
			// and create views recursively
			if (instr instanceof SequentialInstructionExecution) {

				// create compound view
				subView = createViews((SequentialInstructionExecution) instr, view);
			}


			// create simple view if instruction is simple
			else {
				subView = new SimpleInstructionView(instr, view, _controller); 
			}

			//view.addNestedInstructionView(subView);

		}

		return view;

	}



	protected InstructionView createViews(RepExecution repInstr, ComposedInstructionView parentView) {

		ComposedInstructionView view = null;
		if (parentView != null) view = new ComposedInstructionView(repInstr, parentView, _controller);
		else view = new ComposedInstructionView(repInstr, _controller);

		int numReps = repInstr.getTotalNumberOfRepetitions();
		int instrsPerRep = repInstr.getNumberOfInstructionsPerRepetition();
		int numInstr = 0;

		List<InstructionView> subViews = new ArrayList<InstructionView>(instrsPerRep);

		// process sub-instructions
		List<RebotinolInstructionExecution> instrs = repInstr.getSubExecutions();
		for(RebotinolInstructionExecution instr : instrs) {


			// attach instruction to already existing view if second or later repetition
			// (REP case: multiple instructions attached to one view)
			if ((numInstr / instrsPerRep) >= 1) {
				InstructionView subView = subViews.get(numInstr % instrsPerRep);
				subView.attachAdditionalInstr(instr);
			}

			// if first repetition, create views that will be attached to
			// instructions of second or later repetitions
			else {

				InstructionView subView = null;

				// create compound view if instruction is compound (sequential) 
				// and create views recursively
				if (instr instanceof SequentialInstructionExecution) {
					// create compound view
					subView = createViews((SequentialInstructionExecution) instr, view);
				}
				// create simple view if instruction is simple
				else {
					subView = new SimpleInstructionView(instr, view, _controller); 
				}
				subViews.add(subView);

				//view.addNestedInstructionView(subView);
			}
			
			numInstr++;
		}

		return view;
	}


}
