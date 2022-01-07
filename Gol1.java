package empsalary;

public class Gol1 implements Calculate {
    double jamKerja;
    
    public double Salary (double jamKerja) {
        double gajiPokok = 1486500;
        double TPengabdi = 250000;
        double jamLembur;
        double gajiLembur;
        double totalPajak;
        double gajiBersih;
        if (jamKerja>173){
            jamLembur=jamKerja-173;	
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
    
    public Gol1 (double initj){
        jamKerja = initj;
    }
    
    public void cuan () {
        System.out.println("hitung gaji dengan jam kerja "+jamKerja+" jam");
    }

    public void setJamKerja(double jamKerja) {
        this.jamKerja = jamKerja;
    }    
    
    public double getJamKerja() {
        return jamKerja;
    }

}
