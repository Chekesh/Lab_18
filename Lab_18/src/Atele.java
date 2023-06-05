public class Atele{

    static public void DressMans(Cloth[] mas){
        for(Cloth i:mas){
            if(i instanceof MenIsClothing){
                ((MenIsClothing) i).DressMan();
            }
        }
    }
    static public void DressWomens(Cloth[] mas){
        for(Cloth i:mas){
            if(i instanceof WomenIsClothing){
                ((WomenIsClothing) i).DressWomen();
            }
        }
    }
}
