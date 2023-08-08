package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21550h;
import com.airbnb.lottie.model.content.C21571k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.h0 */
public class C21618h0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55926a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "ind", "ks", "hd");

    /* renamed from: a */
    public static C21571k m99596a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str = null;
        int i = 0;
        boolean z = false;
        C21550h hVar = null;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55926a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                i = jsonReader.mo64559k();
            } else if (q == 2) {
                hVar = C21609d.m99583k(jsonReader, gVar);
            } else if (q != 3) {
                jsonReader.mo64566s();
            } else {
                z = jsonReader.mo64557i();
            }
        }
        return new C21571k(str, i, hVar, z);
    }
}
