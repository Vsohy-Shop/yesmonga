package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.lazy.v */
public final class C2621v {
    @C12579k

    /* renamed from: a */
    public final C2569n f6957a;
    @C12579k

    /* renamed from: b */
    public final C2552k f6958b;
    @C12579k

    /* renamed from: c */
    public final C2623x f6959c;

    /* renamed from: d */
    public final long f6960d;

    @C2855v
    public /* synthetic */ C2621v(long j, boolean z, C2569n nVar, C2552k kVar, C2623x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, nVar, kVar, xVar);
    }

    @C12579k
    /* renamed from: a */
    public final C2620u mo9033a(int i) {
        return this.f6959c.mo8303a(i, this.f6957a.mo8293g(i), this.f6958b.mo8740s1(i, this.f6960d));
    }

    /* renamed from: b */
    public final long mo9034b() {
        return this.f6960d;
    }

    @C12579k
    /* renamed from: c */
    public final Map<Object, Integer> mo9035c() {
        return this.f6957a.mo8292f();
    }

    public C2621v(long j, boolean z, C2569n nVar, C2552k kVar, C2623x xVar) {
        this.f6957a = nVar;
        this.f6958b = kVar;
        this.f6959c = xVar;
        this.f6960d = C16478c.m74377b(0, z ? C16476b.m74362p(j) : Integer.MAX_VALUE, 0, !z ? C16476b.m74361o(j) : Integer.MAX_VALUE, 5, (Object) null);
    }
}
