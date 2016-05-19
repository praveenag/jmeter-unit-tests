# jmeter-unit-tests
Test project to get jmeter running with unit-tests

Compile tests and test whether it runs properly with

`mvn clean dependency:copy-dependencies test`

Navigate to target/test-classes

Create a jar

`jar cfv something.jar *`

Copy it to jmeter/lib/junit. This should make it available in the Jmeter-GUI to test.



