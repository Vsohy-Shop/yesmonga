package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.jvm.C11314h;

/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
public final class C2900x7deaba9e implements C15446a {

    /* renamed from: a */
    public final /* synthetic */ SwipeableV2State<?> f7549a;

    /* renamed from: b */
    public final /* synthetic */ Orientation f7550b;

    public C2900x7deaba9e(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        this.f7549a = swipeableV2State;
        this.f7550b = orientation;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7455a(long r3, long r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.C2901x8eaee744
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.C2901x8eaee744) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.label = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.J$0
            kotlin.C11661u0.m45747n(r4)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            kotlin.C11661u0.m45747n(r4)
            androidx.compose.material.SwipeableV2State<?> r4 = r2.f7549a
            float r0 = r2.mo10058f(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.mo10552I(r0, r3)
            if (r3 != r7) goto L_0x0047
            return r7
        L_0x0047:
            androidx.compose.ui.unit.w r3 = androidx.compose.p004ui.unit.C16509w.m74740b(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C2900x7deaba9e.mo7455a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    @C11314h(name = "offsetToFloat")
    /* renamed from: c */
    public final float mo10056c(long j) {
        return this.f7550b == Orientation.Horizontal ? C15094f.m64880p(j) : C15094f.m64882r(j);
    }

    /* renamed from: d */
    public final long mo10057d(float f) {
        float f2;
        Orientation orientation = this.f7550b;
        if (orientation == Orientation.Horizontal) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return C15096g.m64898a(f2, f);
    }

    @C11314h(name = "velocityToFloat")
    /* renamed from: f */
    public final float mo10058f(long j) {
        return this.f7550b == Orientation.Horizontal ? C16509w.m74750l(j) : C16509w.m74752n(j);
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
            return mo10057d(this.f7549a.mo10557i(mo10056c(j2)));
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        float c = mo10056c(j);
        if (c >= 0.0f || !C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
            return C15094f.f37256b.mo42248e();
        }
        return mo10057d(this.f7549a.mo10557i(c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7922o(long r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.C2902xe2eca24b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.C2902xe2eca24b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r6 = r0.J$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0062
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.C11661u0.m45747n(r8)
            float r8 = r5.mo10058f(r6)
            androidx.compose.material.SwipeableV2State<?> r2 = r5.f7549a
            float r2 = r2.mo10545B()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x005c
            androidx.compose.material.SwipeableV2State<?> r4 = r5.f7549a
            float r4 = r4.mo10567s()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
            androidx.compose.material.SwipeableV2State<?> r2 = r5.f7549a
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.mo10552I(r8, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x005c:
            androidx.compose.ui.unit.w$a r6 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r6 = r6.mo47915a()
        L_0x0062:
            androidx.compose.ui.unit.w r6 = androidx.compose.p004ui.unit.C16509w.m74740b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C2900x7deaba9e.mo7922o(long, kotlin.coroutines.c):java.lang.Object");
    }
}
