package com.mindtree.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	/*
	 * List<Topic> topicList = Arrays.asList(new Topic("1",
	 * "Spring Boot Quick start", "Spring Boot"), new Topic("2",
	 * "Core Java Basics", "Core Java"), new Topic("3", "Javascript Basics",
	 * "Javascript"));
	 */
	List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("1", "Spring Boot Quick start", "Spring Boot"),
			new Topic("2", "Core Java Basics", "Core Java"), new Topic("3", "Javascript Basics", "Javascript")));

	public List<Topic> getAllTopics() {

		return topicList;
	}

	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topicList.size(); i++) {
			Topic t = topicList.get(i);
			if (t.getId().equals(id)) {
				topicList.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
	}
}
