package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_vision_text_common.C29992a7;
import com.google.android.gms.internal.mlkit_vision_text_common.C30041e7;
import com.google.android.gms.internal.mlkit_vision_text_common.C30044ea;
import com.google.android.gms.internal.mlkit_vision_text_common.C30048f2;
import com.google.android.gms.internal.mlkit_vision_text_common.C30060g2;
import com.google.android.gms.internal.mlkit_vision_text_common.C30084i2;
import com.google.android.gms.internal.mlkit_vision_text_common.C30137m7;
import com.google.android.gms.internal.mlkit_vision_text_common.C30223t9;
import com.google.android.gms.internal.mlkit_vision_text_common.C30234u8;
import com.google.android.gms.internal.mlkit_vision_text_common.C30247v9;
import com.google.android.gms.internal.mlkit_vision_text_common.C30258w8;
import com.google.android.gms.internal.mlkit_vision_text_common.C30259w9;
import com.google.android.gms.internal.mlkit_vision_text_common.C30268x6;
import com.google.android.gms.internal.mlkit_vision_text_common.C30270x8;
import com.google.android.gms.internal.mlkit_vision_text_common.zzih;
import com.google.android.gms.internal.mlkit_vision_text_common.zzit;
import com.google.android.gms.internal.mlkit_vision_text_common.zziu;
import com.google.android.gms.internal.mlkit_vision_text_common.zziv;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33941g;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.C33971p;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34036f;
import com.google.mlkit.vision.text.C34049b;
import com.google.mlkit.vision.text.C34079e;

/* renamed from: com.google.mlkit.vision.text.internal.b */
public class C34085b extends C33941g<C34049b, C34025b> {
    @C40473a

    /* renamed from: h */
    public static final C33971p f82732h = new C33971p();
    @C0344h1

    /* renamed from: i */
    public static boolean f82733i = true;

    /* renamed from: j */
    public static final C34036f f82734j = C34036f.m136944b();
    @C0323b0("this")
    @C0359n0

    /* renamed from: d */
    public final C34095l f82735d;

    /* renamed from: e */
    public final C30223t9 f82736e;

    /* renamed from: f */
    public final C30247v9 f82737f;

    /* renamed from: g */
    public final C34079e f82738g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34085b(@RecentlyNonNull C33947j jVar, @RecentlyNonNull C34079e eVar) {
        super(f82732h);
        C34095l lVar;
        C30223t9 b = C30044ea.m121656b(eVar.mo99046b());
        Context b2 = jVar.mo98718b();
        if (C40715h.m165670i().mo134221b(b2) >= 204700000 || eVar.mo99047c()) {
            lVar = new C34087d(b2, eVar);
        } else {
            lVar = new C34088e(b2);
        }
        this.f82736e = b;
        this.f82735d = lVar;
        this.f82737f = C30247v9.m121897a(C33947j.m136584c().mo98718b());
        this.f82738g = eVar;
    }

    @C0348i1
    /* renamed from: c */
    public final synchronized void mo98728c() throws MlKitException {
        this.f82735d.zzb();
    }

    @C0348i1
    /* renamed from: e */
    public final synchronized void mo98730e() {
        f82733i = true;
        this.f82735d.mo99057d();
    }

    @RecentlyNonNull
    @C0348i1
    /* renamed from: j */
    public final synchronized C34049b mo98710i(@RecentlyNonNull C34025b bVar) throws MlKitException {
        zziu zziu;
        C34049b a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            a = this.f82735d.mo99056a(bVar);
            mo99055m(zziu.NO_ERROR, elapsedRealtime, bVar);
            f82733i = false;
        } catch (MlKitException e) {
            if (e.mo98621a() == 14) {
                zziu = zziu.MODEL_NOT_DOWNLOADED;
            } else {
                zziu = zziu.UNKNOWN_ERROR;
            }
            mo99055m(zziu, elapsedRealtime, bVar);
            throw e;
        }
        return a;
    }

    /* renamed from: k */
    public final /* synthetic */ C30259w9 mo99053k(long j, zziu zziu, C34025b bVar) {
        zzih zzih;
        zzit zzit;
        C30234u8 u8Var = new C30234u8();
        C30041e7 e7Var = new C30041e7();
        e7Var.mo85087c(Long.valueOf(j));
        e7Var.mo85088d(zziu);
        e7Var.mo85089e(Boolean.valueOf(f82733i));
        Boolean bool = Boolean.TRUE;
        e7Var.mo85085a(bool);
        e7Var.mo85086b(bool);
        u8Var.mo85349d(e7Var.mo85090f());
        C34036f fVar = f82734j;
        int c = fVar.mo98989c(bVar);
        int d = fVar.mo98990d(bVar);
        C29992a7 a7Var = new C29992a7();
        if (c == -1) {
            zzih = zzih.BITMAP;
        } else if (c == 35) {
            zzih = zzih.YUV_420_888;
        } else if (c == 842094169) {
            zzih = zzih.YV12;
        } else if (c == 16) {
            zzih = zzih.NV16;
        } else if (c != 17) {
            zzih = zzih.UNKNOWN_FORMAT;
        } else {
            zzih = zzih.NV21;
        }
        a7Var.mo85036a(zzih);
        a7Var.mo85037b(Integer.valueOf(d));
        u8Var.mo85348c(a7Var.mo85038d());
        C30270x8 x8Var = new C30270x8();
        x8Var.mo85395a(C34084a.m137031a(this.f82738g.mo99050f()));
        u8Var.mo85350e(x8Var.mo85396c());
        C30258w8 f = u8Var.mo85351f();
        C30137m7 m7Var = new C30137m7();
        if (this.f82738g.mo99047c()) {
            zzit = zzit.TYPE_THICK;
        } else {
            zzit = zzit.TYPE_THIN;
        }
        m7Var.mo85229e(zzit);
        m7Var.mo85231g(f);
        return C30259w9.m121910d(m7Var);
    }

    /* renamed from: l */
    public final /* synthetic */ C30259w9 mo99054l(C30084i2 i2Var, int i, C30268x6 x6Var) {
        zzit zzit;
        C30137m7 m7Var = new C30137m7();
        if (this.f82738g.mo99047c()) {
            zzit = zzit.TYPE_THICK;
        } else {
            zzit = zzit.TYPE_THIN;
        }
        m7Var.mo85229e(zzit);
        C30048f2 f2Var = new C30048f2();
        f2Var.mo85100a(Integer.valueOf(i));
        f2Var.mo85102c(i2Var);
        f2Var.mo85101b(x6Var);
        m7Var.mo85228d(f2Var.mo85103e());
        return C30259w9.m121910d(m7Var);
    }

    @C0348i1
    /* renamed from: m */
    public final void mo99055m(zziu zziu, long j, C34025b bVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f82736e.mo85341e(new C34099p(this, elapsedRealtime, zziu, bVar), zziv.ON_DEVICE_TEXT_DETECT);
        C30060g2 g2Var = new C30060g2();
        g2Var.mo85125a(zziu);
        g2Var.mo85126b(Boolean.valueOf(f82733i));
        C30270x8 x8Var = new C30270x8();
        x8Var.mo85395a(C34084a.m137031a(this.f82738g.mo99050f()));
        g2Var.mo85127c(x8Var.mo85396c());
        long j2 = elapsedRealtime;
        this.f82736e.mo85342f(g2Var.mo85128d(), j2, zziv.AGGREGATED_ON_DEVICE_TEXT_DETECTION, new C34098o(this));
        long currentTimeMillis = System.currentTimeMillis();
        this.f82737f.mo85366c(this.f82738g.mo99048d(), zziu.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
