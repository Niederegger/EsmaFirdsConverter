package de.vv.ef.consumer;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * simple container, used as a Dictionary
 *	Stringvalues are mapped to Fieldnames,
 *	they are supposed to have same index
 *	
 *	also this class 
 */
public class L2M {
	public ArrayList<String> fns = new ArrayList<String>();		// Fieldnames
	public ArrayList<String> svs = new ArrayList<String>();		// StringValues
	
	/**
	 * Fügt ein simplen Eintrag hinzu, falls dieser nicht null oder leer ist
	 * @param fn
	 * @param sv
	 */
	public void append(String fn, String sv){
		if(sv==null||sv.equals("")) return;
		fns.add(trimString(fn));svs.add(trimString(sv));
	}
	
	/**
	 * trims a String when it ain't null, removing unwanted whitespace
	 * @param s
	 * @return
	 */
	public String trimString(String s){
		return s!=null?s.trim():s;
	}
	
	/**
	 * Fügt Big-Decimal-Eintrag hinzu, falls dieser nicht null ist
	 * @param fn
	 * @param sv
	 */
	public void append(String fn, BigDecimal sv){
		if(sv==null) return;
		append(fn,sv.toString());
	}
	
	/**
	 * Fügt boolean-Eintrag hinzu, umgewandelt in ein String
	 * @param fn
	 * @param sv
	 */
	public void append(String fn, boolean sv){
		append(fn,b2str(sv));
	}
	
	/**
	 * Fügt Boolean-Eintrag hinzu, falls dieser nicht null ist, umgewandelt in ein String
	 * @param fn
	 * @param sv
	 */
	public void append(String fn, Boolean sv){
		if(sv==null)return;
		append(fn,b2str(sv));
	}
	
	/**
	 * Fügt XMLGregorianCalendar-Eintrag hinzu, falls dieser nicht null ist
	 * @param fn
	 * @param sv
	 */
	public void append(String fn, XMLGregorianCalendar sv){
		if(sv==null) return;
		append(fn,sv.toString());
	}
	
	/**
	 * Fügt ein L2M Element diesem Element hinzu
	 * @param l2m
	 */
	public void append(L2M l2m){
		append(l2m.fns,l2m.svs);
	}
	
	/**
	 * Fügt ein Fieldnames-Liste und StringValue-Liste hinzu,
	 * falls beide nicht null sind und  die gleiche größe haben
	 * @param fn
	 * @param sv
	 */
	public void append(ArrayList<String> fn, ArrayList<String> sv){
		if(sv==null||fn==null||sv.size()!=fn.size()) return;
		fns.addAll(fn);svs.addAll(sv);
	}
	
	/**
	 * wandelt eine boolean in String um
	 * @param b
	 * @return
	 */
	public String b2str(boolean b){return b?"true":"false";}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<fns.size(); i++){
			sb.append("L:");
			sb.append(fns.get(i).length());
			sb.append("\t");
			sb.append(fns.get(i));
			sb.append(":\t");
			sb.append(svs.get(i));
			sb.append("\n");
		}
		return sb.toString();
	}
}
