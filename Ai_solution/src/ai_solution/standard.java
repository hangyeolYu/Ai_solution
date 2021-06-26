package ai_solution;

public class standard {
    int age;
    String male;
    String live;
    int one_time;

    public standard () {}

    public standard (int age, String male, String live, int one_time){
        this.age = age;
        this.male = male;
        this.live = live;
        this.one_time = one_time;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public int getOne_time() {
        return one_time;
    }

    public void setOne_time(int one_time) {
        this.one_time = one_time;
    }

    @Override
    public String toString () {
        return String.format("나이는 %3d,성별은 %7s,사는 지역은 %5s,방문 시간은 %2d ,",this.age,this.male,this.live,this.one_time);
    }


}
