package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21545c;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.content.C21565e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import com.google.zxing.client.android.C34651e;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.n */
public class C21641n {

    /* renamed from: a */
    public static JsonReader.C21628a f56028a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "g", C34930o.f84983b, C10108c.f27801d, C34935s.f84988a, C34651e.f83829d, "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    public static final JsonReader.C21628a f56029b = JsonReader.C21628a.m99628a("p", "k");

    /* renamed from: c */
    public static final JsonReader.C21628a f56030c = JsonReader.C21628a.m99628a("n", C9851c.f26937h);

    /* renamed from: a */
    public static C21565e m99682a(JsonReader jsonReader, C21495g gVar) throws IOException {
        String str;
        C21545c cVar;
        GradientType gradientType;
        JsonReader jsonReader2 = jsonReader;
        C21495g gVar2 = gVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        GradientType gradientType2 = null;
        C21545c cVar2 = null;
        C21548f fVar = null;
        C21548f fVar2 = null;
        C21544b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        C21544b bVar2 = null;
        boolean z = false;
        C21546d dVar = null;
        while (jsonReader.mo64555g()) {
            switch (jsonReader2.mo64564q(f56028a)) {
                case 0:
                    str2 = jsonReader.mo64561m();
                    continue;
                case 1:
                    str = str2;
                    jsonReader.mo64552c();
                    int i = -1;
                    while (jsonReader.mo64555g()) {
                        int q = jsonReader2.mo64564q(f56029b);
                        if (q != 0) {
                            cVar = cVar2;
                            if (q != 1) {
                                jsonReader.mo64565r();
                                jsonReader.mo64566s();
                            } else {
                                cVar2 = C21609d.m99579g(jsonReader2, gVar2, i);
                            }
                        } else {
                            cVar = cVar2;
                            i = jsonReader.mo64559k();
                        }
                        cVar2 = cVar;
                    }
                    C21545c cVar3 = cVar2;
                    jsonReader.mo64554f();
                    break;
                case 2:
                    String str3 = str2;
                    dVar = C21609d.m99580h(jsonReader, gVar);
                    continue;
                case 3:
                    str = str2;
                    if (jsonReader.mo64559k() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    String str4 = str2;
                    fVar = C21609d.m99581i(jsonReader, gVar);
                    continue;
                case 5:
                    String str5 = str2;
                    fVar2 = C21609d.m99581i(jsonReader, gVar);
                    continue;
                case 6:
                    String str6 = str2;
                    bVar = C21609d.m99577e(jsonReader, gVar);
                    continue;
                case 7:
                    str = str2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo64559k() - 1];
                    break;
                case 8:
                    str = str2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo64559k() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) jsonReader.mo64558j();
                    break;
                case 10:
                    z = jsonReader.mo64557i();
                    continue;
                case 11:
                    jsonReader.mo64551b();
                    while (jsonReader.mo64555g()) {
                        jsonReader.mo64552c();
                        String str7 = null;
                        C21544b bVar3 = null;
                        while (jsonReader.mo64555g()) {
                            int q2 = jsonReader2.mo64564q(f56030c);
                            if (q2 != 0) {
                                C21544b bVar4 = bVar2;
                                if (q2 != 1) {
                                    jsonReader.mo64565r();
                                    jsonReader.mo64566s();
                                } else {
                                    bVar3 = C21609d.m99577e(jsonReader, gVar);
                                }
                                bVar2 = bVar4;
                            } else {
                                C21544b bVar5 = bVar2;
                                str7 = jsonReader.mo64561m();
                            }
                        }
                        C21544b bVar6 = bVar2;
                        jsonReader.mo64554f();
                        if (str7.equals(C34930o.f84983b)) {
                            bVar2 = bVar3;
                        } else {
                            if (str7.equals("d") || str7.equals("g")) {
                                gVar2.mo64143y(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar6;
                        }
                    }
                    C21544b bVar7 = bVar2;
                    jsonReader.mo64553d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar2 = bVar7;
                    continue;
                default:
                    String str8 = str2;
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    continue;
            }
            str2 = str;
        }
        String str9 = str2;
        if (dVar == null) {
            dVar = new C21546d(Collections.singletonList(new C21693a(100)));
        }
        return new C21565e(str9, gradientType2, cVar2, dVar, fVar, fVar2, bVar, lineCapType, lineJoinType, f, arrayList, bVar2, z);
    }
}
