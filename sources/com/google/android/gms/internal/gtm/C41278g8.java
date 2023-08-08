package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.g8 */
public final class C41278g8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f104621a;

    /* renamed from: b */
    public final /* synthetic */ String f104622b;

    /* renamed from: c */
    public final /* synthetic */ C41326i8 f104623c;

    public C41278g8(C41326i8 i8Var, boolean z, String str) {
        this.f104623c = i8Var;
        this.f104621a = z;
        this.f104622b = str;
    }

    public final void run() {
        String str;
        if (this.f104623c.f104673n.f104760l == 2) {
            if (this.f104621a) {
                this.f104623c.f104673n.f104760l = 3;
                String str2 = this.f104622b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 18);
                sb.append("Container ");
                sb.append(str2);
                sb.append(" loaded.");
                C41493p6.m168152d(sb.toString());
            } else {
                this.f104623c.f104673n.f104760l = 4;
                String valueOf = String.valueOf(this.f104622b);
                if (valueOf.length() != 0) {
                    str = "Error loading container:".concat(valueOf);
                } else {
                    str = new String("Error loading container:");
                }
                C41493p6.m168149a(str);
            }
            while (!this.f104623c.f104673n.f104761m.isEmpty()) {
                this.f104623c.f104673n.f104753e.execute((Runnable) this.f104623c.f104673n.f104761m.remove());
            }
            return;
        }
        C41493p6.m168153e("Container load callback completed after timeout");
    }
}
