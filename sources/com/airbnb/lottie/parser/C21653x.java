package com.airbnb.lottie.parser;

import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.animation.keyframe.C21479h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21686j;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.x */
public class C21653x {
    /* renamed from: a */
    public static C21479h m99714a(JsonReader jsonReader, C21495g gVar) throws IOException {
        boolean z;
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new C21479h(gVar, C21645q.m99694c(jsonReader, gVar, C21686j.m99804e(), C21654y.f56050a, z, false));
    }
}
