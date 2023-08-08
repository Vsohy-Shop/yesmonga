package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzml;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzms;
import com.google.mlkit.vision.barcode.C33982a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.internal.l */
public final class C34020l implements C34019k {

    /* renamed from: a */
    public final zzms f82630a;

    public C34020l(zzms zzms) {
        this.f82630a = zzms;
    }

    @C0363p0
    /* renamed from: a */
    public static C33982a.C33987d m136856a(@C0363p0 zzmh zzmh) {
        if (zzmh == null) {
            return null;
        }
        return new C33982a.C33987d(zzmh.mo122675f0(), zzmh.mo122673X(), zzmh.mo122670M(), zzmh.mo122671Q(), zzmh.mo122672W(), zzmh.mo122674e0(), zzmh.mo122677p0(), zzmh.mo122676n0());
    }

    @C0363p0
    /* renamed from: M */
    public final Point[] mo98939M() {
        return this.f82630a.mo122750k1();
    }

    @C0363p0
    /* renamed from: d */
    public final Rect mo98940d() {
        Point[] k1 = this.f82630a.mo122750k1();
        if (k1 == null) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : k1) {
            i4 = Math.min(i4, point.x);
            i = Math.max(i, point.x);
            i2 = Math.min(i2, point.y);
            i3 = Math.max(i3, point.y);
        }
        return new Rect(i4, i2, i, i3);
    }

    @C0363p0
    /* renamed from: e */
    public final C33982a.C33988e mo98941e() {
        zzmi W = this.f82630a.mo122745W();
        if (W != null) {
            return new C33982a.C33988e(W.mo122685n0(), W.mo122681W(), W.mo122682X(), W.mo122683e0(), W.mo122684f0(), m136856a(W.mo122680Q()), m136856a(W.mo122679M()));
        }
        return null;
    }

    @C0363p0
    /* renamed from: f */
    public final C33982a.C33989f mo98942f() {
        List list;
        zzmj X = this.f82630a.mo122746X();
        C33982a.C33994j jVar = null;
        if (X == null) {
            return null;
        }
        zzmn M = X.mo122687M();
        if (M != null) {
            jVar = new C33982a.C33994j(M.mo122719Q(), M.mo122723f0(), M.mo122722e0(), M.mo122718M(), M.mo122721X(), M.mo122720W(), M.mo122724n0());
        }
        C33982a.C33994j jVar2 = jVar;
        String Q = X.mo122688Q();
        String W = X.mo122689W();
        zzmo[] f0 = X.mo122692f0();
        ArrayList arrayList = new ArrayList();
        if (f0 != null) {
            for (zzmo zzmo : f0) {
                if (zzmo != null) {
                    arrayList.add(new C33982a.C33995k(zzmo.mo122727Q(), zzmo.mo122726M()));
                }
            }
        }
        zzml[] e0 = X.mo122691e0();
        ArrayList arrayList2 = new ArrayList();
        if (e0 != null) {
            for (zzml zzml : e0) {
                if (zzml != null) {
                    arrayList2.add(new C33982a.C33991h(zzml.mo122710M(), zzml.mo122711Q(), zzml.mo122713X(), zzml.mo122712W()));
                }
            }
        }
        if (X.mo122693n0() != null) {
            list = Arrays.asList((String[]) C40843u.m166202l(X.mo122693n0()));
        } else {
            list = new ArrayList();
        }
        List list2 = list;
        zzmg[] X2 = X.mo122690X();
        ArrayList arrayList3 = new ArrayList();
        if (X2 != null) {
            for (zzmg zzmg : X2) {
                if (zzmg != null) {
                    arrayList3.add(new C33982a.C33983a(zzmg.mo122667M(), zzmg.mo122668Q()));
                }
            }
        }
        return new C33982a.C33989f(jVar2, Q, W, arrayList, arrayList2, list2, arrayList3);
    }

    @C0363p0
    /* renamed from: h */
    public final C33982a.C33991h mo98943h() {
        zzml f0 = this.f82630a.mo122748f0();
        if (f0 == null) {
            return null;
        }
        return new C33982a.C33991h(f0.mo122710M(), f0.mo122711Q(), f0.mo122713X(), f0.mo122712W());
    }

    @C0363p0
    /* renamed from: j */
    public final C33982a.C33993i mo98944j() {
        zzmm n0 = this.f82630a.mo122751n0();
        if (n0 != null) {
            return new C33982a.C33993i(n0.mo122715M(), n0.mo122716Q());
        }
        return null;
    }

    @C0363p0
    /* renamed from: k */
    public final C33982a.C33995k mo98945k() {
        zzmo p0 = this.f82630a.mo122752p0();
        if (p0 != null) {
            return new C33982a.C33995k(p0.mo122727Q(), p0.mo122726M());
        }
        return null;
    }

    @C0363p0
    /* renamed from: o */
    public final C33982a.C33990g mo98946o() {
        zzmk e0 = this.f82630a.mo122747e0();
        if (e0 != null) {
            return new C33982a.C33990g(e0.mo122704f0(), e0.mo122707p0(), e0.mo122705j1(), e0.mo122697K0(), e0.mo122708t0(), e0.mo122701W(), e0.mo122698M(), e0.mo122700Q(), e0.mo122702X(), e0.mo122699N0(), e0.mo122695A0(), e0.mo122706n0(), e0.mo122703e0(), e0.mo122696C0());
        }
        return null;
    }

    @C0363p0
    /* renamed from: p */
    public final C33982a.C33997l mo98947p() {
        zzmp t0 = this.f82630a.mo122753t0();
        if (t0 != null) {
            return new C33982a.C33997l(t0.mo122729M(), t0.mo122730Q());
        }
        return null;
    }

    @C0363p0
    /* renamed from: q */
    public final C33982a.C33999n mo98948q() {
        zzmr C0 = this.f82630a.mo122740C0();
        if (C0 != null) {
            return new C33982a.C33999n(C0.mo122737W(), C0.mo122736Q(), C0.mo122735M());
        }
        return null;
    }

    @C0363p0
    /* renamed from: r */
    public final String mo98949r() {
        return this.f82630a.mo122741K0();
    }

    @C0363p0
    /* renamed from: s */
    public final String mo98950s() {
        return this.f82630a.mo122743N0();
    }

    @C0363p0
    /* renamed from: t */
    public final C33982a.C33998m mo98951t() {
        zzmq A0 = this.f82630a.mo122739A0();
        if (A0 != null) {
            return new C33982a.C33998m(A0.mo122732M(), A0.mo122733Q());
        }
        return null;
    }

    @C0363p0
    /* renamed from: u */
    public final byte[] mo98952u() {
        return this.f82630a.mo122749j1();
    }

    public final int zza() {
        return this.f82630a.mo122742M();
    }

    public final int zzb() {
        return this.f82630a.mo122744Q();
    }
}
