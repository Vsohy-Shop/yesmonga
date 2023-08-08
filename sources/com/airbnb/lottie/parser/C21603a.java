package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21547e;
import com.airbnb.lottie.model.animatable.C21551i;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21693a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.a */
public class C21603a {

    /* renamed from: a */
    public static final JsonReader.C21628a f55908a = JsonReader.C21628a.m99628a("k", "x", "y");

    /* renamed from: a */
    public static C21547e m99559a(JsonReader jsonReader, C21495g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo64551b();
            while (jsonReader.mo64555g()) {
                arrayList.add(C21653x.m99714a(jsonReader, gVar));
            }
            jsonReader.mo64553d();
            C21646r.m99701b(arrayList);
        } else {
            arrayList.add(new C21693a(C21643p.m99689e(jsonReader, C21686j.m99804e())));
        }
        return new C21547e(arrayList);
    }

    /* renamed from: b */
    public static C21555m<PointF, PointF> m99560b(JsonReader jsonReader, C21495g gVar) throws IOException {
        jsonReader.mo64552c();
        C21547e eVar = null;
        C21544b bVar = null;
        boolean z = false;
        C21544b bVar2 = null;
        while (jsonReader.mo64562o() != JsonReader.Token.END_OBJECT) {
            int q = jsonReader.mo64564q(f55908a);
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        jsonReader.mo64565r();
                        jsonReader.mo64566s();
                    } else if (jsonReader.mo64562o() == JsonReader.Token.STRING) {
                        jsonReader.mo64566s();
                    } else {
                        bVar = C21609d.m99577e(jsonReader, gVar);
                    }
                } else if (jsonReader.mo64562o() == JsonReader.Token.STRING) {
                    jsonReader.mo64566s();
                } else {
                    bVar2 = C21609d.m99577e(jsonReader, gVar);
                }
                z = true;
            } else {
                eVar = m99559a(jsonReader, gVar);
            }
        }
        jsonReader.mo64554f();
        if (z) {
            gVar.mo64118a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C21551i(bVar2, bVar);
    }
}
