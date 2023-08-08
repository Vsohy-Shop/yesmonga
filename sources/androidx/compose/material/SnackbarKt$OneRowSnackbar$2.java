package androidx.compose.material;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n223#2,2:365\n223#2,2:367\n1#3:369\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n*L\n308#1:365,2\n312#1:367,2\n*E\n"})
public final class SnackbarKt$OneRowSnackbar$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ String f7855a;

    /* renamed from: b */
    public final /* synthetic */ String f7856b;

    public SnackbarKt$OneRowSnackbar$2(String str, String str2) {
        this.f7855a = str;
        this.f7856b = str2;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        String str = this.f7855a;
        for (C15557e0 e0Var : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) str)) {
                C15611w0 t0 = e0Var.mo44324t0(j);
                int u = C11479u.m44447u((C16476b.m74362p(j) - t0.mo44471K0()) - h0Var2.mo7429n2(SnackbarKt.f7851f), C16476b.m74364r(j));
                String str2 = this.f7856b;
                for (C15557e0 e0Var2 : iterable) {
                    if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) str2)) {
                        C15611w0 t02 = e0Var2.mo44324t0(C16476b.m74351e(j, 0, u, 0, 0, 9, (Object) null));
                        int A = t02.mo44325A(AlignmentLineKt.m68885a());
                        boolean z3 = true;
                        int i4 = 0;
                        if (A != Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            int A2 = t02.mo44325A(AlignmentLineKt.m68886b());
                            if (A2 != Integer.MIN_VALUE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (A != A2) {
                                    z3 = false;
                                }
                                int p = C16476b.m74362p(j) - t0.mo44471K0();
                                if (z3) {
                                    i3 = Math.max(h0Var2.mo7429n2(SnackbarKt.f7853h), t0.mo44468G0());
                                    int G0 = (i3 - t02.mo44468G0()) / 2;
                                    int A3 = t0.mo44325A(AlignmentLineKt.m68885a());
                                    if (A3 != Integer.MIN_VALUE) {
                                        i4 = (A + G0) - A3;
                                    }
                                    i = i4;
                                    i2 = G0;
                                } else {
                                    int n2 = h0Var2.mo7429n2(SnackbarKt.f7846a) - A;
                                    int max = Math.max(h0Var2.mo7429n2(SnackbarKt.f7854i), t02.mo44468G0() + n2);
                                    i2 = n2;
                                    i = (max - t0.mo44468G0()) / 2;
                                    i3 = max;
                                }
                                return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), i3, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(t02, i2, t0, p, i), 4, (Object) null);
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
