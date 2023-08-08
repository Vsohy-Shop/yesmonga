package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.p027os.C17785f;
import androidx.core.p027os.C17812o;
import com.google.android.gms.common.internal.C40805r;
import com.google.android.gms.tasks.C31047k;
import com.google.mlkit.common.sdkinternal.C33933c;
import com.google.mlkit.common.sdkinternal.C33943h;
import com.google.mlkit.common.sdkinternal.C33970o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.c7 */
public final class C39136c7 {
    @C0363p0

    /* renamed from: j */
    public static zzo<String> f99891j;

    /* renamed from: a */
    public final String f99892a;

    /* renamed from: b */
    public final String f99893b;

    /* renamed from: c */
    public final C39126b7 f99894c;

    /* renamed from: d */
    public final C33970o f99895d;

    /* renamed from: e */
    public final C31047k<String> f99896e;

    /* renamed from: f */
    public final C31047k<String> f99897f;

    /* renamed from: g */
    public final String f99898g;

    /* renamed from: h */
    public final Map<zzfs, Long> f99899h = new HashMap();

    /* renamed from: i */
    public final Map<zzfs, Object> f99900i = new HashMap();

    public C39136c7(Context context, C33970o oVar, C39126b7 b7Var, String str) {
        this.f99892a = context.getPackageName();
        this.f99893b = C33933c.m136569a(context);
        this.f99895d = oVar;
        this.f99894c = b7Var;
        this.f99898g = str;
        this.f99896e = C33943h.m136576b().mo98712c(new C39116a7(str));
        C33943h b = C33943h.m136576b();
        oVar.getClass();
        this.f99897f = b.mo98712c(new C39344z6(oVar));
    }

    @C0359n0
    /* renamed from: c */
    public static synchronized zzo<String> m161152c() {
        synchronized (C39136c7.class) {
            zzo<String> zzo = f99891j;
            if (zzo != null) {
                return zzo;
            }
            C17812o a = C17785f.m81175a(Resources.getSystem().getConfiguration());
            C39291t7 t7Var = new C39291t7();
            for (int i = 0; i < a.mo52239l(); i++) {
                t7Var.mo123335c(C33933c.m136570b(a.mo52233d(i)));
            }
            zzo<String> d = t7Var.mo123336d();
            f99891j = d;
            return d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo123237a(C39146d7 d7Var, zzfs zzfs, String str) {
        String str2;
        d7Var.mo123242d(zzfs);
        String a = d7Var.mo123240a();
        C39209k6 k6Var = new C39209k6();
        k6Var.mo123274b(this.f99892a);
        k6Var.mo123275c(this.f99893b);
        k6Var.mo123280h(m161152c());
        k6Var.mo123279g(Boolean.TRUE);
        k6Var.mo123283k(a);
        k6Var.mo123282j(str);
        if (this.f99897f.mo87738v()) {
            str2 = this.f99897f.mo87734r();
        } else {
            str2 = this.f99895d.mo98815i();
        }
        k6Var.mo123281i(str2);
        k6Var.mo123276d(10);
        d7Var.mo123243e(k6Var);
        this.f99894c.mo123231a(d7Var);
    }

    @C0348i1
    /* renamed from: b */
    public final void mo123238b(C39237n7 n7Var, zzfs zzfs) {
        zzfg zzfg;
        zzfm zzfm;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f99899h.get(zzfs) == null || elapsedRealtime - this.f99899h.get(zzfs).longValue() > TimeUnit.SECONDS.toMillis(30)) {
            this.f99899h.put(zzfs, Long.valueOf(elapsedRealtime));
            int i = n7Var.f100202a;
            int i2 = n7Var.f100203b;
            int i3 = n7Var.f100204c;
            int i4 = n7Var.f100205d;
            int i5 = n7Var.f100206e;
            long j = n7Var.f100207f;
            int i6 = n7Var.f100208g;
            C39261q4 q4Var = new C39261q4();
            if (i == -1) {
                zzfg = zzfg.BITMAP;
            } else if (i == 35) {
                zzfg = zzfg.YUV_420_888;
            } else if (i == 842094169) {
                zzfg = zzfg.YV12;
            } else if (i == 16) {
                zzfg = zzfg.NV16;
            } else if (i != 17) {
                zzfg = zzfg.UNKNOWN_FORMAT;
            } else {
                zzfg = zzfg.NV21;
            }
            q4Var.mo123311d(zzfg);
            if (i2 == 1) {
                zzfm = zzfm.BITMAP;
            } else if (i2 == 2) {
                zzfm = zzfm.BYTEARRAY;
            } else if (i2 == 3) {
                zzfm = zzfm.BYTEBUFFER;
            } else if (i2 != 4) {
                zzfm = zzfm.ANDROID_MEDIA_IMAGE;
            } else {
                zzfm = zzfm.FILEPATH;
            }
            q4Var.mo123313f(zzfm);
            q4Var.mo123310c(Integer.valueOf(i3));
            q4Var.mo123312e(Integer.valueOf(i4));
            q4Var.mo123314g(Integer.valueOf(i5));
            q4Var.mo123309b(Long.valueOf(j));
            q4Var.mo123315h(Integer.valueOf(i6));
            C39270r4 j2 = q4Var.mo123316j();
            C39324x4 x4Var = new C39324x4();
            x4Var.mo123353d(j2);
            C39146d7 c = C39146d7.m161162c(x4Var);
            if (this.f99896e.mo87738v()) {
                str = this.f99896e.mo87734r();
            } else {
                str = C40805r.m165993a().mo134462b(this.f99898g);
            }
            C33943h.m136577g().execute(new C39335y6(this, c, zzfs, str, (byte[]) null));
        }
    }
}
