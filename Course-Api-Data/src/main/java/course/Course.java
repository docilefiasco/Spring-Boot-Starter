package course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.context.annotation.Lazy;
import topic.Topic;

@Entity
public class Course {
    private String name;
    @Id
    private String id;
    private String description;
    @ManyToOne
    @Lazy
    private Topic topic;


    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }





    public Course() {
    }

    public Course(String name, String id, String description, String topicId) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.topic = new Topic("",topicId,"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
