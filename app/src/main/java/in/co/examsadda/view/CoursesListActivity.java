package in.co.examsadda.view;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import in.co.examsadda.controller.CourseController;
import in.co.examsadda.model.Course;
import in.co.examsadda.util.CourseLazyAdapter;

public class CoursesListActivity extends Activity {
    List<Course> courses = null;

    ListView registeredCoursesListView;
    CourseLazyAdapter registeredCoursesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_courses_list );

        registeredCoursesListView=(ListView)findViewById(R.id.course_list);


        // Click event for single list row
        registeredCoursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }

    class CoursesAsyncTask extends AsyncTask<Void, Void, Boolean> {


        @Override
        protected void onPostExecute(Boolean aBoolean) {
            registeredCoursesAdapter=new CourseLazyAdapter(CoursesListActivity.this, courses);
            registeredCoursesListView.setAdapter(registeredCoursesAdapter);

        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            courses = new CourseController().getCourseByInstituteIdAndStudentId( 1,"" );
            return true;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
    }

}
