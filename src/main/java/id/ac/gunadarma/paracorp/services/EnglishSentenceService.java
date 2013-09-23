/**
 * 
 */
package id.ac.gunadarma.paracorp.services;

import java.util.List;

import id.ac.gunadarma.paracorp.model.EnglishSentence;
import id.ac.gunadarma.paracorp.repository.EnglishSentenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rezalesmana
 *
 */
@Service("englishSentenceService")
@Transactional
public class EnglishSentenceService {
	
	@Autowired
	private EnglishSentenceRepository englishSentenceRepository;

	public List<EnglishSentence> findAll() {
		return englishSentenceRepository.findAll();
	}
	
	public List<EnglishSentence> findAll( Sort sort ) {
		return englishSentenceRepository.findAll(sort);
	}
	
	public List<EnglishSentence> findAllByListId( List<String> listOfId ) {
		return ( List<EnglishSentence> ) englishSentenceRepository.findAll( listOfId );
	}
	
	public EnglishSentence findById( String id ) {
		return englishSentenceRepository.findOne( id );
	}
	
	public List<EnglishSentence> findBySentence( String sentence ) {
		return englishSentenceRepository.findBySentenceNotNull( sentence );
	}
	
	public EnglishSentence save( EnglishSentence englishSentence ) {
		return englishSentenceRepository.save( englishSentence );
	}
	
	public List<EnglishSentence> saveList( List<EnglishSentence> listOfEnglishSentences ) {
		return englishSentenceRepository.save( listOfEnglishSentences );
	}
	
	public void delete( EnglishSentence englishSentence ) {
		englishSentenceRepository.delete( englishSentence );
	}
	
	public void deleteById( String id ) {
		englishSentenceRepository.delete( id );
	}
	
	public void deleteList( List<EnglishSentence> listOfEnglishSentences ) {
		englishSentenceRepository.delete( listOfEnglishSentences );
	}
	
	public void deleteByListId( List<String> listId ) {
		for( String id : listId ) {
			englishSentenceRepository.delete( id );
		}
	}
	
	public void deleteAll() {
		englishSentenceRepository.deleteAll();
	}
	
	public long getCount() {
		return englishSentenceRepository.count();
	}
	
	public boolean exists( String id ) {
		return englishSentenceRepository.exists( id );
	}
	
}
