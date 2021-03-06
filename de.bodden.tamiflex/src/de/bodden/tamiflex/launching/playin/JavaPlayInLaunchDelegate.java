package de.bodden.tamiflex.launching.playin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

import de.bodden.tamiflex.launching.LaunchUtil;

public class JavaPlayInLaunchDelegate extends JavaLaunchDelegate {

	@Override
	public String getVMArguments(ILaunchConfiguration configuration)
			throws CoreException {
		return LaunchUtil.appendAgentArgs(super.getVMArguments(configuration), true);
	}
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		super.launch(configuration, "run", launch, monitor);
	}

}
