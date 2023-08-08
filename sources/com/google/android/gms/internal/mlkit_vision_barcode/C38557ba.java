package com.google.android.gms.internal.mlkit_vision_barcode;

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
import com.google.mlkit.vision.barcode.internal.C34015g;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ba */
public final class C38557ba {
    @C0363p0

    /* renamed from: j */
    public static zzcc<String> f97733j;

    /* renamed from: a */
    public final String f97734a;

    /* renamed from: b */
    public final String f97735b;

    /* renamed from: c */
    public final C38544aa f97736c;

    /* renamed from: d */
    public final C33970o f97737d;

    /* renamed from: e */
    public final C31047k<String> f97738e;

    /* renamed from: f */
    public final C31047k<String> f97739f;

    /* renamed from: g */
    public final String f97740g;

    /* renamed from: h */
    public final Map<zzjf, Long> f97741h = new HashMap();

    /* renamed from: i */
    public final Map<zzjf, C38815w0<Object, Long>> f97742i = new HashMap();

    public C38557ba(Context context, C33970o oVar, C38544aa aaVar, String str) {
        this.f97734a = context.getPackageName();
        this.f97735b = C33933c.m136569a(context);
        this.f97737d = oVar;
        this.f97736c = aaVar;
        this.f97740g = str;
        this.f97738e = C33943h.m136576b().mo98712c(new C38848y9(str));
        C33943h b = C33943h.m136576b();
        oVar.getClass();
        this.f97739f = b.mo98712c(new C38836x9(oVar));
    }

    @C0344h1
    /* renamed from: a */
    public static long m159861a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    @C0359n0
    /* renamed from: g */
    public static synchronized zzcc<String> m159862g() {
        synchronized (C38557ba.class) {
            zzcc<String> zzcc = f97733j;
            if (zzcc != null) {
                return zzcc;
            }
            C17812o a = C17785f.m81175a(Resources.getSystem().getConfiguration());
            C38767s0 s0Var = new C38767s0();
            for (int i = 0; i < a.mo52239l(); i++) {
                s0Var.mo122498e(C33933c.m136570b(a.mo52233d(i)));
            }
            zzcc<String> g = s0Var.mo122500g();
            f97733j = g;
            return g;
        }
    }

    @C0348i1
    /* renamed from: b */
    public final void mo122237b(C38860z9 z9Var, zzjf zzjf) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo122243i(zzjf, elapsedRealtime, 30)) {
            this.f97741h.put(zzjf, Long.valueOf(elapsedRealtime));
            mo122240e(z9Var.zza(), zzjf, mo122242h());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo122238c(C38596ea eaVar, zzjf zzjf, String str) {
        String str2;
        eaVar.mo122315f(zzjf);
        String b = eaVar.mo122313b();
        C38647i9 i9Var = new C38647i9();
        i9Var.mo122368b(this.f97734a);
        i9Var.mo122369c(this.f97735b);
        i9Var.mo122374h(m159862g());
        i9Var.mo122373g(Boolean.TRUE);
        i9Var.mo122377k(b);
        i9Var.mo122376j(str);
        if (this.f97739f.mo87738v()) {
            str2 = this.f97739f.mo87734r();
        } else {
            str2 = this.f97737d.mo98815i();
        }
        i9Var.mo122375i(str2);
        i9Var.mo122370d(10);
        eaVar.mo122316g(i9Var);
        this.f97736c.mo122220a(eaVar);
    }

    /* renamed from: d */
    public final void mo122239d(C38596ea eaVar, zzjf zzjf) {
        mo122240e(eaVar, zzjf, mo122242h());
    }

    /* renamed from: e */
    public final void mo122240e(C38596ea eaVar, zzjf zzjf, String str) {
        C33943h.m136577g().execute(new C38824w9(this, eaVar, zzjf, str, (byte[]) null));
    }

    @C0348i1
    /* renamed from: f */
    public final <K> void mo122241f(K k, long j, zzjf zzjf, C34015g gVar) {
        if (!this.f97742i.containsKey(zzjf)) {
            this.f97742i.put(zzjf, zzbh.m160254n());
        }
        C38815w0 w0Var = this.f97742i.get(zzjf);
        w0Var.mo122292a(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo122243i(zzjf, elapsedRealtime, 30)) {
            this.f97741h.put(zzjf, Long.valueOf(elapsedRealtime));
            for (Object next : w0Var.mo122299u()) {
                List<Long> b = w0Var.mo122562b(next);
                Collections.sort(b);
                C38567c7 c7Var = new C38567c7();
                long j2 = 0;
                for (Long longValue : b) {
                    j2 += longValue.longValue();
                }
                c7Var.mo122263a(Long.valueOf(j2 / ((long) b.size())));
                c7Var.mo122265c(Long.valueOf(m159861a(b, 100.0d)));
                c7Var.mo122268f(Long.valueOf(m159861a(b, 75.0d)));
                c7Var.mo122266d(Long.valueOf(m159861a(b, 50.0d)));
                c7Var.mo122264b(Long.valueOf(m159861a(b, 25.0d)));
                c7Var.mo122267e(Long.valueOf(m159861a(b, 0.0d)));
                C38593e7 g = c7Var.mo122269g();
                mo122240e(gVar.f82615a.mo98934l((C38627h2) next, w0Var.mo122562b(next).size(), g), zzjf, mo122242h());
            }
            this.f97742i.remove(zzjf);
        }
    }

    @C0348i1
    /* renamed from: h */
    public final String mo122242h() {
        if (this.f97738e.mo87738v()) {
            return this.f97738e.mo87734r();
        }
        return C40805r.m165993a().mo134462b(this.f97740g);
    }

    @C0348i1
    /* renamed from: i */
    public final boolean mo122243i(zzjf zzjf, long j, long j2) {
        if (this.f97741h.get(zzjf) != null && j - this.f97741h.get(zzjf).longValue() <= TimeUnit.SECONDS.toMillis(30)) {
            return false;
        }
        return true;
    }
}
