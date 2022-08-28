package 设计模式.工厂模式.抽象工厂;

/**
 * @author YangChenxi
 */
public class 具体工厂_小日本 extends HumanFactory {
    @Override
    Country createCountry() {
        return new Country_Japan();
    }

    @Override
    Food createFood() {
        return new Food_shit();
    }

    @Override
    Language createLanguage() {
        return new Language_Japanese();
    }
}
