package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21547e;
import com.airbnb.lottie.model.animatable.C21549g;
import com.airbnb.lottie.model.animatable.C21551i;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21703k;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.c */
public class C21607c {

    /* renamed from: a */
    public static final JsonReader.C21628a f55913a = JsonReader.C21628a.m99628a("a", "p", C34935s.f84988a, "rz", C28515a1.f68703k, C34930o.f84983b, "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static final JsonReader.C21628a f55914b = JsonReader.C21628a.m99628a("k");

    /* renamed from: a */
    public static boolean m99565a(C21547e eVar) {
        return eVar == null || (eVar.mo64302c() && ((PointF) eVar.mo64301b().get(0).f56095b).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    public static boolean m99566b(C21555m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C21551i) && mVar.mo64302c() && ((PointF) mVar.mo64301b().get(0).f56095b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m99567c(C21544b bVar) {
        return bVar == null || (bVar.mo64302c() && ((Float) ((C21693a) bVar.mo64301b().get(0)).f56095b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    public static boolean m99568d(C21549g gVar) {
        return gVar == null || (gVar.mo64302c() && ((C21703k) ((C21693a) gVar.mo64301b().get(0)).f56095b).mo64751a(1.0f, 1.0f));
    }

    /* renamed from: e */
    public static boolean m99569e(C21544b bVar) {
        return bVar == null || (bVar.mo64302c() && ((Float) ((C21693a) bVar.mo64301b().get(0)).f56095b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    public static boolean m99570f(C21544b bVar) {
        return bVar == null || (bVar.mo64302c() && ((Float) ((C21693a) bVar.mo64301b().get(0)).f56095b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C21554l m99571g(JsonReader jsonReader, C21495g gVar) throws IOException {
        boolean z;
        C21547e eVar;
        C21555m<PointF, PointF> mVar;
        C21544b bVar;
        C21544b bVar2;
        C21544b bVar3;
        boolean z2;
        JsonReader jsonReader2 = jsonReader;
        C21495g gVar2 = gVar;
        boolean z3 = false;
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo64552c();
        }
        C21544b bVar4 = null;
        C21547e eVar2 = null;
        C21555m<PointF, PointF> mVar2 = null;
        C21549g gVar3 = null;
        C21544b bVar5 = null;
        C21544b bVar6 = null;
        C21546d dVar = null;
        C21544b bVar7 = null;
        C21544b bVar8 = null;
        while (jsonReader.mo64555g()) {
            switch (jsonReader2.mo64564q(f55913a)) {
                case 0:
                    boolean z4 = z3;
                    jsonReader.mo64552c();
                    while (jsonReader.mo64555g()) {
                        if (jsonReader2.mo64564q(f55914b) != 0) {
                            jsonReader.mo64565r();
                            jsonReader.mo64566s();
                        } else {
                            eVar2 = C21603a.m99559a(jsonReader, gVar);
                        }
                    }
                    jsonReader.mo64554f();
                    z3 = z4;
                    continue;
                case 1:
                    boolean z5 = z3;
                    mVar2 = C21603a.m99560b(jsonReader, gVar);
                    continue;
                case 2:
                    boolean z6 = z3;
                    gVar3 = C21609d.m99582j(jsonReader, gVar);
                    continue;
                case 3:
                    gVar2.mo64118a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C21609d.m99580h(jsonReader, gVar);
                    continue;
                case 6:
                    bVar7 = C21609d.m99578f(jsonReader2, gVar2, z3);
                    continue;
                case 7:
                    bVar8 = C21609d.m99578f(jsonReader2, gVar2, z3);
                    continue;
                case 8:
                    bVar5 = C21609d.m99578f(jsonReader2, gVar2, z3);
                    continue;
                case 9:
                    bVar6 = C21609d.m99578f(jsonReader2, gVar2, z3);
                    continue;
                default:
                    boolean z7 = z3;
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    continue;
            }
            C21544b f = C21609d.m99578f(jsonReader2, gVar2, z3);
            if (f.mo64301b().isEmpty()) {
                C21693a aVar = r1;
                C21693a aVar2 = new C21693a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(gVar.mo64123f()));
                f.mo64301b().add(aVar);
            } else if (((C21693a) f.mo64301b().get(0)).f56095b == null) {
                z2 = false;
                f.mo64301b().set(0, new C21693a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(gVar.mo64123f())));
                z3 = z2;
                bVar4 = f;
            }
            z2 = false;
            z3 = z2;
            bVar4 = f;
        }
        if (z) {
            jsonReader.mo64554f();
        }
        if (m99565a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (m99566b(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (m99567c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (m99568d(gVar3)) {
            gVar3 = null;
        }
        if (m99570f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (m99569e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new C21554l(eVar, mVar, gVar3, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}
