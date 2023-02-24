# PET Project Automation Tests

## Technologies and tools

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<a href="https://slack.com/"><img src="media/logo/Slack.svg" width="40" height="50" alt="Slack" title="Slack"></a>
</p>

## Test cases

### Api tests:

- Case 1
- Case 2
- Case 3
- ...

### UI tests:

- Case 1
- Case 2
- Case 3
- ...

### Local tests run

```bash
gradle clean test //all tests in project
gradle clean api_test //Api tests
gradle clean web_test //UI tests
```

## <img title="Jenkins" src="media/logo/Jenkins.svg" width="25" height="25"> Run tests in Jenkins
To start the build, go to the section <code><strong>*Build with parameters*</strong></code>, choose <code><strong>*Task*</strong></code> you need and click <code><strong>*Build*</strong></code>.

<p align="center">
  <img src="media/screen/start_jenkins.png" alt="Jenkins" width="800">
</p>

When the build is completed, in the block <code><strong>*Build history*</strong></code> opposite the build number
the *Allure Report* icon will appear, clicking on which will open a page with the generated HTML Report and Test Documentation.

## <img title="Allure Report" src="media/logo/Allure_Report.svg" width="25" height="25"> Test results in Allure Report

<p align="center">
  <img src="media/screen/jenkins_overview.png" alt="allure-report" width="900">
</p>

<p align="center">
  <img src="media/screen/jenkins_behaviors.png" alt="allure-report_1" width="900">
</p>

## <img title="Slack" src="media/logo/Slack.svg" width="20" height="20"> Slack or <img title="Telegram" src="media/logo/Telegram.svg" width="25" height="25"> Telegram notifications 
After the build is completed, a bot, created in <code>Slack</code> or <code>Telegram</code>, automatically processes and sends a message with a test run report.

<p align="center">
<img title="Telegram Notifications" src="media/screen/notifications.png">