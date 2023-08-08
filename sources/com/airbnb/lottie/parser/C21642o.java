package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.o */
public class C21642o implements C21624k0<Integer> {

    /* renamed from: a */
    public static final C21642o f56031a = new C21642o();

    /* renamed from: b */
    public Integer mo64542a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C21643p.m99691g(jsonReader) * f));
    }
}
