package androidx.compose.material;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import com.google.android.material.badge.BadgeState;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n223#2,2:188\n223#2,2:190\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n*L\n79#1:188,2\n85#1:190,2\n*E\n"})
public final class BadgeKt$BadgedBox$2 implements C15560f0 {

    /* renamed from: a */
    public static final BadgeKt$BadgedBox$2 f7529a = new BadgeKt$BadgedBox$2();

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        for (C15557e0 e0Var : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) BadgeState.f74597g)) {
                C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                for (C15557e0 e0Var2 : iterable) {
                    if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "anchor")) {
                        C15611w0 t02 = e0Var2.mo44324t0(j);
                        int A = t02.mo44325A(AlignmentLineKt.m68885a());
                        int A2 = t02.mo44325A(AlignmentLineKt.m68886b());
                        return h0Var.mo8741C3(t02.mo44471K0(), t02.mo44468G0(), C10977s0.m41456W(C11078d1.m42659a(AlignmentLineKt.m68885a(), Integer.valueOf(A)), C11078d1.m42659a(AlignmentLineKt.m68886b(), Integer.valueOf(A2))), new BadgeKt$BadgedBox$2$measure$1(t0, h0Var, t02));
                    }
                    long j2 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j3 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
