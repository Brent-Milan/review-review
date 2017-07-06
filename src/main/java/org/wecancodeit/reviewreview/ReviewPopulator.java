package org.wecancodeit.reviewreview;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {
	
	@Resource
	private ReviewRepository reviewRepo;
	
	@Override
	public void run(String... args) throws Exception {
		reviewRepo.save(new Review("Granny Smith tastes like teen spirit"));
		reviewRepo.save(new Review("Red Delicious and whatnot"));
	}
}
