import controller.FrontendController;
import view.GUI;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class Application extends GUI {

    public static void main(String[] args) {

            GUI GUI = new GUI();
            GUI.setGUI();

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
            FrontendController.setItemToggle(GUI.magicMeterPanel);
            FrontendController.setItemToggle(GUI.biggerMagicMeterPanel);
            FrontendController.setItemToggle(GUI.upgradedHeartPanel);
            FrontendController.setItemToggle(GUI.spinAttackPanel);


        // Child Items
            FrontendController.setItemToggle(GUI.schleuderPanel);
            FrontendController.setItemToggle(GUI.dekuSticksPanel);
            FrontendController.setItemToggle(GUI.boomerangPanel);
            FrontendController.setItemToggle(GUI.magicBeansPanel);
            FrontendController.setItemToggle(GUI.weirdEggPanel);
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
            FrontendController.toggleKey(GUI.forestKeyPanel, GUI.forestKeyLabel, 5 );
            FrontendController.setItemToggle(GUI.forestBossKeyPanel);
            FrontendController.setItemToggle(GUI.forestMapPanel);
            FrontendController.setItemToggle(GUI.forestCompassPanel);

        // Fire Temple
            FrontendController.setItemToggle(GUI.fireMedallionPanel);
            FrontendController.setItemToggle(GUI.fireSongPanel);
            FrontendController.setItemToggle(GUI.fireHeartContainerPanel);
            FrontendController.setItemToggle(GUI.fireBossKeyPanel);
            FrontendController.toggleKey(GUI.fireKeyPanel, GUI.fireKeyLabel, 8 );
            FrontendController.setItemToggle(GUI.fireMapPanel);
            FrontendController.setItemToggle(GUI.fireCompassPanel);

        // Water Temple
            FrontendController.setItemToggle(GUI.waterMedallionPanel);
            FrontendController.setItemToggle(GUI.waterSongPanel);
            FrontendController.setItemToggle(GUI.waterHeartContainerPanel);
            FrontendController.setItemToggle(GUI.waterBossKeyPanel);
            FrontendController.toggleKey(GUI.waterKeyPanel, GUI.waterKeyLabel, 6);
            FrontendController.setItemToggle(GUI.waterMapPanel);
            FrontendController.setItemToggle(GUI.waterCompassPanel);

         // Shadow temple
            FrontendController.setItemToggle(GUI.shadowMedallionPanel);
            FrontendController.setItemToggle(GUI.shadowSongPanel);
            FrontendController.setItemToggle(GUI.shadowHeartContainerPanel);
            FrontendController.setItemToggle(GUI.shadowBossKeyPanel);
            FrontendController.toggleKey(GUI.shadowKeyPanel, GUI.shadowKeyLabel, 5);
            FrontendController.setItemToggle(GUI.shadowMapPanel);
            FrontendController.setItemToggle(GUI.shadowCompassPanel);

         // Spirit temple
            FrontendController.setItemToggle(GUI.spiritMedallionPanel);
            FrontendController.setItemToggle(GUI.spiritSongPanel);
            FrontendController.setItemToggle(GUI.spiritHeartContainerPanel);
            FrontendController.setItemToggle(GUI.spiritBossKeyPanel);
            FrontendController.toggleKey(GUI.spiritKeyPanel, GUI.spiritKeyLabel, 4 );
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

         // Gerudo training ground
            FrontendController.toggleKey(GUI.gerudoKeyPanel, GUI.gerudoKeyLabel, 9);


    // Collectibles
        // Big goron trading sequence
            FrontendController.setItemToggle(GUI.giantKnifePanel);
            FrontendController.setItemToggle(GUI.pocketEggPanel);
            FrontendController.setItemToggle(GUI.pocketCuccoPanel);
            FrontendController.setItemToggle(GUI.cojiroPanel);
            FrontendController.setItemToggle(GUI.oddMushroomPanel);
            FrontendController.setItemToggle(GUI.oddPoulticePanel);
            FrontendController.setItemToggle(GUI.sawPanel);
            FrontendController.setItemToggle(GUI.brknGoronSwordPanel);
            FrontendController.setItemToggle(GUI.prescriptionPanel);
            FrontendController.setItemToggle(GUI.frogPanel);
            FrontendController.setItemToggle(GUI.eyeDropsPanel);
            FrontendController.setItemToggle(GUI.claimCheckPanel);
            FrontendController.setItemToggle(GUI.secondBigGoronSwordPanel);

            // Mask trading sequence
            FrontendController.setItemToggle(GUI.keatonMaskPanel);
            FrontendController.setItemToggle(GUI.skullMaskPanel);
            FrontendController.setItemToggle(GUI.spookyMaskPanel);
            FrontendController.setItemToggle(GUI.bunnyHoodPanel);
            FrontendController.setItemToggle(GUI.gerudoMaskPanel);
            FrontendController.setItemToggle(GUI.goronMaskPanel);
            FrontendController.setItemToggle(GUI.zoraMaskPanel);
            FrontendController.setItemToggle(GUI.maskOfTruthPanel);

            FrontendController.addHeartPiece(26,GUI.heartPieceAddBtn,GUI.heartPieceProgressBar, GUI.heartPieceOutputLabel);
            FrontendController.subtractHearPiece(26,GUI.heartPieceSubtractBtn,GUI.heartPieceProgressBar,GUI.heartPieceOutputLabel);

            FrontendController.addSkulltula(100,GUI.skultullaAddBtn,GUI.skultullaProgressbar, GUI.skulltullaOutputLabel);
            FrontendController.subtractSkulltula(100,GUI.skulltullaSubtractBtn,GUI.skultullaProgressbar,GUI.skulltullaOutputLabel);

            FrontendController.setTriforceValue(GUI.triforceAddtriforceBtn, GUI.triforceInput, GUI.triforceProgressbar);
            FrontendController.addTriforce(GUI.triforceAddBtn, GUI.triforceProgressbar, GUI.triforceOutputLabel);
            FrontendController.subtractTriforce(GUI.triforceSubstractBtn, GUI.triforceProgressbar, GUI.triforceOutputLabel);
    }
}

