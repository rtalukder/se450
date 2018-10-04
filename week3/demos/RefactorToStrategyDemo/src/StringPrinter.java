class StringPrinter {

    private String printString;

    StringPrinter(String printString){
        this.printString = printString;
    }

    void print(IStringFormatter formatter){
    	String formattedString = formatter.format(printString);
    	System.out.println(formattedString);
    }
}