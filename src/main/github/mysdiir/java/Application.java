import controller.FrontendController;
import view.GUI;

public class Application extends GUI {

    public static void main(String[] args) {

            GUI GUI = new GUI();
            GUI.setGUI();

            FrontendController itemViewController = new FrontendController();

            FrontendController.setItemToggle(GUI.kokiriSwordPanel);
            FrontendController.setItemToggle(GUI.masterSwordPanel);
            FrontendController.setItemToggle(GUI.brknBiggoronSwordPanel);
            FrontendController.setItemToggle(GUI.biggoronSwordPanel);

            // Shields
            FrontendController.setItemToggle(GUI.kokiriShieldPanel);
            FrontendController.setItemToggle(GUI.hylianShieldPanel);
            FrontendController.setItemToggle(GUI.mirrorShieldPanel);

            // Tunics
            FrontendController.setItemToggle(GUI.goronTunicPanel);
            FrontendController.setItemToggle(GUI.zoraTunicPanel);

            //Boots
            FrontendController.setItemToggle(GUI.ironBootsPanel);
            FrontendController.setItemToggle(GUI.hoverBootsPanel);

            // Bags
            // Bullet Bag
            FrontendController.setItemToggle(GUI.bulletBagPanel);
            FrontendController.setItemToggle(GUI.bigBulletBagPanel);
            FrontendController.setItemToggle(GUI.biggestBulletBagPanel);
            // Quiver
            FrontendController.setItemToggle(GUI.quiverPanel);
            FrontendController.setItemToggle(GUI.bigQuiverPanel);
            FrontendController.setItemToggle(GUI.biggestQuiverPanel);
            // Bomb Bag
            FrontendController.setItemToggle(GUI.bombBagPanel);
            FrontendController.setItemToggle(GUI.bigBombBagPanel);
            FrontendController.setItemToggle(GUI.biggestBombBagPanel);

            // Strength Equipment
            FrontendController.setItemToggle(GUI.silverGauntletPanel);
            FrontendController.setItemToggle(GUI.goldenGauntletPanel);
            FrontendController.setItemToggle(GUI.goronBraceletPanel);

            // Diving Scales
            FrontendController.setItemToggle(GUI.silverScalePanel);
            FrontendController.setItemToggle(GUI.goldenScalePanel);

            // Godess Blessing
            FrontendController.setItemToggle(GUI.dinsFirePanel);
            FrontendController.setItemToggle(GUI.faroresWindPanel);
            FrontendController.setItemToggle(GUI.nayrusLovePanel);

            // Wallets
            FrontendController.setItemToggle(GUI.adultsWalletPanel);
            FrontendController.setItemToggle(GUI.giantWalletPanel);

            // Misc
            FrontendController.setItemToggle(GUI.stoneOfAgonyPanel);
            FrontendController.setItemToggle(GUI.gerudoTokenPanel);
            FrontendController.setItemToggle(GUI.magicMeterPanel);
            FrontendController.setItemToggle(GUI.biggerMagicMeterPanel);
            FrontendController.setItemToggle(GUI.upgradedHeartPanel);
            FrontendController.setItemToggle(GUI.spinAttackPanel);

        /*
        // Child Items
        itemControllerMergeItemViewController.setItemToggle(GUI.slingShotPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.dekuSeedPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.dekuStickPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.dekuNutPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.boomerangPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.magicBeanPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.weirdEggPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.cucooPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.zeldasLetterPanel);

        // Adult Items
        itemControllerMergeItemViewController.setItemToggle(GUI.bowPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.fireArrowPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.iceArrowPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.lightArrowPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.hooktshotPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.longshotPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.megatonHammerPanel);

        // Child & Adult Items
        itemControllerMergeItemViewController.setItemToggle(GUI.bombchuPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.bombchuPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.lensOfTruthPanel);
        //itemControllerMergeItemViewController.setItemToggle(GUI.fairyOcarinaPanel);
        itemControllerMergeItemViewController.setItemToggle(GUI.ocarinaOfTimePanel);


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

