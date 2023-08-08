package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21703k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.d0 */
public class C21610d0 implements C21624k0<C21703k> {

    /* renamed from: a */
    public static final C21610d0 f55916a = new C21610d0();

    /* renamed from: b */
    public C21703k mo64542a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo64551b();
        }
        float j = (float) jsonReader.mo64558j();
        float j2 = (float) jsonReader.mo64558j();
        while (jsonReader.mo64555g()) {
            jsonReader.mo64566s();
        }
        if (z) {
            jsonReader.mo64553d();
        }
        return new C21703k((j / 100.0f) * f, (j2 / 100.0f) * f);
    }
}
