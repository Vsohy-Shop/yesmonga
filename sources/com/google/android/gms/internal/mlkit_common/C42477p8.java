package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.p027os.C17785f;
import androidx.core.p027os.C17812o;
import com.google.android.gms.common.internal.C40805r;
import com.google.android.gms.tasks.C31047k;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33933c;
import com.google.mlkit.common.sdkinternal.C33943h;
import com.google.mlkit.common.sdkinternal.C33970o;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_common.p8 */
public final class C42477p8 {
    @C0363p0

    /* renamed from: j */
    public static zzan<String> f107274j;

    /* renamed from: a */
    public final String f107275a;

    /* renamed from: b */
    public final String f107276b;

    /* renamed from: c */
    public final C42466o8 f107277c;

    /* renamed from: d */
    public final C33970o f107278d;

    /* renamed from: e */
    public final C31047k<String> f107279e;

    /* renamed from: f */
    public final C31047k<String> f107280f;

    /* renamed from: g */
    public final String f107281g;

    /* renamed from: h */
    public final Map<zzgz, Long> f107282h = new HashMap();

    /* renamed from: i */
    public final Map<zzgz, Object> f107283i = new HashMap();

    public C42477p8(Context context, C33970o oVar, C42466o8 o8Var, String str) {
        this.f107275a = context.getPackageName();
        this.f107276b = C33933c.m136569a(context);
        this.f107278d = oVar;
        this.f107277c = o8Var;
        this.f107281g = str;
        this.f107279e = C33943h.m136576b().mo98712c(new C42455n8(str));
        C33943h b = C33943h.m136576b();
        oVar.getClass();
        this.f107280f = b.mo98712c(new C42444m8(oVar));
    }

    @C0359n0
    /* renamed from: g */
    public static synchronized zzan<String> m171587g() {
        synchronized (C42477p8.class) {
            zzan<String> zzan = f107274j;
            if (zzan != null) {
                return zzan;
            }
            C17812o a = C17785f.m81175a(Resources.getSystem().getConfiguration());
            C42413k kVar = new C42413k();
            for (int i = 0; i < a.mo52239l(); i++) {
                kVar.mo137722c(C33933c.m136570b(a.mo52233d(i)));
            }
            zzan<String> d = kVar.mo137723d();
            f107274j = d;
            return d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo137759a(C42378g8 g8Var, zzgz zzgz, String str) {
        g8Var.mo137697d(zzgz);
        g8Var.mo137696c(mo137765h(g8Var.mo137698e(), str));
        this.f107277c.mo137721a(g8Var);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo137760b(C42378g8 g8Var, C42499r8 r8Var, C33920d dVar) {
        g8Var.mo137697d(zzgz.MODEL_DOWNLOAD);
        g8Var.mo137696c(mo137765h(r8Var.mo137676e(), mo137766i()));
        g8Var.mo137694a(C42335c9.m171443a(dVar, this.f107278d, r8Var));
        this.f107277c.mo137721a(g8Var);
    }

    /* renamed from: c */
    public final void mo137761c(C42378g8 g8Var, zzgz zzgz) {
        C33943h.m136577g().execute(new C42422k8(this, g8Var, zzgz, mo137766i()));
    }

    /* renamed from: d */
    public final void mo137762d(C42378g8 g8Var, C33920d dVar, boolean z, int i) {
        C42488q8 h = C42499r8.m171636h();
        h.mo137656f(false);
        h.mo137654d(dVar.mo98681e());
        h.mo137651a(zzhe.FAILED);
        h.mo137652b(zzgy.DOWNLOAD_FAILED);
        h.mo137653c(i);
        mo137764f(g8Var, dVar, h.mo137657g());
    }

    /* renamed from: e */
    public final void mo137763e(C42378g8 g8Var, C33920d dVar, zzgy zzgy, boolean z, ModelType modelType, zzhe zzhe) {
        C42488q8 h = C42499r8.m171636h();
        h.mo137656f(z);
        h.mo137654d(modelType);
        h.mo137652b(zzgy);
        h.mo137651a(zzhe);
        mo137764f(g8Var, dVar, h.mo137657g());
    }

    /* renamed from: f */
    public final void mo137764f(C42378g8 g8Var, C33920d dVar, C42499r8 r8Var) {
        C33943h.m136577g().execute(new C42433l8(this, g8Var, r8Var, dVar));
    }

    /* renamed from: h */
    public final C42498r7 mo137765h(String str, String str2) {
        String str3;
        C42498r7 r7Var = new C42498r7();
        r7Var.mo137778b(this.f107275a);
        r7Var.mo137779c(this.f107276b);
        r7Var.mo137784h(m171587g());
        r7Var.mo137783g(Boolean.TRUE);
        r7Var.mo137787k(str);
        r7Var.mo137786j(str2);
        if (this.f107280f.mo87738v()) {
            str3 = this.f107280f.mo87734r();
        } else {
            str3 = this.f107278d.mo98815i();
        }
        r7Var.mo137785i(str3);
        r7Var.mo137780d(10);
        return r7Var;
    }

    @C0348i1
    /* renamed from: i */
    public final String mo137766i() {
        if (this.f107279e.mo87738v()) {
            return this.f107279e.mo87734r();
        }
        return C40805r.m165993a().mo134462b(this.f107281g);
    }
}
