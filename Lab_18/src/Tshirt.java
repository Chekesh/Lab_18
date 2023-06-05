public class Tshirt extends Cloth implements MenIsClothing, WomenIsClothing {
    Tshirt(ClothingSize clothingSize,int cost,String color){
        super(clothingSize,cost,color);
    }
    @Override
    public void DressMan(){
        System.out.println("Мужчина одел футболку: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
    @Override
    public void DressWomen(){
        System.out.println("Женщина одела футболку: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
}
