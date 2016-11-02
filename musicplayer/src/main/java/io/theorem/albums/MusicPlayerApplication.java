package io.theorem.albums;

import java.util.Properties;

import com.google.inject.persist.jpa.JpaPersistModule;
import com.hubspot.dropwizard.guice.GuiceBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.theorem.albums.resources.AlbumsResource;
import io.theorem.albums.util.StartHelper;

public class MusicPlayerApplication extends Application<MusicPlayerConfiguration> {
	private GuiceBundle<MusicPlayerConfiguration> guiceBundle;

	public static void main(String[] args) throws Exception {
		new MusicPlayerApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<MusicPlayerConfiguration> bootstrap) {
		MusicPlayerConfiguration configuration = StartHelper.createConfiguration(StartHelper.getConfigFilename());
		Properties jpaProperties = StartHelper.createPropertiesFromConfiguration(configuration);

		JpaPersistModule jpaPersistModule = new JpaPersistModule(StartHelper.JPA_UNIT);
		jpaPersistModule.properties(jpaProperties);

		guiceBundle = GuiceBundle.<MusicPlayerConfiguration> newBuilder().addModule(new ToDoGuiceModule())
				.addModule(jpaPersistModule).enableAutoConfig("org.oregami")
				.setConfigClass(MusicPlayerConfiguration.class).build();

		bootstrap.addBundle(guiceBundle);

	}

	@Override
	public void run(MusicPlayerConfiguration configuration, Environment environment) {
		/*
		 * Not Implemented
		 */

        StartHelper.init(StartHelper.getConfigFilename());
		environment.jersey().register(guiceBundle.getInjector().getInstance(AlbumsResource.class));

	}

}