package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.RebotinolProgram;

public class ExecutionFromXTextProgramBuilder {
    public static SequentialInstructionExecution buildExecution(RebotinolProgram program) {
        List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
        
        SequentialInstructionExecution exec = new SequentialInstructionExecution(subExecutions);
        return exec;
    }
}
