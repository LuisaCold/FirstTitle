import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MyPanel extends JPanel {
    private  ArrayList<Rectangle> outlist = new ArrayList<>();

        public MyPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
    }



        public void setSymbols(String parm) {
            String[] arr = parm.replace(",", "").split(" ");
            outlist = new ArrayList<Rectangle>();
            for (String cifra : arr) {
                switch (cifra) {
                    case "1":
                        segment("2",false);
                        segment("4",false);
                        break;
                    case "2":
                        segment("1",false);
                        segment("2",false);
                        segment("3",false);
                        segment("6",false);
                        segment("5",false);
                        break;
                    case "3":
                        segment("1",false);
                        segment("2",false);
                        segment("3",false);
                        segment("4",false);
                        segment("5",false);
                        break;
                    case "4":
                        segment("7",false);
                        segment("2",false);
                        segment("3",false);
                        segment("4",false);
                        break;
                    case "5":
                        segment("1",false);
                        segment("7",false);
                        segment("3",false);
                        segment("4",false);
                        segment("5",false);
                        break;
                    case "8":
                        segment("1",false);
                        segment("2",false);
                        segment("3",false);
                        segment("4",false);
                        segment("5",false);
                        segment("6",false);
                        segment("7",false);
                        break;

                }
                x = x+step+width;
            }
        }
        private void segment(String number, boolean clear){
            switch (number){
                case "1":outlist.add(new Rectangle(x+delta,y,x+width-delta,y));
                     break;
                case "2":outlist.add(new Rectangle(x+width,y+delta,x+width,y+(height/2)-delta));
                    break;
                case "3":outlist.add(new Rectangle(x+delta,y+height/2,x+width-delta,y+height/2));
                    break;
                case "4":outlist.add(new Rectangle(x+width,y+(height/2)+delta,x+width,y+height-delta));
                    break;
                case "5":outlist.add(new Rectangle(x+delta,y+height,x+width-delta,y+height));
                    break;
                case "6":outlist.add(new Rectangle(x,y+(height/2)+delta,x,y+height-delta));
                    break;
                case "7":outlist.add(new Rectangle(x,y+delta,x,y+(height/2)-delta));
                    break;
            }
        }

        public Dimension getPreferredSize(){
            return new Dimension(1560,700);
        }

        private int x = 100;
        private int y = 100;
        private int width = 50;
        private int height = 100;
        private int delta = 5;
        private int step = 30;

        public void paintComponent(Graphics g){
            super.paintComponent(g);


            for (Rectangle rect:outlist){
                g.drawLine(rect.x, rect.y, rect.width, rect.height);
            }
        }

        public void  setX(int x){
            this.x = x;
        }
        public void  setY(int y){
            this.y = y;
        }
        public void  setWidth(int  width){
            this.width = width;
        }
        public void  setHeight(int height){
            this.height = height;
        }
        public void  setStep(int step){
            this.step = step;
        }
    }

