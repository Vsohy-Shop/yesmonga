package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.v */
public final class C2507v {

    /* renamed from: a */
    public final boolean f6667a;
    @C12579k

    /* renamed from: b */
    public final List<Integer> f6668b;

    /* renamed from: c */
    public final int f6669c;

    /* renamed from: d */
    public final int f6670d;

    /* renamed from: e */
    public final int f6671e;
    @C12579k

    /* renamed from: f */
    public final C2506u f6672f;
    @C12579k

    /* renamed from: g */
    public final LazyGridSpanLayoutProvider f6673g;
    @C12579k

    /* renamed from: h */
    public final C2512z f6674h;

    public C2507v(boolean z, @C12579k List<Integer> list, int i, int i2, int i3, @C12579k C2506u uVar, @C12579k LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, @C12579k C2512z zVar) {
        Intrinsics.checkNotNullParameter(list, "slotSizesSums");
        Intrinsics.checkNotNullParameter(uVar, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(lazyGridSpanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(zVar, "measuredLineFactory");
        this.f6667a = z;
        this.f6668b = list;
        this.f6669c = i;
        this.f6670d = i2;
        this.f6671e = i3;
        this.f6672f = uVar;
        this.f6673g = lazyGridSpanLayoutProvider;
        this.f6674h = zVar;
    }

    /* renamed from: a */
    public final long mo8629a(int i, int i2) {
        int i3;
        int intValue = this.f6668b.get((i + i2) - 1).intValue();
        if (i == 0) {
            i3 = 0;
        } else {
            i3 = this.f6668b.get(i - 1).intValue();
        }
        int u = C11479u.m44447u((intValue - i3) + (this.f6669c * (i2 - 1)), 0);
        if (this.f6667a) {
            return C16476b.f40850b.mo47812e(u);
        }
        return C16476b.f40850b.mo47811d(u);
    }

    @C12579k
    /* renamed from: b */
    public final C2501p mo8630b(int i) {
        int i2;
        LazyGridSpanLayoutProvider.C2479c c = this.f6673g.mo8478c(i);
        int size = c.mo8492b().size();
        if (size == 0 || c.mo8491a() + size == this.f6670d) {
            i2 = 0;
        } else {
            i2 = this.f6671e;
        }
        C2500o[] oVarArr = new C2500o[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int f = C2488d.m11161f(c.mo8492b().get(i4).mo8563i());
            C2500o a = this.f6672f.mo8627a(C2489e.m11167c(c.mo8491a() + i4), i2, mo8629a(i3, f));
            i3 += f;
            C11079d2 d2Var = C11079d2.f28267a;
            oVarArr[i4] = a;
        }
        return this.f6674h.mo8462a(i, oVarArr, c.mo8492b(), i2);
    }

    @C12579k
    /* renamed from: c */
    public final Map<Object, Integer> mo8631c() {
        return this.f6672f.mo8628c();
    }

    /* renamed from: d */
    public final long mo8632d(int i) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.f6673g;
        return mo8629a(0, lazyGridSpanLayoutProvider.mo8484i(i, lazyGridSpanLayoutProvider.mo8480e()));
    }
}
