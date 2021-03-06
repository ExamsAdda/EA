package in.co.examsadda.model;

import java.util.ArrayList;
import java.util.List;


public class ExamSection {
	private Section section;
	private List<SectionQuestion> questions;
	/**
	 * @param section
	 * @param questions
	 */
	public ExamSection(Section section, List<SectionQuestion> questions) {
		this.section = section;
		this.questions = questions;
	}
	/**
	 * 
	 */
	public ExamSection() {
		section = new Section();
		questions = new ArrayList<>();
	}
	/**
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(Section section) {
		this.section = section;
	}
	/**
	 * @return the questions
	 */
	public List<SectionQuestion> getQuestions() {
		return questions;
	}
	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<SectionQuestion> questions) {
		this.questions = questions;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExamSection [section=" + section + ", questions=" + questions + "]";
	}
	
}
