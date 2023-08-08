package com.airbnb.lottie.parser;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.content.C21566f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.b0 */
public class C21606b0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55912a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "p", C34935s.f84988a, C28515a1.f68703k, "hd");

    /* renamed from: a */
    public static C21566f m99564a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str = null;
        C21555m<PointF, PointF> mVar = null;
        C21548f fVar = null;
        C21544b bVar = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55912a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                mVar = C21603a.m99560b(jsonReader, gVar);
            } else if (q == 2) {
                fVar = C21609d.m99581i(jsonReader, gVar);
            } else if (q == 3) {
                bVar = C21609d.m99577e(jsonReader, gVar);
            } else if (q != 4) {
                jsonReader.mo64566s();
            } else {
                z = jsonReader.mo64557i();
            }
        }
        return new C21566f(str, mVar, fVar, bVar, z);
    }
}
