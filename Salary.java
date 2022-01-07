package empsalary;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Salary {
    
    public double calculateSalary(Calculate gaji) {
        double Salary = 0;
        double jamLembur;
        double gajiLembur;
        double totalPajak;
        
        if(gaji instanceof Gol1){
            Gol1 gol1 = (Gol1) gaji;
            double gajiPokok = 1486500;
            double TPengabdi = 250000;
            if (gol1.getJamKerja()>173){
                jamLembur=gol1.getJamKerja()-173;	
            }else{
                jamLembur=0;
            }
            gajiLembur = jamLembur*20000;
            double pGajiPokok = 0.05*gajiPokok;
            double pGajiLembur = 0.05*gajiLembur;
            totalPajak = pGajiPokok + pGajiLembur;
            System.out.println("Gaji Pokok Golongan 1: Rp"+gajiPokok);
            System.out.println("Gaji Lembur Golongan 1: Rp"+gajiLembur);
            System.out.println("Pajak Gaji Pokok Golongan 1: Rp"+pGajiPokok);
            System.out.println("Pajak Gaji Lembur Golongan 1: Rp"+pGajiLembur);
            System.out.println("Total Pajak Golongan 1: Rp"+totalPajak);            
            Salary = (gajiPokok+TPengabdi+gajiLembur)-totalPajak;
            
        }else if(gaji instanceof Gol2){
            Gol2 gol2 = (Gol2) gaji;
            double gajiPokok = 1926000;
            double TPengabdi = 300000;
            if (gol2.getJamKerja2()>173){
                jamLembur=gol2.getJamKerja2()-173;	
            }else{
                jamLembur=0;
            }
            gajiLembur = jamLembur*20000;
            double pGajiPokok = 0.05*gajiPokok;
            double pGajiLembur = 0.05*gajiLembur;
            totalPajak = pGajiPokok + pGajiLembur;
            System.out.println("Gaji Pokok Golongan 2: Rp"+gajiPokok);
            System.out.println("Gaji Lembur Golongan 2: Rp"+gajiLembur);
            System.out.println("Pajak Gaji Pokok Golongan 2: Rp"+pGajiPokok);
            System.out.println("Pajak Gaji Lembur Golongan 2: Rp"+pGajiLembur);
            System.out.println("Total Pajak Golongan 2: Rp"+totalPajak);
            Salary = (gajiPokok+TPengabdi+gajiLembur)-totalPajak;
            
        }else if(gaji instanceof Gol3){
            Gol3 gol3 = (Gol3) gaji;
            double gajiPokok = 2456700;
            double TPengabdi = 350000;
            if (gol3.getJamKerja3()>173){
                jamLembur=gol3.getJamKerja3()-173;	
            }else{
                jamLembur=0;
            }
            gajiLembur = jamLembur*20000;
            double pGajiPokok = 0.05*gajiPokok;
            double pGajiLembur = 0.05*gajiLembur;
            totalPajak = pGajiPokok + pGajiLembur;
            System.out.println("Gaji Pokok Golongan 3: Rp"+gajiPokok);
            System.out.println("Gaji Lembur Golongan 3: Rp"+gajiLembur);
            System.out.println("Pajak Gaji Pokok Golongan 3: Rp"+pGajiPokok);
            System.out.println("Pajak Gaji Lembur Golongan 3: Rp"+pGajiLembur);
            System.out.println("Total Pajak Golongan 3: Rp"+totalPajak);
            Salary = (gajiPokok+TPengabdi+gajiLembur)-totalPajak;
            
        }else if(gaji instanceof Gol4){
            Gol4 gol4 = (Gol4) gaji;
            double gajiPokok = 2899500;
            double TPengabdi = 400000;
            if (gol4.getJamKerja4()>173){
                jamLembur=gol4.getJamKerja4()-173;	
            }else{
                jamLembur=0;
            }
            gajiLembur = jamLembur*20000;
            double pGajiPokok = 0.05*gajiPokok;
            double pGajiLembur = 0.05*gajiLembur;
            totalPajak = pGajiPokok + pGajiLembur;
            System.out.println("Gaji Pokok Golongan 4: Rp"+gajiPokok);
            System.out.println("Gaji Lembur Golongan 4: Rp"+gajiLembur);
            System.out.println("Pajak Gaji Pokok Golongan 4: Rp"+pGajiPokok);
            System.out.println("Pajak Gaji Lembur Golongan 4: Rp"+pGajiLembur);
            System.out.println("Total Pajak Golongan 4: Rp"+totalPajak);
            Salary = (gajiPokok+TPengabdi+gajiLembur)-totalPajak;
        }
        return Salary;
    }
    
    public static void main(String[] args) {
        Gol1 gol1 = new Gol1(180);
        Gol2 gol2 = new Gol2(180);
        Gol3 gol3 = new Gol3(180);
        Gol4 gol4 = new Gol4(180);
        
//        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
//        
//        formatRp.setCurrencySymbol("Rp. ");
//        formatRp.setMonetaryDecimalSeparator(',');
//        formatRp.setGroupingSeparator('.');
//        kursIndonesia.setDecimalFormatSymbols(formatRp);
//        
//        System.out.println("Gaji Diterima        : "+kursIndonesia.format(gol1));

        Salary salaryObj = new Salary();
        System.out.println("Gaji Bersih Golongan 1: Rp"+salaryObj.calculateSalary(gol1));
        System.out.println("-------------------------------------------------");
        System.out.println("Gaji Bersih Golongan 2: Rp"+salaryObj.calculateSalary(gol2));
        System.out.println("-------------------------------------------------");
        System.out.println("Gaji Bersih Golongan 3: Rp"+salaryObj.calculateSalary(gol3));
        System.out.println("-------------------------------------------------");
        System.out.println("Gaji Bersih Golongan 4: Rp"+salaryObj.calculateSalary(gol4));
    }
    
}
