public class Tie extends Cloth implements MenIsClothing{
    Tie(ClothingSize clothingSize,int cost,String color){
        super(clothingSize,cost,color);
    }
    @Override
    public void DressMan(){
        System.out.println("Мужчина одел галстук: "+ clothingSize + " " + clothingSize.getRasm() + " " + clothingSize.getDescription()+" "+ cost+" "+color);
    }
}
