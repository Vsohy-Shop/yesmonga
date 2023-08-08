package com.google.firebase.perf.transport;

import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.C40087h;
import com.google.firebase.inject.C33058b;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.PerfMetric;

/* renamed from: com.google.firebase.perf.transport.b */
public final class C33414b {

    /* renamed from: d */
    public static final C33363a f81216d = C33363a.m134449e();

    /* renamed from: a */
    public final String f81217a;

    /* renamed from: b */
    public final C33058b<C40087h> f81218b;

    /* renamed from: c */
    public C40086g<PerfMetric> f81219c;

    public C33414b(C33058b<C40087h> bVar, String str) {
        this.f81217a = str;
        this.f81218b = bVar;
    }

    /* renamed from: a */
    public final boolean mo96829a() {
        if (this.f81219c == null) {
            C40087h hVar = this.f81218b.get();
            if (hVar != null) {
                this.f81219c = hVar.mo132669b(this.f81217a, PerfMetric.class, C40041c.m163048b("proto"), new C33413a());
            } else {
                f81216d.mo96439l("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f81219c != null) {
            return true;
        }
        return false;
    }

    @C0348i1
    /* renamed from: b */
    public void mo96830b(@C0359n0 PerfMetric perfMetric) {
        if (!mo96829a()) {
            f81216d.mo96439l("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f81219c.mo132667b(C40083d.m163240e(perfMetric));
        }
    }
}
