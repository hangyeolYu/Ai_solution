package ai_solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Example {
    static int PassWord =3333 ;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        Ideal ideal = new Ideal();
        Likely likely = new Likely();
        Defect defect = new Defect();


        ArrayList<Customer> list = new ArrayList<>();
        ArrayList<Customer> idealList = new ArrayList<>();
        ArrayList<Customer> likelyList = new ArrayList<>();
        ArrayList<Customer> defectList = new ArrayList<>();
        ArrayList<Customer> naverList= new ArrayList<>();
        ArrayList<Customer> gmailList = new ArrayList<>();








            while (true) {
                mainPrint();
                int chose;
                try {
                     chose = Integer.parseInt(br.readLine());
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("오류로 인해 전으로 돌아갑니다!");
                    continue;
                }

                if (chose == 1) {// 고객 정보 설정
                    String costume;
                    try {
                        costumePrint();
                        costume = br.readLine();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("오류로 인해 전으로 돌아갑니다!");
                        continue;
                    }
                    while (true) {
                        if (costume.equals("ideal")) {
                            int setNow;
                                costumeChose();
                                try {
                                     setNow = Integer.parseInt(br.readLine());
                                }catch (Exception e){
                                    System.out.println(e.getMessage());
                                    System.out.println("오류로 인해 다시 돌아갑니다!");
                                    continue;
                                }
                                if (setNow == 6) {
                                    setNow = 0;
                                    break;
                                } else if (setNow == 1) {
                                    manyPrint();
                                    int age;
                                    try{
                                     age = Integer.parseInt(br.readLine());
                                    ideal.setAge(age);
                                    setNow = 0;
                                    continue;}
                                    catch (Exception e){
                                        System.out.println(e.getMessage());
                                        continue;
                                    }
                                } else if (setNow == 2) {
                                    manyPrint();
                                    String male;
                                    try {
                                        male = br.readLine();
                                        ideal.setMale(male);
                                        setNow = 0;
                                        continue;
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        continue;
                                    }
                                } else if (setNow == 3) {
                                    manyPrint();
                                    try {
                                        String live = br.readLine();
                                        ideal.setLive(live);
                                        setNow = 0;
                                        continue;
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        continue;
                                    }
                                } else if (setNow == 4) {
                                    manyPrint();
                                    try {
                                        int one = Integer.parseInt(br.readLine());
                                        ideal.setOne_time(one);
                                        setNow = 0;
                                        continue;
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        continue;
                                    }
                                }


                        } else if (costume.equals("likely")) {
                            int setNow;
                                costumeChose();
                                try{
                                 setNow = Integer.parseInt(br.readLine());}
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                    System.out.println("오류로 인해 다시 돌아갑니다!");
                                    continue;
                                }

                                if (setNow == 6) {
                                    setNow = 0;
                                    break;
                                } else if (setNow == 1) {
                                    manyPrint();
                                    int age = Integer.parseInt(br.readLine());
                                    likely.setAge(age);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 2) {
                                    manyPrint();
                                    String male = br.readLine();
                                    likely.setMale(male);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 3) {
                                    manyPrint();
                                    String live = br.readLine();
                                    likely.setLive(live);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 4) {
                                    manyPrint();
                                    int one = Integer.parseInt(br.readLine());
                                    likely.setOne_time(one);
                                    setNow = 0;
                                    continue;
                                }


                        } else if (costume.equals("defect")) {
                            int  setNow;
                                costumeChose();
                                try {
                                    setNow = Integer.parseInt(br.readLine());
                                }catch (Exception e){
                                    System.out.println(e.getMessage());
                                    System.out.println("오류로 인해 다시 돌아갑니다!");
                                    continue;
                                }
                                if (setNow == 6) {
                                    setNow = 0;
                                    break;
                                } else if (setNow == 1) {
                                    manyPrint();
                                    int age = Integer.parseInt(br.readLine());
                                    defect.setAge(age);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 2) {
                                    manyPrint();
                                    String male = br.readLine();
                                    defect.setMale(male);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 3) {
                                    manyPrint();
                                    String live = br.readLine();
                                    defect.setLive(live);
                                    setNow = 0;
                                    continue;
                                } else if (setNow == 4) {
                                    manyPrint();
                                    int one = Integer.parseInt(br.readLine());
                                    defect.setOne_time(one);
                                    setNow = 0;
                                    continue;
                                }

                        }
                        else if (costume.equals("end")){
                            break;
                        }
                    }
                    }


                else if (chose==2){//고객 데이터 입력
                    consumer();
                    while(true) {
                        try {
                            manyPrint();
                            String str = br.readLine();

                            if (str.equals("end")) break;

                            StringTokenizer st = new StringTokenizer(str, ",");
                            int age = Integer.parseInt(st.nextToken());
                            String male = st.nextToken();
                            String live = st.nextToken();
                            int one = Integer.parseInt(st.nextToken());
                            String mail = st.nextToken();

                            list.add(new Customer(age, male, live, one, mail));
                            age = 0;
                            male = null;
                            live = null;
                            one = 0;
                            mail = null;
                            System.out.println("입력 완료");

                            continue;
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            System.out.println("오류로 인해 다시 돌아갑니다!");
                            continue;
                        }

                    }
                }
                else if (chose==3){///데이터분류
                    while(true) {
                        int chooose;
                        try {
                            setStandard();
                             chooose = Integer.parseInt(br.readLine());
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            System.out.println("오류로 인해 다시 돌아갑니다!");
                            continue;
                        }
                        if (chooose == 1) {//////나이 정렬
                            chooose = 0;
                            for (int i = 0; i < list.size(); i++) {
                                if ((list.get(i).age >= defect.age)) {
                                    //if list.get(i).age==0 list인덱스는 버리깅
                                    defectList.add(list.get(i));
                                }
                                else if (list.get(i).age >= likely.age) {
                                    likelyList.add(list.get(i));
                                }
                                else if (list.get(i).age>=ideal.age){
                                    idealList.add(list.get(i));
                                }


                            }
                            System.out.println("나이 기준 정렬 결과");
                            System.out.println();
                            System.out.println("단골 고객 정보");
                            for (int i = 0; i < idealList.size(); i++) {
                                System.out.println(idealList.get(i));
                            }
                            System.out.println();
                            System.out.println("알반 고객 정보");
                            for (int i = 0; i < likelyList.size(); i++) {
                                System.out.println(likelyList.get(i));
                            }
                            System.out.println();
                            System.out.println("그외 고객 정보");
                            for (int i = 0; i < defectList.size(); i++) {
                                System.out.println(defectList.get(i));
                            }
                            System.out.println();

                            list.clear();
                            continue;


                        } else if (chooose == 2) {//온타임 정렬
                            chooose =0;
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).one_time >= ideal.one_time) {
                                    idealList.add(list.get(i));
                                } else if (list.get(i).one_time >= likely.one_time) {
                                    likelyList.add(list.get(i));
                                } else if (list.get(i).one_time > 0) {
                                    defectList.add(list.get(i));
                                }
                            }
                            System.out.println("온타임 기준 정렬 결과");
                            System.out.println();
                            System.out.println("단골 고객 정보");
                            for (int i = 0; i < idealList.size(); i++) {
                                System.out.println(idealList.get(i));
                            }
                            System.out.println();
                            System.out.println("알반 고객 정보");
                            for (int i = 0; i < likelyList.size(); i++) {
                                System.out.println(likelyList.get(i));
                            }
                            System.out.println();
                            System.out.println("그외 고객 정보");
                            for (int i = 0; i < defectList.size(); i++) {
                                System.out.println(defectList.get(i));
                            }
                            System.out.println();

                            list.clear();

                            continue;



                        } else if (chooose == 3) {//고객 기준 출력
                            chooose = 0;
                            System.out.println("단골 고객 기준 출력");
                            System.out.println(ideal.toString());
                            System.out.println();
                            System.out.println("일반 고객 기준 출력");
                            System.out.println(likely.toString());
                            System.out.println();
                            System.out.println("그 외 고객 기준 출력");
                            System.out.println(defect.toString());
                            System.out.println();

                            continue;
                        }
                        else if (chooose==4){//이메일 접근 비밀번호 있음!
                            int count=0;
                            int pass;
                            chooose=0;
                            while(true) {
                                try{
                                passwordPrint();
                                manyPrint();
                                 pass = Integer.parseInt(br.readLine());
                                }catch (Exception e){
                                    System.out.println(e.getMessage());
                                    System.out.println("오류로 인해 다시 돌아갑니다!");
                                    continue;
                                }

                                if(pass==5)break;
                                boolean pong = password(pass);
                                if(pong==true){//이메일 접근 허용
                                    Email();
                                        for(int i = 0;i<list.size();i++){
                                            String str = list.get(i).mail.toString();
                                            StringTokenizer st = new StringTokenizer(str,"@");
                                            String garbege = st.nextToken();
                                            String stappi = st.nextToken();
                                            if(stappi.equals("naver.com")==true){
                                                naverList.add( list.get(i));
                                            }
                                            else if (stappi.equals("gmail.com")==true){
                                                gmailList.add(list.get(i));
                                            }
                                        }
                                    System.out.println();
                                    System.out.println("naver 이메일 사용자 ");
                                        for(int i = 0;i< naverList.size();i++){
                                            System.out.println(naverList.get(i));
                                        }
                                    System.out.println();
                                    System.out.println("위 고객들에게 메일로 네이버 온라인 스토어 할인 쿠폰을 발급합니다.");
                                    System.out.println();
                                    System.out.println("gmail 이메일 사용자");
                                        for(int i = 0; i< gmailList.size();i++){
                                            System.out.println(gmailList.get(i));
                                        }
                                    System.out.println();
                                    System.out.println("위 고객들에게 유튜브 구독 이벤트 메일을 보냅니다");
                                    System.out.println();

                                    list.clear();

                                    break;



                                }
                                else if (pong==false){
                                     count++;

                                     if(count>=5){
                                         System.out.println("5회 이상 오류입니다");
                                         for(int i =10;i>=0;i--){
                                             System.out.println("잠금 해제 까지 "+i+"초");
                                             Thread.sleep(1000);
                                         }
                                         break;
                                     }


                                    System.out.printf("비밀번호 %2d 회 오류 입니다 다시 입력해주세요",count);
                                    continue;

                                }
                            }
                        }
                        else if(chooose==5){break;}
                    }
                }


                else if (chose==4) {//고객 및 저장된 데이터 확인 맟 초기화 }
                    while(true) {
                        Loom();
                        int hang;
                        try{
                        hang = Integer.parseInt(br.readLine());
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            System.out.println("오류로 인해 다시 돌아갑니다!");
                            continue;
                        }

                        if(hang==4){hang=0;break;}

                        else if (hang == 1) {
                            hang = 0;
                            manyPrint();
                            System.out.println("분류가 아직 안된 고객 리스트 ");
                            for (int i = 0; i < list.size(); i++) {
                                System.out.println(list.get(i));}
                            System.out.println();

                            System.out.println("분류된 ideal 고객 리스트");
                            for(int i = 0; i< idealList.size();i++){
                                System.out.println(idealList.get(i));}
                            System.out.println();

                            System.out.println("분류된 likely 고객 리스트");
                            for(int i = 0;i < likelyList.size();i++){
                                System.out.println(likelyList.get(i));}
                            System.out.println();

                            System.out.println("분류된 defect 고객 리스트");
                            for(int i = 0;i<defectList.size();i++){
                                System.out.println(defectList.get(i));}
                            System.out.println();

                            System.out.println("분류된 naver 사용 고객 리스트");
                            for(int i = 0;i < naverList.size();i++){
                                System.out.println(naverList.get(i));
                            }
                            System.out.println();

                            System.out.println("분류된 gamil 사용  고객 리스트");
                            for(int i = 0;i < gmailList.size();i++){
                                System.out.println(gmailList.get(i));
                            }
                            System.out.println();

                            continue;


                        } else if (hang == 2) {
                            hang = 0;
                            int last;
                            System.out.println("");
                            System.out.println("데이터 삭제 선택시 모든 데이터가 초기화 됩니다.");
                            System.out.println("원하시면 1 , 아니라면 2 을 입력해주세요!");
                            manyPrint();
                            try {


                            last = Integer.parseInt(br.readLine());
                            }catch (Exception e){
                                System.out.println(e.getMessage());
                                System.out.println("오류로 인해 다시 돌아갑니다!");
                                continue;
                            }
                            if(last == 1 ){
                                last = 0;
                                list.clear();
                                idealList.clear();
                                likelyList.clear();
                                defectList.clear();
                                naverList.clear();
                                gmailList.clear();
                                System.out.println("고객 데이터 : "+ list);
                                System.out.println("단골 고객 데이터 : "+ idealList);
                                System.out.println("일반 고객 데이터  : "+ likelyList);
                                System.out.println("그 외 고객 데이터 : "+ defectList);
                                System.out.println("네이버 메일 사용 고객 데이터 : "+ naverList);
                                System.out.println("G메일 사용 고객 데이터 : "+gmailList);

                                continue;

                            }
                            else if (last ==2){
                                break;
                            }

                        }
                        else if (hang==3){
                            hang=0;
                            System.out.println("==============================");
                            System.out.println("기준내렸던 모든 데이터를 처음으로 옮깁니다");
                            System.out.println("==============================");
                            for(int i =0;i<idealList.size();i++){
                                list.add(idealList.get(i));
                            }
                            idealList.clear();
                            for(int i =0;i <likelyList.size();i++){
                                list.add(likelyList.get(i));
                            }
                            likelyList.clear();
                            for(int i = 0;i < defectList.size();i++){
                                list.add(defectList.get(i));
                            }
                            defectList.clear();
                            for(int i = 0;i < naverList.size();i++){
                                list.add(naverList.get(i));
                            }
                            naverList.clear();
                            for(int i = 0;i < gmailList.size();i++){
                                list.add(gmailList.get(i));
                            }
                            gmailList.clear();
                            System.out.println("........완료");
                            System.out.println();
                            break;
                        }

                    }
        }
                //데이터 분류 및 출력
                else if (chose==5)break;//종료문
            }


        }



    public static void mainPrint(){
        System.out.println("====================");
        System.out.println("번호를 입력해주세요.......");
        System.out.println("1.데이터를 나눌 기준 정하기");
        System.out.println("2.고객 데이터를 입력하기...");
        System.out.println("3.현재 기준으로 데이터 분류.");
        System.out.println("4.고객 데이터 확인 및 초기화.....");
        System.out.println("5........종료.........");
        System.out.println("=====================");
    }
    public static void costumePrint(){
        System.out.println("====================");
        System.out.println("원하는 고객층을 입력해주세요");
        System.out.println("ideal,likely,defect");
        System.out.println("끝내고 싶다면 end 를 입력해줘");
        System.out.println("====================");
    }
    public static void costumeChose(){
        System.out.println("====================");
        System.out.println("설정할 정보를 선택해주세요!");
        System.out.println("1.나이.................");
        System.out.println("2.성별..only male or female");
        System.out.println("3.사는지역...only north or south");
        System.out.println("4.온라인 이용시간.........");
        System.out.println("5.이메일...............");
        System.out.println("6.입력끝..............");
        System.out.println("=====================ß");

    }
    public static void manyPrint(){
        System.out.println();
        System.out.println("=============");
        System.out.println("입력해주세요!");
        System.out.println("=============");
        System.out.println();
    }
    public static void consumer(){
        System.out.println("==================");
        System.out.println("고객 정보를 입력해주세요");
        System.out.println("고객 데이터는 계속 쌓입니다");
        System.out.println("나이,성별,지역,온라인 이용시간,이메일");
        System.out.println("이메일은 광고에 사용할수 있습니다!");
        System.out.println("====================");
        System.out.println("프로그램은 \" , \"로 구분합니다");
        System.out.println("===================");
        System.out.println("만약 입력을 끝내고 싶다면 ");
        System.out.println("\"end\""+" 를 입력해주세요!");
        System.out.println("===================");
    }
    public static void setStandard(){
        System.out.println("===================");
        System.out.println("나이 혹은 온타임 시간으로 ");
        System.out.println("데이터를 나눌수 있습니다 ");
        System.out.println("1.나이.................");
        System.out.println("2.온타임 기준...........");
        System.out.println("3.현재 기준보기..........");
        System.out.println("4. 이메일 분류 (암호 접근)");
        System.out.println("5.뒤로가기...............");
        System.out.println("입력해주세요!");
        System.out.println("===================");
    }
    public static void Loom(){
        System.out.println("================================");
        System.out.println("현재 데이터 확인및 초기화,설정 초기화 를 할수 있습니다");
        System.out.println("사라진 데이터는 복구할수 없습니다 ..!");
        System.out.println("1.현재 데이터 확인 ");
        System.out.println("2.데이터 초기화");
        System.out.println("3.설정했던 기준 초기화 ");
        System.out.println("4..뒤로가기");
        System.out.println("================================");
    }
    public static void passwordPrint(){
        System.out.println("===========================");
        System.out.println("비밀 번호를 입력해주세요");
        System.out.println("5회 이상 오류시 10초간 재입력이 안되며");
        System.out.println("그후 뒤로 갑니다");
        System.out.println("뒤로 가시려면 5번을 입력해주세요");
        System.out.println("===========================");
    }
    public static boolean password(int pass){
        if(pass==PassWord){
            return true;
        }
        else   return false;


    }
    public static void Email(){
        System.out.println("======================================");
        System.out.println("고객중 naver.com 이용자와 gmail.com이용자를 구분합니다 " );
        System.out.println("======================================");
    }

}
