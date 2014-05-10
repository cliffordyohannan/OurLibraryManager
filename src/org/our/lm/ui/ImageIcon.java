/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.ui;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.io.IOException;
/**
 *
 * @author Clifford P Y
 * @email cliffordyohannan@gmail.com
 */
public class ImageIcon extends JFrame{
    public void setFrameIcon(JFrame mainFrame)
    {
                BufferedImage image = null;
                try 
                {
                         image = ImageIO.read(
                         mainFrame.getClass().getResource("/images/Our.png"));
                }
                catch (IOException e) 
                {
                        System.out.println("In org.our.lm.ui.ImageIcon.java.setFrameIcon(JFrame mainFrame)  :"+e.getMessage());

                }

                mainFrame.setIconImage(image);
    }


}
