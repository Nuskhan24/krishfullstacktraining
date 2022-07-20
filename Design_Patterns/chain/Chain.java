public class Chain

{

Processor chain;

public Chain(){

buildChain();

}

private void buildChain(){

chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));

}

public void process(Number request) {

chain.process(request);

}

}

abstract class Processor

{

private Processor nextProcessor;

public Processor(Processor nextProcessor){

this.nextProcessor = nextProcessor;

};

public void process(Number request){

if(nextProcessor != null)

nextProcessor.process(request);

};

}

class Number

{

private int number;

public Number(int number)

{

this.number = number;

}

public int getNumber()

{

return number;

}

}




