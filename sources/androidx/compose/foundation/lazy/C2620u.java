package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,6:194\n33#2,6:200\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n*L\n72#1:194,6\n93#1:200,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.u */
public final class C2620u {

    /* renamed from: a */
    public final int f6941a;
    @C12579k

    /* renamed from: b */
    public final List<C15611w0> f6942b;

    /* renamed from: c */
    public final boolean f6943c;
    @C12580l

    /* renamed from: d */
    public final C8734c.C8736b f6944d;
    @C12580l

    /* renamed from: e */
    public final C8734c.C8737c f6945e;
    @C12579k

    /* renamed from: f */
    public final LayoutDirection f6946f;

    /* renamed from: g */
    public final boolean f6947g;

    /* renamed from: h */
    public final int f6948h;

    /* renamed from: i */
    public final int f6949i;
    @C12579k

    /* renamed from: j */
    public final LazyListItemPlacementAnimator f6950j;

    /* renamed from: k */
    public final int f6951k;

    /* renamed from: l */
    public final long f6952l;
    @C12579k

    /* renamed from: m */
    public final Object f6953m;

    /* renamed from: n */
    public final int f6954n;

    /* renamed from: o */
    public final int f6955o;

    /* renamed from: p */
    public final int f6956p;

    @C2855v
    public /* synthetic */ C2620u(int i, List list, boolean z, C8734c.C8736b bVar, C8734c.C8737c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, bVar, cVar, layoutDirection, z2, i2, i3, lazyListItemPlacementAnimator, i4, j, obj);
    }

    /* renamed from: a */
    public final int mo9027a() {
        return this.f6956p;
    }

    /* renamed from: b */
    public final int mo9028b() {
        return this.f6941a;
    }

    @C12579k
    /* renamed from: c */
    public final Object mo9029c() {
        return this.f6953m;
    }

    /* renamed from: d */
    public final int mo9030d() {
        return this.f6954n;
    }

    /* renamed from: e */
    public final int mo9031e() {
        return this.f6955o;
    }

    @C12579k
    /* renamed from: f */
    public final C2574r mo9032f(int i, int i2, int i3) {
        int i4;
        long j;
        int i5;
        ArrayList arrayList = new ArrayList();
        if (this.f6943c) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        List<C15611w0> list = this.f6942b;
        int size = list.size();
        int i6 = i;
        for (int i7 = 0; i7 < size; i7++) {
            C15611w0 w0Var = list.get(i7);
            if (this.f6943c) {
                C8734c.C8736b bVar = this.f6944d;
                if (bVar != null) {
                    j = C16496n.m74593a(bVar.mo17075a(w0Var.mo44471K0(), i2, this.f6946f), i6);
                    int i8 = i3;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int i9 = i2;
                C8734c.C8737c cVar = this.f6945e;
                if (cVar != null) {
                    j = C16496n.m74593a(i6, cVar.mo17076a(w0Var.mo44468G0(), i3));
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            if (this.f6943c) {
                i5 = w0Var.mo44468G0();
            } else {
                i5 = w0Var.mo44471K0();
            }
            i6 += i5;
            arrayList.add(new C2573q(j, w0Var, (DefaultConstructorMarker) null));
        }
        return new C2574r(i, this.f6941a, this.f6953m, this.f6954n, -this.f6948h, i4 + this.f6949i, this.f6943c, arrayList, this.f6950j, this.f6952l, this.f6947g, i4, (DefaultConstructorMarker) null);
    }

    public C2620u(int i, List<? extends C15611w0> list, boolean z, C8734c.C8736b bVar, C8734c.C8737c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        this.f6941a = i;
        this.f6942b = list;
        this.f6943c = z;
        this.f6944d = bVar;
        this.f6945e = cVar;
        this.f6946f = layoutDirection;
        this.f6947g = z2;
        this.f6948h = i2;
        this.f6949i = i3;
        this.f6950j = lazyListItemPlacementAnimator;
        this.f6951k = i4;
        this.f6952l = j;
        this.f6953m = obj;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C15611w0 w0Var = (C15611w0) list.get(i7);
            i5 += this.f6943c ? w0Var.mo44468G0() : w0Var.mo44471K0();
            i6 = Math.max(i6, !this.f6943c ? w0Var.mo44468G0() : w0Var.mo44471K0());
        }
        this.f6954n = i5;
        this.f6955o = C11479u.m44447u(i5 + this.f6951k, 0);
        this.f6956p = i6;
    }
}
