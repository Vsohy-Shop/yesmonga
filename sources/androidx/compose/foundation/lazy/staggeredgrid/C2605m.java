package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n59#2,3:1098\n62#2,2:1105\n64#2:1108\n99#2,8:1109\n33#3,4:1101\n38#3:1107\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1020#1:1098,3\n1020#1:1105,2\n1020#1:1108\n1026#1:1109,8\n1020#1:1101,4\n1020#1:1107\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.m */
public final class C2605m {

    /* renamed from: a */
    public final int f6905a;
    @C12579k

    /* renamed from: b */
    public final Object f6906b;
    @C12579k

    /* renamed from: c */
    public final List<C15611w0> f6907c;

    /* renamed from: d */
    public final boolean f6908d;

    /* renamed from: e */
    public final int f6909e;

    /* renamed from: f */
    public final int f6910f;

    /* renamed from: g */
    public final int f6911g;

    /* renamed from: h */
    public boolean f6912h = true;

    /* renamed from: i */
    public final int f6913i;

    /* renamed from: j */
    public final int f6914j;

    /* renamed from: k */
    public final int f6915k;

    public C2605m(int i, @C12579k Object obj, @C12579k List<? extends C15611w0> list, boolean z, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(obj, "key");
        Intrinsics.checkNotNullParameter(list, "placeables");
        this.f6905a = i;
        this.f6906b = obj;
        this.f6907c = list;
        this.f6908d = z;
        this.f6909e = i2;
        this.f6910f = i3;
        this.f6911g = i4;
        int i8 = 1;
        int i9 = 0;
        Integer num2 = 0;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C15611w0 w0Var = (C15611w0) list.get(i10);
            int intValue = num2.intValue();
            if (this.f6908d) {
                i7 = w0Var.mo44468G0();
            } else {
                i7 = w0Var.mo44471K0();
            }
            num2 = Integer.valueOf(intValue + i7);
        }
        int intValue2 = num2.intValue();
        this.f6913i = intValue2;
        this.f6914j = C11479u.m44447u(intValue2 + this.f6909e, 0);
        List<C15611w0> list2 = this.f6907c;
        if (list2.isEmpty()) {
            num = null;
        } else {
            C15611w0 w0Var2 = list2.get(0);
            if (this.f6908d) {
                i5 = w0Var2.mo44471K0();
            } else {
                i5 = w0Var2.mo44468G0();
            }
            Integer valueOf = Integer.valueOf(i5);
            int G = CollectionsKt__CollectionsKt.m40443G(list2);
            if (1 <= G) {
                while (true) {
                    C15611w0 w0Var3 = list2.get(i8);
                    if (this.f6908d) {
                        i6 = w0Var3.mo44471K0();
                    } else {
                        i6 = w0Var3.mo44468G0();
                    }
                    Integer valueOf2 = Integer.valueOf(i6);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i8 == G) {
                        break;
                    }
                    i8++;
                }
            }
            num = valueOf;
        }
        Integer num3 = num;
        this.f6915k = num3 != null ? num3.intValue() : i9;
    }

    /* renamed from: a */
    public final int mo8987a() {
        return this.f6915k;
    }

    /* renamed from: b */
    public final int mo8988b() {
        return this.f6905a;
    }

    @C12579k
    /* renamed from: c */
    public final Object mo8989c() {
        return this.f6906b;
    }

    /* renamed from: d */
    public final int mo8990d() {
        return this.f6910f;
    }

    /* renamed from: e */
    public final int mo8991e() {
        return this.f6913i;
    }

    @C12579k
    /* renamed from: f */
    public final List<C15611w0> mo8992f() {
        return this.f6907c;
    }

    /* renamed from: g */
    public final int mo8993g() {
        return this.f6914j;
    }

    /* renamed from: h */
    public final int mo8994h() {
        return this.f6909e;
    }

    /* renamed from: i */
    public final int mo8995i() {
        return this.f6911g;
    }

    /* renamed from: j */
    public final boolean mo8996j() {
        return this.f6908d;
    }

    /* renamed from: k */
    public final boolean mo8997k() {
        return this.f6912h;
    }

    @C12579k
    /* renamed from: l */
    public final C2606n mo8998l(int i, int i2, int i3, int i4) {
        long j;
        long j2;
        if (this.f6908d) {
            j = C16496n.m74593a(i3, i2);
        } else {
            int i5 = i2;
            int i6 = i3;
            j = C16496n.m74593a(i2, i3);
        }
        long j3 = j;
        int i7 = this.f6905a;
        Object obj = this.f6906b;
        if (this.f6908d) {
            j2 = C16502r.m74668a(this.f6915k, this.f6914j);
        } else {
            j2 = C16502r.m74668a(this.f6914j, this.f6915k);
        }
        return new C2606n(j3, i7, i, obj, j2, this.f6907c, this.f6908d, i4, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public final void mo8999m(boolean z) {
        this.f6912h = z;
    }
}
