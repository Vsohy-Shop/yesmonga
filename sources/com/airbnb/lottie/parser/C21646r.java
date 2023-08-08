package com.airbnb.lottie.parser;

import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.animation.keyframe.C21479h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.r */
public class C21646r {

    /* renamed from: a */
    public static JsonReader.C21628a f56039a = JsonReader.C21628a.m99628a("k");

    /* renamed from: a */
    public static <T> List<C21693a<T>> m99700a(JsonReader jsonReader, C21495g gVar, float f, C21624k0<T> k0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo64562o() == JsonReader.Token.STRING) {
            gVar.mo64118a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo64552c();
        while (jsonReader.mo64555g()) {
            if (jsonReader.mo64564q(f56039a) != 0) {
                jsonReader.mo64566s();
            } else if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo64551b();
                if (jsonReader.mo64562o() == JsonReader.Token.NUMBER) {
                    arrayList.add(C21645q.m99694c(jsonReader, gVar, f, k0Var, false, z));
                } else {
                    while (jsonReader.mo64555g()) {
                        arrayList.add(C21645q.m99694c(jsonReader, gVar, f, k0Var, true, z));
                    }
                }
                jsonReader.mo64553d();
            } else {
                arrayList.add(C21645q.m99694c(jsonReader, gVar, f, k0Var, false, z));
            }
        }
        jsonReader.mo64554f();
        m99701b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m99701b(List<? extends C21693a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C21693a aVar = (C21693a) list.get(i2);
            i2++;
            C21693a aVar2 = (C21693a) list.get(i2);
            aVar.f56101h = Float.valueOf(aVar2.f56100g);
            if (aVar.f56096c == null && (t = aVar2.f56095b) != null) {
                aVar.f56096c = t;
                if (aVar instanceof C21479h) {
                    ((C21479h) aVar).mo64091i();
                }
            }
        }
        C21693a aVar3 = (C21693a) list.get(i);
        if ((aVar3.f56095b == null || aVar3.f56096c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
