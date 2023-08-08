package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.foundation.MutatePriority;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ScrollExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9367a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2203n r7, float r8, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1968g<java.lang.Float> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref.FloatRef) r7
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.C11661u0.m45747n(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r10
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.C2203n.m9563c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r10
        L_0x0057:
            float r7 = r7.element
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.m9367a(androidx.compose.foundation.gestures.n, float, androidx.compose.animation.core.g, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m9368b(C2203n nVar, float f, C1968g gVar, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return m9367a(nVar, f, gVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9369c(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2203n r7, float r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref.FloatRef) r7
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.C11661u0.m45747n(r9)
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r1 = 0
            r5.<init>(r9, r8, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r9
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.C2203n.m9563c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r9
        L_0x0057:
            float r7 = r7.element
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.m9369c(androidx.compose.foundation.gestures.n, float, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public static final Object m9370d(@C12579k C2203n nVar, @C12579k MutatePriority mutatePriority, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = nVar.mo7253g(mutatePriority, new ScrollExtensionsKt$stopScroll$2((C11045c<? super ScrollExtensionsKt$stopScroll$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m9371e(C2203n nVar, MutatePriority mutatePriority, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return m9370d(nVar, mutatePriority, cVar);
    }
}
