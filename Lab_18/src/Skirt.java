public class Skirt extends Cloth implements WomenIsClothing{
    Skirt(ClothingSize clothingSize,int cost,String color){
        super(clothingSize,cost,color);
    }
    @Override
    public void DressWomen(){
        System.out.println("Женщина одела юбку: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
}
