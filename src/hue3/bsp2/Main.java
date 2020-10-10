/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue3.bsp2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.Normalizer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author holzm
 */
public class Main {

    public static int[] zufall = new int[10000];
    public static String[] line = new String[10];

    private static List<Weapon> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                s[0],
                CombatType.valueOf(s[1]),
                DamageType.valueOf(s[2]),
                Integer.parseInt(s[3]),
                Integer.parseInt(s[4]),
                Integer.parseInt(s[5]),
                Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());
    }

    public void befuellenInt() {
        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = (int) (Math.random() * 101);

        }
    }

    public void befuellenString() {

        String grossB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kleinB = grossB.toLowerCase();

        String all = grossB + kleinB;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length; i++) {

            int j = 0;
            Random rand = new Random();
            while (j < 10) {
                sb.append(all.charAt(rand.nextInt(all.length())));
                j++;

            }

            line[i] = sb.toString();

        }
    }
}
