package entity;

public class Style {

	private Accesories accesories = new Accesories();
	private Clothes clothes = new Clothes();
	private MakeUp makeUp = new MakeUp();

    public int takeEveningStyle(int size, int sizeOgBoots) {
        int accesoriesPrice = accesories.addBelt(size) + accesories.addSmallBag();
		int makeUpPrice = makeUp.makeEveningMakeUp();
        int clothesPrice = clothes.takeBoots(sizeOgBoots) + clothes.takeDress(size)
			+ clothes.takeHat(10);

		return accesoriesPrice + clothesPrice + makeUpPrice;
	}

    public int takeEveryDayStyle(int sizeOfBoots) {
		int accesoriesPrice = accesories.addBigBag();
		int makeUpPrice = makeUp.makeDayMakeUp();
        int clothesPrice = clothes.takeBoots(sizeOfBoots);

		return accesoriesPrice + clothesPrice + makeUpPrice;
	}

    public int takeSportStyle(int size) {
		int accesoriesPrice = accesories.addBackPack();
		int makeUpPrice = makeUp.makeSportMakeUp();
        int clothesPrice = clothes.takeSneakers(size);

		return accesoriesPrice + clothesPrice + makeUpPrice;
	}

}
