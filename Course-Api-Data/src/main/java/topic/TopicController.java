package topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService TopicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return TopicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return TopicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        TopicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        TopicService.updateTopic(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
         TopicService.deleteTopic(id);
    }

}

