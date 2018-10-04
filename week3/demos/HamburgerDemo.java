public class HamburgerDemo {
	public static void main(String[] args){
		// turkey burger with lettuce, cheddar cheese, red onion, mustard
		// Original, bad code
		Burger burger = new Burger(new TurkeyPatty(), new Lettuce(), null, new CheddarCheese(), null, null, new Mustard());
		
		// Same as above using Builder
		BurgerBuilder builder = new BurgerBuilder();
		builder.setPatty(new TurkeyPatty());
		builder.setLettuce(new Lettuce());
		builder.setCheese(new CheddarCheese());
		builder.setMustard(new Mustard());
				
		burger = builder.toBurger();
		
		// Same as above using Builder with Fluent Interface
		burger = new BurgerBuilder()
					.setPatty(new TurkeyPatty())
					.setLettuce(new Lettuce())
					.setCheese(new CheddarCheese())
					.setMustard(new Mustard())
					.toBurger();
	}
}

class BurgerBuilder {
	private IPatty patty;
    private ILettuce lettuce;
    private ITomato tomato;
    private ICheese cheese;
    private IOnion onion;
    private IPickle pickle;
    private IKetchup ketchup;
    private IMustard mustard;
	private IAoli aoli;
	
	BurgerBuilder setPatty(IPatty patty){
		this.patty = patty;
		return this;
	}
	
	BurgerBuilder setLettuce(ILettuce lettuce){
		this.lettuce = lettuce;
		return this;
	}
	
	BurgerBuilder setTomato(ITomato tomato){
		this.tomato = tomato;
		return this;
	}
	
	BurgerBuilder setCheese(ICheese cheese){
		this.cheese = cheese;
		return this;
	}
	
	BurgerBuilder setOnion(IOnion onion){
		this.onion = onion;
		return this;
	}
	
	BurgerBuilder setPickle(IPickle pickle){
		this.pickle = pickle;
		return this;
	}
	
	BurgerBuilder setKetchup(IKetchup ketchup){
		this.ketchup = ketchup;
		return this;
	}
	
	BurgerBuilder setMustard(IMustard mustard){
		this.mustard = mustard;
		return this;
	}
	
	BurgerBuilder setAoli(IAoli aoli){
		this.aoli = aoli;
		return this;
	}
	
	Burger toBurger(){
		return new Burger(patty, lettuce, tomato, cheese, onion, pickle, ketchup, mustard, aoli);
	}
}

class Burger {
    private final IPatty patty;
    private final ILettuce lettuce;
    private final ITomato tomato;
    private final ICheese cheese;
    private final IOnion onion;
    private final IPickle pickle;
    private final IKetchup ketchup;
    private final IMustard mustard;
	private final IAoli aoli;
    
    public Burger(IPatty patty, ILettuce lettuce, ITomato tomato, ICheese cheese, IOnion onion, IPickle pickle, IKetchup ketchup, IMustard mustard, IAoli aoli) {
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.onion = onion;
        this.pickle = pickle;
        this.ketchup = ketchup;
        this.mustard = mustard;
		this.aoli = aoli;
    }
}


interface IPatty {}
interface ILettuce {}
interface ITomato {}
interface ICheese {}
interface IOnion {}
interface IPickle {}
interface IKetchup {}
interface IMustard {}
