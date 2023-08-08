package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.f */
public class C21613f implements C21624k0<Integer> {

    /* renamed from: a */
    public static final C21613f f55920a = new C21613f();

    /* renamed from: b */
    public Integer mo64542a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        double d;
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo64551b();
        }
        double j = jsonReader.mo64558j();
        double j2 = jsonReader.mo64558j();
        double j3 = jsonReader.mo64558j();
        if (jsonReader.mo64562o() == JsonReader.Token.NUMBER) {
            d = jsonReader.mo64558j();
        } else {
            d = 1.0d;
        }
        if (z) {
            jsonReader.mo64553d();
        }
        if (j <= 1.0d && j2 <= 1.0d && j3 <= 1.0d) {
            j *= 255.0d;
            j2 *= 255.0d;
            j3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) j, (int) j2, (int) j3));
    }
}
