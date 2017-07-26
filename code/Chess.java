//带参数的构造器
//如果没有默认的基类构造器 或者想调用一个带参数的基类构造器 就必须
//用super显式调用基类构造器
import static utils.Print.*;

class Game {
	Game(int i) {
		printLn("Game 构造器");
	}
}

class BoardGame extends Game {
	public BoardGame(int i) {
		// TODO Auto-generated constructor stub
		super(11);
		printLn("BoardGame 构造器");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super(11);
		printLn("Chess 构造器");
	}
	public static void main (String[] args) {
		Chess x=new Chess();
	}

}
