//�������Ĺ�����
//���û��Ĭ�ϵĻ��๹���� ���������һ���������Ļ��๹���� �ͱ���
//��super��ʽ���û��๹����
import static utils.Print.*;

class Game {
	Game(int i) {
		printLn("Game ������");
	}
}

class BoardGame extends Game {
	public BoardGame(int i) {
		// TODO Auto-generated constructor stub
		super(11);
		printLn("BoardGame ������");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super(11);
		printLn("Chess ������");
	}
	public static void main (String[] args) {
		Chess x=new Chess();
	}

}
