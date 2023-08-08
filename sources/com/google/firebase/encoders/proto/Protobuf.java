package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.C32998b;

@C32998b
public @interface Protobuf {

    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
