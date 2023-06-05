public class Trousers extends Cloth implements MenIsClothing, WomenIsClothing{
    Trousers(ClothingSize clothingSize,int cost,String color){
        super(clothingSize,cost,color);
    }
    @Override
    public void DressMan(){
        System.out.println("Мужчина одел штаны: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
    @Override
    public void DressWomen(){
        System.out.println("Женщина одела штаны: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
}
