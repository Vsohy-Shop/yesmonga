package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.z */
public class C21655z implements C21624k0<PointF> {

    /* renamed from: a */
    public static final C21655z f56051a = new C21655z();

    /* renamed from: b */
    public PointF mo64542a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token o = jsonReader.mo64562o();
        if (o == JsonReader.Token.BEGIN_ARRAY) {
            return C21643p.m99689e(jsonReader, f);
        }
        if (o == JsonReader.Token.BEGIN_OBJECT) {
            return C21643p.m99689e(jsonReader, f);
        }
        if (o == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo64558j()) * f, ((float) jsonReader.mo64558j()) * f);
            while (jsonReader.mo64555g()) {
                jsonReader.mo64566s();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + o);
    }
}
