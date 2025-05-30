# Mobile Software Development II

#### Description of the project report - Country Quizzing App

- Home page - have a few items from a featured Category shown and welcome banner.
- The possibility to enter UserName.
- User Starting the Quiz.
- Quiz histroy.

### Class Diagram
![image](https://github.com/user-attachments/assets/41784cbc-d301-431b-bf1e-4f3588fb0203)

### Setup
- Create the Kotlin Project called Country Quizzing App.
- Create an Activity Classes.
- Create MainActivity.
- Create QuizQuestionsActivity.
- Create Question Class.
- Create Constants Object.
- Create ResultActivity.
- Create Unit testing for the Activity Classes.
- Create Integration testing and run the Integration testing with the MainActivity.
- Build and run the Project.

### Technologies Used
- AndroidStudio LadyBurg 2024 ReleaseAndroid Studio Ladybug Feature Drop | 2024.2.2 Patch 2.
- Build #AI-242.23726.103.2422.13103373, built on February 21, 2025.
- Runtime version: 21.0.5+-13047016-b750.29 amd64
- VM: OpenJDK 64-Bit Server VM by JetBrains.
- Virtual Device Manager.
- Kotlin / Java .

### MainActivity Route
- *MainActivity* : (https://github.com/IUCampus/mobile-software-engineering-02/blob/main/app/src/main/java/franciswebapp/com/devquizapp/MainActivity.kt)
---
### **Creating a New MainActivity**
  
**Method:** `POST`  

**Body:**

```json
@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

``` 
### QuizQuestionsActivity Route
- *QuizQuestionsActivity* : (https://github.com/IUCampus/mobile-software-engineering-02/blob/main/app/src/main/java/franciswebapp/com/devquizapp/QuizQuestionActivity.kt)

### **Creating a new QuizQuestionActivity**
 
**Method:** `GET`  

### Question Route
- *Question.kt* : (https://github.com/IUCampus/mobile-software-engineering-02/blob/main/app/src/main/java/franciswebapp/com/devquizapp/Question.kt)
---
### **Creating a Question**
  
**Method:** `POST`  

### ResultActivity Route
- *ResultActivity* : (https://github.com/IUCampus/mobile-software-engineering-02/blob/main/app/src/main/java/franciswebapp/com/devquizapp/ResultActivity.kt) 
---
### **Creating a New ResultActivity**
 
**Method:** `POST`  

---

### Extra links 

[Confluence](https://iu-study-team-zao8md48.atlassian.net/wiki/spaces/CQA/overview)

[Jira Kanban](https://iu-study-team-uzhrq77c.atlassian.net/jira/software/projects/CQA/boards/35)

[Final Project Git Hub Account](https://github.com/IUCampus/mobile-software-engineering-02)

### Future Work
- Expand to more subject areas.
- Implement AI-Driven adaptive quizzes.
- Add Multiplayer quiz mode.


