package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
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
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1664:1\n223#2,2:1665\n223#2,2:1667\n223#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2\n*L\n1337#1:1665,2\n1340#1:1667,2\n1350#1:1669,2\n*E\n"})
public final class AppBarKt$TopAppBarLayout$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ float f19165a;

    /* renamed from: b */
    public final /* synthetic */ Arrangement.C2269d f19166b;

    /* renamed from: c */
    public final /* synthetic */ Arrangement.C2279l f19167c;

    /* renamed from: d */
    public final /* synthetic */ int f19168d;

    public AppBarKt$TopAppBarLayout$2(float f, Arrangement.C2269d dVar, Arrangement.C2279l lVar, int i) {
        this.f19165a = f;
        this.f19166b = dVar;
        this.f19167c = lVar;
        this.f19168d = i;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        int i2;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        for (C15557e0 e0Var : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) "navigationIcon")) {
                C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 14, (Object) null));
                for (C15557e0 e0Var2 : iterable) {
                    if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "actionIcons")) {
                        C15611w0 t02 = e0Var2.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 14, (Object) null));
                        if (C16476b.m74362p(j) == Integer.MAX_VALUE) {
                            i = C16476b.m74362p(j);
                        } else {
                            i = C11479u.m44447u((C16476b.m74362p(j) - t0.mo44471K0()) - t02.mo44471K0(), 0);
                        }
                        int i3 = i;
                        for (C15557e0 e0Var3 : iterable) {
                            if (Intrinsics.areEqual(C15594q.m69317a(e0Var3), (Object) "title")) {
                                C15611w0 t03 = e0Var3.mo44324t0(C16476b.m74351e(j, 0, i3, 0, 0, 12, (Object) null));
                                if (t03.mo44325A(AlignmentLineKt.m68886b()) != Integer.MIN_VALUE) {
                                    i2 = t03.mo44325A(AlignmentLineKt.m68886b());
                                } else {
                                    i2 = 0;
                                }
                                int L0 = C11409d.m43851L0(this.f19165a);
                                return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), L0, (Map) null, new AppBarKt$TopAppBarLayout$2$measure$1(t0, L0, t03, this.f19166b, j, t02, h0Var, this.f19167c, this.f19168d, i2), 4, (Object) null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
