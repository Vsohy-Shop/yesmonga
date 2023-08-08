package androidx.compose.foundation.pager;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2855v
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,781:1\n76#2:782\n83#3,3:783\n1114#4,6:786\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n473#1:782\n475#1:783,3\n475#1:786,6\n*E\n"})
/* renamed from: androidx.compose.foundation.pager.c */
public final class C2654c {
    @C12579k

    /* renamed from: a */
    public static final C2654c f7025a = new C2654c();

    /* renamed from: b */
    public static final int f7026b = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.animation.core.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (r2 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0096;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior mo9113a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.pager.PagerState r19, @org.jetbrains.annotations.C12580l androidx.compose.foundation.pager.C2655d r20, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1968g<java.lang.Float> r21, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C2013v<java.lang.Float> r22, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1968g<java.lang.Float> r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r18 = this;
            r0 = r19
            r1 = r24
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -344874176(0xffffffffeb71a340, float:-2.9212205E26)
            r1.mo14918M(r2)
            r3 = r26 & 2
            r4 = 1
            if (r3 == 0) goto L_0x001b
            androidx.compose.foundation.pager.d$a r3 = androidx.compose.foundation.pager.C2655d.f7027a
            androidx.compose.foundation.pager.d r3 = r3.mo9116a(r4)
            goto L_0x001d
        L_0x001b:
            r3 = r20
        L_0x001d:
            r5 = r26 & 4
            r6 = 0
            r7 = 0
            r8 = 2
            if (r5 == 0) goto L_0x0030
            androidx.compose.animation.core.z r5 = androidx.compose.animation.core.C1947b0.m8291c()
            r9 = 500(0x1f4, float:7.0E-43)
            androidx.compose.animation.core.z0 r5 = androidx.compose.animation.core.C1972h.m8392q(r9, r7, r5, r8, r6)
            r11 = r5
            goto L_0x0032
        L_0x0030:
            r11 = r21
        L_0x0032:
            r5 = r26 & 8
            if (r5 == 0) goto L_0x003c
            androidx.compose.animation.core.v r5 = androidx.compose.animation.C2046v.m8765b(r1, r7)
            r12 = r5
            goto L_0x003e
        L_0x003c:
            r12 = r22
        L_0x003e:
            r5 = r26 & 16
            r9 = 5
            if (r5 == 0) goto L_0x004c
            r5 = 0
            r10 = 1137180672(0x43c80000, float:400.0)
            androidx.compose.animation.core.v0 r5 = androidx.compose.animation.core.C1972h.m8390o(r5, r10, r6, r9, r6)
            r13 = r5
            goto L_0x004e
        L_0x004c:
            r13 = r23
        L_0x004e:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x005c
            r5 = -1
            java.lang.String r6 = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:462)"
            r10 = r25
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r10, r5, r6)
        L_0x005c:
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r1.mo15032w(r2)
            r14 = r2
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r7] = r11
            r2[r4] = r12
            r2[r8] = r13
            r4 = 3
            r2[r4] = r3
            r4 = 4
            r2[r4] = r14
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo14918M(r4)
            r4 = r7
        L_0x007c:
            if (r7 >= r9) goto L_0x0088
            r5 = r2[r7]
            boolean r5 = r1.mo15006n0(r5)
            r4 = r4 | r5
            int r7 = r7 + 1
            goto L_0x007c
        L_0x0088:
            java.lang.Object r2 = r24.mo14921N()
            if (r4 != 0) goto L_0x0096
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x00a8
        L_0x0096:
            androidx.compose.foundation.gestures.snapping.e r10 = androidx.compose.foundation.pager.PagerKt.m11899c(r0, r3, r12)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
            r15 = 0
            r16 = 32
            r17 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.mo14893C(r2)
        L_0x00a8:
            r24.mo15002m0()
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r2
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00b6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b6:
            r24.mo15002m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.C2654c.mo9113a(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.pager.d, androidx.compose.animation.core.g, androidx.compose.animation.core.v, androidx.compose.animation.core.g, androidx.compose.runtime.o, int, int):androidx.compose.foundation.gestures.snapping.SnapFlingBehavior");
    }

    @C12579k
    /* renamed from: b */
    public final C15446a mo9114b(@C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Horizontal) {
            return PagerKt.f6974a;
        }
        return PagerKt.f6975b;
    }
}
