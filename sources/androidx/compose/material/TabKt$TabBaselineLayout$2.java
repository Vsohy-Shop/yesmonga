package androidx.compose.material;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n223#2,2:435\n223#2,2:437\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2\n*L\n318#1:435,2\n326#1:437,2\n*E\n"})
public final class TabKt$TabBaselineLayout$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f7946a;

    /* renamed from: b */
    public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f7947b;

    public TabKt$TabBaselineLayout$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2) {
        this.f7946a = pVar;
        this.f7947b = pVar2;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        C15611w0 w0Var;
        C15611w0 w0Var2;
        int i;
        float f;
        Integer num;
        Integer num2;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        if (this.f7946a != null) {
            for (C15557e0 e0Var : list2) {
                if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) "text")) {
                    w0Var = e0Var.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        w0Var = null;
        if (this.f7947b != null) {
            for (C15557e0 e0Var2 : list2) {
                if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "icon")) {
                    w0Var2 = e0Var2.mo44324t0(j);
                } else {
                    long j2 = j;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        w0Var2 = null;
        int i2 = 0;
        if (w0Var != null) {
            i = w0Var.mo44471K0();
        } else {
            i = 0;
        }
        if (w0Var2 != null) {
            i2 = w0Var2.mo44471K0();
        }
        int max = Math.max(i, i2);
        if (w0Var == null || w0Var2 == null) {
            f = TabKt.f7936a;
        } else {
            f = TabKt.f7937b;
        }
        int n2 = h0Var2.mo7429n2(f);
        if (w0Var != null) {
            num = Integer.valueOf(w0Var.mo44325A(AlignmentLineKt.m68885a()));
        } else {
            num = null;
        }
        if (w0Var != null) {
            num2 = Integer.valueOf(w0Var.mo44325A(AlignmentLineKt.m68886b()));
        } else {
            num2 = null;
        }
        return C15568h0.m69206r2(h0Var, max, n2, (Map) null, new TabKt$TabBaselineLayout$2$measure$1(w0Var, w0Var2, h0Var, max, n2, num, num2), 4, (Object) null);
    }
}
