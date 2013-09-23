/**
 * 
 */
package id.ac.gunadarma.paracorp.common;

/**
 * @author rezalesmana
 *
 */
public class Constant {
	
	public static final String INDONESIA = "ID";
	
	public static final String INDONESIA_NAME = "Indonesia";
	
	public static boolean isValidConstant( String constant ) {
		if( constant.equals( Constant.INDONESIA) ) {
			return true;
		}else if( constant.equals( Constant.INDONESIA_NAME ) ) {
			return true;
		}
		
		return false;
	}

}
