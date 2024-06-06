package topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    //mutable list as asList is not mutable
//   private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("Spring Framework", "1", "Spring description"),
//                new Topic("Java Framework", "2", "Java description"),
//        new Topic("Kotlin Framework", "3", "Kotlin description")
//        ));

   public List<Topic> getAllTopics(){
       List<Topic> topics = new ArrayList<>();
       topicRepository.findAll().forEach(topics::add);
       return topics;
   }
   public Optional<Topic> getTopic(String id)
   {
      return topicRepository.findById(id);
    //return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
      //study this line well
   }

   public void addTopic(Topic topic)
   {
       topicRepository.save(topic);
   }


    public void updateTopic(String id,Topic topic) {
//        for(int i=0;i<topics.size();i++)
//        {
//            Topic t= topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.set(i,topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

       topicRepository.deleteById(id);
    }
}


