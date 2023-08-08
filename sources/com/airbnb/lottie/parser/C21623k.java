package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.C21558b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.k */
public class C21623k {

    /* renamed from: a */
    public static final JsonReader.C21628a f55933a = JsonReader.C21628a.m99628a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    public static C21558b m99602a(JsonReader jsonReader) throws IOException {
        jsonReader.mo64552c();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55933a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                str3 = jsonReader.mo64561m();
            } else if (q == 2) {
                str2 = jsonReader.mo64561m();
            } else if (q != 3) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                f = (float) jsonReader.mo64558j();
            }
        }
        jsonReader.mo64554f();
        return new C21558b(str, str3, str2, f);
    }
}
