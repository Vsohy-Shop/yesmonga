package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n217#1:1103\n880#2:1098\n879#2:1099\n878#2:1101\n880#2:1104\n879#2:1105\n878#2:1107\n62#3:1100\n55#3:1102\n62#3:1106\n55#3:1108\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n220#1:1103\n217#1:1098\n217#1:1099\n217#1:1101\n220#1:1104\n220#1:1105\n220#1:1107\n217#1:1100\n217#1:1102\n220#1:1106\n220#1:1108\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.j */
public final class C2601j {
    @C12579k

    /* renamed from: a */
    public final LazyStaggeredGridState f6866a;
    @C12579k

    /* renamed from: b */
    public final C2597f f6867b;
    @C12579k

    /* renamed from: c */
    public final int[] f6868c;

    /* renamed from: d */
    public final long f6869d;

    /* renamed from: e */
    public final boolean f6870e;
    @C12579k

    /* renamed from: f */
    public final C2552k f6871f;

    /* renamed from: g */
    public final int f6872g;

    /* renamed from: h */
    public final long f6873h;

    /* renamed from: i */
    public final int f6874i;

    /* renamed from: j */
    public final int f6875j;

    /* renamed from: k */
    public final boolean f6876k;

    /* renamed from: l */
    public final int f6877l;

    /* renamed from: m */
    public final int f6878m;
    @C12579k

    /* renamed from: n */
    public final C2603k f6879n;
    @C12579k

    /* renamed from: o */
    public final LazyStaggeredGridLaneInfo f6880o;

    /* renamed from: p */
    public final int f6881p;

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.j$a */
    public static final class C2602a implements C2612s {

        /* renamed from: a */
        public final /* synthetic */ C2601j f6882a;

        public C2602a(C2601j jVar) {
            this.f6882a = jVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2605m mo8977a(int i, int i2, int i3, @C12579k Object obj, @C12579k List<? extends C15611w0> list) {
            Intrinsics.checkNotNullParameter(obj, "key");
            Intrinsics.checkNotNullParameter(list, "placeables");
            return new C2605m(i, obj, list, this.f6882a.mo8976t(), this.f6882a.mo8967k(), i2, i3);
        }
    }

    public /* synthetic */ C2601j(LazyStaggeredGridState lazyStaggeredGridState, C2597f fVar, int[] iArr, long j, boolean z, C2552k kVar, int i, long j2, int i2, int i3, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, fVar, iArr, j, z, kVar, i, j2, i2, i3, z2, i4, i5);
    }

    /* renamed from: a */
    public final int mo8957a() {
        return this.f6875j;
    }

    /* renamed from: b */
    public final int mo8958b() {
        return this.f6874i;
    }

    /* renamed from: c */
    public final long mo8959c() {
        return this.f6869d;
    }

    /* renamed from: d */
    public final long mo8960d() {
        return this.f6873h;
    }

    /* renamed from: e */
    public final int mo8961e() {
        return this.f6878m;
    }

    @C12579k
    /* renamed from: f */
    public final C2597f mo8962f() {
        return this.f6867b;
    }

    /* renamed from: g */
    public final int mo8963g() {
        return this.f6881p;
    }

    @C12579k
    /* renamed from: h */
    public final LazyStaggeredGridLaneInfo mo8964h() {
        return this.f6880o;
    }

    /* renamed from: i */
    public final int mo8965i(long j) {
        int i = (int) (j >> 32);
        boolean z = true;
        if (((int) (4294967295L & j)) - i == 1) {
            z = false;
        }
        if (z) {
            return -2;
        }
        return i;
    }

    /* renamed from: j */
    public final int mo8966j() {
        return this.f6872g;
    }

    /* renamed from: k */
    public final int mo8967k() {
        return this.f6877l;
    }

    @C12579k
    /* renamed from: l */
    public final C2552k mo8968l() {
        return this.f6871f;
    }

    @C12579k
    /* renamed from: m */
    public final C2603k mo8969m() {
        return this.f6879n;
    }

    @C12579k
    /* renamed from: n */
    public final int[] mo8970n() {
        return this.f6868c;
    }

    /* renamed from: o */
    public final boolean mo8971o() {
        return this.f6876k;
    }

    /* renamed from: p */
    public final long mo8972p(@C12579k C2597f fVar, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(fVar, "$this$getSpanRange");
        boolean b = fVar.mo8863h().mo9013b(i);
        if (b) {
            i3 = this.f6881p;
        } else {
            i3 = 1;
        }
        if (b) {
            i2 = 0;
        }
        return C2613t.m11845b(i2, i3);
    }

    @C12579k
    /* renamed from: q */
    public final LazyStaggeredGridState mo8973q() {
        return this.f6866a;
    }

    /* renamed from: r */
    public final boolean mo8974r(@C12579k C2597f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.mo8863h().mo9013b(i);
    }

    /* renamed from: s */
    public final boolean mo8975s(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32)) != 1;
    }

    /* renamed from: t */
    public final boolean mo8976t() {
        return this.f6870e;
    }

    public C2601j(LazyStaggeredGridState lazyStaggeredGridState, C2597f fVar, int[] iArr, long j, boolean z, C2552k kVar, int i, long j2, int i2, int i3, boolean z2, int i4, int i5) {
        this.f6866a = lazyStaggeredGridState;
        this.f6867b = fVar;
        this.f6868c = iArr;
        this.f6869d = j;
        this.f6870e = z;
        this.f6871f = kVar;
        this.f6872g = i;
        this.f6873h = j2;
        this.f6874i = i2;
        this.f6875j = i3;
        this.f6876k = z2;
        this.f6877l = i4;
        this.f6878m = i5;
        this.f6879n = new C2603k(z, fVar, kVar, iArr, i5, new C2602a(this));
        this.f6880o = lazyStaggeredGridState.mo8931x();
        this.f6881p = iArr.length;
    }
}
