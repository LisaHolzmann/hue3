package hue3.bsp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public double average(int[] numbers) {

        return IntStream.of(numbers).average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {
        /*
        List<String> erg = Arrays.asList(strings);

        erg = erg.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        return erg;*/

        return Arrays.asList(strings).stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {

        weapons.stream().map(Weapon -> Weapon.getDamage());
        weapons.stream().filter(Weapon -> Weapon.getDamage().);

    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        //implement this
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter(Weapon -> Weapon.getDamageType() == DamageType.MISSILE).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        //implement this
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(Weapon -> Weapon.getName()).collect(Collectors.toList());
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().map(Weapon -> Weapon.getSpeed()).mapToInt(Integer::intValue).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().map(Weapon -> Weapon.getValue()).reduce(0, (a, b) -> a + b);
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().map(Weapon -> Weapon.hashCode()).reduce(0, (a, b) -> a + b);

    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream().distinct().collect(Collectors.toList());
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        //implement this
    }
}
