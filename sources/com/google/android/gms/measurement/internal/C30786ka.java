package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41981h5;
import com.google.android.gms.internal.measurement.C42240w4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ka */
public final class C30786ka {

    /* renamed from: a */
    public C41981h5 f73687a;

    /* renamed from: b */
    public List f73688b;

    /* renamed from: c */
    public List f73689c;

    /* renamed from: d */
    public long f73690d;

    /* renamed from: e */
    public final /* synthetic */ C30822na f73691e;

    public /* synthetic */ C30786ka(C30822na naVar, C30774ja jaVar) {
        this.f73691e = naVar;
    }

    /* renamed from: b */
    public static final long m123874b(C42240w4 w4Var) {
        return ((w4Var.mo137398E() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo87203a(long j, C42240w4 w4Var) {
        C40843u.m166202l(w4Var);
        if (this.f73689c == null) {
            this.f73689c = new ArrayList();
        }
        if (this.f73688b == null) {
            this.f73688b = new ArrayList();
        }
        if (!this.f73689c.isEmpty() && m123874b((C42240w4) this.f73689c.get(0)) != m123874b(w4Var)) {
            return false;
        }
        long b = this.f73690d + ((long) w4Var.mo137271b());
        this.f73691e.mo87358U();
        if (b >= ((long) Math.max(0, ((Integer) C30742h3.f73541k.mo87094a((Object) null)).intValue()))) {
            return false;
        }
        this.f73690d = b;
        this.f73689c.add(w4Var);
        this.f73688b.add(Long.valueOf(j));
        int size = this.f73689c.size();
        this.f73691e.mo87358U();
        if (size >= Math.max(1, ((Integer) C30742h3.f73543l.mo87094a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
