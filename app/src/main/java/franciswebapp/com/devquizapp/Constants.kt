package franciswebapp.com.devquizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val  questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to ?",
             R.drawable.ic_flag_of_argentina, "Argentina","Austrilia","Armenia", "Austria",1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2,"Which country does this flag belongs to ?",
             R.drawable.ic_flag_of_germany,"Koeria","Japan","Germany","Belgium",3
        )
        questionList.add(que2)

        return questionList
    }
}