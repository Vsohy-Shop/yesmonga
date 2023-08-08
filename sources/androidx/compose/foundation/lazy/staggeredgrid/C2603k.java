package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n878#2:1098\n880#2:1100\n879#2:1101\n878#2:1103\n880#2:1105\n879#2:1106\n878#2:1108\n55#3:1099\n62#3:1102\n55#3:1104\n62#3:1107\n55#3:1109\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n993#1:1098\n993#1:1100\n993#1:1101\n994#1:1103\n994#1:1105\n994#1:1106\n994#1:1108\n993#1:1099\n993#1:1102\n994#1:1104\n994#1:1107\n994#1:1109\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.k */
public final class C2603k {

    /* renamed from: a */
    public final boolean f6883a;
    @C12579k

    /* renamed from: b */
    public final C2549h f6884b;
    @C12579k

    /* renamed from: c */
    public final C2552k f6885c;
    @C12579k

    /* renamed from: d */
    public final int[] f6886d;

    /* renamed from: e */
    public final int f6887e;
    @C12579k

    /* renamed from: f */
    public final C2612s f6888f;

    public C2603k(boolean z, @C12579k C2549h hVar, @C12579k C2552k kVar, @C12579k int[] iArr, int i, @C12579k C2612s sVar) {
        Intrinsics.checkNotNullParameter(hVar, "itemProvider");
        Intrinsics.checkNotNullParameter(kVar, "measureScope");
        Intrinsics.checkNotNullParameter(iArr, "resolvedSlotSums");
        Intrinsics.checkNotNullParameter(sVar, "measuredItemFactory");
        this.f6883a = z;
        this.f6884b = hVar;
        this.f6885c = kVar;
        this.f6886d = iArr;
        this.f6887e = i;
        this.f6888f = sVar;
    }

    /* renamed from: a */
    public final long mo8978a(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 0;
        } else {
            i3 = this.f6886d[i - 1];
        }
        int i4 = (this.f6886d[(i + i2) - 1] - i3) + (this.f6887e * (i2 - 1));
        if (this.f6883a) {
            return C16476b.f40850b.mo47812e(i4);
        }
        return C16476b.f40850b.mo47811d(i4);
    }

    @C12579k
    /* renamed from: b */
    public final C2605m mo8979b(int i, long j) {
        int i2 = (int) (j >> 32);
        int i3 = ((int) (j & 4294967295L)) - i2;
        return this.f6888f.mo8977a(i, i2, i3, this.f6884b.mo8293g(i), this.f6885c.mo8740s1(i, mo8978a(i2, i3)));
    }
}
