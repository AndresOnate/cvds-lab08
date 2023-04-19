package edu.eci.cvds.service;

import org.springframework.stereotype.Service;
import edu.eci.cvds.repository.ConfigurationsRepository;

@Service
public class ConfigurationService {

    private final ConfigurationsRepository configurationRepository;
	
	@Autowired
	public ConfigurationService(configurationRepository configurationRepository) {
		this.configurationRepository = configurationRepository;
	}
	
	public Configuration addConfiguration(Configuration Configuration) {
		return configurationRepository.save(Configuration);
	}
	
	public Configuration getConfiguration(Long ConfigurationId) {
		return configurationRepository.findById(ConfigurationId).get();
	}
	
	public List<Configuration> getAllConfigurations() {
		return configurationRepository.findAll();
	}
	
	public Configuration updateConfiguration(Configuration Configuration) {
		if(configurationRepository.existsById(Configuration.getConfigurationId())) {
			return configurationRepository.save(Configuration);
		}
		
		return null;
	}
	
	public void deleteConfiguration(Long ConfigurationId) {
		configurationRepository.deleteById(ConfigurationId);
	}	
    
}
