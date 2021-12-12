package ru.mirea.task24;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUIPatient extends JFrame implements ActionListener
{
    protected JButton bntThem,bntTimkiem,bntLuu,bntSua,bntDel;
    protected JLabel lbmabn,lbhoten,lbngaysinh,lbkhoa,lblop,lbCoSo,lbtext;
    protected  JTextField tfmabn,tfhoten,tflop,tfngaysinh,tfCoSo,tfKhoa;
    protected JComboBox cbngay,cbthang,cbnam,cbkhoa,cbCoSo,cbmabn;
    Patient SV=new Patient();
    Patient[] ListSV=new Patient[100];
    //Tao Giao Dien
    public GUIPatient()
    {
        super("Patient Management System");
        setSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        Header();
        //Gui();
    }
    //Tao Tieu De Frame
    void Header()
    {
        JLabel lbtitle=new JLabel("Patient Management");
        lbtitle.setFont(new Font ("Time New Roman",Font.BOLD,18));
        lbtitle.setBounds(110,10,180,25);
        lbtitle.setForeground(Color.red);
        this.add(lbtitle);
    }
    //Tao Giao Dien Benh Nhan
    JPanel pnDetail;
    void Gui()
    {
        pnDetail=new JPanel();
        pnDetail.setBorder(BorderFactory.createLineBorder(Color.red,2));
        lbmabn=new JLabel("ID :");
        lbmabn.setBounds(20,70,100,25);
        pnDetail.add(lbmabn);
        getContentPane().add(lbmabn);

        tfmabn=new JTextField();
        tfmabn.setBounds(120,70,100,25);
        pnDetail.add(tfmabn);
        getContentPane().add(tfmabn);

        lbhoten=new JLabel("Name Patient:");
        lbhoten.setBounds(20,100,100,25);
        pnDetail.add(lbhoten);
        getContentPane().add(lbhoten);

        tfhoten=new JTextField();
        tfhoten.setBounds(120,100,200,25);
        pnDetail.add(tfhoten);
        getContentPane().add(tfhoten);

        lbngaysinh=new JLabel("Birthday :");
        lbngaysinh.setBounds(20,130,100,25);
        pnDetail.add(lbngaysinh);
        getContentPane().add(lbngaysinh);

        cbngay=new JComboBox();
        cbngay.setBounds(120,130,55,25);
        cbthang=new JComboBox();
        cbthang.setBounds(175,130,55,25);
        cbnam=new JComboBox();
        cbnam.setBounds(230,130,55,25);
        for(int i=1;i<=31;i++)
        {
            if(i<=12) cbthang.addItem(i);
            cbngay.addItem(i);
        }
        for(int j=1900;j<=2021;j++)
        {
            cbnam.addItem(j);
        }
        pnDetail.add(cbngay);
        getContentPane().add(cbngay);
        pnDetail.add((cbthang));
        getContentPane().add(cbthang);
        pnDetail.add(cbnam);
        getContentPane().add(cbnam);

        lbCoSo=new JLabel("Choose a facility :");
        lbCoSo.setBounds(20,160,100,25);
        pnDetail.add(lbCoSo);
        getContentPane().add(lbCoSo);

        cbCoSo=new JComboBox(new Object[]{"Moscow General Hospital","Petersburg general hospital","Kazan general hospital"});
        cbCoSo.setBounds(120,160,180,25);
        pnDetail.add(cbCoSo);
        getContentPane().add(cbCoSo);

        lbkhoa=new JLabel("Department :");
        lbkhoa.setBounds(20,190,100,25);
        pnDetail.add(lbkhoa);
        getContentPane().add(lbkhoa);

        cbkhoa=new JComboBox();
        cbkhoa.setBounds(120,190,200,25);
        cbkhoa.addItem("Medical examination department");
        cbkhoa.addItem("Internal medicine department");
        cbkhoa.addItem("emergency department");
        cbkhoa.addItem("Resuscitation department");

        pnDetail.add(cbkhoa);
        getContentPane().add(cbkhoa);

        lblop=new JLabel("Room :");
        lblop.setBounds(20,220,100,25);
        pnDetail.add(lblop);
        getContentPane().add(lblop);

        tflop=new JTextField();
        tflop.setBounds(120,220,100,25);
        pnDetail.add(tflop);
        getContentPane().add(tflop);

        bntThem=new JButton("Add");
        bntThem.setBounds(50,270,75,25);
        pnDetail.add(bntThem);
        getContentPane().add(bntThem);

        bntLuu=new JButton("Save");
        bntLuu.setBounds(125,270,75,25);
        pnDetail.add(bntLuu);
        getContentPane().add(bntLuu);

        bntSua=new JButton("Fix");
        bntSua.setBounds(200,270,75,25);
        pnDetail.add(bntSua);
        getContentPane().add(bntSua);

        bntTimkiem=new JButton("Find Student");
        bntTimkiem.setBounds(275,270,75,25);
        pnDetail.add(bntTimkiem);
        getContentPane().add(bntTimkiem);

        //Xu ly su kien button
        bntThem.addActionListener(this);
        bntLuu.addActionListener(this);
        bntSua.addActionListener(this);
        bntTimkiem.addActionListener(this);
        LockText(false);
    }
    public void GuiTK()
    {
        cbmabn=new JComboBox();
        cbmabn.setBounds(120,70,100,25);
        pnDetail.add(cbmabn);
        getContentPane().add(cbmabn);

        tfngaysinh=new JTextField();
        tfngaysinh.setBounds(120,130,100,25);
        pnDetail.add(tfngaysinh);
        getContentPane().add(tfngaysinh);

        tfCoSo=new JTextField();
        tfCoSo.setBounds(120,160,200,25);
        pnDetail.add(tfCoSo);
        getContentPane().add(tfCoSo);

        tfKhoa=new JTextField();
        tfKhoa.setBounds(120,190,200,25);
        pnDetail.add(tfKhoa);
        getContentPane().add(tfKhoa);

        tfngaysinh.setVisible(true);
        tfngaysinh.setEditable(false);
        tfCoSo.setVisible(true);
        tfCoSo.setEditable(false);
        tfKhoa.setVisible(true);
        tfKhoa.setEditable(false);

        HideText(false);
    }
    public void HideText(boolean Hide)
    {
        tfmabn.setVisible(Hide);
        cbngay.setVisible(Hide);
        cbthang.setVisible(Hide);
        cbnam.setVisible(Hide);
        cbCoSo.setVisible(Hide);
        cbkhoa.setVisible(Hide);

    }
    public void LockTK(boolean lock)
    {
        cbmabn.setVisible(lock);
        tfngaysinh.setVisible(lock);
        tfngaysinh.setEditable(!lock);
        tfCoSo.setVisible(lock);
        tfCoSo.setEditable(!lock);
        tfKhoa.setVisible(lock);
        tfKhoa.setEditable(!lock);
    }
    public void LockText(boolean lock)
    {
        tfmabn.setEditable(lock);
        tfhoten.setEditable(lock);
        cbngay.setEnabled(lock);
        cbthang.setEnabled(lock);
        cbnam.setEnabled(lock);
        cbCoSo.setEnabled(lock);
        cbkhoa.setEnabled(lock);
        tflop.setEditable(lock);
        bntLuu.setEnabled(lock);
        bntSua.setEnabled(lock);
        bntThem.setEnabled(!lock);
        bntTimkiem.setEnabled(!lock);
    }
    public void actionPerformed(ActionEvent e)
    {
        //Ko ghi o lop cha -> Nguyen Nhan ( loi ghi phuong thuc cua lop con )
        //Xu ly : dung override ghi lai phuong thuc nay o lop con
    }
}