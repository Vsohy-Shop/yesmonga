package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C2252k;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.runtime.snapshots.C8646f;
import com.urbanairship.iam.C9166d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,364:1\n154#2:365\n154#2:366\n480#3,4:367\n485#3:376\n122#4,5:371\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n234#1:365\n236#1:366\n317#1:367,4\n317#1:376\n317#1:371,5\n*E\n"})
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements C11304p<C2552k, C16476b, C2499n> {
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ Arrangement.C2269d $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C2495j $itemProvider;
    final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C11304p<C16479d, C16476b, List<Integer>> $slotSizesSums;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a */
    public static final class C2475a implements C2511y {

        /* renamed from: a */
        public final /* synthetic */ C2552k f6506a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6507b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6508c;

        /* renamed from: d */
        public final /* synthetic */ int f6509d;

        /* renamed from: e */
        public final /* synthetic */ int f6510e;

        /* renamed from: f */
        public final /* synthetic */ LazyGridItemPlacementAnimator f6511f;

        /* renamed from: g */
        public final /* synthetic */ long f6512g;

        public C2475a(C2552k kVar, boolean z, boolean z2, int i, int i2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
            this.f6506a = kVar;
            this.f6507b = z;
            this.f6508c = z2;
            this.f6509d = i;
            this.f6510e = i2;
            this.f6511f = lazyGridItemPlacementAnimator;
            this.f6512g = j;
        }

        @C12579k
        /* renamed from: a */
        public final C2500o mo8461a(int i, @C12579k Object obj, int i2, int i3, @C12579k List<? extends C15611w0> list) {
            Object obj2 = obj;
            Intrinsics.checkNotNullParameter(obj2, "key");
            List<? extends C15611w0> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "placeables");
            return new C2500o(i, obj2, this.f6507b, i2, i3, this.f6508c, this.f6506a.getLayoutDirection(), this.f6509d, this.f6510e, list2, this.f6511f, this.f6512g, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b */
    public static final class C2476b implements C2512z {

        /* renamed from: a */
        public final /* synthetic */ boolean f6513a;

        /* renamed from: b */
        public final /* synthetic */ List<Integer> f6514b;

        /* renamed from: c */
        public final /* synthetic */ C2552k f6515c;

        /* renamed from: d */
        public final /* synthetic */ int f6516d;

        public C2476b(boolean z, List<Integer> list, C2552k kVar, int i) {
            this.f6513a = z;
            this.f6514b = list;
            this.f6515c = kVar;
            this.f6516d = i;
        }

        @C12579k
        /* renamed from: a */
        public final C2501p mo8462a(int i, @C12579k C2500o[] oVarArr, @C12579k List<C2488d> list, int i2) {
            Intrinsics.checkNotNullParameter(oVarArr, "items");
            Intrinsics.checkNotNullParameter(list, "spans");
            return new C2501p(i, oVarArr, list, this.f6513a, this.f6514b.size(), this.f6515c.getLayoutDirection(), i2, this.f6516d, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, C2366i0 i0Var, boolean z2, LazyGridState lazyGridState, C2495j jVar, C11304p<? super C16479d, ? super C16476b, ? extends List<Integer>> pVar, Arrangement.C2279l lVar, Arrangement.C2269d dVar, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z2;
        this.$state = lazyGridState;
        this.$itemProvider = jVar;
        this.$slotSizesSums = pVar;
        this.$verticalArrangement = lVar;
        this.$horizontalArrangement = dVar;
        this.$placementAnimator = lazyGridItemPlacementAnimator;
    }

    @C12579k
    /* renamed from: a */
    public final C2499n mo8458a(@C12579k C2552k kVar, long j) {
        Orientation orientation;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        long j2;
        C8646f p;
        int i6;
        int i7;
        C2552k kVar2 = kVar;
        long j3 = j;
        Intrinsics.checkNotNullParameter(kVar2, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        C2252k.m9698a(j3, orientation);
        if (this.$isVertical) {
            i = kVar2.mo7429n2(this.$contentPadding.mo8091b(kVar.getLayoutDirection()));
        } else {
            i = kVar2.mo7429n2(PaddingKt.m10022i(this.$contentPadding, kVar.getLayoutDirection()));
        }
        if (this.$isVertical) {
            i2 = kVar2.mo7429n2(this.$contentPadding.mo8092c(kVar.getLayoutDirection()));
        } else {
            i2 = kVar2.mo7429n2(PaddingKt.m10021h(this.$contentPadding, kVar.getLayoutDirection()));
        }
        int n2 = kVar2.mo7429n2(this.$contentPadding.mo8093d());
        int n22 = kVar2.mo7429n2(this.$contentPadding.mo8090a());
        int i8 = n2 + n22;
        int i9 = i + i2;
        boolean z = this.$isVertical;
        if (z) {
            i3 = i8;
        } else {
            i3 = i9;
        }
        if (z && !this.$reverseLayout) {
            i4 = n2;
        } else if (z && this.$reverseLayout) {
            i4 = n22;
        } else if (z || this.$reverseLayout) {
            i4 = i2;
        } else {
            i4 = i;
        }
        int i10 = i3 - i4;
        long i11 = C16478c.m74384i(j3, -i9, -i8);
        this.$state.mo8513U(this.$itemProvider);
        LazyGridSpanLayoutProvider k = this.$itemProvider.mo8449k();
        List invoke = this.$slotSizesSums.invoke(kVar2, C16476b.m74348b(j));
        k.mo8483h(invoke.size());
        this.$state.mo8505M(kVar2);
        this.$state.mo8510R(invoke.size());
        if (this.$isVertical) {
            Arrangement.C2279l lVar = this.$verticalArrangement;
            if (lVar != null) {
                f = lVar.mo7658a();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.C2269d dVar = this.$horizontalArrangement;
            if (dVar != null) {
                f = dVar.mo7658a();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        int n23 = kVar2.mo7429n2(f);
        if (this.$isVertical) {
            Arrangement.C2269d dVar2 = this.$horizontalArrangement;
            if (dVar2 != null) {
                f2 = dVar2.mo7658a();
            } else {
                f2 = C16483g.m74435M((float) 0);
            }
        } else {
            Arrangement.C2279l lVar2 = this.$verticalArrangement;
            if (lVar2 != null) {
                f2 = lVar2.mo7658a();
            } else {
                f2 = C16483g.m74435M((float) 0);
            }
        }
        int n24 = kVar2.mo7429n2(f2);
        int a = this.$itemProvider.mo8288a();
        if (this.$isVertical) {
            i5 = C16476b.m74361o(j) - i8;
        } else {
            i5 = C16476b.m74362p(j) - i9;
        }
        int i12 = i5;
        if (!this.$reverseLayout || i12 > 0) {
            j2 = C16496n.m74593a(i, n2);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i12;
            }
            if (z2) {
                n2 += i12;
            }
            j2 = C16496n.m74593a(i, n2);
        }
        C2475a aVar = r2;
        int i13 = i8;
        int i14 = n24;
        int i15 = a;
        int i16 = i4;
        int i17 = n23;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = k;
        int i18 = i9;
        List list = invoke;
        C2475a aVar2 = new C2475a(kVar, this.$isVertical, this.$reverseLayout, i4, i10, this.$placementAnimator, j2);
        C2506u uVar = new C2506u(this.$itemProvider, kVar2, i17, aVar2);
        boolean z3 = this.$isVertical;
        final C2507v vVar = new C2507v(z3, list, i14, i15, i17, uVar, lazyGridSpanLayoutProvider, new C2476b(z3, list, kVar2, i14));
        final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        this.$state.mo8507O(new C11300l<C2510x, ArrayList<Pair<? extends Integer, ? extends C16476b>>>() {
            @C12579k
            /* renamed from: a */
            public final ArrayList<Pair<Integer, C16476b>> mo8459a(int i) {
                LazyGridSpanLayoutProvider.C2479c c = lazyGridSpanLayoutProvider2.mo8478c(i);
                int c2 = C2489e.m11167c(c.mo8491a());
                ArrayList<Pair<Integer, C16476b>> arrayList = new ArrayList<>(c.mo8492b().size());
                List<C2488d> b = c.mo8492b();
                C2507v vVar = vVar;
                int size = b.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int f = C2488d.m11161f(b.get(i3).mo8563i());
                    arrayList.add(C11078d1.m42659a(Integer.valueOf(c2), C16476b.m74348b(vVar.mo8629a(i2, f))));
                    c2 = C2489e.m11167c(c2 + 1);
                    i2 += f;
                }
                return arrayList;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo8459a(((C2510x) obj).mo8641n());
            }
        });
        C8646f.C8647a aVar3 = C8646f.f23196e;
        LazyGridState lazyGridState = this.$state;
        C8646f a2 = aVar3.mo16621a();
        try {
            p = a2.mo16617p();
            int i19 = i15;
            if (lazyGridState.mo8519q() >= i19) {
                if (i19 > 0) {
                    i7 = lazyGridSpanLayoutProvider2.mo8479d(i19 - 1);
                    i6 = 0;
                    C11079d2 d2Var = C11079d2.f28267a;
                    a2.mo16619w(p);
                    a2.mo16415d();
                    C2495j jVar = this.$itemProvider;
                    float D = this.$state.mo8497D();
                    boolean z4 = this.$isVertical;
                    Arrangement.C2279l lVar3 = this.$verticalArrangement;
                    Arrangement.C2269d dVar3 = this.$horizontalArrangement;
                    boolean z5 = this.$reverseLayout;
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = this.$placementAnimator;
                    C2555n w = this.$state.mo8525w();
                    C24743 r29 = r2;
                    final C2552k kVar3 = kVar;
                    final long j4 = j;
                    final int i20 = i18;
                    final int i21 = i13;
                    C24743 r2 = new C11305q<Integer, Integer, C11300l<? super C15611w0.C15612a, ? extends C11079d2>, C15564g0>() {
                        @C12579k
                        /* renamed from: a */
                        public final C15564g0 mo8460a(int i, int i2, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
                            Intrinsics.checkNotNullParameter(lVar, C9166d.f24869j0);
                            return kVar3.mo8741C3(C16478c.m74382g(j4, i + i20), C16478c.m74381f(j4, i2 + i21), C10977s0.m41492z(), lVar);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo8460a(((Number) obj).intValue(), ((Number) obj2).intValue(), (C11300l) obj3);
                        }
                    };
                    C2499n d = LazyGridMeasureKt.m11046d(i19, jVar, vVar, uVar, i12, i16, i10, i17, i7, i6, D, i11, z4, lVar3, dVar3, z5, kVar, lazyGridItemPlacementAnimator, lazyGridSpanLayoutProvider2, w, r29);
                    this.$state.mo8515m(d);
                    return d;
                }
            }
            int d2 = lazyGridSpanLayoutProvider2.mo8479d(lazyGridState.mo8519q());
            i6 = lazyGridState.mo8520r();
            i7 = d2;
            C11079d2 d2Var2 = C11079d2.f28267a;
            a2.mo16619w(p);
            a2.mo16415d();
            C2495j jVar2 = this.$itemProvider;
            float D2 = this.$state.mo8497D();
            boolean z42 = this.$isVertical;
            Arrangement.C2279l lVar32 = this.$verticalArrangement;
            Arrangement.C2269d dVar32 = this.$horizontalArrangement;
            boolean z52 = this.$reverseLayout;
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = this.$placementAnimator;
            C2555n w2 = this.$state.mo8525w();
            C24743 r292 = r2;
            final C2552k kVar32 = kVar;
            final long j42 = j;
            final int i202 = i18;
            final int i212 = i13;
            C24743 r22 = new C11305q<Integer, Integer, C11300l<? super C15611w0.C15612a, ? extends C11079d2>, C15564g0>() {
                @C12579k
                /* renamed from: a */
                public final C15564g0 mo8460a(int i, int i2, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
                    Intrinsics.checkNotNullParameter(lVar, C9166d.f24869j0);
                    return kVar32.mo8741C3(C16478c.m74382g(j42, i + i202), C16478c.m74381f(j42, i2 + i212), C10977s0.m41492z(), lVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return mo8460a(((Number) obj).intValue(), ((Number) obj2).intValue(), (C11300l) obj3);
                }
            };
            C2499n d3 = LazyGridMeasureKt.m11046d(i19, jVar2, vVar, uVar, i12, i16, i10, i17, i7, i6, D2, i11, z42, lVar32, dVar32, z52, kVar, lazyGridItemPlacementAnimator2, lazyGridSpanLayoutProvider2, w2, r292);
            this.$state.mo8515m(d3);
            return d3;
        } catch (Throwable th) {
            a2.mo16415d();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8458a((C2552k) obj, ((C16476b) obj2).mo47807x());
    }
}
