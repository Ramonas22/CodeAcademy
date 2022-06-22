package codeAcademy.vytautas.abstractClass.figure;

abstract class SpatialFigure extends Figure{

    Double volume;

    public SpatialFigure(String name) {
        super(name);
    }
    abstract Double calculateVolume();
}
