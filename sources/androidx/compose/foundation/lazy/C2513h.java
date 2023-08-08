package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n76#2:72\n36#3:73\n83#3,3:80\n1114#4,6:74\n1114#4,6:83\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n39#1:72\n40#1:73\n41#1:80,3\n40#1:74,6\n41#1:83,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.h */
public final class C2513h {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.foundation.lazy.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: androidx.compose.foundation.lazy.layout.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.foundation.lazy.layout.f} */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (r7 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x008e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m11292a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r6, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.LazyListState r7, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2458g r8, boolean r9, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "beyondBoundsInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -62057177(0xfffffffffc4d1527, float:-4.2593995E36)
            r11.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0026
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0026:
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r11.mo15032w(r12)
            r4 = r12
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            r12 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r12)
            boolean r12 = r11.mo15006n0(r7)
            java.lang.Object r0 = r11.mo14921N()
            if (r12 != 0) goto L_0x0049
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r0 != r12) goto L_0x0051
        L_0x0049:
            androidx.compose.foundation.lazy.i r0 = new androidx.compose.foundation.lazy.i
            r0.<init>(r7)
            r11.mo14893C(r0)
        L_0x0051:
            r11.mo15002m0()
            r1 = r0
            androidx.compose.foundation.lazy.i r1 = (androidx.compose.foundation.lazy.C2514i) r1
            r7 = 5
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r0 = 0
            r12[r0] = r1
            r2 = 1
            r12[r2] = r8
            r2 = 2
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r12[r2] = r3
            r2 = 3
            r12[r2] = r4
            r2 = 4
            r12[r2] = r10
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.mo14918M(r2)
            r2 = r0
        L_0x0074:
            if (r0 >= r7) goto L_0x0080
            r3 = r12[r0]
            boolean r3 = r11.mo15006n0(r3)
            r2 = r2 | r3
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0080:
            java.lang.Object r7 = r11.mo14921N()
            if (r2 != 0) goto L_0x008e
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r7 != r12) goto L_0x009a
        L_0x008e:
            androidx.compose.foundation.lazy.layout.f r7 = new androidx.compose.foundation.lazy.layout.f
            r0 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r11.mo14893C(r7)
        L_0x009a:
            r11.mo15002m0()
            androidx.compose.ui.m r7 = (androidx.compose.p004ui.C8767m) r7
            androidx.compose.ui.m r6 = r6.mo17224k3(r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00ac
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ac:
            r11.mo15002m0()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C2513h.m11292a(androidx.compose.ui.m, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.g, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }
}
