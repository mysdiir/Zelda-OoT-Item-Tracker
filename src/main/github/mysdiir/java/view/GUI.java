package view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame{

// Panels
    public JPanel mainWindow;
    public JPanel coreItemsPanel;
    public JPanel dungeonPanel;
    public JPanel grottoMapPanel;
    public JPanel collectiblesPanel;

// Items
    // Core items
    public JPanel kokiriSwordPanel;         private JLabel kokiriSwordPic;
    public JPanel masterSwordPanel;         private JLabel masterSwordPic;
    public JPanel brknBiggoronSwordPanel;   public JPanel biggoronSwordPanel;
    public JPanel kokiriShieldPanel;        private JLabel kokiriShieldPic;
    public JPanel hylianShieldPanel;        private JLabel hylianShieldPic;
    public JPanel mirrorShieldPanel;        private JLabel mirrorShieldPic;
    public JPanel kokiriTunicPanel;         private JLabel kokiriTunicPic;
    public JPanel goronTunicPanel;          private JLabel goronTunicPic;
    public JPanel zoraTunicPanel;           private JLabel zoraTunicPic;
    public JPanel ironBootsPanel;           private JLabel ironBootsPic;
    public JPanel hoverBootsPanel;          private JLabel hoverBootsPic;
    public JLabel brknBiggoronSwordPic;     private JLabel biggoronSwordPic;
    public JPanel kokiriBootsPanel;         private JLabel kokiriBootsPic;
    public JPanel bulletBagPanel;           private JLabel bulletBagPic;
    public JPanel bigBulletBagPanel;        private JLabel bigBulletBagPic;
    public JPanel biggestBulletBagPanel;    private JLabel biggestBulletBagPic;
    public JPanel silverGauntletPanel;      private JLabel silverGauntletPic;
    public JPanel goldenGauntletPanel;      private JLabel goldenGauntletsPic;
    public JPanel dinsFirePanel;            private JLabel dinsFirePic;
    public JPanel adultsWalletPanel;        private JLabel adultWalletPanelPic;
    public JPanel giantWalletPanel;         private JLabel giantWalletPic;
    public JPanel upgradedHeartPanel;       private JLabel updatesHeartPic;
    public JPanel quiverPanel;              private JLabel quiverPic;
    public JPanel bigQuiverPanel;           private JLabel bigQuiverPic;
    public JPanel biggestQuiverPanel;       private JLabel biggestQuiverPic;
    public JPanel silverScalePanel;         private JLabel silverScalePic;
    public JPanel goldenScalePanel;         private JLabel goldenScalePic;
    public JPanel faroresWindPanel;         private JLabel faroresWindPic;
    public JPanel stoneOfAgonyPanel;        private JLabel stoneOfAgonyPic;

    public JPanel spinAttackPanel;          private JLabel spinAttackPic;
    public JPanel bombBagPanel;             private JLabel bombBagPic;
    public JPanel bigBombBagPanel;          private JLabel bigBombBagPic;
    public JPanel biggestBombBagPanel;      private JLabel biggestBombBagPic;
    public JPanel goronBraceletPanel;       private JLabel goronBraceletPic;
    public JPanel nayrusLovePanel;          private JLabel nayrusLovePic;
    public JPanel magicMeterPanel;          private JLabel magicMeterPic;
    public JPanel biggerMagicMeterPanel;    private JLabel biggerMagicMeterPic;

    // Child items
    public JPanel dekuSticksPanel;          private JLabel dekuSticksPic;
    public JPanel boomerangPanel;           private JLabel boomerangPic;
    public JPanel magicBeansPanel;          private JLabel magicBeansPic;
    public JPanel zeldasLetterPanel;        private JLabel zeldasLetterPic;
    public JPanel cucoPanel;                private JLabel cucoPic;
    public JPanel rutosLetterPanel;         private JLabel rutosLetterPic;
    public JPanel fairyOcarinaPanel;        private JLabel fairyOcarinaPic;
    public JPanel weirdEggPanel;            private JLabel weirdEggPic;
    public JPanel schleuderPanel;           private JLabel schleuderPic;


    // Adult items
    public JPanel bowPanel;                 private JLabel bowPic;
    public JPanel fireArrowPanel;           private JLabel fireArrowPic;
    public JPanel iceArrowPanel;            private JLabel iceArrowPic;
    public JPanel lightArrowPanel;          private JLabel lightArrowPic;
    public JPanel hookshotPanel;            private JLabel hookshotPic;
    public JPanel longshotPanel;            private JLabel longshotPic;
    public JPanel megatonHammerPanel;       private JLabel megatonHammerPic;
    public JPanel goodOcarinaPanel;         private JLabel oOTPic;

    // mixed Items
    public JPanel bombPanel;                private JLabel bombPic;
    public JPanel bombchuPanel;             private JLabel bombchuPic;
    public JPanel dekuNutsPanel;            private JLabel dekuNutsPic;
    public JPanel lensOfTruthPanel;         private JLabel lensOfTruthPic;

    // Scare crow song
    public JPanel scareCrowContainer;       public JTextField scareCrowInput;
    public JPanel scareCrowPanel;           private JLabel scareCrowPic;

    // Horror kid mini game
    public JPanel horrorKidMiniGameContainer;public JTextField horrorKidMiniGameInput;
    public JPanel horrorKidMinigamePanel;    private JLabel horrorKidMiniGamePic;


// Dungeons
    // Forest temple
    public JPanel forestMedallionPanel;     private JLabel forestMedallionPic;
    public JPanel forestSongPanel;          private JLabel forestSongPic;
    public JPanel forestHeartContainerPanel;private JLabel forestHeartContainerPic;
    public JPanel forestKeyPanel;           private JLabel forestKeyPic;             public JLabel forestKeyLabel;
    public JPanel forestBossKeyPanel;       private JLabel forestBossKeyPic;
    public JPanel forestMapPanel;           private JLabel forestMapPic;
    public JPanel forestCompassPanel;       private JLabel forestCompassPic;

    // Fire temple
    public JPanel fireMedallionPanel;       private JLabel fireMedallionPic;
    public JPanel fireSongPanel;            private JLabel fireSongPic;
    public JPanel fireHeartContainerPanel;  private JLabel fireHeartContainerPic;
    public JPanel fireKeyPanel;             private JLabel fireKeyPic;               public JLabel fireKeyLabel;
    public JPanel fireBossKeyPanel;         private JLabel fireBossKeyPic;
    public JPanel fireMapPanel;             private JLabel fireMapPic;
    public JPanel fireCompassPanel;         private JLabel fireCompassPic;

    // Water temple
    public JPanel waterMedallionPanel;      private JLabel waterMedallionPic;
    public JPanel waterSongPanel;           private JLabel waterSongPic;
    public JPanel waterHeartContainerPanel; private JLabel waterHeartContainerPic;
    public JPanel waterKeyPanel;            private JLabel waterKeyPic;              public JLabel waterKeyLabel;
    public JPanel waterBossKeyPanel;        private JLabel waterBossKeyPic;
    public JPanel waterMapPanel;            public JLabel waterMapPic;
    public JPanel waterCompassPanel;        private JLabel waterCompassPic;

    // Shadow temple
    public JPanel shadowMedallionPanel;     private JLabel shadowMedallionPic;
    public JPanel shadowSongPanel;          private JLabel shadowSongPic;
    public JPanel shadowHeartContainerPanel;private JLabel shadowHeartContainerPic;
    public JPanel shadowKeyPanel;           private JLabel shadowKeyPic;             public JLabel shadowKeyLabel;
    public JPanel shadowBossKeyPanel;       private JLabel shadowBosKeyPic;
    public JPanel shadowMapPanel;           private JLabel shadowMapPic;
    public JPanel shadowCompassPanel;       private JLabel shadowCompassPic;

    // Spirit temple
    public JPanel spiritMedallionPanel;     private JLabel spiritMedallionPic;
    public JPanel spiritSongPanel;          private JLabel spiritSongPic;
    public JPanel spiritHeartContainerPanel;private JLabel spiritHeartContainerPic;
    public JPanel spiritKeyPanel;           private JLabel spiritKeyPic;          public JLabel spiritKeyLabel;
    public JPanel spiritBossKeyPanel;       private JLabel spiritBossKeyPic;
    public JPanel spiritMapPanel;           private JLabel spiritMapPic;
    public JPanel spiritCompassPanel;       private JLabel spiritCompassPic;

    // light Items
    public JPanel lightMedallionPanel;      private JLabel lightMedallionPic;
    public JPanel lightSongPanel;           private JLabel lightSongPic;

    // spiritual stones
    public JPanel kokiriStonePanel;         private JLabel kokiriStonePic;
    public JPanel goronStonePanel;          private JLabel goronStonePic;
    public JPanel zoraStonePanel;           private JLabel zoraStonePic;

    // gerudo training complex
    public JPanel gerudoTokenPanel;         private JLabel gerudoKeyPic;
    public JPanel gerudoKeyPanel;           private JLabel gerudoTokenPic;       public JLabel gerudoKeyLabel;

    // misc. songs
    public JPanel zeldaSongPanel;           private JLabel zeldaSongPic;
    public JPanel eponaSongPanel;           private JLabel eponaSongPic;
    public JPanel sariaSongPanel;           private JLabel sariaSongPic;
    public JPanel sunSongPanel;             private JLabel sunSongPic;
    public JPanel songOfTimePanel;          private JLabel songOfTimePic;
    public JPanel songOfStormsPanel;        private JLabel songOfStormPic;

// Grotto map
    public JLabel grottoMapPic;

    private JScrollPane grottoScrollPanel;
    private JPanel grottoPanel;

    private JLabel grottoHeadline01;
    private JLabel grotto001Label;               public JCheckBox grotto001Check;
    private JLabel grotto002Label;               public JCheckBox grotto002Check;

    private JLabel grottoHeadline02;
    private JLabel grotto003Label;               public JCheckBox grotto003Check;
    private JLabel grotto004Label;               public JCheckBox grotto004Check;

    private JLabel grottoHeadline03;
    private JLabel grotto005Label;               public JCheckBox grotto005Check;

    private JLabel grottoHeadline04;
    private JLabel grotto006Label;               public JCheckBox grotto006Check;
    private JLabel grotto007Label;               public JCheckBox grotto007Check;

    private JLabel grottoHeadline05;
    private JLabel grotto008Label;               public JCheckBox grotto008Check;

    private JLabel grottoHeadline06;
    private JLabel grotto009Label;               public JCheckBox grotto009Check;

    private JLabel grottoHeadline07;
    private JLabel grotto010Label;               public JCheckBox grotto010Check;

    private JLabel grottoHeadline08;
    private JLabel grotto011Label;               public JCheckBox grotto011Check;
    private JLabel grotto012Label;               public JCheckBox grotto012Check;
    private JLabel grotto013Label;               public JCheckBox grotto013Check;
    private JLabel grotto014Label;               public JCheckBox grotto014Check;
    private JLabel grotto015Label;               public JCheckBox grotto015Check;
    private JLabel grotto016Label;               public JCheckBox grotto016Check;
    private JLabel grotto017Label;               public JCheckBox grotto017Check;

    private JLabel grottoHeadline09;
    private JLabel grotto018Label;               public JCheckBox grotto018Check;
    private JLabel grotto019Label;               public JCheckBox grotto019Check;
    private JLabel grotto020Label;               public JCheckBox grotto020Check;

    private JLabel grottoHeadline10;
    private JLabel grotto021Label;               public JCheckBox grotto021Check;

    private JLabel grottoHeadline11;
    private JLabel grotto022Label;               public JCheckBox grotto022Check;

    private JLabel grottoHeadline12;
    private JLabel grotto023Label;               public JCheckBox grotto023Check;

    private JLabel grottoHeadline13;
    private JLabel grotto024Label;               public JCheckBox grotto024Check;
    private JLabel grotto025Label;               public JCheckBox grotto025Check;
    private JLabel grotto026Label;               public JCheckBox grotto26Check;

    private JLabel grottoHeadline14;
    private JLabel grotto27Panel;                public JCheckBox grotto27Check;
    private JLabel grotto028Panel;               public JCheckBox grotto028Check;
    private JLabel grotto029Label;               public JCheckBox grotto029Check;

    private JLabel grottoHeadline15;
    private JLabel grotto030Label;               public JCheckBox grotto030Check;
    private JLabel grotto031Label;               public JCheckBox grotto031Check;
    private JLabel grotto032Label;               public JCheckBox grotto032Check;

    private JLabel grottoHeadline16;
    private JLabel grotto033Label;               public JCheckBox grotto033Check;

// Collectibles
    public JPanel heartSkulltullaTriforceContainer;

    // Heartpieces
    public JPanel heartPieceContainer;
    public JProgressBar heartPieceProgressBar;
    public JButton heartPieceAddBtn;       public JButton heartPieceSubtractBtn;

    // Skulltulla
    public JPanel skulltullaContainer;
    public JProgressBar skultullaProgressbar;
    public JButton skultullaAddBtn;             public JButton skulltullaSubtractBtn;

    // triforce hunt
    public JPanel triforceHuntContainer;
    public  JTextField triforceInput;
    public JPanel triforcePanel;                public JLabel triforcePic;
    public JProgressBar triforceProgressbar;
    public JButton triforceAddBtn;              public JButton triforceSubstractBtn;
    public JButton triforceAddtriforceBtn;

    // Biggoron trading sequence
    public JPanel giantKnifePanel;              private JLabel giantKnifePic;
    public JPanel pocketEggPanel;               private JLabel poketEggPic;
    public JPanel pocketCuccoPanel;             private JLabel pocketCuccoPic;
    public JPanel cojiroPanel;                  private JLabel cojiroPic;
    public JPanel oddMushroomPanel;             private JLabel oddMushroomPic;
    public JPanel oddPoulticePanel;             private JLabel oddPoulticePic;
    public JPanel sawPanel;                     private JLabel sawPic;
    public JPanel brknGoronSwordPanel;          private JLabel brknGoronSwordPic;
    public JPanel prescriptionPanel;            private JLabel prescriptionPic;
    public JPanel frogPanel;                    private JLabel frogPic;
    public JPanel eyeDropsPanel;                private JLabel eyeDropsPic;
    public JPanel claimCheckPanel;              private JLabel claimCheckPic;
    public JPanel secondBigGoronSwordPanel;     private JLabel secondBigGoronSwordPic;

    public JPanel keatonMaskPanel;              private JLabel keatonMaskPic;
    public JPanel skullMaskPanel;               private JLabel skullMaskPic;
    public JPanel spookyMaskPanel;              private JLabel spookyMaskPic;
    public JPanel bunnyHoodPanel;               private JLabel bunnyHoodPic;
    public JPanel gerudoMaskPanel;              private JLabel gerudoMaskPic;
    public JPanel goronMaskPanel;               private JLabel goronMaskPic;
    public JPanel zoraMaskPanel;                private JLabel zoraMaskPic;
    public JPanel maskOfTruthPanel;             private JLabel maskOfTruthPic;

    private JPanel empty3_13_1;
    private JPanel empty3_15_1;
    private JPanel empty3_17_1;
    private JPanel empty3_12_2;
    private JPanel empty3_11_2;
    private JPanel empty3_10_2;
    private JPanel empty3_9_2;
    private JPanel empty3_14_2;
    private JPanel empty3_15_2;
    private JPanel empty3_16_2;
    private JPanel empty3_17_2;
    private JPanel empty1_1_2;
    private JPanel empty1_12_2;
    private JPanel empty1_16_2;
    private JPanel empty1_16_3;
    private JPanel empty1_1_3;
    private JPanel empty1_2_3;
    private JPanel empty1_8_5;
    private JPanel empty1_12_1;
    private JPanel heartPieceSpacer;
    private JPanel skulltullaSpacer;
    private JPanel triforceSpacer;
    private JPanel heartPiecePanel;
    private JLabel heartPiecePic;
    public JLabel heartPieceOutputLabel;
    private JPanel skultullaPanel;
    private JLabel skulltullaPic;
    public JLabel skulltullaOutputLabel;
    public JLabel triforceOutputLabel;


    public GUI() {

    }

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
