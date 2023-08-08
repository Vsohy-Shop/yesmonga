package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;

/* renamed from: com.google.android.gms.internal.gtm.h7 */
public final class C41301h7 {

    /* renamed from: a */
    public double f104652a = 60.0d;

    /* renamed from: b */
    public long f104653b;

    /* renamed from: c */
    public final Object f104654c = new Object();

    /* renamed from: d */
    public final C40979g f104655d = C40985k.m166636d();

    /* renamed from: a */
    public final boolean mo135432a() {
        synchronized (this.f104654c) {
            long a = this.f104655d.mo134768a();
            double d = this.f104652a;
            if (d < 60.0d) {
                double d2 = ((double) (a - this.f104653b)) / 2000.0d;
                if (d2 > 0.0d) {
                    d = Math.min(60.0d, d + d2);
                    this.f104652a = d;
                }
            }
            this.f104653b = a;
            if (d >= 1.0d) {
                this.f104652a = d - 4.0d;
                return true;
            }
            C41493p6.m168153e("No more tokens available.");
            return false;
        }
    }
}
