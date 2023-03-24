package points_two;

public class learn_condition_if_elseif {
    private float score;

    public static void main(String[] args) {

        learn_condition_if_elseif obj;
        obj = new learn_condition_if_elseif();
        System.out.println(obj.conditionScore()); // result score is 0

        obj = new learn_condition_if_elseif(10.95f); // set score 10
        System.out.println(obj.conditionScore());

        obj.setScore(1000f);
        System.out.println(obj.conditionScore());

        // same class private can into
        System.out.println(new learn_condition_if_elseif(99.99f).conditionScore());
    }

    learn_condition_if_elseif() {
        this.score = 0;
    }

    learn_condition_if_elseif(float score) {
        this.score = score;
    }

    public void setScore(float score) { // accessor == set
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public String conditionScore () {
        // using if else-if
        // สุดแท้แล้ว
        // if then , else if
        // check all case
        if (score <= 100 && score >= 80) {
            return "score "+score+" A";
        }
        else if (score >= 70 && score < 80) {
            return "score "+score+" B";
        }
        else if (score >= 60 && score < 70) {
            return "score "+score+" C+";
        }
        else if (score >= 50 && score < 60) {
            return "score "+score+" D";
        }
        else if (score < 50 && score >=0 ) {
            return "score "+score+" F";
        }
        else {
            return "your score is wrong";
        }

    }
}
