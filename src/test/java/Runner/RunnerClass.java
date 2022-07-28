package Runner;

import com.intuit.karate.junit5.Karate;

public class RunnerClass {
	@Karate.Test
	public Karate runTest() {
		return Karate.run("C:\\Users\\Zam\\eclipse-workspace\\TigersReveiwSessionProject\\features\\review.feature")
				.tags("@End2End");
	}

}
