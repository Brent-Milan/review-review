package org.wecancodeit.reviewreview;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReviewJpaTest {

		@Resource
		private ReviewRepository reviewRepo;
		// could have also done:
		// private CrudRepository<Review, Long> reviewRepo
		
		/**
		 * There is no assertion here. This will simply fail if things aren't 
		 * correctly configured
		 */
	
		@Test
		public void shouldReadReview() {
			reviewRepo.findAll();
		}
	
}
