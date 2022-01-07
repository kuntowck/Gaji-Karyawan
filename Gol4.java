package empsalary;

public class Gol4 implements Calculate {
    double jamKerja4;
    
    public double Salary (double jamKerja4) {
        double gajiPokok = 2899500;
        double TPengabdi = 400000;
        double jamLembur;
        double gajiLembur;
        double totalPajak;
        double gajiBersih;
        if (jamKerja4>173){
            jamLembur=jamKerja4-173;	
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
    
    public Gol4 (double initk){
        jamKerja4 = initk;
    }

    public void cuan () {
        System.out.println("hitung gaji dengan jam kerja "+jamKerja4+" jam");
    }

    public double getJamKerja4() {
        return jamKerja4;
    }

    public void setJamKerja4(double jamKerja4) {
        this.jamKerja4 = jamKerja4;
    }
}
