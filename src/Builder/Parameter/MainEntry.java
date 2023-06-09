package Builder.Parameter;

import Builder.Parameter.impl.Car;
import Builder.Parameter.impl.CarBuilder;

import java.util.Random;

public class MainEntry {

    public static void main( String[] args ){
        Car car1 = new Car( "V7" , true , "black" , true , false );

//        Car car2 = new CarBuilder()
//                .setAEB( false )
//                .setAirbag( false )
//                .setCameraSensor( true )
//                .setColor( "white" )
//                .setEngine( "V9" )
//                .build();

        CarBuilder builder = new CarBuilder()       // 이렇게 파라미터를 분할하여 독립적으로 처리할 수 있고
                .setAEB( false )
                .setCameraSensor( true )
                .setColor( "white" )
                .setEngine( "V9" );                 // 객체생성을 최대한 뒤로 늦추기 때문에, 중간에 로직을 추가할 수 있다

        Random random = new Random();
        Car car2 = builder
                .setAirbag( random.nextInt( 2 ) == 0 ) // 50% 확률로 에어백 장착 결정
                .build();

        System.out.println( car1 );
        System.out.println( car2 );

    }
}
