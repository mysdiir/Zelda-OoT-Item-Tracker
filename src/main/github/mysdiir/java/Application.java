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


        // Child Items
            FrontendController.setItemToggle(GUI.schleuderPanel);
            FrontendController.setItemToggle(GUI.dekuSticksPanel);
            FrontendController.setItemToggle(GUI.boomerangPanel);
            FrontendController.setItemToggle(GUI.magicBeansPanel);
            FrontendController.setItemToggle(GUI.upgradedHeartPanel);
            FrontendController.setItemToggle(GUI.fairyOcarinaPanel);

            // Collectibles
            FrontendController.setItemToggle(GUI.zeldasLetterPanel);
            FrontendController.setItemToggle(GUI.cucoPanel);
            FrontendController.setItemToggle(GUI.rutosLetterPanel);



        // Adult Items
            FrontendController.setItemToggle(GUI.bowPanel);
            FrontendController.setItemToggle(GUI.fireArrowPanel);
            FrontendController.setItemToggle(GUI.iceArrowPanel);
            FrontendController.setItemToggle(GUI.lightArrowPanel);
            FrontendController.setItemToggle(GUI.hookshotPanel);
            FrontendController.setItemToggle(GUI.longshotPanel);
            FrontendController.setItemToggle(GUI.megatonHammerPanel);
            FrontendController.setItemToggle(GUI.goodOcarinaPanel);


        // Child & Adult Items
            FrontendController.setItemToggle(GUI.dekuNutsPanel);
            FrontendController.setItemToggle(GUI.lensOfTruthPanel);
            FrontendController.setItemToggle(GUI.bombchuPanel);
            FrontendController.setItemToggle(GUI.bombPanel);

    // Dungeons
        // Forest Temple
            FrontendController.setItemToggle(GUI.forestMedallionPanel);
            FrontendController.setItemToggle(GUI.forestSongPanel);
            FrontendController.setItemToggle(GUI.forestHeartContainerPanel);
            FrontendController.setItemToggle(GUI.forestKeyPanel);
            FrontendController.setItemToggle(GUI.forestBossKeyPanel);
            FrontendController.setItemToggle(GUI.forestMapPanel);
            FrontendController.setItemToggle(GUI.forestCompassPanel);

        // Fire Temple
            FrontendController.setItemToggle(GUI.fireMedallionPanel);
            FrontendController.setItemToggle(GUI.fireSongPanel);
            FrontendController.setItemToggle(GUI.fireHeartContainerPanel);
            FrontendController.setItemToggle(GUI.fireBossKeyPanel);
            FrontendController.setItemToggle(GUI.fireKeyPanel);
            FrontendController.setItemToggle(GUI.fireMapPanel);
            FrontendController.setItemToggle(GUI.fireCompassPanel);

        // Water Temple
            FrontendController.setItemToggle(GUI.waterMedallionPanel);
            FrontendController.setItemToggle(GUI.waterSongPanel);
            FrontendController.setItemToggle(GUI.waterHeartContainerPanel);
            FrontendController.setItemToggle(GUI.waterBossKeyPanel);
            FrontendController.setItemToggle(GUI.waterKeyPanel);
            FrontendController.setItemToggle(GUI.waterMapPanel);
            FrontendController.setItemToggle(GUI.waterCompassPanel);

         // Shadow temple
            FrontendController.setItemToggle(GUI.shadowMedallionPanel);
            FrontendController.setItemToggle(GUI.shadowSongPanel);
            FrontendController.setItemToggle(GUI.shadowHeartContainerPanel);
            FrontendController.setItemToggle(GUI.shadowBossKeyPanel);
            FrontendController.setItemToggle(GUI.shadowKeyPanel);
            FrontendController.setItemToggle(GUI.shadowMapPanel);
            FrontendController.setItemToggle(GUI.shadowCompassPanel);

         // Spirit temple
            FrontendController.setItemToggle(GUI.spiritMedallionPanel);
            FrontendController.setItemToggle(GUI.spiritSongPanel);
            FrontendController.setItemToggle(GUI.spiritHeartContainerPanel);
            FrontendController.setItemToggle(GUI.spiritBossKeyPanel);
            FrontendController.setItemToggle(GUI.spiritKeyPanel);
            FrontendController.setItemToggle(GUI.spiritMapPanel);
            FrontendController.setItemToggle(GUI.spiritCompassPanel);

         // Light items
            FrontendController.setItemToggle(GUI.lightMedallionPanel);
            FrontendController.setItemToggle(GUI.lightSongPanel);

         // Spiritual Stones
            FrontendController.setItemToggle(GUI.kokiriStonePanel);
            FrontendController.setItemToggle(GUI.goronStonePanel);
            FrontendController.setItemToggle(GUI.zoraStonePanel);

         // misc. Songs
            FrontendController.setItemToggle(GUI.zeldaSongPanel);
            FrontendController.setItemToggle(GUI.eponaSongPanel);
            FrontendController.setItemToggle(GUI.sariaSongPanel);
            FrontendController.setItemToggle(GUI.sunSongPanel);
            FrontendController.setItemToggle(GUI.songOfStormsPanel);
            FrontendController.setItemToggle(GUI.songOfTimePanel);
    }
}

