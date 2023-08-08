package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;

@C11363r0({"SMAP\nLazyNearestItemsRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,89:1\n67#2,3:90\n66#2:93\n83#2,3:110\n1114#3,3:94\n1117#3,3:107\n1114#3,6:113\n480#4,4:97\n485#4:106\n122#5,5:101\n*S KotlinDebug\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n*L\n47#1:90,3\n47#1:93\n59#1:110,3\n47#1:94,3\n47#1:107,3\n59#1:113,6\n48#1:97,4\n48#1:106\n48#1:101,5\n*E\n"})
public final class LazyNearestItemsRangeKt {
    /* renamed from: b */
    public static final C11466l m11364b(int i, int i2, int i3) {
        int i4 = (i / i2) * i2;
        return C11479u.m44378W1(Math.max(i4 - i3, 0), i4 + i2 + i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1} */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        if (r12 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x00b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.C8578k2<kotlin.ranges.C11466l> m11365c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<java.lang.Integer> r8, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<java.lang.Integer> r9, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<java.lang.Integer> r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            java.lang.String r0 = "firstVisibleItemIndex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "slidingWindowSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "extraItemCount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 429733345(0x199d35e1, float:1.6255181E-23)
            r11.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0021
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0021:
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r11.mo14918M(r12)
            boolean r12 = r11.mo15006n0(r8)
            boolean r0 = r11.mo15006n0(r9)
            r12 = r12 | r0
            boolean r0 = r11.mo15006n0(r10)
            r12 = r12 | r0
            java.lang.Object r0 = r11.mo14921N()
            r1 = 2
            if (r12 != 0) goto L_0x0044
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r0 != r12) goto L_0x007f
        L_0x0044:
            androidx.compose.runtime.snapshots.f$a r12 = androidx.compose.runtime.snapshots.C8646f.f23196e
            androidx.compose.runtime.snapshots.f r12 = r12.mo16621a()
            androidx.compose.runtime.snapshots.f r0 = r12.mo16617p()     // Catch:{ all -> 0x00dd }
            java.lang.Object r2 = r8.invoke()     // Catch:{ all -> 0x00d8 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x00d8 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r3 = r9.invoke()     // Catch:{ all -> 0x00d8 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ all -> 0x00d8 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r4 = r10.invoke()     // Catch:{ all -> 0x00d8 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x00d8 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00d8 }
            kotlin.ranges.l r2 = m11364b(r2, r3, r4)     // Catch:{ all -> 0x00d8 }
            r3 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r3, r1, r3)     // Catch:{ all -> 0x00d8 }
            r12.mo16619w(r0)     // Catch:{ all -> 0x00dd }
            r12.mo16415d()
            r11.mo14893C(r2)
            r0 = r2
        L_0x007f:
            r11.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r12 = 4
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r8
            r4 = 1
            r2[r4] = r9
            r2[r1] = r10
            r1 = 3
            r2[r1] = r0
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.mo14918M(r1)
            r1 = r3
        L_0x0099:
            if (r3 >= r12) goto L_0x00a5
            r4 = r2[r3]
            boolean r4 = r11.mo15006n0(r4)
            r1 = r1 | r4
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00a5:
            java.lang.Object r12 = r11.mo14921N()
            if (r1 != 0) goto L_0x00b3
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r12 != r1) goto L_0x00c1
        L_0x00b3:
            androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 r12 = new androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1
            r7 = 0
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r11.mo14893C(r12)
        L_0x00c1:
            r11.mo15002m0()
            kotlin.jvm.functions.p r12 = (kotlin.jvm.functions.C11304p) r12
            r8 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r12, r11, r8)
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00d4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d4:
            r11.mo15002m0()
            return r0
        L_0x00d8:
            r8 = move-exception
            r12.mo16619w(r0)     // Catch:{ all -> 0x00dd }
            throw r8     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r8 = move-exception
            r12.mo16415d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt.m11365c(kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }
}
