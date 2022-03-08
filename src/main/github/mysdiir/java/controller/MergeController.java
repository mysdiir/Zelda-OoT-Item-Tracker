package controller;

import view.GUI;

import javax.swing.*;


public class MergeController extends GUI {


    public void setItemFunctions(JPanel PanelName) {
        PanelName = PanelName;
        ItemViewController.setItemToggle(PanelName);
    
    
    
    
    }

    
    
    public void setMergedFunctions() {

        GUI GUI = new GUI();
        GUI.setGUI();


        setItemFunctions(GUI.kokiriSwordPanel);
        setItemFunctions(GUI.masterSwordPanel);
        setItemFunctions(GUI.brknBiggoronSwordPanel);
        setItemFunctions(GUI.biggoronSwordPanel);

        // Shields
        setItemFunctions(GUI.kokiriShieldPanel);
        setItemFunctions(GUI.hylianShieldPanel);
        setItemFunctions(GUI.mirrorShieldPanel);

        // Tunics
        setItemFunctions(GUI.goronTunicPanel);
        setItemFunctions(GUI.zoraTunicPanel);

        //Boots
        setItemFunctions(GUI.ironBootsPanel);
        setItemFunctions(GUI.hoverBootsPanel);

        // Bags
        // Bullet Bag
        setItemFunctions(GUI.bulletBagPanel);
        setItemFunctions(GUI.bigBulletBagPanel);
        setItemFunctions(GUI.biggestBulletBagPanel);
        // Quiver
        setItemFunctions(GUI.quiverPanel);
        setItemFunctions(GUI.bigQuiverPanel);
        setItemFunctions(GUI.biggestQuiverPanel);
        // Bomb Bag
        setItemFunctions(GUI.bombBagPanel);
        setItemFunctions(GUI.bigBombBagPanel);
        setItemFunctions(GUI.biggestBombBagPanel);

        // Strength Equipment
        setItemFunctions(GUI.silverGauntletPanel);
        setItemFunctions(GUI.goldenGauntletPanel);
        setItemFunctions(GUI.goronBraceletPanel);

        // Diving Scales
        setItemFunctions(GUI.silverScalePanel);
        setItemFunctions(GUI.goldenScalePanel);

        // Godess Blessing
        setItemFunctions(GUI.dinsFirePanel);
        setItemFunctions(GUI.faroresWindPanel);
        setItemFunctions(GUI.nayrusLovePanel);

        // Wallets
        setItemFunctions(GUI.adultsWalletPanel);
        setItemFunctions(GUI.giantWalletPanel);

        // Misc
        setItemFunctions(GUI.stoneOfAgonyPanel);
        setItemFunctions(GUI.gerudoTokenPanel);
        setItemFunctions(GUI.magicMeterPanel);
        setItemFunctions(GUI.biggerMagicMeterPanel);
        setItemFunctions(GUI.upgradedHeartPanel);
        setItemFunctions(GUI.spinAttackPanel);

        /*
        // Child Items
        itemControllerMergesetItemFunctions(GUI.slingShotPanel);
        itemControllerMergesetItemFunctions(GUI.dekuSeedPanel);
        itemControllerMergesetItemFunctions(GUI.dekuStickPanel);
        itemControllerMergesetItemFunctions(GUI.dekuNutPanel);
        itemControllerMergesetItemFunctions(GUI.boomerangPanel);
        itemControllerMergesetItemFunctions(GUI.magicBeanPanel);
        itemControllerMergesetItemFunctions(GUI.weirdEggPanel);
        itemControllerMergesetItemFunctions(GUI.cucooPanel);
        itemControllerMergesetItemFunctions(GUI.zeldasLetterPanel);

        // Adult Items
        itemControllerMergesetItemFunctions(GUI.bowPanel);
        itemControllerMergesetItemFunctions(GUI.fireArrowPanel);
        itemControllerMergesetItemFunctions(GUI.iceArrowPanel);
        itemControllerMergesetItemFunctions(GUI.lightArrowPanel);
        itemControllerMergesetItemFunctions(GUI.hooktshotPanel);
        itemControllerMergesetItemFunctions(GUI.longshotPanel);
        itemControllerMergesetItemFunctions(GUI.megatonHammerPanel);

        // Child & Adult Items
        itemControllerMergesetItemFunctions(GUI.bombchuPanel);
        itemControllerMergesetItemFunctions(GUI.bombchuPanel);
        itemControllerMergesetItemFunctions(GUI.lensOfTruthPanel);
        //itemControllerMergesetItemFunctions(GUI.fairyOcarinaPanel);
        itemControllerMergesetItemFunctions(GUI.ocarinaOfTimePanel);


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
