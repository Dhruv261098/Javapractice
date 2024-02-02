import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInch;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102,51,0);

    public double getHeightFt(){
        return heightFt;
    }

    public double gettrunk(){
        return trunkDiameterInch;
    }
    Tree (double heightFt, double trunkDiameterInch, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInch = trunkDiameterInch;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInch = this.trunkDiameterInch + 1;
    }

    void knowtheHeight(){
        if (this.heightFt > 100){
            System.out.println(this.treeType + "is tall");
        }
    }

    static void announceTree(){
        System.out.println("Hello look at that Tree");
    }


}

