package androidx.compose.material;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class SnackbarKt$TextOnlySnackbar$2 implements C15560f0 {

    /* renamed from: a */
    public static final SnackbarKt$TextOnlySnackbar$2 f7857a = new SnackbarKt$TextOnlySnackbar$2();

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        boolean z;
        boolean z2;
        float f;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        boolean z3 = false;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C15611w0 t0 = ((C15557e0) CollectionsKt___CollectionsKt.m40706w2(list)).mo44324t0(j);
            int A = t0.mo44325A(AlignmentLineKt.m68885a());
            int A2 = t0.mo44325A(AlignmentLineKt.m68886b());
            if (A != Integer.MIN_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (A2 != Integer.MIN_VALUE) {
                    z3 = true;
                }
                if (z3) {
                    if (A == A2) {
                        f = SnackbarKt.f7853h;
                    } else {
                        f = SnackbarKt.f7854i;
                    }
                    int max = Math.max(h0Var.mo7429n2(f), t0.mo44468G0());
                    return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), max, (Map) null, new SnackbarKt$TextOnlySnackbar$2$measure$4(max, t0), 4, (Object) null);
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
    }
}
