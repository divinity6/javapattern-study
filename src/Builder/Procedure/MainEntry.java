package Builder.Procedure;

import Builder.Procedure.impl.*;
import Builder.Procedure.types.Builder;

public class MainEntry {

    public static void main( String[] args ){
        Data data = new Data( "Jane" , 25 );

        /** PlainText */
        Builder builder = new PlainTextBuilder( data );
        Director director = new Director( builder );
        String result = director.build();
        System.out.println( result );

        /** JSON */
        builder = new JSONBuilder( data );
        director = new Director( builder );
        result = director.build();
        System.out.println( result );

        /** XML */
        builder = new XMLBuilder( data );
        director = new Director( builder );
        result = director.build();
        System.out.println( result );
    }
}
