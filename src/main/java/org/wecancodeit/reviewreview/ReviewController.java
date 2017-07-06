package org.wecancodeit.reviewreview;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo;
	
	@RequestMapping("/allCategories")
	public String showAllCategories() {
		return "categoriesView";
	}
}
