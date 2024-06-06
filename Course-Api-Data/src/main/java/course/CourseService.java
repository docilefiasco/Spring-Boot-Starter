package course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    //mutable list as asList is not mutable
//   private List<Course> courses = new ArrayList<>(Arrays.asList(
//            new Course("Spring Framework", "1", "Spring description"),
//                new Course("Java Framework", "2", "Java description"),
//        new Course("Kotlin Framework", "3", "Kotlin description")
//        ));

   public List<Course> getAllCourses(String topicId){
       return new ArrayList<>(courseRepository.findByTopicId(topicId));
        //suggested syntax by intelliJ
   }
   public Optional<Course> getCourse(String id)
   {
      return courseRepository.findById(id);
    //return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
      //study this line well
   }

   public void addCourse(Course course)
   {
       courseRepository.save(course);
   }


    public void updateCourse(Course course) {
//        for(int i=0;i<topics.size();i++)
//        {
//            Topic t= topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.set(i,topic);
//                return;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

       courseRepository.deleteById(id);
    }

}


