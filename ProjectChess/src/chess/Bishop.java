package chess;

public class Bishop extends Unit {
	
	public Bishop (String code, String color, UnitLocationPoint unitLocationPoint) {
		super.unitCode = code;
		super.unitColor = color;
		super.unitLocationPoint = unitLocationPoint;
	}

	@Override
	public boolean checkMove(int y, int x) {
		// TODO Auto-generated method stub
		return false;
	}
}