package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,287:1\n49#2,6:288\n49#2,6:294\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n*L\n135#1:288,6\n155#1:294,6\n*E\n"})
public final class BoxKt$boxMeasurePolicy$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ boolean f6043a;

    /* renamed from: b */
    public final /* synthetic */ C8734c f6044b;

    public BoxKt$boxMeasurePolicy$1(boolean z, C8734c cVar) {
        this.f6043a = z;
        this.f6044b = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        C15611w0 w0Var;
        int i4;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        if (list.isEmpty()) {
            return C15568h0.m69206r2(h0Var, C16476b.m74364r(j), C16476b.m74363q(j), (Map) null, BoxKt$boxMeasurePolicy$1$measure$1.f6045f, 4, (Object) null);
        }
        if (this.f6043a) {
            j2 = j;
        } else {
            j2 = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        }
        if (list.size() == 1) {
            C15557e0 e0Var = (C15557e0) list2.get(0);
            if (!BoxKt.m9847i(e0Var)) {
                C15611w0 t0 = e0Var.mo44324t0(j2);
                int max = Math.max(C16476b.m74364r(j), t0.mo44471K0());
                i3 = Math.max(C16476b.m74363q(j), t0.mo44468G0());
                w0Var = t0;
                i4 = max;
            } else {
                i4 = C16476b.m74364r(j);
                int q = C16476b.m74363q(j);
                w0Var = e0Var.mo44324t0(C16476b.f40850b.mo47810c(C16476b.m74364r(j), C16476b.m74363q(j)));
                i3 = q;
            }
            return C15568h0.m69206r2(h0Var, i4, i3, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$2(w0Var, e0Var, h0Var, i4, i3, this.f6044b), 4, (Object) null);
        }
        C15611w0[] w0VarArr = new C15611w0[list.size()];
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = C16476b.m74364r(j);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = C16476b.m74363q(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            C15557e0 e0Var2 = (C15557e0) list2.get(i5);
            if (!BoxKt.m9847i(e0Var2)) {
                C15611w0 t02 = e0Var2.mo44324t0(j2);
                w0VarArr[i5] = t02;
                intRef.element = Math.max(intRef.element, t02.mo44471K0());
                intRef2.element = Math.max(intRef2.element, t02.mo44468G0());
            } else {
                z = true;
            }
        }
        if (z) {
            int i6 = intRef.element;
            if (i6 != Integer.MAX_VALUE) {
                i = i6;
            } else {
                i = 0;
            }
            int i7 = intRef2.element;
            if (i7 != Integer.MAX_VALUE) {
                i2 = i7;
            } else {
                i2 = 0;
            }
            long a = C16478c.m74376a(i, i6, i2, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                C15557e0 e0Var3 = (C15557e0) list2.get(i8);
                if (BoxKt.m9847i(e0Var3)) {
                    w0VarArr[i8] = e0Var3.mo44324t0(a);
                }
            }
        }
        return C15568h0.m69206r2(h0Var, intRef.element, intRef2.element, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$5(w0VarArr, list, h0Var, intRef, intRef2, this.f6044b), 4, (Object) null);
    }
}
