
public class JackOLantern {
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column)
    {
        this.faceFeatures[row][column] = replace;
    }

    public void fill(String str)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.println();
            }
        }
    }

    public String toString()
    {
        String printStr = "";
        for (String[] col : faceFeatures)
        {
            for (String str : col)
            {
                printStr += str;
            }
            printStr += "\n";
        }
        return printStr;
    }
}
