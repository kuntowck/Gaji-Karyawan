package empsalary;

public class Gol2 implements Calculate {
    double jamKerja2;
    
    public double Salary (double jamKerja2) {
        double gajiPokok = 1926000;
        double TPengabdi = 300000;
        double jamLembur;
        double gajiLembur;
        double totalPajak;
        double gajiBersih;
        if (jamKerja2>173){
            jamLembur=jamKerja2-173;	
        }else{
            jamLembur=0;
        }
        gajiLembur = jamLembur*20000;
        double pGajiPokok = 0.05*gajiPokok;
        double pGajiLembur = 0.05*gajiLembur;
        totalPajak = pGajiPokok + pGajiLembur;
        gajiBersih = (gajiPokok+TPengabdi+gajiLembur)-totalPajak;
        return gajiBersih;
    }  
    
    public Gol2 (double inita){
        jamKerja2 = inita;
    }    

    public void cuan () {
        System.out.println("hitung gaji dengan jam kerja "+jamKerja2+" jam");
    }    

    public double getJamKerja2() {
        return jamKerja2;
    }

    public void setJamKerja2(double jamKerja2) {
        this.jamKerja2 = jamKerja2;
    }
}

