package in.co.examsadda.controller;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.model.ExamPaper;

public class ExamController {

	public ExamPaper getExamPaperByExamPaperId(Integer examPaperId) {
		return new ExamPaper(  );
	}
	public List<ExamPaper> getExamPapersByExamId(Integer examId) {
		return new ArrayList<ExamPaper>(10  );
	}
}