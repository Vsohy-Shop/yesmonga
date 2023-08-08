package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.C21542a;
import com.airbnb.lottie.model.content.C21568h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21685i;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.usabilla.sdk.ubform.net.C9851c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.e0 */
public class C21612e0 implements C21624k0<C21568h> {

    /* renamed from: a */
    public static final C21612e0 f55918a = new C21612e0();

    /* renamed from: b */
    public static final JsonReader.C21628a f55919b = JsonReader.C21628a.m99628a("c", C9851c.f26937h, "i", C34930o.f84983b);

    /* renamed from: b */
    public C21568h mo64542a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo64551b();
        }
        jsonReader.mo64552c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55919b);
            if (q == 0) {
                z = jsonReader.mo64557i();
            } else if (q == 1) {
                list = C21643p.m99690f(jsonReader, f);
            } else if (q == 2) {
                list2 = C21643p.m99690f(jsonReader, f);
            } else if (q != 3) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                list3 = C21643p.m99690f(jsonReader, f);
            }
        }
        jsonReader.mo64554f();
        if (jsonReader.mo64562o() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo64553d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C21568h(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C21542a(C21685i.m99787a(list.get(i2), list3.get(i2)), C21685i.m99787a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C21542a(C21685i.m99787a(list.get(i3), list3.get(i3)), C21685i.m99787a(pointF3, list2.get(0)), pointF3));
            }
            return new C21568h(pointF, z, arrayList);
        }
    }
}
