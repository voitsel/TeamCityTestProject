import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@Test
	public void successResultTest() {
		Assert.assertTrue(App.getSuccessResult());
	}

	@Test
	@Ignore
	public void ignoredTest() {
		Assert.assertTrue(App.getSuccessResult());
	}

}
