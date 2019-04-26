package java_practic.lectures.lecture_6;

class RecursionExamle{

    int factorial(int n){
        if (n == 1){
            return 1;
        }
        return factorial(n-1)*n;
    }


    public static void main(String[] args) {
RecursionExamle re = new RecursionExamle();
int f = re.factorial(3);
        System.out.println(f);
    }

    }

