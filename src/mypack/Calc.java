package mypack;

public class Calc {
    private double curRes = 0;
    private double num;

    /**
     * setting current result
     *
     * @param cur_res
     */
    public void setCur_res(double cur_res) {
        this.curRes = curRes;
    }

    /**
     * setting current number
     *
     * @param num
     */
    public void setNum(double num) {
        this.num = num;
    }

    /**
     * adding number to current result
     *
     * @param num
     * @return current result
     */
    public double add(double num) {
        curRes += num;
        return curRes;
    }

    /**
     * multiplying number to current result
     *
     * @param num
     * @return current result
     */
    public double mult(double num) {
        curRes *= num;
        return curRes;
    }

    /**
     * dividing current result by number
     *
     * @param num
     * @return current result
     */
    public double div(double num) {
        curRes /= num;
        return curRes;
    }

    public double pow2(double num) {
        curRes = Math.pow(num, 2);
        return curRes;
    }

    public double pow3(double num) {
        curRes = Math.pow(num, 3);
        return curRes;
    }

    public double sqrt(double num) {
        curRes = Math.sqrt(num);
        return curRes;
    }

    /**
     * @return current result
     */
    public double printRes() {
        return curRes;
    }


    /**
     * clearint current result and set it to 0
     */
    public void clear() {
        curRes = 0;
    }
}
