package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1097:1\n1088#1:1102\n1086#1:1103\n33#2,4:1098\n38#2:1105\n86#3:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n*L\n1074#1:1102\n1075#1:1103\n1072#1:1098,4\n1072#1:1105\n1081#1:1104\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.n */
public final class C2606n implements C2596e {

    /* renamed from: a */
    public final long f6916a;

    /* renamed from: b */
    public final int f6917b;

    /* renamed from: c */
    public final int f6918c;
    @C12579k

    /* renamed from: d */
    public final Object f6919d;

    /* renamed from: e */
    public final long f6920e;
    @C12579k

    /* renamed from: f */
    public final List<C15611w0> f6921f;

    /* renamed from: g */
    public final boolean f6922g;

    /* renamed from: h */
    public final int f6923h;

    public /* synthetic */ C2606n(long j, int i, int i2, Object obj, long j2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, obj, j2, list, z, i3);
    }

    /* renamed from: a */
    public long mo8952a() {
        return this.f6920e;
    }

    /* renamed from: b */
    public long mo8953b() {
        return this.f6916a;
    }

    /* renamed from: c */
    public int mo8954c() {
        return this.f6918c;
    }

    /* renamed from: d */
    public final long mo9000d(long j, C11300l<? super Integer, Integer> lVar) {
        int m = this.f6922g ? C16494m.m74581m(j) : lVar.invoke(Integer.valueOf(C16494m.m74581m(j))).intValue();
        boolean z = this.f6922g;
        int o = C16494m.m74583o(j);
        if (z) {
            o = lVar.invoke(Integer.valueOf(o)).intValue();
        }
        return C16496n.m74593a(m, o);
    }

    /* renamed from: e */
    public final int mo9001e(C15611w0 w0Var) {
        return this.f6922g ? w0Var.mo44468G0() : w0Var.mo44471K0();
    }

    /* renamed from: f */
    public final void mo9002f(@C12579k C15611w0.C15612a aVar, @C12579k C2601j jVar) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(aVar, "scope");
        Intrinsics.checkNotNullParameter(jVar, C9175a.f24932Y);
        List<C15611w0> list = this.f6921f;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            C15611w0 w0Var = list.get(i5);
            if (jVar.mo8971o()) {
                long b = mo8953b();
                if (this.f6922g) {
                    i = C16494m.m74581m(b);
                } else {
                    int m = this.f6923h - C16494m.m74581m(b);
                    if (this.f6922g) {
                        i4 = w0Var.mo44468G0();
                    } else {
                        i4 = w0Var.mo44471K0();
                    }
                    i = m - i4;
                }
                if (this.f6922g) {
                    int o = this.f6923h - C16494m.m74583o(b);
                    if (this.f6922g) {
                        i3 = w0Var.mo44468G0();
                    } else {
                        i3 = w0Var.mo44471K0();
                    }
                    i2 = o - i3;
                } else {
                    i2 = C16494m.m74583o(b);
                }
                j = C16496n.m74593a(i, i2);
            } else {
                j = mo8953b();
            }
            long d = jVar.mo8960d();
            C15611w0.C15612a.m69398B(aVar, w0Var, C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(d), C16494m.m74583o(j) + C16494m.m74583o(d)), 0.0f, (C11300l) null, 6, (Object) null);
        }
    }

    public int getIndex() {
        return this.f6917b;
    }

    @C12579k
    public Object getKey() {
        return this.f6919d;
    }

    @C12579k
    public String toString() {
        return super.toString();
    }

    public C2606n(long j, int i, int i2, Object obj, long j2, List<? extends C15611w0> list, boolean z, int i3) {
        this.f6916a = j;
        this.f6917b = i;
        this.f6918c = i2;
        this.f6919d = obj;
        this.f6920e = j2;
        this.f6921f = list;
        this.f6922g = z;
        this.f6923h = i3;
    }
}
