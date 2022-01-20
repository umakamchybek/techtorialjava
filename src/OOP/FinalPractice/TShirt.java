package OOP.FinalPractice;

public final class TShirt extends Shirt{

//    public void wash(){ >>>> you cannot override final method**************
//        System.out.println(" You can wash this Tshirt");
//
//    }
//

    @Override
    public boolean fit(char size) {
        return true;
    }
}
