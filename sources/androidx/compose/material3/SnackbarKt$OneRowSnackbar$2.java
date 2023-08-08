package androidx.compose.material3;

import androidx.compose.material3.tokens.C8288a1;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n288#2,2:436\n288#2,2:438\n223#2,2:440\n1#3:442\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2\n*L\n336#1:436,2\n338#1:438,2\n347#1:440,2\n*E\n"})
public final class SnackbarKt$OneRowSnackbar$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ String f19717a;

    /* renamed from: b */
    public final /* synthetic */ String f19718b;

    /* renamed from: c */
    public final /* synthetic */ String f19719c;

    public SnackbarKt$OneRowSnackbar$2(String str, String str2, String str3) {
        this.f19717a = str;
        this.f19718b = str2;
        this.f19719c = str3;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        C15611w0 w0Var;
        Object obj;
        C15611w0 w0Var2;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int A;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        long j2 = j;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        int min = Math.min(C16476b.m74362p(j), h0Var2.mo7429n2(SnackbarKt.f19709a));
        Iterable<C15557e0> iterable = list2;
        String str = this.f19717a;
        Iterator it = iterable.iterator();
        while (true) {
            w0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj), (Object) str)) {
                break;
            }
        }
        C15557e0 e0Var = (C15557e0) obj;
        if (e0Var != null) {
            w0Var2 = e0Var.mo44324t0(j2);
        } else {
            w0Var2 = null;
        }
        String str2 = this.f19718b;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj2), (Object) str2)) {
                break;
            }
        }
        C15557e0 e0Var2 = (C15557e0) obj2;
        if (e0Var2 != null) {
            w0Var = e0Var2.mo44324t0(j2);
        }
        C15611w0 w0Var3 = w0Var;
        if (w0Var2 != null) {
            i = w0Var2.mo44471K0();
        } else {
            i = 0;
        }
        if (w0Var2 != null) {
            i2 = w0Var2.mo44468G0();
        } else {
            i2 = 0;
        }
        if (w0Var3 != null) {
            i3 = w0Var3.mo44471K0();
        } else {
            i3 = 0;
        }
        if (w0Var3 != null) {
            i4 = w0Var3.mo44468G0();
        } else {
            i4 = 0;
        }
        if (i3 == 0) {
            i5 = h0Var2.mo7429n2(SnackbarKt.f19715g);
        } else {
            i5 = 0;
        }
        int u = C11479u.m44447u(((min - i) - i3) - i5, C16476b.m74364r(j));
        String str3 = this.f19719c;
        for (C15557e0 e0Var3 : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var3), (Object) str3)) {
                int i12 = i4;
                C15611w0 t0 = e0Var3.mo44324t0(C16476b.m74351e(j, 0, u, 0, 0, 9, (Object) null));
                int A2 = t0.mo44325A(AlignmentLineKt.m68885a());
                boolean z3 = true;
                if (A2 != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int A3 = t0.mo44325A(AlignmentLineKt.m68886b());
                    if (A3 != Integer.MIN_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (A2 != A3) {
                            z3 = false;
                        }
                        int i13 = min - i3;
                        int i14 = i13 - i;
                        if (z3) {
                            int max = Math.max(h0Var2.mo7429n2(C8288a1.f20706a.mo13182n()), Math.max(i2, i12));
                            int G0 = (max - t0.mo44468G0()) / 2;
                            if (w0Var2 == null || (A = w0Var2.mo44325A(AlignmentLineKt.m68885a())) == Integer.MIN_VALUE) {
                                i11 = 0;
                            } else {
                                i11 = (A2 + G0) - A;
                            }
                            i6 = i11;
                            i7 = G0;
                            i8 = max;
                        } else {
                            int n2 = h0Var2.mo7429n2(SnackbarKt.f19710b) - A2;
                            i8 = Math.max(h0Var2.mo7429n2(C8288a1.f20706a.mo13185q()), t0.mo44468G0() + n2);
                            if (w0Var2 != null) {
                                i10 = (i8 - w0Var2.mo44468G0()) / 2;
                            } else {
                                i10 = 0;
                            }
                            i7 = n2;
                            i6 = i10;
                        }
                        if (w0Var3 != null) {
                            i9 = (i8 - w0Var3.mo44468G0()) / 2;
                        } else {
                            i9 = 0;
                        }
                        return C15568h0.m69206r2(h0Var, min, i8, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(t0, i7, w0Var3, i13, i9, w0Var2, i14, i6), 4, (Object) null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
