package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.C1875h;
import androidx.collection.C1887m;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.C21536k;
import com.airbnb.lottie.model.C21558b;
import com.airbnb.lottie.model.C21559c;
import com.airbnb.lottie.model.C21576g;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21686j;
import com.urbanairship.iam.C9206k;
import com.usabilla.sdk.ubform.net.C9851c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.parser.t */
public class C21649t {

    /* renamed from: a */
    public static final JsonReader.C21628a f56044a = JsonReader.C21628a.m99628a("w", "h", "ip", "op", "fr", C9851c.f26937h, "layers", C9206k.f25062a1, "fonts", "chars", "markers");

    /* renamed from: b */
    public static JsonReader.C21628a f56045b = JsonReader.C21628a.m99628a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    public static final JsonReader.C21628a f56046c = JsonReader.C21628a.m99628a("list");

    /* renamed from: d */
    public static final JsonReader.C21628a f56047d = JsonReader.C21628a.m99628a("cm", "tm", "dr");

    /* renamed from: a */
    public static C21495g m99704a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float e = C21686j.m99804e();
        C1875h hVar = new C1875h();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C1887m mVar = new C1887m();
        C21495g gVar = new C21495g();
        jsonReader.mo64552c();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.mo64555g()) {
            switch (jsonReader2.mo64564q(f56044a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = jsonReader.mo64559k();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = jsonReader.mo64559k();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) jsonReader.mo64558j();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.mo64558j()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.mo64558j();
                    break;
                case 5:
                    String[] split = jsonReader.mo64561m().split("\\.");
                    if (!C21686j.m99809j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        gVar.mo64118a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m99708e(jsonReader2, gVar, arrayList2, hVar);
                    break;
                case 7:
                    m99705b(jsonReader2, gVar, hashMap2, hashMap3);
                    break;
                case 8:
                    m99707d(jsonReader2, hashMap4);
                    break;
                case 9:
                    m99706c(jsonReader2, gVar, mVar);
                    break;
                case 10:
                    m99709f(jsonReader2, gVar, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        ArrayList arrayList7 = arrayList3;
        gVar.mo64141w(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, hVar, hashMap2, hashMap3, mVar, hashMap4, arrayList3);
        return gVar;
    }

    /* renamed from: b */
    public static void m99705b(JsonReader jsonReader, C21495g gVar, Map<String, List<Layer>> map, Map<String, C21536k> map2) throws IOException {
        jsonReader.mo64551b();
        while (jsonReader.mo64555g()) {
            ArrayList arrayList = new ArrayList();
            C1875h hVar = new C1875h();
            jsonReader.mo64552c();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.mo64555g()) {
                int q = jsonReader.mo64564q(f56045b);
                if (q == 0) {
                    str = jsonReader.mo64561m();
                } else if (q == 1) {
                    jsonReader.mo64551b();
                    while (jsonReader.mo64555g()) {
                        Layer b = C21647s.m99703b(jsonReader, gVar);
                        hVar.mo6229t(b.mo64448b(), b);
                        arrayList.add(b);
                    }
                    jsonReader.mo64553d();
                } else if (q == 2) {
                    i = jsonReader.mo64559k();
                } else if (q == 3) {
                    i2 = jsonReader.mo64559k();
                } else if (q == 4) {
                    str2 = jsonReader.mo64561m();
                } else if (q != 5) {
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                } else {
                    str3 = jsonReader.mo64561m();
                }
            }
            jsonReader.mo64554f();
            if (str2 != null) {
                C21536k kVar = new C21536k(i, i2, str, str2, str3);
                map2.put(kVar.mo64274e(), kVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.mo64553d();
    }

    /* renamed from: c */
    public static void m99706c(JsonReader jsonReader, C21495g gVar, C1887m<C21559c> mVar) throws IOException {
        jsonReader.mo64551b();
        while (jsonReader.mo64555g()) {
            C21559c a = C21621j.m99600a(jsonReader, gVar);
            mVar.mo6369t(a.hashCode(), a);
        }
        jsonReader.mo64553d();
    }

    /* renamed from: d */
    public static void m99707d(JsonReader jsonReader, Map<String, C21558b> map) throws IOException {
        jsonReader.mo64552c();
        while (jsonReader.mo64555g()) {
            if (jsonReader.mo64564q(f56046c) != 0) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                jsonReader.mo64551b();
                while (jsonReader.mo64555g()) {
                    C21558b a = C21623k.m99602a(jsonReader);
                    map.put(a.mo64318c(), a);
                }
                jsonReader.mo64553d();
            }
        }
        jsonReader.mo64554f();
    }

    /* renamed from: e */
    public static void m99708e(JsonReader jsonReader, C21495g gVar, List<Layer> list, C1875h<Layer> hVar) throws IOException {
        jsonReader.mo64551b();
        int i = 0;
        while (jsonReader.mo64555g()) {
            Layer b = C21647s.m99703b(jsonReader, gVar);
            if (b.mo64450d() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(b);
            hVar.mo6229t(b.mo64448b(), b);
            if (i > 4) {
                C21682f.m99760e("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.mo64553d();
    }

    /* renamed from: f */
    public static void m99709f(JsonReader jsonReader, C21495g gVar, List<C21576g> list) throws IOException {
        jsonReader.mo64551b();
        while (jsonReader.mo64555g()) {
            jsonReader.mo64552c();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.mo64555g()) {
                int q = jsonReader.mo64564q(f56047d);
                if (q == 0) {
                    str = jsonReader.mo64561m();
                } else if (q == 1) {
                    f = (float) jsonReader.mo64558j();
                } else if (q != 2) {
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                } else {
                    f2 = (float) jsonReader.mo64558j();
                }
            }
            jsonReader.mo64554f();
            list.add(new C21576g(str, f, f2));
        }
        jsonReader.mo64553d();
    }
}
