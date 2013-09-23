package id.ac.gunadarma.paracorp.viewmodel;

import java.util.List;

import id.ac.gunadarma.paracorp.model.EnglishSentence;
import id.ac.gunadarma.paracorp.services.EnglishSentenceService;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

/**
 * @author rezalesmana
 *
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class EnglishSentenceVM {
	
	@Init
	public void init() {
		this.setListSentences(englishSentenceService.findAll());
	}
	
	@WireVariable
	private EnglishSentenceService englishSentenceService;
	
	private List<EnglishSentence> listSentences;
	
	private EnglishSentence selectedItem;

	public List<EnglishSentence> getListSentences() {
		return listSentences;
	}

	public void setListSentences(List<EnglishSentence> listSentences) {
		this.listSentences = listSentences;
	}

	public EnglishSentence getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(EnglishSentence selectedItem) {
		this.selectedItem = selectedItem;
	}

}
