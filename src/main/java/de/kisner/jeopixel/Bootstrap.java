package de.kisner.jeopixel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bootstrap
{
	final static Logger logger = LoggerFactory.getLogger(Bootstrap.class);

	public final static String xmlConfig = "jeopixel/config/jbenkins.xml";
	
//	private static Configuration config;
	
//	public static Configuration init()
	{
//		return init(xmlConfig);
	}
	
/*	public static Configuration init(String configFile)
	{
		LoggerInit loggerInit = new LoggerInit("log4j.xml");
		loggerInit.addAltPath("jeopixel/config");
		loggerInit.init();

		try
		{
			String cfn = ExlpCentralConfigPointer.getFile("jeopixel","app").getAbsolutePath();
			ConfigLoader.add(cfn);
			logger.info("Using additional config in: "+cfn );
		}
		catch (ExlpConfigurationException e) {logger.debug("No additional "+ExlpCentralConfigPointer.class.getSimpleName()+" because "+e.getMessage());}
		ConfigLoader.add(configFile);
		
		config = ConfigLoader.init();

		return config;
	}
	*/
}