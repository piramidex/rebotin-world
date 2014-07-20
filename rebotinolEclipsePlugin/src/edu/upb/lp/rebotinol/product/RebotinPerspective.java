package edu.upb.lp.rebotinol.product;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RebotinPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		// Get the editor area.
		String editorArea = layout.getEditorArea();
		layout.setFixed(true);
		layout.setEditorAreaVisible(true);
		layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, 0.25f, editorArea);
	}
}
