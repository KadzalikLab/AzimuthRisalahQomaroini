package com.Kadzalik;

public class PerhitunganAsli {

    public static void main(String[] args) {
        //data - data yang dibutuhkan
        double buruj_miqwam=9;
        double derajat_miqwam=22;
        double menit_miqwam=58;
        double detik_miqwam=5;
        double miqwam= pengkonversi_satuan_buruj2(buruj_miqwam,derajat_miqwam,menit_miqwam,detik_miqwam);
        double miqwam_r=Math.toRadians(miqwam);
        double jah_irtifak=3;
        double qoh_irtifak=2;
        double ni_irtifak=6;
        double irtifak=derajat_ke_desimal(jah_irtifak,qoh_irtifak,ni_irtifak);
        double buruj_hissoh=7;
        double derajat_hissoh=7;
        double menit_hissoh=22;
        double detik_hissoh=32;
        double hissoh= pengkonversi_satuan_buruj2(buruj_hissoh,derajat_hissoh,menit_hissoh,detik_hissoh);
        double hissoh_r=Math.toRadians(hissoh);
        double ardulbalad= -7.783333333;
        double ardulbalad_r=Math.toRadians(ardulbalad);

        //==================Mualai hisab
        double thulqomar=miqwam+irtifak;
        double thulqomar_r=Math.toRadians(thulqomar);

        double mailkulli=23.44444444;
        double mailkulli_r=Math.toRadians(mailkulli);

        double mel_syamsi=Math.toDegrees(Math.asin(Math.sin(miqwam_r)*Math.sin(mailkulli_r)));
        double mel_syamsi_r=Math.toRadians(mel_syamsi);
        double nisfu_qous_nahar=Math.toDegrees(Math.acos(Math.tan(mel_syamsi_r)*Math.tan(ardulbalad_r)));
        double takdil_matholi=Math.toDegrees(Math.asin(Math.cos(miqwam_r)/Math.cos(mel_syamsi_r)));
        double matholi_falakiyah=0;
        if (miqwam>=0 && miqwam<=180)matholi_falakiyah=180-takdil_matholi;
        else if (miqwam>=180 && miqwam<=270)matholi_falakiyah=360+takdil_matholi;
        else if (miqwam>=270 && miqwam<=360)matholi_falakiyah=takdil_matholi;

        double matholi_ghurub_syamsi=nisfu_qous_nahar+matholi_falakiyah;
        double siah_maghrib=Math.toDegrees(Math.asin(Math.sin(mel_syamsi_r)/Math.cos(ardulbalad_r)));
        double rumus_dq=0.808333333;
        double rumus_dq_r=Math.toRadians(rumus_dq);

        double daqoiq_tamkin=Math.toDegrees(Math.asin(Math.sin(rumus_dq_r)/Math.cos(ardulbalad_r)/Math.cos(mel_syamsi_r)));
        double ardulqomar=Math.toDegrees(Math.asin(Math.sin(hissoh_r)*Math.sin(Math.toRadians(5))));
        double ardulqomar_r=Math.toRadians(ardulqomar);
        double mel_tsani=Math.toDegrees(Math.atan(Math.sin(thulqomar_r)*Math.tan(mailkulli_r)));
        double ardul_muaddal=mel_tsani+ardulqomar;
        double bukdu_qomar=Math.toDegrees(Math.asin(Math.sin(Math.toRadians(ardul_muaddal))*Math.cos(mailkulli_r)/Math.cos(Math.toRadians(mel_tsani))));
        double bukdu_qomar_r=Math.toRadians(bukdu_qomar);
        double nisfu_qous_nahar_qomar=Math.toDegrees(Math.acos(Math.tan(ardulbalad_r)*Math.tan(bukdu_qomar_r)));
        double takdil_matholi_qomar=Math.toDegrees(Math.asin(Math.cos(thulqomar_r)*Math.cos(ardulqomar_r)/Math.cos(bukdu_qomar_r)));

        double matholi_falakiyah_qomar=0;
        if (miqwam>=0 && miqwam<=180)matholi_falakiyah_qomar=180-takdil_matholi_qomar;
        else if (miqwam>=180 && miqwam<=270)matholi_falakiyah_qomar=360+takdil_matholi_qomar;
        else if (miqwam>=270 && miqwam<=360)matholi_falakiyah_qomar=takdil_matholi_qomar;

        double matholi_ghurub_qomar=nisfu_qous_nahar_qomar+matholi_falakiyah_qomar;
        double qousil_muksi=matholi_ghurub_qomar-matholi_ghurub_syamsi;
        double qousil_muksi_mari=qousil_muksi-daqoiq_tamkin;
        double muksu_hilal=qousil_muksi_mari/15;
        double fadlu_dair=nisfu_qous_nahar_qomar-qousil_muksi_mari;
        double fadlu_dair_r=Math.toRadians(fadlu_dair);
        double irtifak_hilal=Math.toDegrees(Math.asin((Math.sin(ardulbalad_r)*Math.sin(bukdu_qomar_r))+(Math.cos(ardulbalad_r)*Math.cos(bukdu_qomar_r)*Math.cos(fadlu_dair_r))));
        double samtul_irtifak=Math.toDegrees(Math.atan((Math.tan(bukdu_qomar_r)*Math.cos(ardulbalad_r)/Math.sin(fadlu_dair_r))-(Math.sin(ardulbalad_r)*Math.tan(Math.toRadians(90-fadlu_dair)))));
        double bukdu_bain_samat_wasiah=samtul_irtifak-siah_maghrib;
        double qous_nurul_hilal=(irtifak/15)+(ardulqomar/60);


        //=====================================menampilkan hasil============================
        System.out.println("Miqwam                = "+ pengkonversi_satuan_buruj(miqwam)[1]+"|"+ pengkonversi_satuan_buruj(miqwam)[2]+"\u00B0"+ pengkonversi_satuan_buruj(miqwam)[3]+"\u2032"+ pengkonversi_satuan_buruj(miqwam)[4]+"\u2033");
        System.out.println("irtifak               = "+desimal_ke_derajat(irtifak)[1]+"\u00B0"+desimal_ke_derajat(irtifak)[2]+"\u2032"+desimal_ke_derajat(irtifak)[3]+"\u2033");
        System.out.println("Hissoh                = "+ pengkonversi_satuan_buruj(hissoh)[1]+"|"+ pengkonversi_satuan_buruj(hissoh)[3]+"\u00B0"+ pengkonversi_satuan_buruj(hissoh)[3]+"\u2032"+ pengkonversi_satuan_buruj(hissoh)[4]+"\u2033");
        System.out.println("thulqomar             = "+desimal_ke_derajat(thulqomar)[1]+"\u00B0"+desimal_ke_derajat(thulqomar)[2]+"\u2032"+desimal_ke_derajat(thulqomar)[3]+"\u2033");

        System.out.print(System.lineSeparator());
        System.out.println("mel_syamsi            = "+desimal_ke_derajat(mel_syamsi)[1]+"\u00B0"+desimal_ke_derajat(mel_syamsi)[2]+"\u2032"+desimal_ke_derajat(mel_syamsi)[3]+"\u2033");
        System.out.println("nisfu_qous_nahar      = "+desimal_ke_derajat(nisfu_qous_nahar)[1]+"\u00B0"+desimal_ke_derajat(nisfu_qous_nahar)[2]+"\u2032"+desimal_ke_derajat(nisfu_qous_nahar)[3]+"\u2033");
        System.out.println("takdil_matholi        = "+desimal_ke_derajat(takdil_matholi)[1]+"\u00B0"+desimal_ke_derajat(takdil_matholi)[2]+"\u2032"+desimal_ke_derajat(takdil_matholi)[3]+"\u2033");
        System.out.println("matholi_falakiyah     = "+desimal_ke_derajat(matholi_falakiyah)[1]+"\u00B0"+desimal_ke_derajat(matholi_falakiyah)[2]+"\u2032"+desimal_ke_derajat(matholi_falakiyah)[3]+"\u2033");
        System.out.println("matholi_ghurub_syamsi = "+desimal_ke_derajat(matholi_ghurub_syamsi)[1]+"\u00B0"+desimal_ke_derajat(matholi_ghurub_syamsi)[2]+"\u2032"+desimal_ke_derajat(matholi_ghurub_syamsi)[3]+"\u2033");
        System.out.println("siah_maghrib          = "+desimal_ke_derajat(siah_maghrib)[1]+"\u00B0"+desimal_ke_derajat(siah_maghrib)[2]+"\u2032"+desimal_ke_derajat(siah_maghrib)[3]+"\u2033");
        System.out.println("daqoiq_tamkin         = "+desimal_ke_derajat(daqoiq_tamkin)[1]+"\u00B0"+desimal_ke_derajat(daqoiq_tamkin)[2]+"\u2032"+desimal_ke_derajat(daqoiq_tamkin)[3]+"\u2033");
        System.out.println("ardulqomar            = "+desimal_ke_derajat(ardulqomar)[1]+"\u00B0"+desimal_ke_derajat(ardulqomar)[2]+"\u2032"+desimal_ke_derajat(ardulqomar)[3]+"\u2033");
        System.out.println("mel_tsani             = "+desimal_ke_derajat(mel_tsani)[1]+"\u00B0"+desimal_ke_derajat(mel_tsani)[2]+"\u2032"+desimal_ke_derajat(mel_tsani)[3]+"\u2033");
        System.out.println("ardul_muaddal         = "+desimal_ke_derajat(ardul_muaddal)[1]+"\u00B0"+desimal_ke_derajat(ardul_muaddal)[2]+"\u2032"+desimal_ke_derajat(ardul_muaddal)[3]+"\u2033");

        System.out.println("bukdu_qomar           = "+desimal_ke_derajat(bukdu_qomar)[1]+"\u00B0"+desimal_ke_derajat(bukdu_qomar)[2]+"\u2032"+desimal_ke_derajat(bukdu_qomar)[3]+"\u2033");
        System.out.println("nisfu_qous_nahar_qomar= "+desimal_ke_derajat(nisfu_qous_nahar_qomar)[1]+"\u00B0"+desimal_ke_derajat(nisfu_qous_nahar_qomar)[2]+"\u2032"+desimal_ke_derajat(nisfu_qous_nahar_qomar)[3]+"\u2033");
        System.out.println("takdil_matholi_qomar  = "+desimal_ke_derajat(takdil_matholi_qomar)[1]+"\u00B0"+desimal_ke_derajat(takdil_matholi_qomar)[2]+"\u2032"+desimal_ke_derajat(takdil_matholi_qomar)[3]+"\u2033");
        System.out.println("matholifalakiyah_qomar= "+desimal_ke_derajat(matholi_falakiyah_qomar)[1]+"\u00B0"+desimal_ke_derajat(matholi_falakiyah_qomar)[2]+"\u2032"+desimal_ke_derajat(matholi_falakiyah_qomar)[3]+"\u2033");
        System.out.println("matholi_ghurub_qomar  = "+desimal_ke_derajat(matholi_ghurub_qomar)[1]+"\u00B0"+desimal_ke_derajat(matholi_ghurub_qomar)[2]+"\u2032"+desimal_ke_derajat(matholi_ghurub_qomar)[3]+"\u2033");
        System.out.println("qousil_muksi          = "+desimal_ke_derajat(qousil_muksi)[1]+"\u00B0"+desimal_ke_derajat(qousil_muksi)[2]+"\u2032"+desimal_ke_derajat(qousil_muksi)[3]+"\u2033");
        System.out.println("qousil_muksi_mari     = "+desimal_ke_derajat(qousil_muksi_mari)[1]+"\u00B0"+desimal_ke_derajat(qousil_muksi_mari)[2]+"\u2032"+desimal_ke_derajat(qousil_muksi_mari)[3]+"\u2033");
        System.out.println("muksu_hilal           = "+desimal_ke_derajat(muksu_hilal)[1]+"\u00B0"+desimal_ke_derajat(muksu_hilal)[2]+"\u2032"+desimal_ke_derajat(muksu_hilal)[3]+"\u2033");
        System.out.println("fadlu_dair            = "+desimal_ke_derajat(fadlu_dair)[1]+"\u00B0"+desimal_ke_derajat(fadlu_dair)[2]+"\u2032"+desimal_ke_derajat(fadlu_dair)[3]+"\u2033");
        System.out.println("irtifak_hilal         = "+desimal_ke_derajat(irtifak_hilal)[1]+"\u00B0"+desimal_ke_derajat(irtifak_hilal)[2]+"\u2032"+desimal_ke_derajat(irtifak_hilal)[3]+"\u2033");
        System.out.println("samtul_irtifak        = "+desimal_ke_derajat(samtul_irtifak)[1]+"\u00B0"+desimal_ke_derajat(samtul_irtifak)[2]+"\u2032"+desimal_ke_derajat(samtul_irtifak)[3]+"\u2033");
        System.out.println("bukdu_bain_samat      = "+desimal_ke_derajat(bukdu_bain_samat_wasiah)[1]+"\u00B0"+desimal_ke_derajat(bukdu_bain_samat_wasiah)[2]+"\u2032"+desimal_ke_derajat(bukdu_bain_samat_wasiah)[3]+"\u2033");
        System.out.println("qous_nurul_hilal      = "+desimal_ke_derajat(qous_nurul_hilal)[1]+"\u00B0"+desimal_ke_derajat(qous_nurul_hilal)[2]+"\u2032"+desimal_ke_derajat(qous_nurul_hilal)[3]+"\u2033");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println("Azimuth Matahari      = "+desimal_ke_derajat(siah_maghrib)[1]+"\u00B0"+desimal_ke_derajat(siah_maghrib)[2]+"\u2032"+desimal_ke_derajat(siah_maghrib)[3]+"\u2033");
        System.out.println("Azimuth Bulan         = "+desimal_ke_derajat(samtul_irtifak)[1]+"\u00B0"+desimal_ke_derajat(samtul_irtifak)[2]+"\u2032"+desimal_ke_derajat(samtul_irtifak)[3]+"\u2033");






    }


    public  static  double pengkonversi_satuan_buruj2(double buruj, double jah , double qoh, double ni ){
        buruj=(buruj*30);
        qoh=(qoh/60);
        ni=(ni/3600);

        return buruj+jah+qoh+ni;

    }

    public  static  int[] pengkonversi_satuan_buruj(double selain_alamah){
        int buruj=(int)(selain_alamah/30)%12;
        int derajat= (int) (selain_alamah%30);
        double qoh=(selain_alamah%1)*60;
        double ni=Math.round((qoh%1)*60);
        return new int[]{0,buruj,derajat,(int)qoh,(int)ni};

    }


    public  static double derajat_ke_desimal(double jah, double qoh, double ni){
        return jah+(qoh/60)+(ni/3600);
    }


    public  static int []desimal_ke_derajat(double desimal){
        int jah=(int)desimal;
        double qoh=(Math.abs(desimal)%1)*60;
        double ni=Math.round((qoh%1)*60);
        return new int[]{0,jah,(int)qoh,(int)ni};
    }
    
    
    
}
