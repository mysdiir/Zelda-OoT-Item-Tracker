package view;

import javax.swing.*;

public class GUI extends JFrame{

// Panels
    public JPanel mainWindow;
    public JPanel coreItemsPanel;
    public JPanel dungeonPanel;
    public JPanel grottoMapPanel;
    public JPanel collectiblesPanel;

// Items
    // Core items
    public JPanel kokiriSwordPanel;         public JLabel kokiriSwordPic;
    public JPanel masterSwordPanel;         public JLabel masterSwordPic;
    public JPanel brknBiggoronSwordPanel;   public JPanel biggoronSwordPanel;
    public JPanel kokiriShieldPanel;        public JLabel kokiriShieldPic;
    public JPanel hylianShieldPanel;        public JLabel hylianShieldPic;
    public JPanel mirrorShieldPanel;        public JLabel mirrorShieldPic;
    public JPanel kokiriTunicPanel;         public JLabel kokiriTunicPic;
    public JPanel goronTunicPanel;          public JLabel goronTunicPic;
    public JPanel zoraTunicPanel;           public JLabel zoraTunicPic;
    public JPanel ironBootsPanel;           public JLabel ironBootsPic;
    public JPanel hoverBootsPanel;          public JLabel hoverBootsPic;
    public JLabel brknBiggoronSwordPic;     public JLabel biggoronSwordPic;
    public JPanel kokiriBootsPanel;         public JLabel kokiriBootsPic;
    public JPanel bulletBagPanel;           public JLabel bulletBagPic;
    public JPanel bigBulletBagPanel;        public JLabel bigBulletBagPic;
    public JPanel biggestBulletBagPanel;    public JLabel biggestBulletBagPic;
    public JPanel silverGauntletPanel;      public JLabel silverGauntletPic;
    public JPanel goldenGauntletPanel;      public JLabel goldenGauntletsPic;
    public JPanel dinsFirePanel;            public JLabel dinsFirePic;
    public JPanel adultsWalletPanel;        public JLabel adultPanelPic;
    public JPanel giantWalletPanel;         public JPanel upgradedHeartPanel;
    public JLabel updatesHeartPic;          public JPanel quiverPanel;              public JLabel quiverPic;
    public JPanel bigQuiverPanel;           public JLabel bigQuiverPic;
    public JPanel biggestQuiverPanel;       public JLabel biggestQuiverPic;
    public JPanel silverScalePanel;         public JLabel silverScalePic;
    public JPanel goldenScalePanel;         public JLabel goldenScalePic;
    public JPanel faroresWindPanel;         public JLabel faroresWindPic;
    public JPanel stoneOfAgonyPanel;        public JLabel stoneOfAgonyPic;
    public JPanel gerudoTokenPanel;         public JLabel gerudoTokenPic;
    public JPanel spinAttackPanel;          public JLabel spinAttackPic;
    public JPanel bombBagPanel;             public JLabel bombBagPic;
    public JPanel bigBombBagPanel;          public JLabel bigBombBagPic;
    public JPanel biggestBombBagPanel;      public JLabel biggestBombBagPic;
    public JPanel goronBraceletPanel;       public JLabel goronBraceletPic;
    public JPanel nayrusLovePanel;          public JLabel nayrusLovePic;
    public JPanel magicMeterPanel;          public JLabel magicMeterPic;
    public JPanel biggerMagicMeterPanel;    public JLabel biggerMagicMeterPic;

    // Child items
    public JPanel dekuSticksPanel;          public JLabel dekuSticksPic;
    public JPanel boomerangPanel;           public JLabel boomerangPic;
    public JPanel magicBeansPanel;          public JLabel magicBeansPic;
    public JPanel zeldasLetterPanel;        public JLabel zeldasLetterPic;
    public JPanel cucoPanel;                public JLabel cucoPic;
    public JPanel rutosLetterPanel;         public JLabel rutosLetterPic;
    public JPanel fairyOcarinaPanel;        public JLabel fairyOcarinaPic;
    public JPanel weirdEggPanel;            public JLabel weirdEggPic;
    public JPanel schleuderPanel;           public JLabel schleuderPic;


    // Adult items
    public JPanel bowPanel;                 public JLabel bowPic;
    public JPanel fireArrowPanel;           public JLabel fireArrowPic;
    public JPanel iceArrowPanel;            public JLabel iceArrowPic;
    public JPanel lightArrowPanel;          public JLabel lightArrowPic;
    public JPanel hookshotPanel;            public JLabel hookshotPic;
    public JPanel longshotPanel;            public JLabel longshotPic;
    public JPanel megatonHammerPanel;       public JLabel megatonHammerPic;
    public JPanel goodOcarinaPanel;         public JLabel oOTPic;
    public JPanel bombPanel;                public JLabel bombPic;
    public JPanel bombchuPanel;             public JLabel bombchuPic;


    // mixed Items
    public JPanel dekuNutsPanel;            public JLabel dekuNutsPic;
    public JPanel lensOfTruthPanel;         public JLabel lensOfTruthPic;


    // empty panels
    public JPanel empty1_2;
    public JPanel empty1_3;
    public JPanel empty10_3;
    public JPanel empty14_3;
    public JPanel empty5_4;
    public JPanel empty11_4;
    public JPanel empty14_4;
    public JPanel empty9_5;
    public JPanel empty8_5;
    public JPanel empty11_5;
    public JPanel empty14_5;


// Dungeons
    // Forest temple
    public JPanel forestMedallionPanel;     public JLabel forestMedallionPic;
    public JPanel forestSongPanel;          public JLabel forestSongPic;
    public JPanel forestHeartContainerPanel;public JLabel forestHeartContainerPic;
    public JPanel forestKeyPanel;           public JLabel forestKeyPic;
    public JPanel forestBossKeyPanel;       public JLabel forestBossKeyPic;
    public JPanel forestMapPanel;           public JLabel forestMapPic;
    public JPanel forestCompassPanel;       public JLabel forestCompassPic;

    // Fire temple
    public JPanel fireMedallionPanel;       public JLabel fireMedallionPic;
    public JPanel fireSongPanel;            public JLabel fireSongPic;
    public JPanel fireHeartContainerPanel;  public JLabel fireHeartContainerPic;
    public JPanel fireKeyPanel;             public JLabel fireKeyPic;
    public JPanel fireBossKeyPanel;         public JLabel fireBossKeyPic;
    public JPanel fireMapPanel;             public JLabel fireMapPic;
    public JPanel fireCompassPanel;         public JLabel fireCompassPic;

    // Water temple
    // Shadow temple
    // Spirit temple
    // Light Area



    public void setGUI() {
        setContentPane(mainWindow);
        setSize(600, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.add(coreItemsPanel);
        mainWindow.add(dungeonPanel);
        mainWindow.add(grottoMapPanel);
        mainWindow.add(collectiblesPanel);
        setVisible(true);
    }
}
