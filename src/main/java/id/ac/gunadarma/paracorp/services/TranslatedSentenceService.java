/**
 * 
 */
package id.ac.gunadarma.paracorp.services;

import java.util.List;

import id.ac.gunadarma.paracorp.model.IndonesiaSentence;
import id.ac.gunadarma.paracorp.model.TranslatedSentence;
import id.ac.gunadarma.paracorp.repository.IndonesiaSentenceRepository;
import id.ac.gunadarma.paracorp.repository.TranslatedSentenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rezalesmana
 *
 */
@Service("translatedSentenceService")
@Transactional
public class TranslatedSentenceService {
	
	private String language = id.ac.gunadarma.paracorp.common.Constant.INDONESIA;
	
	@Autowired
	private IndonesiaSentenceRepository indonesiaSentenceRepository;

	public List<TranslatedSentence> findAll(){
		return getRepository().findAll();
	}
	
	public TranslatedSentenceRepository getRepository() {
		if( language.equals( id.ac.gunadarma.paracorp.common.Constant.INDONESIA ) ) {
			return indonesiaSentenceRepository;
		}
		
		return indonesiaSentenceRepository;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
