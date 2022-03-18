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
    public JPanel adultsWalletPanel;        public JLabel adultWalletPanelPic;
    public JPanel giantWalletPanel;         public JLabel giantWalletPic;
    public JPanel upgradedHeartPanel;       public JLabel updatesHeartPic;
    public JPanel quiverPanel;              public JLabel quiverPic;
    public JPanel bigQuiverPanel;           public JLabel bigQuiverPic;
    public JPanel biggestQuiverPanel;       public JLabel biggestQuiverPic;
    public JPanel silverScalePanel;         public JLabel silverScalePic;
    public JPanel goldenScalePanel;         public JLabel goldenScalePic;
    public JPanel faroresWindPanel;         public JLabel faroresWindPic;
    public JPanel stoneOfAgonyPanel;        public JLabel stoneOfAgonyPic;

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

    // mixed Items
    public JPanel bombPanel;                public JLabel bombPic;
    public JPanel bombchuPanel;             public JLabel bombchuPic;
    public JPanel dekuNutsPanel;            public JLabel dekuNutsPic;
    public JPanel lensOfTruthPanel;         public JLabel lensOfTruthPic;

    // Scare crow song
    public JPanel scareCrowContainer;       public JTextField scareCrowInput;
    public JPanel scareCrowPanel;           public JLabel scareCrowPic;

    // Horror kid mini game
    public JPanel horrorKidMiniGameContainer;public JTextField horrorKidMiniGameInput;
    public JPanel horrorKidMinigamePanel;    public JLabel horrorKidMiniGamePic;


// Dungeons
    // Forest temple
    public JPanel forestMedallionPanel;     public JLabel forestMedallionPic;
    public JPanel forestSongPanel;          public JLabel forestSongPic;
    public JPanel forestHeartContainerPanel;public JLabel forestHeartContainerPic;
    public JPanel forestKeyPanel;           public JLabel forestKeyPic;             public JLabel forestKeyLabel;
    public JPanel forestBossKeyPanel;       public JLabel forestBossKeyPic;
    public JPanel forestMapPanel;           public JLabel forestMapPic;
    public JPanel forestCompassPanel;       public JLabel forestCompassPic;

    // Fire temple
    public JPanel fireMedallionPanel;       public JLabel fireMedallionPic;
    public JPanel fireSongPanel;            public JLabel fireSongPic;
    public JPanel fireHeartContainerPanel;  public JLabel fireHeartContainerPic;
    public JPanel fireKeyPanel;             public JLabel fireKeyPic;               public JLabel fireKeyLabel;
    public JPanel fireBossKeyPanel;         public JLabel fireBossKeyPic;
    public JPanel fireMapPanel;             public JLabel fireMapPic;
    public JPanel fireCompassPanel;         public JLabel fireCompassPic;

    // Water temple
    public JPanel waterMedallionPanel;      public JLabel waterMedallionPic;
    public JPanel waterSongPanel;           public JLabel waterSongPic;
    public JPanel waterHeartContainerPanel; public JLabel waterHeartContainerPic;
    public JPanel waterKeyPanel;            public JLabel waterKeyPic;              public JLabel waterKeyLabel;
    public JPanel waterBossKeyPanel;        public JLabel waterBossKeyPic;
    public JPanel waterMapPanel;            public JPanel waterCompassPanel;
    public JLabel waterMapPic;              public JLabel waterCompassPic;

    // Shadow temple
    public JPanel shadowMedallionPanel;     public JLabel shadowMedallionPic;
    public JPanel shadowSongPanel;          public JLabel shadowSongPic;
    public JPanel shadowHeartContainerPanel;public JLabel shadowHeartContainerPic;
    public JPanel shadowKeyPanel;           public JLabel shadowKeyPic;             public JLabel shadowKeyLabel;
    public JPanel shadowBossKeyPanel;       public JLabel shadowBosKeyPic;
    public JPanel shadowMapPanel;           public JLabel shadowMapPic;
    public JPanel shadowCompassPanel;       public JLabel shadowCompassPic;

    // Spirit temple
    public JPanel spiritMedallionPanel;     public JLabel spiritMedallionPic;
    public JPanel spiritSongPanel;          public JLabel spiritSongPic;
    public JPanel spiritHeartContainerPanel;public JLabel spiritHeartContainerPic;
    public JPanel spiritKeyPanel;           public JLabel spiritKeyPic;          public JLabel spiritKeyLabel;
    public JPanel spiritBossKeyPanel;       public JLabel spiritBossKeyPic;
    public JPanel spiritMapPanel;           public JLabel spiritMapPic;
    public JPanel spiritCompassPanel;       public JLabel spiritCompassPic;

    // light Items
    public JPanel lightMedallionPanel;      public JLabel lightMedallionPic;
    public JPanel lightSongPanel;           public JLabel lightSongPic;

    // spiritual stones
    public JPanel kokiriStonePanel;         public JLabel kokiriStonePic;
    public JPanel goronStonePanel;          public JLabel goronStonePic;
    public JPanel zoraStonePanel;           public JLabel zoraStonePic;

    // gerudo training complex
    public JPanel gerudoTokenPanel;         public JLabel gerudoKeyPic;
    public JPanel gerudoKeyPanel;           public JLabel gerudoTokenPic;       public JLabel gerudoKeyLabel;

    // misc. songs
    public JPanel zeldaSongPanel;           public JLabel zeldaSongPic;
    public JPanel eponaSongPanel;           public JLabel eponaSongPic;
    public JPanel sariaSongPanel;           public JLabel sariaSongPic;
    public JPanel sunSongPanel;             public JLabel sunSongPic;
    public JPanel songOfTimePanel;          public JLabel songOfTimePic;
    public JPanel songOfStormsPanel;        public JLabel songOfStormPic;

// Grotto map
    public JLabel grottoMapPic;

// Collectibles
    public JPanel heartSkulltullaTriforceContainer;

    // Heartpieces
    public JPanel heartPieceContainer;
    public JPanel heartPiecePanel;              public JLabel heartPiecePic;
    public JProgressBar heartPieceProgressBar;
    public JButton heartPieceAddBtn;            public JButton heartPieceSubtractBtn;

    // Skulltulla
    public JPanel skulltullaContainer;
    public JPanel skultullaPanel;               public JLabel skulltullaPic;
    public JProgressBar skultullaProgressbar;
    public JButton skultullaAddBtn;             public JButton skulltullaSubtractBtn;

    // triforce hunt
    public JPanel triforceHuntContainer;
    public JTextField triforceInput;
    public JPanel triforcePanel;                public JLabel triforcePic;
    public JProgressBar triforceProgressbar;
    public JButton triforceAddBtn;              public JButton triforceSubstractBtn;
    public JButton triforceAddtriforceBtn;

    // Biggoron trading sequence
    public JPanel giantKnifePanel;              public JLabel giantKnifePic;
    public JPanel pocketEggPanel;               public JLabel poketEggPic;
    public JPanel pocketCuccoPanel;             public JLabel pocketCuccoPic;
    public JPanel cojiroPanel;                  public JLabel cojiroPic;
    public JPanel oddMushroomPanel;             public JLabel oddMushroomPic;
    public JPanel oddPoulticePanel;             public JLabel oddPoulticePic;
    public JPanel sawPanel;                     public JLabel sawPic;
    public JPanel brknGoronSwordPanel;          public JLabel brknGoronSwordPic;
    public JPanel prescriptionPanel;            public JLabel prescriptionPic;
    public JPanel frogPanel;                    public JLabel frogPic;
    public JPanel eyeDropsPanel;                public JLabel eyeDropsPic;
    public JPanel claimCheckPanel;              public JLabel claimCheckPic;
    public JPanel secondBigGoronSwordPanel;     public JLabel secondBigGoronSwordPic;

    public JPanel keatonMaskPanel;              public JLabel keatonMaskPic;
    public JPanel skullMaskPanel;               public JLabel skullMaskPic;
    public JPanel spookyMaskPanel;              public JLabel spookyMaskPic;
    public JPanel bunnyHoodPanel;               public JLabel bunnyHoodPic;
    public JPanel gerudoMaskPanel;              public JLabel gerudoMaskPic;
    public JPanel goronMaskPanel;               public JLabel goronMaskPic;
    public JPanel zoraMaskPanel;                public JLabel zoraMaskPic;
    public JPanel maskOfTruthPanel;             public JLabel maskOfTruthPic;

    public JPanel empty3_13_1;
    public JPanel empty3_15_1;
    public JPanel empty3_17_1;
    public JPanel empty3_12_2;
    public JPanel empty3_11_2;
    public JPanel empty3_10_2;
    public JPanel empty3_9_2;
    public JPanel empty3_14_2;
    public JPanel empty3_15_2;
    public JPanel empty3_16_2;
    public JPanel empty3_17_2;
    public JPanel empty1_1_2;
    public JPanel empty1_12_2;
    public JPanel empty1_16_2;
    public JPanel empty1_16_3;
    public JPanel empty1_1_3;
    public JPanel empty1_2_3;
    public JPanel empty1_8_5;
    public JPanel empty1_12_1;
    public JScrollPane grottoScrollPane;
    public JCheckBox checkBox1;


    public void setGUI() {
        setContentPane(mainWindow);
        setSize(670, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.add(coreItemsPanel);
        mainWindow.add(dungeonPanel);
        mainWindow.add(grottoMapPanel);
        mainWindow.add(collectiblesPanel);
        setVisible(true);
    }
}
