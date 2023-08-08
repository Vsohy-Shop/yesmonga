package com.airbnb.lottie.parser;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.content.C21561a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.e */
public class C21611e {

    /* renamed from: a */
    public static JsonReader.C21628a f55917a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "p", C34935s.f84988a, "hd", "d");

    /* renamed from: a */
    public static C21561a m99586a(JsonReader jsonReader, C21495g gVar, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        C21555m<PointF, PointF> mVar = null;
        C21548f fVar = null;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55917a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                mVar = C21603a.m99560b(jsonReader, gVar);
            } else if (q == 2) {
                fVar = C21609d.m99581i(jsonReader, gVar);
            } else if (q == 3) {
                z3 = jsonReader.mo64557i();
            } else if (q != 4) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else if (jsonReader.mo64559k() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new C21561a(str, mVar, fVar, z2, z3);
    }
}
