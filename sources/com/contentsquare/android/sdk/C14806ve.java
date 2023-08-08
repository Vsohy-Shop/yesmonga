package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.ve */
public final class C14806ve implements C14502lc {

    /* renamed from: a */
    public final List<C14374ga> f36701a = new ArrayList();

    /* renamed from: b */
    public C14923z8 f36702b = C14923z8.HIGH;

    /* renamed from: c */
    public int f36703c;

    /* renamed from: d */
    public final C14453jf f36704d;

    public C14806ve(C14476k7 k7Var) {
        Intrinsics.checkNotNullParameter(k7Var, "deviceInfo");
        this.f36703c = k7Var.mo35757g();
        this.f36704d = new C14453jf("QualityChangeProvider");
    }

    /* renamed from: a */
    public void mo35238a() {
    }

    /* renamed from: b */
    public final String mo36647b(int i) {
        return (i == -1 || i == 0) ? "Error" : i != 1 ? "Cellular" : "Wifi";
    }

    /* renamed from: c */
    public synchronized List<C14374ga> mo35239c(C14507le leVar, long j) {
        List<C14374ga> T5;
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        T5 = CollectionsKt___CollectionsKt.m40572T5(this.f36701a);
        this.f36701a.clear();
        return T5;
    }

    /* renamed from: d */
    public final synchronized void mo36648d(C14889y8 y8Var, C14923z8 z8Var, int i) {
        C14923z8 z8Var2 = z8Var;
        int i2 = i;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(y8Var, "reason");
            Intrinsics.checkNotNullParameter(z8Var2, "currentQualityLevel");
            if (!(i2 == -1 || z8Var2 == this.f36702b)) {
                this.f36701a.add(new C14785v0(System.currentTimeMillis(), y8Var, this.f36702b, z8Var, this.f36703c, i));
                mo36649e(y8Var, this.f36702b, z8Var, this.f36703c, i);
                this.f36702b = z8Var2;
                this.f36703c = i2;
            }
        }
    }

    /* renamed from: e */
    public final void mo36649e(C14889y8 y8Var, C14923z8 z8Var, C14923z8 z8Var2, int i, int i2) {
        String str = "Sr QualityChanged event added: " + y8Var + " | " + z8Var.name() + " -> " + z8Var2.name();
        if (y8Var == C14889y8.NETWORK_CHANGED) {
            str = str + " | " + mo36647b(i) + " -> " + mo36647b(i2);
        }
        this.f36704d.mo35676e(str);
    }

    /* renamed from: f */
    public final void mo36650f(C14923z8 z8Var) {
        Intrinsics.checkNotNullParameter(z8Var, "<set-?>");
        this.f36702b = z8Var;
    }

    /* renamed from: c */
    public void mo35240c() {
    }
}
