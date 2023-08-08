package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2252k;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.runtime.snapshots.C8646f;
import com.urbanairship.iam.C9166d;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
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
@C11363r0({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,334:1\n480#2,4:335\n485#2:344\n122#3,5:339\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:335,4\n294#1:344\n294#1:339,5\n*E\n"})
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements C11304p<C2552k, C16476b, C2572p> {
    final /* synthetic */ C2458g $beyondBoundsInfo;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ Arrangement.C2269d $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C2569n $itemProvider;
    final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$a */
    public static final class C2447a implements C2623x {

        /* renamed from: a */
        public final /* synthetic */ int f6408a;

        /* renamed from: b */
        public final /* synthetic */ int f6409b;

        /* renamed from: c */
        public final /* synthetic */ C2552k f6410c;

        /* renamed from: d */
        public final /* synthetic */ boolean f6411d;

        /* renamed from: e */
        public final /* synthetic */ C8734c.C8736b f6412e;

        /* renamed from: f */
        public final /* synthetic */ C8734c.C8737c f6413f;

        /* renamed from: g */
        public final /* synthetic */ boolean f6414g;

        /* renamed from: h */
        public final /* synthetic */ int f6415h;

        /* renamed from: i */
        public final /* synthetic */ int f6416i;

        /* renamed from: j */
        public final /* synthetic */ LazyListItemPlacementAnimator f6417j;

        /* renamed from: k */
        public final /* synthetic */ long f6418k;

        public C2447a(int i, int i2, C2552k kVar, boolean z, C8734c.C8736b bVar, C8734c.C8737c cVar, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
            this.f6408a = i;
            this.f6409b = i2;
            this.f6410c = kVar;
            this.f6411d = z;
            this.f6412e = bVar;
            this.f6413f = cVar;
            this.f6414g = z2;
            this.f6415h = i3;
            this.f6416i = i4;
            this.f6417j = lazyListItemPlacementAnimator;
            this.f6418k = j;
        }

        @C12579k
        /* renamed from: a */
        public final C2620u mo8303a(int i, @C12579k Object obj, @C12579k List<? extends C15611w0> list) {
            int i2;
            Intrinsics.checkNotNullParameter(obj, "key");
            Intrinsics.checkNotNullParameter(list, "placeables");
            if (i == this.f6408a - 1) {
                i2 = 0;
            } else {
                i2 = this.f6409b;
            }
            int i3 = i2;
            return new C2620u(i, list, this.f6411d, this.f6412e, this.f6413f, this.f6410c.getLayoutDirection(), this.f6414g, this.f6415h, this.f6416i, this.f6417j, i3, this.f6418k, obj, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, C2366i0 i0Var, boolean z2, LazyListState lazyListState, C2569n nVar, Arrangement.C2279l lVar, Arrangement.C2269d dVar, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, C2458g gVar, int i, C8734c.C8736b bVar, C8734c.C8737c cVar) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProvider = nVar;
        this.$verticalArrangement = lVar;
        this.$horizontalArrangement = dVar;
        this.$placementAnimator = lazyListItemPlacementAnimator;
        this.$beyondBoundsInfo = gVar;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = bVar;
        this.$verticalAlignment = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final C2572p mo8301a(@C12579k C2552k kVar, long j) {
        Orientation orientation;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j2;
        C8646f p;
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
        int i6 = n2 + n22;
        int i7 = i + i2;
        boolean z = this.$isVertical;
        if (z) {
            i3 = i6;
        } else {
            i3 = i7;
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
        int i8 = i3 - i4;
        long i9 = C16478c.m74384i(j3, -i7, -i6);
        this.$state.mo8333Q(this.$itemProvider);
        this.$state.mo8327K(kVar2);
        this.$itemProvider.mo8290d().mo8269i(C16476b.m74362p(i9), C16476b.m74361o(i9));
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
        int a = this.$itemProvider.mo8288a();
        if (this.$isVertical) {
            i5 = C16476b.m74361o(j) - i6;
        } else {
            i5 = C16476b.m74362p(j) - i7;
        }
        int i10 = i5;
        if (!this.$reverseLayout || i10 > 0) {
            j2 = C16496n.m74593a(i, n2);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i10;
            }
            if (z2) {
                n2 += i10;
            }
            j2 = C16496n.m74593a(i, n2);
        }
        boolean z3 = this.$isVertical;
        C2569n nVar = this.$itemProvider;
        boolean z4 = z3;
        int i11 = i7;
        C2621v vVar = new C2621v(i9, z4, nVar, kVar, new C2447a(a, n23, kVar, z3, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, i4, i8, this.$placementAnimator, j2), (DefaultConstructorMarker) null);
        this.$state.mo8330N(vVar.mo9034b());
        C8646f.C8647a aVar = C8646f.f23196e;
        LazyListState lazyListState = this.$state;
        C8646f a2 = aVar.mo16621a();
        try {
            p = a2.mo16617p();
            int c = C2452b.m10906c(lazyListState.mo8339q());
            int r = lazyListState.mo8340r();
            C11079d2 d2Var = C11079d2.f28267a;
            a2.mo16619w(p);
            a2.mo16415d();
            C2569n nVar2 = this.$itemProvider;
            float D = this.$state.mo8321D();
            boolean z5 = this.$isVertical;
            List<Integer> i12 = this.$itemProvider.mo8294i();
            Arrangement.C2279l lVar2 = this.$verticalArrangement;
            Arrangement.C2269d dVar2 = this.$horizontalArrangement;
            boolean z6 = this.$reverseLayout;
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator = this.$placementAnimator;
            C2458g gVar = this.$beyondBoundsInfo;
            int i13 = this.$beyondBoundsItemCount;
            C2555n w = this.$state.mo8345w();
            C24462 r30 = r2;
            final C2552k kVar3 = kVar;
            final long j4 = j;
            final int i14 = i11;
            final int i15 = i6;
            C24462 r2 = new C11305q<Integer, Integer, C11300l<? super C15611w0.C15612a, ? extends C11079d2>, C15564g0>() {
                @C12579k
                /* renamed from: a */
                public final C15564g0 mo8302a(int i, int i2, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
                    Intrinsics.checkNotNullParameter(lVar, C9166d.f24869j0);
                    return kVar3.mo8741C3(C16478c.m74382g(j4, i + i14), C16478c.m74381f(j4, i2 + i15), C10977s0.m41492z(), lVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return mo8302a(((Number) obj).intValue(), ((Number) obj2).intValue(), (C11300l) obj3);
                }
            };
            C2572p j5 = LazyListMeasureKt.m10816j(a, nVar2, vVar, i10, i4, i8, n23, c, r, D, i9, z5, i12, lVar2, dVar2, z6, kVar, lazyListItemPlacementAnimator, gVar, i13, w, r30);
            this.$state.mo8335m(j5);
            return j5;
        } catch (Throwable th) {
            a2.mo16415d();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8301a((C2552k) obj, ((C16476b) obj2).mo47807x());
    }
}
