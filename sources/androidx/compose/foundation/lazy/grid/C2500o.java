package androidx.compose.foundation.lazy.grid;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,196:1\n33#2,6:197\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n66#1:197,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.o */
public final class C2500o {

    /* renamed from: a */
    public final int f6620a;
    @C12579k

    /* renamed from: b */
    public final Object f6621b;

    /* renamed from: c */
    public final boolean f6622c;

    /* renamed from: d */
    public final int f6623d;

    /* renamed from: e */
    public final int f6624e;

    /* renamed from: f */
    public final boolean f6625f;
    @C12579k

    /* renamed from: g */
    public final LayoutDirection f6626g;

    /* renamed from: h */
    public final int f6627h;

    /* renamed from: i */
    public final int f6628i;
    @C12579k

    /* renamed from: j */
    public final List<C15611w0> f6629j;
    @C12579k

    /* renamed from: k */
    public final LazyGridItemPlacementAnimator f6630k;

    /* renamed from: l */
    public final long f6631l;

    /* renamed from: m */
    public final int f6632m;

    /* renamed from: n */
    public final int f6633n;

    public /* synthetic */ C2500o(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, lazyGridItemPlacementAnimator, j);
    }

    /* renamed from: a */
    public final int mo8595a() {
        return this.f6623d;
    }

    /* renamed from: b */
    public final int mo8596b() {
        return this.f6620a;
    }

    @C12579k
    /* renamed from: c */
    public final Object mo8597c() {
        return this.f6621b;
    }

    /* renamed from: d */
    public final int mo8598d() {
        return this.f6632m;
    }

    /* renamed from: e */
    public final int mo8599e() {
        return this.f6633n;
    }

    /* renamed from: f */
    public final int mo8600f() {
        return this.f6624e;
    }

    @C12579k
    /* renamed from: g */
    public final List<C15611w0> mo8601g() {
        return this.f6629j;
    }

    @C12579k
    /* renamed from: h */
    public final C2502q mo8602h(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        int i10 = i;
        boolean z = this.f6622c;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        if (z) {
            i8 = i3;
        } else {
            i8 = i4;
        }
        if (!z || this.f6626g != LayoutDirection.Rtl) {
            i9 = i2;
        } else {
            i9 = (i8 - i2) - this.f6623d;
        }
        if (z) {
            j = C16496n.m74593a(i9, i10);
        } else {
            j = C16496n.m74593a(i10, i9);
        }
        long j3 = j;
        int i11 = this.f6620a;
        Object obj = this.f6621b;
        if (this.f6622c) {
            j2 = C16502r.m74668a(this.f6623d, this.f6632m);
        } else {
            j2 = C16502r.m74668a(this.f6632m, this.f6623d);
        }
        return new C2502q(j3, i11, obj, i5, i6, j2, -this.f6627h, i7 + this.f6628i, this.f6622c, this.f6629j, this.f6630k, this.f6631l, i7, this.f6625f, (DefaultConstructorMarker) null);
    }

    public C2500o(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends C15611w0> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.f6620a = i;
        this.f6621b = obj;
        this.f6622c = z;
        this.f6623d = i2;
        this.f6624e = i3;
        this.f6625f = z2;
        this.f6626g = layoutDirection;
        this.f6627h = i4;
        this.f6628i = i5;
        this.f6629j = list;
        this.f6630k = lazyGridItemPlacementAnimator;
        this.f6631l = j;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C15611w0 w0Var = (C15611w0) list.get(i7);
            i6 = Math.max(i6, this.f6622c ? w0Var.mo44468G0() : w0Var.mo44471K0());
        }
        this.f6632m = i6;
        this.f6633n = C11479u.m44447u(i6 + this.f6624e, 0);
    }
}
