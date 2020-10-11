package curso.api.rest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//CLASSE CRIADA PARA AUXILICAR O METODO AUTHENTICATION GETAUTHENTICATION
//TODO O CONTEXTO DOS REPOSITORY É FEITA PARA AUXILIXAR A CLASSE JWTTOKEAUTENTIACACAOSERVICE
@Component
public class ApplicationContextLoad  implements ApplicationContextAware{

	@Autowired
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}


}
