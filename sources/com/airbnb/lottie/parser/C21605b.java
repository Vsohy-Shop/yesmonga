package com.airbnb.lottie.parser;

import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21553k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.b */
public class C21605b {

    /* renamed from: a */
    public static JsonReader.C21628a f55910a = JsonReader.C21628a.m99628a("a");

    /* renamed from: b */
    public static JsonReader.C21628a f55911b = JsonReader.C21628a.m99628a("fc", "sc", "sw", C10108c.f27801d);

    /* renamed from: a */
    public static C21553k m99562a(JsonReader jsonReader, C21495g gVar) throws IOException {
        jsonReader.mo64552c();
        C21553k kVar = null;
        while (jsonReader.mo64555g()) {
            if (jsonReader.mo64564q(f55910a) != 0) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                kVar = m99563b(jsonReader, gVar);
            }
        }
        jsonReader.mo64554f();
        if (kVar == null) {
            return new C21553k((C21543a) null, (C21543a) null, (C21544b) null, (C21544b) null);
        }
        return kVar;
    }

    /* renamed from: b */
    public static C21553k m99563b(JsonReader jsonReader, C21495g gVar) throws IOException {
        jsonReader.mo64552c();
        C21543a aVar = null;
        C21543a aVar2 = null;
        C21544b bVar = null;
        C21544b bVar2 = null;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55911b);
            if (q == 0) {
                aVar = C21609d.m99575c(jsonReader, gVar);
            } else if (q == 1) {
                aVar2 = C21609d.m99575c(jsonReader, gVar);
            } else if (q == 2) {
                bVar = C21609d.m99577e(jsonReader, gVar);
            } else if (q != 3) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                bVar2 = C21609d.m99577e(jsonReader, gVar);
            }
        }
        jsonReader.mo64554f();
        return new C21553k(aVar, aVar2, bVar, bVar2);
    }
}
