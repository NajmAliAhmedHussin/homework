public class Teste {


        public static void main (String[] args)
        {
            Counter tally= new Counter();

            tally.setLimit(500);

            tally.click();
            tally.click();
            tally.click();
            tally.click();
            tally.click();
            tally.click();

            System.out.println("Tally: " + tally.getValue());

            tally.undo();
            tally.undo();
            tally.undo();
            tally.undo();
            tally.undo();
            tally.undo();
            tally.undo();
            tally.undo();

            System.out.println("Tally: " + tally.getValue());

            Counter counter = new Counter();
            counter.setLimit(15);


            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();
            counter.click();

            System.out.println("Counter: " + counter.getValue());
        }


    }


