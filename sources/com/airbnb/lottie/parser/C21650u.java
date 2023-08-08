package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.C1875h;
import androidx.collection.C1887m;
import com.airbnb.lottie.C21495g;
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

/* renamed from: com.airbnb.lottie.parser.u */
public class C21650u {

    /* renamed from: a */
    public static JsonReader.C21628a f56048a = JsonReader.C21628a.m99628a("w", "h", "ip", "op", "fr", C9851c.f26937h, "layers", C9206k.f25062a1, "fonts", "chars", "markers");

    /* renamed from: a */
    public static C21495g m99710a(JsonReader jsonReader) throws IOException {
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
            switch (jsonReader2.mo64564q(f56048a)) {
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
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m99711b(jsonReader2, gVar, arrayList2, hVar);
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            jsonReader.mo64566s();
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        ArrayList arrayList7 = arrayList3;
        gVar.mo64141w(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, hVar, hashMap2, hashMap3, mVar, hashMap4, arrayList3);
        return gVar;
    }

    /* renamed from: b */
    public static void m99711b(JsonReader jsonReader, C21495g gVar, List<Layer> list, C1875h<Layer> hVar) throws IOException {
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
}
