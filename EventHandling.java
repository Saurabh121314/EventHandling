import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener{
TextField t1;
EventHandling(){
t1 = new TextField();
t1.setBounds(50,50,150,40);
Button btn = new Button("click");
btn.setBounds(100,100,50,50);
btn.addActionListener(this);
add(btn);
add(t1);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
t1.setText("helllo beautyfull people");

}
public static void main(String args[]){
new EventHandling();
}
}