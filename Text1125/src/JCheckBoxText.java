import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxText {
	public static void main(String[] args) {

        JFrame f = new JFrame("复选框");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
        JCheckBox bCheckBox = new JCheckBox("选项一");
        //设置 为 默认被选中 
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(50, 50, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("选项二");
        bCheckBox2.setBounds(50, 100, 130, 30);
        //判断 是否 被 选中 
        System.out.println(bCheckBox2.isSelected());

        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
