package in.co.examsadda.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import in.co.examsadda.model.Course;
import in.co.examsadda.view.R;

public class CourseLazyAdapter extends BaseAdapter {

    private Activity activity;
    private List<Course> courses;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader; 
    
    public CourseLazyAdapter(Activity activity, List<Course> courses) {
        this.activity = activity;
        this.courses =courses;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return courses.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(convertView==null) {
            view = inflater.inflate( R.layout.course_row, null );
        }

        TextView courseSerialNumberTV = (TextView)view.findViewById(R.id.courseSerialNumberTV); // Serial Number
        TextView courseNameEnglishTV = (TextView)view.findViewById(R.id.courseNameEnglishTV); // Course name in English
        TextView courseNameRegionalTV = (TextView)view.findViewById(R.id.courseNameRegionalTV); // Course name in Regional
        TextView numberOfPracticePapersCountTV=(TextView)view.findViewById(R.id.numberOfPracticePapersCountTV); // Number of Practice papers Available For the Course

        Course course = new Course();
        course = courses.get(position);
        
        // Setting all values in list view
        courseSerialNumberTV.setText(position);
        courseNameEnglishTV.setText(course.getCourseNameInEnglish());
        courseNameRegionalTV.setText(course.getCourseNameInRegional());
        numberOfPracticePapersCountTV.setText(course.getNumberOfPracticePapersAvailable());
        return view;
    }
}