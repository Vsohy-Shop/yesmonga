package com.carrefour.fid.android.design.libs.pager.snapper;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/LazyListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n154#2:258\n154#2:259\n50#3:260\n49#3:261\n1114#4,6:262\n76#5:268\n1#6:269\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/LazyListKt\n*L\n48#1:258\n77#1:259\n78#1:260\n78#1:261\n78#1:262,6\n84#1:268\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.libs.pager.snapper.a */
public final class C37469a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.jvm.functions.p<? super com.carrefour.fid.android.design.libs.pager.snapper.d, ? super com.carrefour.fid.android.design.libs.pager.snapper.e, java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: kotlin.jvm.functions.p<? super com.carrefour.fid.android.design.libs.pager.snapper.d, ? super com.carrefour.fid.android.design.libs.pager.snapper.e, java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: kotlin.jvm.functions.p<com.carrefour.fid.android.design.libs.pager.snapper.d, com.carrefour.fid.android.design.libs.pager.snapper.e, java.lang.Integer>} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r11 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo m153770a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.LazyListState r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.design.libs.pager.snapper.C37472d, ? super com.carrefour.fid.android.design.libs.pager.snapper.C37473e, java.lang.Integer> r8, float r9, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            java.lang.String r0 = "lazyListState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -934468592(0xffffffffc84d2410, float:-210064.25)
            r10.mo14918M(r0)
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0015
            com.carrefour.fid.android.design.libs.pager.snapper.SnapOffsets r8 = com.carrefour.fid.android.design.libs.pager.snapper.SnapOffsets.f94102a
            kotlin.jvm.functions.p r8 = r8.mo114146a()
        L_0x0015:
            r3 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0020
            r8 = 0
            float r8 = (float) r8
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
        L_0x0020:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x002c
            r8 = -1
            java.lang.String r12 = "com.carrefour.fid.android.design.libs.pager.snapper.rememberLazyListSnapperLayoutInfo (LazyList.kt:73)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r8, r12)
        L_0x002c:
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo14918M(r8)
            boolean r8 = r10.mo15006n0(r7)
            boolean r11 = r10.mo15006n0(r3)
            r8 = r8 | r11
            java.lang.Object r11 = r10.mo14921N()
            if (r8 != 0) goto L_0x0049
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r11 != r8) goto L_0x0056
        L_0x0049:
            com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo r11 = new com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r11
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r10.mo14893C(r11)
        L_0x0056:
            r10.mo15002m0()
            com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo r11 = (com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo) r11
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r10.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            int r7 = r7.mo7429n2(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r11.mo114144n(r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x007d:
            r10.mo15002m0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.snapper.C37469a.m153770a(androidx.compose.foundation.lazy.LazyListState, kotlin.jvm.functions.p, float, androidx.compose.runtime.o, int, int):com.carrefour.fid.android.design.libs.pager.snapper.LazyListSnapperLayoutInfo");
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final SnapperFlingBehavior m153771b(@C12579k LazyListState lazyListState, @C12580l C11304p<? super C37472d, ? super C37473e, Integer> pVar, float f, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12579k C11305q<? super C37472d, ? super Integer, ? super Integer, Integer> qVar, @C12580l C8592o oVar, int i, int i2) {
        C11304p pVar2;
        float f2;
        C2013v<Float> vVar2;
        C1968g<Float> gVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        LazyListState lazyListState2 = lazyListState;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
        oVar2.mo14918M(-1571364057);
        if ((i2 & 2) != 0) {
            pVar2 = SnapOffsets.f94102a.mo114146a();
        } else {
            pVar2 = pVar;
        }
        if ((i2 & 4) != 0) {
            f2 = C16483g.m74435M((float) 0);
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            vVar2 = C2046v.m8765b(oVar2, 0);
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 16) != 0) {
            gVar2 = SnapperFlingBehaviorDefaults.f94117a.mo114167d();
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1571364057, i3, -1, "com.carrefour.fid.android.design.libs.pager.snapper.rememberSnapperFlingBehavior (LazyList.kt:44)");
        }
        SnapperFlingBehavior a = C37471c.m153775a(m153770a(lazyListState, pVar2, f2, oVar, (i3 & 896) | (i3 & 14) | (i3 & 112), 0), vVar2, gVar2, qVar, oVar, ((i3 >> 6) & 7168) | 576, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }
}
