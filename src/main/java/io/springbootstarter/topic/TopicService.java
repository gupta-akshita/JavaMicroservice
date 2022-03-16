package io.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic>  topics = new ArrayList<>(Arrays.asList(
                new Topic("Sping", "springFramework", "Application"),
                new Topic("JAVA", "spring", "NotNULL"),
                new Topic("javascript", "react", "golang")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
       return topics.stream().filter(t -> t.getLang().equals(id)).findFirst().get();
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getLang().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void deleteTopic(String id, Topic topic) {
        topics.removeIf(t -> t.getLang().equals(id));
    }
}
