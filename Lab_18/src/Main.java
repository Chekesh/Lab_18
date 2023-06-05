public class Main {
    public static void main(String[] args) {
        Trousers maka = new Trousers(ClothingSize.L, 3000, "red");
        Skirt skirt = new Skirt(ClothingSize.XS, 2000, "yelow");
        Tie tie = new Tie(ClothingSize.M, 6000, "blue");
        Tshirt shirt = new Tshirt(ClothingSize.XXS, 5000, "blak");
        Cloth[] sp = new Cloth[]{maka, skirt, tie, shirt};
        Atele.DressMans(sp);
        Atele.DressWomens(sp);
    }
}
