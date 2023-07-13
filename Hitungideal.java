package uts;

public class Hitungideal {
    private double tb,bb,tot;
    private String info;
    
    public double getTot() {
        return tot=this.bb/(this.tb*this.bb);
    }

    public String getInfo() {
        return info;
    }

    public void setTb(double tb) {
        this.tb = tb/100;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }
    
    void hasilinfo(){
        if(getTot() < 18.5){
            this.info = " Aduh ente KURUS bree";
           
        }else if (getTot() < 24.9){
            this.info = " Selamat Bree Ente IDEAL";
        }else if (getTot() < 29.9){
            this.info = " hati2 OJANN ente GEMUK ";
        }else if (getTot()>30.0){
            this.info = " Waduh ente KEGEMUKAN bree";
        }
    }
}
