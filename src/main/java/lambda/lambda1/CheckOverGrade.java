package lambda.lambda1;

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}
