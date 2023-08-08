package com.airbnb.lottie.parser;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21545c;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.content.C21564d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.zxing.client.android.C34651e;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.m */
public class C21627m {

    /* renamed from: a */
    public static final JsonReader.C21628a f55935a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "g", C34930o.f84983b, C10108c.f27801d, C34935s.f84988a, C34651e.f83829d, C28515a1.f68703k, "hd");

    /* renamed from: b */
    public static final JsonReader.C21628a f55936b = JsonReader.C21628a.m99628a("p", "k");

    /* renamed from: a */
    public static C21564d m99608a(JsonReader jsonReader, C21495g gVar) throws IOException {
        C21546d dVar;
        GradientType gradientType;
        Path.FillType fillType;
        C21546d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType2 = null;
        C21545c cVar = null;
        C21548f fVar = null;
        C21548f fVar2 = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            switch (jsonReader.mo64564q(f55935a)) {
                case 0:
                    str = jsonReader.mo64561m();
                    break;
                case 1:
                    jsonReader.mo64552c();
                    int i = -1;
                    while (jsonReader.mo64555g()) {
                        int q = jsonReader.mo64564q(f55936b);
                        if (q == 0) {
                            i = jsonReader.mo64559k();
                        } else if (q != 1) {
                            jsonReader.mo64565r();
                            jsonReader.mo64566s();
                        } else {
                            cVar = C21609d.m99579g(jsonReader, gVar, i);
                        }
                    }
                    jsonReader.mo64554f();
                    break;
                case 2:
                    dVar2 = C21609d.m99580h(jsonReader, gVar);
                    break;
                case 3:
                    if (jsonReader.mo64559k() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    fVar = C21609d.m99581i(jsonReader, gVar);
                    break;
                case 5:
                    fVar2 = C21609d.m99581i(jsonReader, gVar);
                    break;
                case 6:
                    if (jsonReader.mo64559k() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = jsonReader.mo64557i();
                    break;
                default:
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new C21546d(Collections.singletonList(new C21693a(100)));
        } else {
            dVar = dVar2;
        }
        return new C21564d(str, gradientType2, fillType2, cVar, dVar, fVar, fVar2, (C21544b) null, (C21544b) null, z);
    }
}
