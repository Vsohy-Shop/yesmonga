package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.gtm.C41294h0;
import com.google.android.gms.internal.gtm.C41559s0;
import com.google.android.gms.internal.gtm.C41606u;
import com.google.android.gms.internal.gtm.C41611u4;
import com.google.android.gms.internal.gtm.C41655w0;
import com.google.android.gms.internal.gtm.C41706y3;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.d0 */
public final class C40378d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map f102912a;

    /* renamed from: b */
    public final /* synthetic */ boolean f102913b;

    /* renamed from: c */
    public final /* synthetic */ String f102914c;

    /* renamed from: d */
    public final /* synthetic */ long f102915d;

    /* renamed from: e */
    public final /* synthetic */ boolean f102916e;

    /* renamed from: f */
    public final /* synthetic */ boolean f102917f;

    /* renamed from: g */
    public final /* synthetic */ String f102918g;

    /* renamed from: v */
    public final /* synthetic */ C40397i f102919v;

    public C40378d0(C40397i iVar, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f102919v = iVar;
        this.f102912a = map;
        this.f102913b = z;
        this.f102914c = str;
        this.f102915d = j;
        this.f102916e = z2;
        this.f102917f = z3;
        this.f102918g = str2;
    }

    public final void run() {
        String str;
        double d;
        if (this.f102919v.f102961g.mo133299c0()) {
            this.f102912a.put("sc", "start");
        }
        Map map = this.f102912a;
        C40379e I = this.f102919v.mo135735I();
        C40843u.m166201k("getClientId can not be called from the main thread");
        String Z = I.mo133418e().mo135898i().mo135656Z();
        if (Z != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", Z);
        }
        String str2 = (String) this.f102912a.get("sf");
        if (str2 != null) {
            try {
                d = Double.parseDouble(str2);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (C41611u4.m168474j(d, (String) this.f102912a.get("cid"))) {
                this.f102919v.mo135751n("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        C41294h0 g1 = this.f102919v.mo135737K();
        if (this.f102913b) {
            Map map2 = this.f102912a;
            boolean Z2 = g1.mo135422Z();
            if (!map2.containsKey("ate")) {
                if (true != Z2) {
                    str = "0";
                } else {
                    str = "1";
                }
                map2.put("ate", str);
            }
            C41611u4.m168471g(this.f102912a, "adid", g1.mo135421X());
        } else {
            this.f102912a.remove("ate");
            this.f102912a.remove("adid");
        }
        C41606u X = this.f102919v.mo135740N().mo135356X();
        C41611u4.m168471g(this.f102912a, "an", X.mo135883g());
        C41611u4.m168471g(this.f102912a, "av", X.mo135884h());
        C41611u4.m168471g(this.f102912a, "aid", X.mo135881e());
        C41611u4.m168471g(this.f102912a, "aiid", X.mo135882f());
        this.f102912a.put(C9851c.f26937h, "1");
        this.f102912a.put("_v", C41559s0.f104934b);
        C41611u4.m168471g(this.f102912a, "ul", this.f102919v.mo135743Q().mo136014X().mo136115e());
        C41611u4.m168471g(this.f102912a, "sr", this.f102919v.mo135743Q().mo136015Z());
        if (this.f102914c.equals("transaction") || this.f102914c.equals("item") || this.f102919v.f102960f.mo134994a()) {
            long a = C41611u4.m168465a((String) this.f102912a.get("ht"));
            if (a == 0) {
                a = this.f102915d;
            }
            long j = a;
            if (this.f102916e) {
                this.f102919v.mo135745S().mo135758u("Dry run enabled. Would have sent hit", new C41706y3(this.f102919v, this.f102912a, j, this.f102917f));
                return;
            }
            String str3 = (String) this.f102912a.get("cid");
            HashMap hashMap = new HashMap();
            C41611u4.m168472h(hashMap, "uid", this.f102912a);
            C41611u4.m168472h(hashMap, "an", this.f102912a);
            C41611u4.m168472h(hashMap, "aid", this.f102912a);
            C41611u4.m168472h(hashMap, "av", this.f102912a);
            C41611u4.m168472h(hashMap, "aiid", this.f102912a);
            C40843u.m166202l(str3);
            this.f102912a.put("_s", String.valueOf(this.f102919v.mo135738L().mo135690X(new C41655w0(0, str3, this.f102918g, !TextUtils.isEmpty((CharSequence) this.f102912a.get("adid")), 0, hashMap))));
            this.f102919v.mo135738L().mo135695e0(new C41706y3(this.f102919v, this.f102912a, j, this.f102917f));
            return;
        }
        this.f102919v.mo135745S().mo135212a0(this.f102912a, "Too many hits sent too quickly, rate limiting invoked");
    }
}
