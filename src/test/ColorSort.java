package test;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;

public class ColorSort extends Canvas {

    int width, height;
    Random random = new Random();
    ArrayList<Color> rgbColor = new ArrayList<>();

    public static void main(String[] args) {

        new ColorSort(1300, 730);
    }

    public ColorSort(int Width, int Height) {
        this.width = Width;
        this.height = Height;
        JFrame window = new JFrame();
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(this);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Color clr;
        int red, green, blue;
        for (int i = 0; i < height + 1; i += 1) {
            for (int j = 0; j < width + 1; j += 1) {
                red = random.nextInt(255);
                green = random.nextInt(255);
                blue = random.nextInt(255);
                clr = new Color(red, green, blue);
                g.setColor(clr);
                g.fillRect(j, i, 1, 1);
            }
        }
    }

    public ArrayList<Color> sortLighterColor(ArrayList<Color> arrayColor) {

        ArrayList<Integer> listNumberRGB = new ArrayList<>();
        int size = arrayColor.size();
        Color clr;
        for (int i = 0; i < size; i++) {
            clr = arrayColor.get(i);
            listNumberRGB.add(clr.getRed() + clr.getGreen() + clr.getBlue());
        }
        quickSort(arrayColor, listNumberRGB, 0, size);
        return arrayColor;
    }

    int partition(ArrayList<Color> arrColor, ArrayList<Integer> arr, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr.get((left + right) / 2);
        Color tmpColor;

        while (i <= j) {
            while (arr.get(i) < pivot) {
                i++;
            }
            while (arr.get(i) > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr.get(i);
                tmpColor = arrColor.get(i);
                arr.set(i, arr.get(j));
                arrColor.set(i, arrColor.get(j));
                arr.set(j, tmp);
                arrColor.set(j, tmpColor);
                i++;
                j--;
            }
        };

        return i;
    }

    void quickSort(ArrayList<Color> arrColor, ArrayList<Integer> arr, int left, int right) {
        int index = partition(arrColor, arr, left, right);
        if (left < index - 1) {
            quickSort(arrColor, arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arrColor, arr, index, right);
        }
    }

}
