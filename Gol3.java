package empsalary;

public class Gol3 implements Calculate {
    double jamKerja3;
    
    public double Salary (double jamKerja3) {
        double gajiPokok = 2456700;
        double TPengabdi = 350000;
        double jamLembur;
        double gajiLembur;
        double totalPajak;
        double gajiBersih;
        if (jamKerja3>173){
            jamLembur=jamKerja3-173;	
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
    
    public Gol3 (double initm){
        jamKerja3 = initm;
    }
    
    public void cuan () {
        System.out.println("hitung gaji dengan jam kerja "+jamKerja3+" jam");
    }

    public double getJamKerja3() {
        return jamKerja3;
    }

    public void setJamKerja3(double jamKerja3) {
        this.jamKerja3 = jamKerja3;
    }
}
