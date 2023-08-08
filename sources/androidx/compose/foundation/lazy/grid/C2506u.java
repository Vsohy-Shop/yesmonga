package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.lazy.grid.u */
public final class C2506u {
    @C12579k

    /* renamed from: a */
    public final C2495j f6663a;
    @C12579k

    /* renamed from: b */
    public final C2552k f6664b;

    /* renamed from: c */
    public final int f6665c;
    @C12579k

    /* renamed from: d */
    public final C2511y f6666d;

    @C2855v
    public C2506u(@C12579k C2495j jVar, @C12579k C2552k kVar, int i, @C12579k C2511y yVar) {
        Intrinsics.checkNotNullParameter(jVar, "itemProvider");
        Intrinsics.checkNotNullParameter(kVar, "measureScope");
        Intrinsics.checkNotNullParameter(yVar, "measuredItemFactory");
        this.f6663a = jVar;
        this.f6664b = kVar;
        this.f6665c = i;
        this.f6666d = yVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C2500o m11263b(C2506u uVar, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = uVar.f6665c;
        }
        return uVar.mo8627a(i, i2, j);
    }

    @C12579k
    /* renamed from: a */
    public final C2500o mo8627a(int i, int i2, long j) {
        int q;
        Object g = this.f6663a.mo8293g(i);
        List<C15611w0> s1 = this.f6664b.mo8740s1(i, j);
        if (C16476b.m74360n(j)) {
            q = C16476b.m74364r(j);
        } else if (C16476b.m74358l(j)) {
            q = C16476b.m74363q(j);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return this.f6666d.mo8461a(i, g, q, i2, s1);
    }

    @C12579k
    /* renamed from: c */
    public final Map<Object, Integer> mo8628c() {
        return this.f6663a.mo8292f();
    }
}
