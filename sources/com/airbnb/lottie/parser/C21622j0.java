package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.zxing.client.android.C34651e;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.j0 */
public class C21622j0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55932a = JsonReader.C21628a.m99628a(C34935s.f84988a, C34651e.f83829d, C34930o.f84983b, SearchView.f2053T1, "m", "hd");

    /* renamed from: a */
    public static ShapeTrimPath m99601a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        C21544b bVar = null;
        C21544b bVar2 = null;
        C21544b bVar3 = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55932a);
            if (q == 0) {
                bVar = C21609d.m99578f(jsonReader, gVar, false);
            } else if (q == 1) {
                bVar2 = C21609d.m99578f(jsonReader, gVar, false);
            } else if (q == 2) {
                bVar3 = C21609d.m99578f(jsonReader, gVar, false);
            } else if (q == 3) {
                str = jsonReader.mo64561m();
            } else if (q == 4) {
                type = ShapeTrimPath.Type.m99345b(jsonReader.mo64559k());
            } else if (q != 5) {
                jsonReader.mo64566s();
            } else {
                z = jsonReader.mo64557i();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z);
    }
}
