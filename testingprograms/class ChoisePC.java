public class Computer extends Rpps {

    String thePC;

    int pcValue;
    public String getChoisePC(String choisePC) {
        Random generator = new Random();

        System.out.println("thePC plays: " + thePC);
        pcValue = generator.nextInt(4);

        switch (pcValue) {
            case 0: {
                thePC = "Paper";
                break;
            }

            case 1: {
                thePC = "Pencil";
                break;
            }

            case 2: {
                thePC = "Rock";
                break;
            }

            case 3: {
                thePC = "Scissors";
                break;
            }

            default: {
                thePC = "Never occurs";
            }
        }
        return choisePC;
    }
}