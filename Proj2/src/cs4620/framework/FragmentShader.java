package cs4620.framework;

import javax.media.opengl.GL2;

public class FragmentShader extends Shader {

	public FragmentShader(GL2 glContext, String srcFile)
			throws GlslException {
		super(GL2.GL_FRAGMENT_SHADER, glContext, srcFile);
	}

}
