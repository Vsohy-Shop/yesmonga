package com.airbnb.lottie.parser;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.content.C21569i;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.journeyapps.barcodescanner.camera.C34930o;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.f0 */
public class C21614f0 {

    /* renamed from: a */
    public static final JsonReader.C21628a f55921a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "c", C34930o.f84983b, "fillEnabled", C28515a1.f68703k, "hd");

    /* renamed from: a */
    public static C21569i m99591a(JsonReader jsonReader, C21495g gVar) throws IOException {
        Path.FillType fillType;
        C21546d dVar = null;
        String str = null;
        C21543a aVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55921a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                aVar = C21609d.m99575c(jsonReader, gVar);
            } else if (q == 2) {
                dVar = C21609d.m99580h(jsonReader, gVar);
            } else if (q == 3) {
                z = jsonReader.mo64557i();
            } else if (q == 4) {
                i = jsonReader.mo64559k();
            } else if (q != 5) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                z2 = jsonReader.mo64557i();
            }
        }
        if (dVar == null) {
            dVar = new C21546d(Collections.singletonList(new C21693a(100)));
        }
        C21546d dVar2 = dVar;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C21569i(str, z, fillType, aVar, dVar2, z2);
    }
}
