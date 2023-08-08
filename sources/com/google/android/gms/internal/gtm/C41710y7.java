package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.y7 */
public final class C41710y7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f105297a;

    /* renamed from: b */
    public final /* synthetic */ String f105298b;

    /* renamed from: c */
    public final /* synthetic */ C41375k8 f105299c;

    public C41710y7(C41375k8 k8Var, String str, String str2, String str3) {
        this.f105299c = k8Var;
        this.f105297a = str;
        this.f105298b = str2;
    }

    public final void run() {
        String str = this.f105297a;
        StringBuilder sb = new StringBuilder(str.length() + 28);
        sb.append("Starting to load container ");
        sb.append(str);
        sb.append(".");
        C41493p6.m168152d(sb.toString());
        if (this.f105299c.f104760l != 1) {
            C41660w5.m168645c("Unexpected state - container loading already initiated.", this.f105299c.f104749a);
            return;
        }
        this.f105299c.f104760l = 2;
        this.f105299c.f104752d.mo135855c(this.f105297a, this.f105298b, (String) null, new C41326i8(this.f105299c, (C41302h8) null));
    }
}
