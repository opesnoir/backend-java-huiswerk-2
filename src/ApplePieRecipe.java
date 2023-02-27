public class ApplePieRecipe {

    //variabelen
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient sugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient bakingSoda = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient(1.5, "stuks", "zoetzure appels");
    Ingredient cristalSugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "eetlepels", "kaneel");
    Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

    //methoden
    public void printIngredients(){
        System.out.println("Doorloop de volgende stappen een voor een:");
        System.out.println("Ingredienten nodig voor dit recept: ");
        // Hier roepen we steeds de getAmount(), getAmountTwo(), getUnit() en getName() methode van Ingredients aan,
        // maar elke keer voor een andere instantiatie van Ingredients die met andere waardes in de constructor zijn aangeroepen
        // en dus krijgen we elke keer een ander resultaat.
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(bakingSoda.getAmount() + " " + bakingSoda.getUnit() + " " + bakingSoda.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmountTwo() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }


    public void printRecipe(){
        System.out.println("Doorloop de volgende stappen een voor een:");
        // We roepen hier telkens een andere methode aan. Elke methode print op zijn beurt een string uit.
        preHeatOven();
        divideEgg();
        mixDoug();
        cleanApples();
        greaceForm();
        clotheForm();
        fillForm();
        makingRibbons();
        placingRibbons();
        bakePie();
    }

    public void preHeatOven(){
        System.out.println("Verwarm de oven van te voren op 170 °C (boven en onderwarmte).");
    }

    public void divideEgg() {
        System.out.println( "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixDoug() {
        System.out.println("Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel in 3 gelijke delen.");
    }

    public void cleanApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker met het kaneel.");
    }

    public void greaceForm() {
        System.out.println("Vet de springvorm in en bestuif het met bloem.");
    }

    public void clotheForm() {
        System.out.println("Gebruik één deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om je randen te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void fillForm() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen.");
    }

    public void makingRibbons(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1cm breed.");
    }

    public void placingRibbons(){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het halve ei om de stroken in te smeren.");
    }

    public void bakePie(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 °C (boven en onderwarmte) gaar en goudbruin.");
    }


}


   /*   minimaal voor elk ingredient dat hierboven genoemd is een object geinstanieerd in ApplePieRecipe
        minimaal voor elke stap die hierboven genoemd word een methode die de tekst via een System.out.println() uitprint
        minimaal 1 object van het type ApplePieRecipe om de tekst uit te kunnen printen in de Main klasse*/