/**
 * 
 */
package id.ac.gunadarma.paracorp.viewmodel;

import java.util.List;

import id.ac.gunadarma.paracorp.common.Constant;
import id.ac.gunadarma.paracorp.model.TranslatedSentence;
import id.ac.gunadarma.paracorp.services.TranslatedSentenceService;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

/**
 * @author rezalesmana
 *
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class TranslatedSentenceVM {
	
	private String language = Constant.INDONESIA;
	
	private List<TranslatedSentence> listSentences;
	
	private TranslatedSentence selectedItem; 
	
	@WireVariable
	private TranslatedSentenceService translatedSentenceService;
	
	@Init
    public void init( @BindingParam( "language" ) String language ){
		if( Constant.isValidConstant( language ) ) {
			this.setLanguage( language );
		}
		this.setListSentences(this.translatedSentenceService.findAll());
    }

	public String getLanguage() {
		return language;
	}

	public void setLanguage( String language ) {
		this.language = language;
		this.translatedSentenceService.setLanguage( this.getLanguage() );
	}

	public List<TranslatedSentence> getListSentences() {
		return listSentences;
	}

	public void setListSentences( List<TranslatedSentence> listSentences ) {
		this.listSentences = listSentences;
	}

	public TranslatedSentence getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem( TranslatedSentence selectedItem ) {
		this.selectedItem = selectedItem;
	}

}
