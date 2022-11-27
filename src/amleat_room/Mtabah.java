/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amleat_room;

/**
 *
 * @author HADUS
 */
public class Mtabah {
    public int num_M;
    public String da_M;
    public String tayp_M;
    public String Jhah_M;
    public String title_M;
    public int days_M;
    public String mtaba_M;
    public String mstfed_M;
    public String ahmeh_M;
    public String ejra_M;
    public String natgfinl_M;
    public String natg_M;
    public int nsbh_M;
    public String mdah_M;

    public Mtabah(int num_M, String da_M, String tayp_M, String jhah_M, String title_M, int days_M, String mtaba_M, String mstfed_M, String ahmeh_M, String ejra_M, String natgfinl_M, String natg_M, int nsbh_M, String mdah_M) {

        this.num_M = num_M;
        this.da_M = da_M;
        this.tayp_M = tayp_M;
        Jhah_M = jhah_M;
        this.title_M = title_M;
        this.days_M = days_M;
        this.mtaba_M = mtaba_M;
        this.mstfed_M = mstfed_M;
        this.ahmeh_M = ahmeh_M;
        this.ejra_M = ejra_M;
        this.natgfinl_M = natgfinl_M;
        this.natg_M = natg_M;
        this.nsbh_M = nsbh_M;
        this.mdah_M = mdah_M;
    }
    public Mtabah(){}
    
    public int getNum_M() {
        return num_M;
    }

    public String getDa_M() {
        return da_M;
    }

    public String getTayp_M() {
        return tayp_M;
    }

    public String getJhah_M() {
        return Jhah_M;
    }

    public String getTitle_M() {
        return title_M;
    }

    public int getDays_M() {
        return days_M;
    }

    public String getMtaba_M() {
        return mtaba_M;
    }

    public String getMstfed_M() {
        return mstfed_M;
    }

    public String getAhmeh_M() {
        return ahmeh_M;
    }

    public String getEjra_M() {
        return ejra_M;
    }

    public String getNatgfinl_M() {
        return natgfinl_M;
    }

    public String getNatg_M() {
        return natg_M;
    }

    public int getNsbh_M() {
        return nsbh_M;
    }

    public String getMdah_M() {
        return mdah_M;
    }

    public void setNum_M(int num_M) {
        this.num_M = num_M;
    }

    public void setDa_M(String da_M) {
        this.da_M = da_M;
    }

    public void setTayp_M(String tayp_M) {
        this.tayp_M = tayp_M;
    }

    public void setJhah_M(String jhah_M) {
        Jhah_M = jhah_M;
    }

    public void setTitle_M(String title_M) {
        this.title_M = title_M;
    }

    public void setDays_M(int days_M) {
        this.days_M = days_M;
    }

    public void setMtaba_M(String mtaba_M) {
        this.mtaba_M = mtaba_M;
    }

    public void setMstfed_M(String mstfed_M) {
        this.mstfed_M = mstfed_M;
    }

    public void setAhmeh_M(String ahmeh_M) {
        this.ahmeh_M = ahmeh_M;
    }

    public void setEjra_M(String ejra_M) {
        this.ejra_M = ejra_M;
    }

    public void setNatgfinl_M(String natgfinl_M) {
        this.natgfinl_M = natgfinl_M;
    }

    public void setNatg_M(String natg_M) {
        this.natg_M = natg_M;
    }

    public void setNsbh_M(int nsbh_M) {
        this.nsbh_M = nsbh_M;
    }

    public void setMdah_M(String mdah_M) {
        this.mdah_M = mdah_M;
    }

    @Override
    public String toString() {
        return "Mtabah{" +
                "num_M=" + num_M +
                ", da_M='" + da_M + '\'' +
                ", tayp_M='" + tayp_M + '\'' +
                ", Jhah_M='" + Jhah_M + '\'' +
                ", title_M='" + title_M + '\'' +
                ", days_M=" + days_M +
                ", mtaba_M='" + mtaba_M + '\'' +
                ", mstfed_M='" + mstfed_M + '\'' +
                ", ahmeh_M='" + ahmeh_M + '\'' +
                ", ejra_M='" + ejra_M + '\'' +
                ", natgfinl_M='" + natgfinl_M + '\'' +
                ", natg_M='" + natg_M + '\'' +
                ", nsbh_M=" + nsbh_M +
                ", mdah_M='" + mdah_M + '\'' +
                '}';
    }
}

