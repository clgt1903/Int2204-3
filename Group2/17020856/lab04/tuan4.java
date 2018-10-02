public class tuan4 {
    // Tìm giá trị lớn nhất của hai số nguyên
    public int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    // Tìm giá trị nhỏ nhất của của một mảng số nguyên
    public int minArr(int[] arr){
        int min = arr[0];
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    // Kết quả đánh giá chỉ số BMI
    public String BMI( float chieucao, float cannang){
        float bmi = cannang/(chieucao*chieucao);
        if(bmi < 18.5)
            return "Thiếu cân";
        else if (bmi >=18.8 && bmi < 23)
            return "Bình thường";
        else if (bmi >=23 && bmi <25)
            return "Thừa cân";
        else
            return "Béo phì";
    }

}
