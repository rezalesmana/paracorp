/**
 * 
 */
package id.ac.gunadarma.paracorp.repository;

import id.ac.gunadarma.paracorp.model.TranslatedSentence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rezalesmana
 *
 */
public interface TranslatedSentenceRepository<T> extends MongoRepository<TranslatedSentence, String> {
	
	List<TranslatedSentence> findBySentenceNotNull( String sentence );

}
