package enums;

/**
 * @author: i
 * @createDate: 2021/8/10
 * @version: 1.0
 */
public enum EnumSeason {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");

    String name;

    EnumSeason(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
