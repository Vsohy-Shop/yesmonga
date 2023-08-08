package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.C16934c;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21552j;
import com.airbnb.lottie.model.animatable.C21553k;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.content.C21562b;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21693a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.s */
public class C21647s {

    /* renamed from: a */
    public static final JsonReader.C21628a f56040a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "ind", "refId", "ty", C16934c.f44493V1, "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", C10108c.f27801d, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    public static final JsonReader.C21628a f56041b = JsonReader.C21628a.m99628a("d", "a");

    /* renamed from: c */
    public static final JsonReader.C21628a f56042c = JsonReader.C21628a.m99628a(SearchView.f2053T1);

    /* renamed from: com.airbnb.lottie.parser.s$a */
    public static /* synthetic */ class C21648a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56043a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56043a = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C21647s.C21648a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Layer m99702a(C21495g gVar) {
        Rect b = gVar.mo64119b();
        List emptyList = Collections.emptyList();
        Layer.LayerType layerType = Layer.LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C21554l lVar = r12;
        C21554l lVar2 = new C21554l();
        return new Layer(emptyList, gVar, "__container", -1, layerType, -1, (String) null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), (C21552j) null, (C21553k) null, Collections.emptyList(), Layer.MatteType.NONE, (C21544b) null, false);
    }

    /* renamed from: b */
    public static Layer m99703b(JsonReader jsonReader, C21495g gVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        JsonReader jsonReader2 = jsonReader;
        C21495g gVar2 = gVar;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.mo64552c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        C21554l lVar = null;
        C21552j jVar = null;
        C21553k kVar = null;
        C21544b bVar = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f2 = 1.0f;
        long j2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        String str2 = "UNSET";
        String str3 = null;
        while (jsonReader.mo64555g()) {
            switch (jsonReader2.mo64564q(f56040a)) {
                case 0:
                    str2 = jsonReader.mo64561m();
                    break;
                case 1:
                    j = (long) jsonReader.mo64559k();
                    break;
                case 2:
                    str = jsonReader.mo64561m();
                    break;
                case 3:
                    int k = jsonReader.mo64559k();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (k >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[k];
                        break;
                    }
                case 4:
                    j2 = (long) jsonReader.mo64559k();
                    break;
                case 5:
                    i = (int) (((float) jsonReader.mo64559k()) * C21686j.m99804e());
                    break;
                case 6:
                    i2 = (int) (((float) jsonReader.mo64559k()) * C21686j.m99804e());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.mo64561m());
                    break;
                case 8:
                    lVar = C21607c.m99571g(jsonReader, gVar);
                    break;
                case 9:
                    int k2 = jsonReader.mo64559k();
                    if (k2 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[k2];
                        int i6 = C21648a.f56043a[matteType2.ordinal()];
                        if (i6 == 1) {
                            gVar2.mo64118a("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            gVar2.mo64118a("Unsupported matte type: Luma Inverted");
                        }
                        gVar2.mo64140v(1);
                        break;
                    } else {
                        gVar2.mo64118a("Unsupported matte type: " + k2);
                        break;
                    }
                case 10:
                    jsonReader.mo64551b();
                    while (jsonReader.mo64555g()) {
                        arrayList3.add(C21651v.m99712a(jsonReader, gVar));
                    }
                    gVar2.mo64140v(arrayList3.size());
                    jsonReader.mo64553d();
                    break;
                case 11:
                    jsonReader.mo64551b();
                    while (jsonReader.mo64555g()) {
                        C21562b a = C21615g.m99592a(jsonReader, gVar);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    jsonReader.mo64553d();
                    break;
                case 12:
                    jsonReader.mo64552c();
                    while (jsonReader.mo64555g()) {
                        int q = jsonReader2.mo64564q(f56041b);
                        if (q == 0) {
                            jVar = C21609d.m99576d(jsonReader, gVar);
                        } else if (q != 1) {
                            jsonReader.mo64565r();
                            jsonReader.mo64566s();
                        } else {
                            jsonReader.mo64551b();
                            if (jsonReader.mo64555g()) {
                                kVar = C21605b.m99562a(jsonReader, gVar);
                            }
                            while (jsonReader.mo64555g()) {
                                jsonReader.mo64566s();
                            }
                            jsonReader.mo64553d();
                        }
                    }
                    jsonReader.mo64554f();
                    break;
                case 13:
                    jsonReader.mo64551b();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.mo64555g()) {
                        jsonReader.mo64552c();
                        while (jsonReader.mo64555g()) {
                            if (jsonReader2.mo64564q(f56042c) != 0) {
                                jsonReader.mo64565r();
                                jsonReader.mo64566s();
                            } else {
                                arrayList5.add(jsonReader.mo64561m());
                            }
                        }
                        jsonReader.mo64554f();
                    }
                    jsonReader.mo64553d();
                    gVar2.mo64118a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) jsonReader.mo64558j();
                    break;
                case 15:
                    f4 = (float) jsonReader.mo64558j();
                    break;
                case 16:
                    i4 = (int) (((float) jsonReader.mo64559k()) * C21686j.m99804e());
                    break;
                case 17:
                    i5 = (int) (((float) jsonReader.mo64559k()) * C21686j.m99804e());
                    break;
                case 18:
                    f3 = (float) jsonReader.mo64558j();
                    break;
                case 19:
                    f5 = (float) jsonReader.mo64558j();
                    break;
                case 20:
                    bVar = C21609d.m99578f(jsonReader2, gVar2, false);
                    break;
                case 21:
                    str3 = jsonReader.mo64561m();
                    break;
                case 22:
                    z = jsonReader.mo64557i();
                    break;
                default:
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    break;
            }
        }
        jsonReader.mo64554f();
        ArrayList arrayList6 = new ArrayList();
        if (f3 > 0.0f) {
            C21693a aVar = r0;
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            C21693a aVar2 = new C21693a(gVar, valueOf2, valueOf2, (Interpolator) null, 0.0f, Float.valueOf(f3));
            arrayList2.add(aVar);
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = gVar.mo64123f();
        }
        C21495g gVar3 = gVar;
        arrayList2.add(new C21693a(gVar3, valueOf, valueOf, (Interpolator) null, f3, Float.valueOf(f5)));
        arrayList2.add(new C21693a(gVar3, valueOf2, valueOf2, (Interpolator) null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            gVar2.mo64118a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, gVar, str2, j, layerType, j2, str, arrayList, lVar, i, i2, i3, f2, f4, i4, i5, jVar, kVar, arrayList2, matteType2, bVar, z);
    }
}
