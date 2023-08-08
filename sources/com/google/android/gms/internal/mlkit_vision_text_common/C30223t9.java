package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
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
import com.google.mlkit.vision.text.internal.C34098o;
import com.google.mlkit.vision.text.internal.C34099p;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.t9 */
public final class C30223t9 {
    @C0363p0

    /* renamed from: j */
    public static zzbm<String> f72232j;

    /* renamed from: a */
    public final String f72233a;

    /* renamed from: b */
    public final String f72234b;

    /* renamed from: c */
    public final C30211s9 f72235c;

    /* renamed from: d */
    public final C33970o f72236d;

    /* renamed from: e */
    public final C31047k<String> f72237e;

    /* renamed from: f */
    public final C31047k<String> f72238f;

    /* renamed from: g */
    public final String f72239g;

    /* renamed from: h */
    public final Map<zziv, Long> f72240h = new HashMap();

    /* renamed from: i */
    public final Map<zziv, C30070h0<Object, Long>> f72241i = new HashMap();

    public C30223t9(Context context, C33970o oVar, C30211s9 s9Var, String str) {
        this.f72233a = context.getPackageName();
        this.f72234b = C33933c.m136569a(context);
        this.f72236d = oVar;
        this.f72235c = s9Var;
        this.f72239g = str;
        this.f72237e = C33943h.m136576b().mo98712c(new C30199r9(str));
        C33943h b = C33943h.m136576b();
        oVar.getClass();
        this.f72238f = b.mo98712c(new C30187q9(oVar));
    }

    @C0344h1
    /* renamed from: a */
    public static long m121858a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    @C0359n0
    /* renamed from: g */
    public static synchronized zzbm<String> m121859g() {
        synchronized (C30223t9.class) {
            zzbm<String> zzbm = f72232j;
            if (zzbm != null) {
                return zzbm;
            }
            C17812o a = C17785f.m81175a(Resources.getSystem().getConfiguration());
            C30034e0 e0Var = new C30034e0();
            for (int i = 0; i < a.mo52239l(); i++) {
                e0Var.mo85081c(C33933c.m136570b(a.mo52233d(i)));
            }
            zzbm<String> d = e0Var.mo85082d();
            f72232j = d;
            return d;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo85338b(C30259w9 w9Var, zziv zziv, String str) {
        String str2;
        w9Var.mo85379f(zziv);
        String b = w9Var.mo85377b();
        C30031d9 d9Var = new C30031d9();
        d9Var.mo85065b(this.f72233a);
        d9Var.mo85066c(this.f72234b);
        d9Var.mo85071h(m121859g());
        d9Var.mo85070g(Boolean.TRUE);
        d9Var.mo85074k(b);
        d9Var.mo85073j(str);
        if (this.f72238f.mo87738v()) {
            str2 = this.f72238f.mo87734r();
        } else {
            str2 = this.f72236d.mo98815i();
        }
        d9Var.mo85072i(str2);
        d9Var.mo85067d(10);
        w9Var.mo85380g(d9Var);
        this.f72235c.mo85042a(w9Var);
    }

    /* renamed from: c */
    public final void mo85339c(C30259w9 w9Var, zziv zziv) {
        mo85340d(w9Var, zziv, mo85343h());
    }

    /* renamed from: d */
    public final void mo85340d(C30259w9 w9Var, zziv zziv, String str) {
        C33943h.m136577g().execute(new C30175p9(this, w9Var, zziv, str, (byte[]) null));
    }

    @C0348i1
    /* renamed from: e */
    public final void mo85341e(C34099p pVar, zziv zziv) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo85344i(zziv, elapsedRealtime, 30)) {
            this.f72240h.put(zziv, Long.valueOf(elapsedRealtime));
            mo85340d(pVar.f82759a.mo99053k(pVar.f82760b, pVar.f82761c, pVar.f82762d), zziv, mo85343h());
        }
    }

    @C0348i1
    /* renamed from: f */
    public final <K> void mo85342f(K k, long j, zziv zziv, C34098o oVar) {
        if (!this.f72241i.containsKey(zziv)) {
            this.f72241i.put(zziv, zzar.m121960n());
        }
        C30070h0 h0Var = this.f72241i.get(zziv);
        h0Var.mo85280a(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo85344i(zziv, elapsedRealtime, 30)) {
            this.f72240h.put(zziv, Long.valueOf(elapsedRealtime));
            for (Object next : h0Var.mo85287u()) {
                List<Long> b = h0Var.mo85137b(next);
                Collections.sort(b);
                C30244v6 v6Var = new C30244v6();
                long j2 = 0;
                for (Long longValue : b) {
                    j2 += longValue.longValue();
                }
                v6Var.mo85358a(Long.valueOf(j2 / ((long) b.size())));
                v6Var.mo85360c(Long.valueOf(m121858a(b, 100.0d)));
                v6Var.mo85363f(Long.valueOf(m121858a(b, 75.0d)));
                v6Var.mo85361d(Long.valueOf(m121858a(b, 50.0d)));
                v6Var.mo85359b(Long.valueOf(m121858a(b, 25.0d)));
                v6Var.mo85362e(Long.valueOf(m121858a(b, 0.0d)));
                C30268x6 g = v6Var.mo85364g();
                mo85340d(oVar.f82758a.mo99054l((C30084i2) next, h0Var.mo85137b(next).size(), g), zziv, mo85343h());
            }
            this.f72241i.remove(zziv);
        }
    }

    @C0348i1
    /* renamed from: h */
    public final String mo85343h() {
        if (this.f72237e.mo87738v()) {
            return this.f72237e.mo87734r();
        }
        return C40805r.m165993a().mo134462b(this.f72239g);
    }

    @C0348i1
    /* renamed from: i */
    public final boolean mo85344i(zziv zziv, long j, long j2) {
        if (this.f72240h.get(zziv) != null && j - this.f72240h.get(zziv).longValue() <= TimeUnit.SECONDS.toMillis(30)) {
            return false;
        }
        return true;
    }
}
