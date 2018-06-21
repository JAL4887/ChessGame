public abstract class Tile
{
    int tileLocation;

    Tile( int tileLocation)
    {
        this.tileLocation = tileLocation; // the tile position is passed
    }

    public abstract boolean isOccupied(); // abstract - not defined here, defined in subclass

    public abstract Piece getpiece();

    public static final class EmptyFile extends Tile
    {
        EmptyFile(int coordinate )
        {
            super(coordinate);
        }

        @Override
        public boolean isOccupied()
        {
            return false;               // by definition the tile is empty
        }

        @Override
        public Piece getpiece()
        {
            return null;                // return null by definition
        }
    }

    public static final class OccupiedTile extends Tile
    {
        Piece pieceOnTile;

        OccupiedTile(int location, Piece pieceOnTile)
        {
            super(location);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isOccupied()
        {
            return true;
        }

        @Override
        public Piece getpiece()
        {
            return this.pieceOnTile;
        }
    }

}
