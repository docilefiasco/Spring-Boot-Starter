package topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    //mutable list as asList is not mutable
   private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring Framework", "1", "Spring description"),
                new Topic("Java Framework", "2", "Java description"),
        new Topic("Kotlin Framework", "3", "Kotlin description")
        ));

   public List<Topic> getAllTopics(){
       return topics;
   }
   public Topic getTopic(String id)
   {
    return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
      //study this line well
   }

   public void addTopic(Topic topic)
   {
       topics.add(topic);
   }


    public void updateTopic(String id,Topic topic) {
        for(int i=0;i<topics.size();i++)
        {
            Topic t= topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
          topics.removeIf(t->t.getId().equals(id));
    }
}


