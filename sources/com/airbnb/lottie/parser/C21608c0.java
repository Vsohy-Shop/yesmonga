package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.content.C21567g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.journeyapps.barcodescanner.camera.C34930o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.c0 */
public class C21608c0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55915a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "c", C34930o.f84983b, "tr", "hd");

    /* renamed from: a */
    public static C21567g m99572a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str = null;
        C21544b bVar = null;
        C21544b bVar2 = null;
        C21554l lVar = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55915a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                bVar = C21609d.m99578f(jsonReader, gVar, false);
            } else if (q == 2) {
                bVar2 = C21609d.m99578f(jsonReader, gVar, false);
            } else if (q == 3) {
                lVar = C21607c.m99571g(jsonReader, gVar);
            } else if (q != 4) {
                jsonReader.mo64566s();
            } else {
                z = jsonReader.mo64557i();
            }
        }
        return new C21567g(str, bVar, bVar2, lVar, z);
    }
}
