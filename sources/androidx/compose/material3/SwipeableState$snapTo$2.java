package androidx.compose.material3;

import java.util.Map;
import kotlinx.coroutines.flow.C11908f;

public final class SwipeableState$snapTo$2 implements C11908f<Map<Float, ? extends T>> {

    /* renamed from: a */
    public final /* synthetic */ T f19784a;

    /* renamed from: b */
    public final /* synthetic */ SwipeableState<T> f19785b;

    public SwipeableState$snapTo$2(T t, SwipeableState<T> swipeableState) {
        this.f19784a = t;
        this.f19785b = swipeableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material3.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material3.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material3.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            androidx.compose.material3.SwipeableState$snapTo$2 r5 = (androidx.compose.material3.SwipeableState$snapTo$2) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            T r6 = r4.f19784a
            java.lang.Float r5 = androidx.compose.material3.SwipeableKt.m26380f(r5, r6)
            if (r5 == 0) goto L_0x005c
            androidx.compose.material3.SwipeableState<T> r6 = r4.f19785b
            float r5 = r5.floatValue()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.mo12050Q(r5, r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            androidx.compose.material3.SwipeableState<T> r6 = r5.f19785b
            T r5 = r5.f19784a
            r6.mo12044K(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x005c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$snapTo$2.emit(java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }
}
