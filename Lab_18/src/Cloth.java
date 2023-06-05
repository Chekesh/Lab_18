public abstract class Cloth{
    ClothingSize clothingSize;
    int cost;
    String color;
    Cloth(ClothingSize clothingSize,int cost,String color){
        this.clothingSize=clothingSize;
        this.cost=cost;
        this.color=color;
    }
}
