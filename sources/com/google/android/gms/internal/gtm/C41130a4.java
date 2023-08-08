package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.a4 */
public final class C41130a4 {

    /* renamed from: a */
    public double f104422a = 60.0d;

    /* renamed from: b */
    public long f104423b;

    /* renamed from: c */
    public final Object f104424c = new Object();

    /* renamed from: d */
    public final String f104425d = "tracking";

    /* renamed from: e */
    public final C40979g f104426e;

    public C41130a4(int i, long j, String str, C40979g gVar) {
        this.f104426e = gVar;
    }

    /* renamed from: a */
    public final boolean mo134994a() {
        synchronized (this.f104424c) {
            long a = this.f104426e.mo134768a();
            double d = this.f104422a;
            if (d < 60.0d) {
                double d2 = ((double) (a - this.f104423b)) / 2000.0d;
                if (d2 > 0.0d) {
                    d = Math.min(60.0d, d + d2);
                    this.f104422a = d;
                }
            }
            this.f104423b = a;
            if (d >= 1.0d) {
                this.f104422a = d - 4.0d;
                return true;
            }
            String str = this.f104425d;
            StringBuilder sb = new StringBuilder(str.length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            C41178c4.m167251e(sb.toString());
            return false;
        }
    }
}
