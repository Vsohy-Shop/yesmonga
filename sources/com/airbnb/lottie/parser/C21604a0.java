package com.airbnb.lottie.parser;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.a0 */
public class C21604a0 {

    /* renamed from: a */
    public static final JsonReader.C21628a f55909a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "sy", "pt", "p", C28515a1.f68703k, "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    public static PolystarShape m99561a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str = null;
        PolystarShape.Type type = null;
        C21544b bVar = null;
        C21555m<PointF, PointF> mVar = null;
        C21544b bVar2 = null;
        C21544b bVar3 = null;
        C21544b bVar4 = null;
        C21544b bVar5 = null;
        C21544b bVar6 = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            switch (jsonReader.mo64564q(f55909a)) {
                case 0:
                    str = jsonReader.mo64561m();
                    break;
                case 1:
                    type = PolystarShape.Type.m99324b(jsonReader.mo64559k());
                    break;
                case 2:
                    bVar = C21609d.m99578f(jsonReader, gVar, false);
                    break;
                case 3:
                    mVar = C21603a.m99560b(jsonReader, gVar);
                    break;
                case 4:
                    bVar2 = C21609d.m99578f(jsonReader, gVar, false);
                    break;
                case 5:
                    bVar4 = C21609d.m99577e(jsonReader, gVar);
                    break;
                case 6:
                    bVar6 = C21609d.m99578f(jsonReader, gVar, false);
                    break;
                case 7:
                    bVar3 = C21609d.m99577e(jsonReader, gVar);
                    break;
                case 8:
                    bVar5 = C21609d.m99578f(jsonReader, gVar, false);
                    break;
                case 9:
                    z = jsonReader.mo64557i();
                    break;
                default:
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
