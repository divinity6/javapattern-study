package Builder.Parameter.impl;

public class Car {
    private String engine;  // 엔진
    private boolean airbag; // 에어백 여부
    private String  color;  // 차량 색상
    private boolean cameraSensor;   // 카메라센서 유무
    private boolean AEB;    // 자동급제동장치 유무

    public Car( String engine , boolean airbag , String color , boolean cameraSensor , boolean AEB ){
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append( "a CAR SPEC\n" );
        sb.append( "    CameraSensor " + ( this.cameraSensor ? "Y" : "N" ) + "\n" );
        sb.append( "          Engine " + this.engine + "\n" );
        sb.append( "          Airbag " + ( this.airbag ? "Y" : "N" ) + "\n" );
        sb.append( "           Color " + this.color + "\n" );
        sb.append( "             AEB " + ( this.AEB ? "Y" : "N" ) + "\n" );

        return sb.toString();
    }
}
