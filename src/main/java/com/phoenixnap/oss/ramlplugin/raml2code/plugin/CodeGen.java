package com.phoenixnap.oss.ramlplugin.raml2code.plugin;

import java.io.IOException;

public class CodeGen {

	/*
	 * args[0] - Path of RAML
	 * args[1] - Output Directory
	 * args[2] - Base Package Structure
	 */
    public static void main(String args[]) {
        SpringMvcEndpointGeneratorMojo codeGenerator = new SpringMvcEndpointGeneratorMojo();
        try {
            codeGenerator.generateEndpoints(args[0],
                    args[1],
                    args[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
