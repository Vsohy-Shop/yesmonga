package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.usabilla.sdk.ubform.net.C9851c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.i0 */
public class C21620i0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55928a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "c", "w", C34930o.f84983b, "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    public static final JsonReader.C21628a f55929b = JsonReader.C21628a.m99628a("n", C9851c.f26937h);

    /* renamed from: a */
    public static ShapeStroke m99599a(JsonReader jsonReader, C21495g gVar) throws IOException {
        JsonReader jsonReader2 = jsonReader;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        C21544b bVar = null;
        C21543a aVar = null;
        C21544b bVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        C21546d dVar = null;
        while (jsonReader.mo64555g()) {
            switch (jsonReader2.mo64564q(f55928a)) {
                case 0:
                    C21495g gVar2 = gVar;
                    str = jsonReader.mo64561m();
                    break;
                case 1:
                    C21495g gVar3 = gVar;
                    aVar = C21609d.m99575c(jsonReader, gVar);
                    break;
                case 2:
                    C21495g gVar4 = gVar;
                    bVar2 = C21609d.m99577e(jsonReader, gVar);
                    break;
                case 3:
                    C21495g gVar5 = gVar;
                    dVar = C21609d.m99580h(jsonReader, gVar);
                    break;
                case 4:
                    C21495g gVar6 = gVar;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo64559k() - 1];
                    break;
                case 5:
                    C21495g gVar7 = gVar;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo64559k() - 1];
                    break;
                case 6:
                    C21495g gVar8 = gVar;
                    f = (float) jsonReader.mo64558j();
                    break;
                case 7:
                    C21495g gVar9 = gVar;
                    z = jsonReader.mo64557i();
                    break;
                case 8:
                    jsonReader.mo64551b();
                    while (jsonReader.mo64555g()) {
                        jsonReader.mo64552c();
                        String str2 = null;
                        C21544b bVar3 = null;
                        while (jsonReader.mo64555g()) {
                            int q = jsonReader2.mo64564q(f55929b);
                            if (q == 0) {
                                str2 = jsonReader.mo64561m();
                            } else if (q != 1) {
                                jsonReader.mo64565r();
                                jsonReader.mo64566s();
                            } else {
                                bVar3 = C21609d.m99577e(jsonReader, gVar);
                            }
                        }
                        jsonReader.mo64554f();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals(C34930o.f84983b)) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                gVar.mo64143y(true);
                                arrayList.add(bVar3);
                                break;
                            case 2:
                                C21495g gVar10 = gVar;
                                bVar = bVar3;
                                break;
                            default:
                                C21495g gVar11 = gVar;
                                break;
                        }
                    }
                    C21495g gVar12 = gVar;
                    jsonReader.mo64553d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    C21495g gVar13 = gVar;
                    jsonReader.mo64566s();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new C21546d(Collections.singletonList(new C21693a(100)));
        }
        return new ShapeStroke(str, bVar, arrayList, aVar, dVar, bVar2, lineCapType, lineJoinType, f, z);
    }
}
