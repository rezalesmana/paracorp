/**
 * 
 */
package id.ac.gunadarma.paracorp.repository;

import java.util.List;

import id.ac.gunadarma.paracorp.model.EnglishSentence;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rezalesmana
 *
 */
public interface EnglishSentenceRepository extends MongoRepository<EnglishSentence, String> {
	
	List<EnglishSentence> findBySentenceNotNull( String sentence );

}
