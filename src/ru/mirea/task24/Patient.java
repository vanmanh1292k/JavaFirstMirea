package ru.mirea.task24;
public class Patient
{
    private int MaBN,Ngay,Thang,Nam,SLBN=0;
    private String Hoten,CoSo,Khoa,Lop;
    public Patient[] ListSV;
    public Patient()
    {

    }
    //Getter va Setter Ma Benh Nhan
    public int getMaBN()
    {
        return MaBN;
    }
    public void setMaBN(int ID)
    {
        this.MaBN=ID;
    }
    //Getter va Setter Ho Ten
    public String getHoten()
    {
        return this.Hoten;
    }
    public void setHoten(String name)
    {
        this.Hoten=name;
    }
    //Getter va Setter Ngay Sinh
    public int getNgay()
    {
        return Ngay;
    }
    public void setNgay(int date)
    {
        this.Ngay=date;
    }
    //Getter va Setter Thang
    public int getThang()
    {
        return Thang;
    }
    public void setThang(int month)
    {
        this.Thang=month;
    }
    //Getter va Setter Nam
    public int getNam()
    {
        return Nam;
    }
    public void setNam(int year)
    {
        this.Nam=year;
    }
    //Getter va Setter He Dao Tao
    public String getCoSo()
    {
        return CoSo;
    }
    public void setCoSo(String HDT)
    {
        this.CoSo=HDT;
    }
    //Getter va Setter Khoa
    public String getKhoa()
    {
        return Khoa;
    }
    public void setKhoa(String skhoa)
    {
        this.Khoa=skhoa;
    }
    //Getter va Setter Lop
    public String getLop()
    {
        return Lop;
    }
    public void setLop(String sLop)
    {
        this.Lop=sLop;
    }
    //Getter va Setter So Luong Sinh Vien
    public int  getSLBN()
    {
        return SLBN;
    }
    public void setSLBN(int ssl)
    {
        this.SLBN=ssl;
    }
}
