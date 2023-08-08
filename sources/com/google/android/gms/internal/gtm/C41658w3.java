package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.w3 */
public final class C41658w3 implements C41512q1<C41682x3> {

    /* renamed from: a */
    public final C41607u0 f105187a;

    /* renamed from: b */
    public final C41682x3 f105188b = new C41682x3();

    public C41658w3(C41607u0 u0Var) {
        this.f105187a = u0Var;
    }

    /* renamed from: a */
    public final void mo135764a(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f105188b.f105229a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f105188b.f105230b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f105188b.f105231c = str2;
        } else {
            this.f105187a.mo135902m().mo135763z("String xml configuration name not recognized", str);
        }
    }

    /* renamed from: b */
    public final void mo135765b(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f105188b.f105233e = z ? 1 : 0;
            return;
        }
        this.f105187a.mo135902m().mo135763z("Bool xml configuration name not recognized", str);
    }

    /* renamed from: c */
    public final void mo135766c(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f105188b.f105232d = i;
        } else {
            this.f105187a.mo135902m().mo135763z("Int xml configuration name not recognized", str);
        }
    }

    /* renamed from: f */
    public final void mo135767f(String str, String str2) {
    }

    public final /* bridge */ /* synthetic */ C41488p1 zza() {
        return this.f105188b;
    }
}
