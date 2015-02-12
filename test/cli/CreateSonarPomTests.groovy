import grails.test.AbstractCliTestCase

class CreateSonarPomTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testCreateSonarPom() {

        execute(["create-sonar-pom"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
