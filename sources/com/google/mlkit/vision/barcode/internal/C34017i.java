package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38581d8;
import com.google.android.gms.internal.mlkit_vision_barcode.C38583da;
import com.google.android.gms.internal.mlkit_vision_barcode.C38588e2;
import com.google.android.gms.internal.mlkit_vision_barcode.C38593e7;
import com.google.android.gms.internal.mlkit_vision_barcode.C38596ea;
import com.google.android.gms.internal.mlkit_vision_barcode.C38601f2;
import com.google.android.gms.internal.mlkit_vision_barcode.C38627h2;
import com.google.android.gms.internal.mlkit_vision_barcode.C38632h7;
import com.google.android.gms.internal.mlkit_vision_barcode.C38684l7;
import com.google.android.gms.internal.mlkit_vision_barcode.C38767s0;
import com.google.android.gms.internal.mlkit_vision_barcode.C38786t7;
import com.google.android.gms.internal.mlkit_vision_barcode.zzir;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzje;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjf;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33941g;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.barcode.C34004c;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34032b;
import com.google.mlkit.vision.common.internal.C34036f;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.internal.i */
public final class C34017i extends C33941g<List<C33982a>, C34025b> {

    /* renamed from: j */
    public static final C34036f f82622j = C34036f.m136944b();
    @C0344h1

    /* renamed from: k */
    public static boolean f82623k = true;

    /* renamed from: d */
    public final C34004c f82624d;

    /* renamed from: e */
    public final C34018j f82625e;

    /* renamed from: f */
    public final C38557ba f82626f;

    /* renamed from: g */
    public final C38583da f82627g;

    /* renamed from: h */
    public final C34032b f82628h = new C34032b();

    /* renamed from: i */
    public boolean f82629i;

    public C34017i(C33947j jVar, C34004c cVar, C34018j jVar2, C38557ba baVar) {
        C40843u.m166203m(jVar, "MlKitContext can not be null");
        C40843u.m166203m(cVar, "BarcodeScannerOptions can not be null");
        this.f82624d = cVar;
        this.f82625e = jVar2;
        this.f82626f = baVar;
        this.f82627g = C38583da.m159906a(jVar.mo98718b());
    }

    @C0348i1
    /* renamed from: c */
    public final synchronized void mo98728c() throws MlKitException {
        this.f82629i = this.f82625e.mo98937d();
    }

    @C0348i1
    /* renamed from: e */
    public final synchronized void mo98730e() {
        this.f82625e.zzb();
        f82623k = true;
    }

    @C0348i1
    /* renamed from: j */
    public final synchronized List<C33982a> mo98710i(@C0359n0 C34025b bVar) throws MlKitException {
        zzje zzje;
        List<C33982a> a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f82628h.mo98979a(bVar);
        try {
            a = this.f82625e.mo98936a(bVar);
            mo98935m(zzje.NO_ERROR, elapsedRealtime, bVar, a);
            f82623k = false;
        } catch (MlKitException e) {
            MlKitException mlKitException = e;
            if (mlKitException.mo98621a() == 14) {
                zzje = zzje.MODEL_NOT_DOWNLOADED;
            } else {
                zzje = zzje.UNKNOWN_ERROR;
            }
            mo98935m(zzje, elapsedRealtime, bVar, (List<C33982a>) null);
            throw mlKitException;
        }
        return a;
    }

    /* renamed from: k */
    public final /* synthetic */ C38596ea mo98933k(long j, zzje zzje, C38767s0 s0Var, C38767s0 s0Var2, C34025b bVar) {
        zzir zzir;
        zzjd zzjd;
        C38581d8 d8Var = new C38581d8();
        C38684l7 l7Var = new C38684l7();
        l7Var.mo122420c(Long.valueOf(j));
        l7Var.mo122421d(zzje);
        l7Var.mo122422e(Boolean.valueOf(f82623k));
        Boolean bool = Boolean.TRUE;
        l7Var.mo122418a(bool);
        l7Var.mo122419b(bool);
        d8Var.mo122283h(l7Var.mo122423f());
        d8Var.mo122284i(C34010b.m136824c(this.f82624d));
        d8Var.mo122280e(s0Var.mo122500g());
        d8Var.mo122281f(s0Var2.mo122500g());
        int h = bVar.mo98958h();
        int d = f82622j.mo98990d(bVar);
        C38632h7 h7Var = new C38632h7();
        if (h == -1) {
            zzir = zzir.BITMAP;
        } else if (h == 35) {
            zzir = zzir.YUV_420_888;
        } else if (h == 842094169) {
            zzir = zzir.YV12;
        } else if (h == 16) {
            zzir = zzir.NV16;
        } else if (h != 17) {
            zzir = zzir.UNKNOWN_FORMAT;
        } else {
            zzir = zzir.NV21;
        }
        h7Var.mo122353a(zzir);
        h7Var.mo122354b(Integer.valueOf(d));
        d8Var.mo122282g(h7Var.mo122355d());
        C38786t7 t7Var = new C38786t7();
        if (this.f82629i) {
            zzjd = zzjd.TYPE_THICK;
        } else {
            zzjd = zzjd.TYPE_THIN;
        }
        t7Var.mo122515e(zzjd);
        t7Var.mo122517g(d8Var.mo122285j());
        return C38596ea.m159934d(t7Var);
    }

    /* renamed from: l */
    public final /* synthetic */ C38596ea mo98934l(C38627h2 h2Var, int i, C38593e7 e7Var) {
        zzjd zzjd;
        C38786t7 t7Var = new C38786t7();
        if (this.f82629i) {
            zzjd = zzjd.TYPE_THICK;
        } else {
            zzjd = zzjd.TYPE_THIN;
        }
        t7Var.mo122515e(zzjd);
        C38588e2 e2Var = new C38588e2();
        e2Var.mo122300a(Integer.valueOf(i));
        e2Var.mo122302c(h2Var);
        e2Var.mo122301b(e7Var);
        t7Var.mo122514d(e2Var.mo122303e());
        return C38596ea.m159934d(t7Var);
    }

    @C0348i1
    /* renamed from: m */
    public final void mo98935m(zzje zzje, long j, @C0359n0 C34025b bVar, @C0363p0 List<C33982a> list) {
        int i;
        C38767s0 s0Var = new C38767s0();
        C38767s0 s0Var2 = new C38767s0();
        if (list != null) {
            for (C33982a next : list) {
                s0Var.mo122498e(C34010b.m136822a(next.mo98845h()));
                s0Var2.mo122498e(C34010b.m136823b(next.mo98852o()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f82626f.mo122237b(new C34016h(this, elapsedRealtime, zzje, s0Var, s0Var2, bVar), zzjf.ON_DEVICE_BARCODE_DETECT);
        C38601f2 f2Var = new C38601f2();
        f2Var.mo122326e(zzje);
        f2Var.mo122327f(Boolean.valueOf(f82623k));
        f2Var.mo122328g(C34010b.m136824c(this.f82624d));
        f2Var.mo122324c(s0Var.mo122500g());
        f2Var.mo122325d(s0Var2.mo122500g());
        long j2 = elapsedRealtime;
        this.f82626f.mo122241f(f2Var.mo122329h(), j2, zzjf.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new C34015g(this));
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f82629i;
        long j3 = currentTimeMillis - elapsedRealtime;
        C38583da daVar = this.f82627g;
        if (true != z) {
            i = 24301;
        } else {
            i = 24302;
        }
        daVar.mo122287c(i, zzje.zza(), j3, currentTimeMillis);
    }
}
