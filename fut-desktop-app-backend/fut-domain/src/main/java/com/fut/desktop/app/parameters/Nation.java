package com.fut.desktop.app.parameters;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@JsonFormat
@SuppressWarnings("WeakerAccess")
public class Nation extends SearchParameterBase<Long> {

    public final static long Albania = 1;
    public final static long Algeria = 97;
    public final static long Angola = 98;
    public final static long AntiguaBarbuda = 63;
    public final static long Argentina = 52;
    public final static long Armenia = 3;
    public final static long Australia = 195;
    public final static long Austria = 4;
    public final static long Azerbaijan = 5;
    public final static long Bahrain = 150;
    public final static long Barbados = 66;
    public final static long Belarus = 6;
    public final static long Belgium = 7;
    public final static long Benin = 99;
    public final static long Bermuda = 68;
    public final static long Bolivia = 53;
    public final static long BosniaHerzegovina = 8;
    public final static long Brazil = 54;
    public final static long Bulgaria = 9;
    public final static long BurkinaFaso = 101;
    public final static long Burundi = 102;
    public final static long Cambodia = 154;
    public final static long Cameroon = 103;
    public final static long Canada = 70;
    public final static long CapeVerdeIslands = 104;
    public final static long CentralAfricanRep = 105;
    public final static long Chile = 55;
    public final static long ChinaPr = 155;
    public final static long Colombia = 56;
    public final static long Comoros = 214;
    public final static long Congo = 107;
    public final static long CostaRica = 72;
    public final static long Croatia = 10;
    public final static long Cuba = 73;
    public final static long Curacao = 85;
    public final static long Cyprus = 11;
    public final static long CzechRepublic = 12;
    public final static long Denmark = 13;
    public final static long DrCongo = 110;
    public final static long Ecuador = 57;
    public final static long Egypt = 111;
    public final static long ElSalvador = 76;
    public final static long England = 14;
    public final static long Estonia = 208;
    public final static long EquatorialGuinea = 112;
    public final static long FaroeIslands = 16;
    public final static long Fiji = 197;
    public final static long Finland = 17;
    public final static long France = 18;
    public final static long FrenchGuiana = 79;
    public final static long FyrMacedonia = 19;
    public final static long Gabon = 115;
    public final static long Gambia = 116;
    public final static long Georgia = 20;
    public final static long Germany = 21;
    public final static long Ghana = 117;
    public final static long Greece = 22;
    public final static long Grenada = 77;
    public final static long Guam = 157;
    public final static long Guatemala = 78;
    public final static long Guinea = 118;
    public final static long GuineaBissau = 119;
    public final static long Haiti = 80;
    public final static long Honduras = 81;
    public final static long Hungary = 23;
    public final static long Iceland = 24;
    public final static long Iran = 161;
    public final static long Iraq = 162;
    public final static long Israel = 26;
    public final static long Italy = 27;
    public final static long IvoryCoast = 108;
    public final static long Jamaica = 82;
    public final static long Japan = 163;
    public final static long Jordan = 164;
    public final static long Kazakhstan = 165;
    public final static long Kenya = 120;
    public final static long KoreaDpr = 166;
    public final static long KoreaRepublic = 167;
    public final static long Kosovo = 219;
    public final static long Kuwait = 168;
    public final static long Latvia = 28;
    public final static long Lebanon = 171;
    public final static long Liberia = 122;
    public final static long Libya = 123;
    public final static long Liechtenstein = 29;
    public final static long Lithuania = 30;
    public final static long Luxembourg = 31;
    public final static long Madagascar = 124;
    public final static long Mali = 126;
    public final static long Malta = 32;
    public final static long Mauritania = 127;
    public final static long Mexico = 83;
    public final static long Moldova = 33;
    public final static long Montenegro = 15;
    public final static long Morocco = 129;
    public final static long Mozambique = 130;
    public final static long Netherlands = 34;
    public final static long NewCaledonia = 215;
    public final static long NewZealand = 198;
    public final static long Niger = 132;
    public final static long Nigeria = 133;
    public final static long NorthernIreland = 35;
    public final static long Norway = 36;
    public final static long Oman = 178;
    public final static long Palestine = 180;
    public final static long Panama = 87;
    public final static long Paraguay = 58;
    public final static long Peru = 59;
    public final static long Philippines = 181;
    public final static long Poland = 37;
    public final static long Portugal = 38;
    public final static long PuertoRico = 88;
    public final static long RepublicOfIreland = 25;
    public final static long Romania = 39;
    public final static long Russia = 40;
    public final static long SaudiArabia = 183;
    public final static long Scotland = 42;
    public final static long Senegal = 136;
    public final static long Serbia = 51;
    public final static long SierraLeone = 138;
    public final static long Slovakia = 43;
    public final static long Slovenia = 44;
    public final static long SouthAfrica = 140;
    public final static long Spain = 45;
    public final static long StKitts = 89;
    public final static long StLucia = 90;
    public final static long Suriname = 92;
    public final static long Sweden = 46;
    public final static long Switzerland = 47;
    public final static long Syria = 186;
    public final static long Thailand = 188;
    public final static long Togo = 144;
    public final static long TrinidadAndTobago = 93;
    public final static long Tunisia = 145;
    public final static long Turkey = 48;
    public final static long Turkmenistan = 189;
    public final static long Uganda = 146;
    public final static long Ukraine = 49;
    public final static long UnitedStates = 95;
    public final static long Uruguay = 60;
    public final static long Uzbekistan = 191;
    public final static long Venezuela = 61;
    public final static long Wales = 50;
    public final static long Zambia = 147;
    public final static long Zimbabwe = 148;

    public Nation(String description, long value) {
        this.description = description;
        this.value = value;
    }

    public static Collection<Nation> getAll() {
        Collection<Nation> nations = new ArrayList<>();

        nations.add(new Nation("Albania", Albania));
        nations.add(new Nation("Algeria", Algeria));
        nations.add(new Nation("Angola", Angola));
        nations.add(new Nation("Antigua and Barbuda", AntiguaBarbuda));
        nations.add(new Nation("Argentina", Argentina));
        nations.add(new Nation("Armenia", Armenia));
        nations.add(new Nation("Australia", Australia));
        nations.add(new Nation("Austria", Austria));
        nations.add(new Nation("Azerbaijan", Azerbaijan));
        nations.add(new Nation("Bahrain", Bahrain));
        nations.add(new Nation("Barbados", Barbados));
        nations.add(new Nation("Belarus", Belarus));
        nations.add(new Nation("Belgium", Belgium));
        nations.add(new Nation("Benin", Benin));
        nations.add(new Nation("Bermuda", Bermuda));
        nations.add(new Nation("Bolivia", Bolivia));
        nations.add(new Nation("Bosnia Herzegovina", BosniaHerzegovina));
        nations.add(new Nation("Brazil", Brazil));
        nations.add(new Nation("Bulgaria", Bulgaria));
        nations.add(new Nation("Burkina Faso", BurkinaFaso));
        nations.add(new Nation("Burundi", Burundi));
        nations.add(new Nation("Cambodia", Cambodia));
        nations.add(new Nation("Cameroon", Cameroon));
        nations.add(new Nation("Canada", Canada));
        nations.add(new Nation("Cape Verde Islands", CapeVerdeIslands));
        nations.add(new Nation("Central African Republic", CentralAfricanRep));
        nations.add(new Nation("Chile", Chile));
        nations.add(new Nation("China PR", ChinaPr));
        nations.add(new Nation("Colombia", Colombia));
        nations.add(new Nation("Comoros", Comoros));
        nations.add(new Nation("Congo", Congo));
        nations.add(new Nation("Costa Rica", CostaRica));
        nations.add(new Nation("Croatia", Croatia));
        nations.add(new Nation("Cuba", Cuba));
        nations.add(new Nation("Curacao", Curacao));
        nations.add(new Nation("Cyprus", Cyprus));
        nations.add(new Nation("Czech Republic", CzechRepublic));
        nations.add(new Nation("Denmark", Denmark));
        nations.add(new Nation("DR Congo", DrCongo));
        nations.add(new Nation("Ecuador", Ecuador));
        nations.add(new Nation("Egypt", Egypt));
        nations.add(new Nation("El Salvador", ElSalvador));
        nations.add(new Nation("England", England));
        nations.add(new Nation("Estonia", Estonia));
        nations.add(new Nation("Equatorial Guinea", EquatorialGuinea));
        nations.add(new Nation("Faroe Islands", FaroeIslands));
        nations.add(new Nation("Fiji", Fiji));
        nations.add(new Nation("Finland", Finland));
        nations.add(new Nation("France", France));
        nations.add(new Nation("French Guiana", FrenchGuiana));
        nations.add(new Nation("FYR Macedonia", FyrMacedonia));
        nations.add(new Nation("Gabon", Gabon));
        nations.add(new Nation("Gambia", Gambia));
        nations.add(new Nation("Georgia", Georgia));
        nations.add(new Nation("Germany", Germany));
        nations.add(new Nation("Ghana", Ghana));
        nations.add(new Nation("Greece", Greece));
        nations.add(new Nation("Grenada", Grenada));
        nations.add(new Nation("Guam", Guam));
        nations.add(new Nation("Guatemala", Guatemala));
        nations.add(new Nation("Guinea", Guinea));
        nations.add(new Nation("Guinea Bissau", GuineaBissau));
        nations.add(new Nation("Haiti", Haiti));
        nations.add(new Nation("Honduras", Honduras));
        nations.add(new Nation("Hungary", Hungary));
        nations.add(new Nation("Iceland", Iceland));
        nations.add(new Nation("Iran", Iran));
        nations.add(new Nation("Iraq", Iraq));
        nations.add(new Nation("Israel", Israel));
        nations.add(new Nation("Italy", Italy));
        nations.add(new Nation("Ivory Coast", IvoryCoast));
        nations.add(new Nation("Jamaica", Jamaica));
        nations.add(new Nation("Japan", Japan));
        nations.add(new Nation("Jordan", Jordan));
        nations.add(new Nation("Kazakhstan", Kazakhstan));
        nations.add(new Nation("Kenya", Kenya));
        nations.add(new Nation("Korea DPR", KoreaDpr));
        nations.add(new Nation("Korea Republic", KoreaRepublic));
        nations.add(new Nation("Kosovo", Kosovo));
        nations.add(new Nation("Kuwait", Kuwait));
        nations.add(new Nation("Latvia", Latvia));
        nations.add(new Nation("Lebanon", Lebanon));
        nations.add(new Nation("Liberia", Liberia));
        nations.add(new Nation("Libya", Libya));
        nations.add(new Nation("Liechtenstein", Liechtenstein));
        nations.add(new Nation("Lithuania", Lithuania));
        nations.add(new Nation("Luxembourg", Luxembourg));
        nations.add(new Nation("Madagascar", Madagascar));
        nations.add(new Nation("Mali", Mali));
        nations.add(new Nation("Malta", Malta));
        nations.add(new Nation("Mauritania", Mauritania));
        nations.add(new Nation("Mexico", Mexico));
        nations.add(new Nation("Moldova", Moldova));
        nations.add(new Nation("Montenegro", Montenegro));
        nations.add(new Nation("Morocco", Morocco));
        nations.add(new Nation("Mozambique", Mozambique));
        nations.add(new Nation("Netherlands", Netherlands));
        nations.add(new Nation("New Caledonia", NewCaledonia));
        nations.add(new Nation("New Zealand", NewZealand));
        nations.add(new Nation("Niger", Niger));
        nations.add(new Nation("Nigeria", Nigeria));
        nations.add(new Nation("Northern Ireland", NorthernIreland));
        nations.add(new Nation("Norway", Norway));
        nations.add(new Nation("Oman", Oman));
        nations.add(new Nation("Palestine", Palestine));
        nations.add(new Nation("Panama", Panama));
        nations.add(new Nation("Paraguay", Paraguay));
        nations.add(new Nation("Peru", Peru));
        nations.add(new Nation("Philippines", Philippines));
        nations.add(new Nation("Poland", Poland));
        nations.add(new Nation("Portugal", Portugal));
        nations.add(new Nation("Puerto Rico", PuertoRico));
        nations.add(new Nation("Republic of Ireland", RepublicOfIreland));
        nations.add(new Nation("Romania", Romania));
        nations.add(new Nation("Russia", Russia));
        nations.add(new Nation("Saudi Arabia", SaudiArabia));
        nations.add(new Nation("Scotland", Scotland));
        nations.add(new Nation("Senegal", Senegal));
        nations.add(new Nation("Serbia", Serbia));
        nations.add(new Nation("Sierra Leone", SierraLeone));
        nations.add(new Nation("Slovakia", Slovakia));
        nations.add(new Nation("Slovenia", Slovenia));
        nations.add(new Nation("South Africa", SouthAfrica));
        nations.add(new Nation("Spain", Spain));
        nations.add(new Nation("St Kitts and Nevis", StKitts));
        nations.add(new Nation("St Lucia", StLucia));
        nations.add(new Nation("Suriname", Suriname));
        nations.add(new Nation("Sweden", Sweden));
        nations.add(new Nation("Switzerland", Switzerland));
        nations.add(new Nation("Syria", Syria));
        nations.add(new Nation("Thailand", Thailand));
        nations.add(new Nation("Togo", Togo));
        nations.add(new Nation("Trinidad & Tobago", TrinidadAndTobago));
        nations.add(new Nation("Tunisia", Tunisia));
        nations.add(new Nation("Turkey", Turkey));
        nations.add(new Nation("Turkmenistan", Turkmenistan));
        nations.add(new Nation("Uganda", Uganda));
        nations.add(new Nation("Ukraine", Ukraine));
        nations.add(new Nation("United States", UnitedStates));
        nations.add(new Nation("Uruguay", Uruguay));
        nations.add(new Nation("Uzbekistan", Uzbekistan));
        nations.add(new Nation("Venezuela", Venezuela));
        nations.add(new Nation("Wales", Wales));
        nations.add(new Nation("Zambia", Zambia));
        nations.add(new Nation("Zimbabwe", Zimbabwe));

        return nations;
    }

    /**
     * Get a random nation
     *
     * @return Random Nation value
     */
    public static int getRandom() {
        Random random = new Random();
        List<Nation> nations = new ArrayList<>(getAll());
        int i = random.nextInt(nations.size());
        return Math.toIntExact(nations.get(i).getValue());
    }
}
