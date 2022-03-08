import controller.ItemController;
import view.GUI;

public class Application extends GUI {
    public static void main(String[] args) {


        GUI GUI = new GUI();
        GUI.setGUI();


        ItemController ItemController = new ItemController();

    // Item section
        // Swords
        ItemController.setItemFunctions(GUI.kokiriSwordPanel);
        ItemController.setItemFunctions(GUI.masterSwordPanel);
        ItemController.setItemFunctions(GUI.brknBiggoronSwordPanel);
        ItemController.setItemFunctions(GUI.biggoronSwordPanel);

        // Shields
        ItemController.setItemFunctions(GUI.kokiriShieldPanel);
        ItemController.setItemFunctions(GUI.hylianShieldPanel);
        ItemController.setItemFunctions(GUI.mirrorShieldPanel);

        // Tunics
        ItemController.setItemFunctions(GUI.goronTunicPanel);
        ItemController.setItemFunctions(GUI.zoraTunicPanel);

        //Boots
        ItemController.setItemFunctions(GUI.ironBootsPanel);
        ItemController.setItemFunctions(GUI.hoverBootsPanel);

        // Bags
            // Bullet Bag
        ItemController.setItemFunctions(GUI.bulletBagPanel);
        ItemController.setItemFunctions(GUI.bigBulletBagPanel);
        ItemController.setItemFunctions(GUI.biggestBulletBagPanel);
            // Quiver
        ItemController.setItemFunctions(GUI.quiverPanel);
        ItemController.setItemFunctions(GUI.bigQuiverPanel);
        ItemController.setItemFunctions(GUI.biggestQuiverPanel);
            // Bomb Bag
        ItemController.setItemFunctions(GUI.bombBagPanel);
        ItemController.setItemFunctions(GUI.bigBombBagPanel);
        ItemController.setItemFunctions(GUI.biggestBombBagPanel);

        // Strength Equipment
        ItemController.setItemFunctions(GUI.silverGauntletsPanel);
        ItemController.setItemFunctions(GUI.goldenGauntletsPanel);
        ItemController.setItemFunctions(GUI.goronsBraceletPanel);

        // Diving Scales
        ItemController.setItemFunctions(GUI.silverScalePanel);
        ItemController.setItemFunctions(GUI.goldenScalePanel);

        // Godess Blessing
        ItemController.setItemFunctions(GUI.dinsFirePanel);
        ItemController.setItemFunctions(GUI.faroresWindPanel);
        ItemController.setItemFunctions(GUI.nayrusLovePanel);

        // Wallets
        ItemController.setItemFunctions(GUI.adultWalletPanel);
        ItemController.setItemFunctions(GUI.giantsWalletPanel);

        // Misc
        ItemController.setItemFunctions(GUI.stoneOfAgonyPanel);
        ItemController.setItemFunctions(GUI.gerudoTokenPanel);
        ItemController.setItemFunctions(GUI.magicMeterSmallPanel);
        ItemController.setItemFunctions(GUI.magicMeterBigPanel);
        ItemController.setItemFunctions(GUI.upgradedHealthPanel);
        ItemController.setItemFunctions(GUI.spinAttackPanel);

        /*
        // Child Items
        ItemController.setItemFunctions(GUI.slingShotPanel);
        ItemController.setItemFunctions(GUI.dekuSeedPanel);
        ItemController.setItemFunctions(GUI.dekuStickPanel);
        ItemController.setItemFunctions(GUI.dekuNutPanel);
        ItemController.setItemFunctions(GUI.boomerangPanel);
        ItemController.setItemFunctions(GUI.magicBeanPanel);
        ItemController.setItemFunctions(GUI.weirdEggPanel);
        ItemController.setItemFunctions(GUI.cucooPanel);
        ItemController.setItemFunctions(GUI.zeldasLetterPanel);

        // Adult Items
        ItemController.setItemFunctions(GUI.bowPanel);
        ItemController.setItemFunctions(GUI.fireArrowPanel);
        ItemController.setItemFunctions(GUI.iceArrowPanel);
        ItemController.setItemFunctions(GUI.lightArrowPanel);
        ItemController.setItemFunctions(GUI.hooktshotPanel);
        ItemController.setItemFunctions(GUI.longshotPanel);
        ItemController.setItemFunctions(GUI.megatonHammerPanel);

        // Child & Adult Items
        ItemController.setItemFunctions(GUI.bombchuPanel);
        ItemController.setItemFunctions(GUI.bombchuPanel);
        ItemController.setItemFunctions(GUI.lensOfTruthPanel);
        //ItemController.setItemFunctions(GUI.fairyOcarinaPanel);
        ItemController.setItemFunctions(GUI.ocarinaOfTimePanel);


         */

        //Dungeons
            // Forest Temple
            // Fire Temple
            // Water Temple
            // Shadow Temple
            // Spirit Temple
            // Light Panel
            // Forest Temple
            // Holy Items



















    }
}
