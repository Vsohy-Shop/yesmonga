package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n76#2:332\n83#3,3:333\n1114#4,6:336\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n114#1:332\n116#1:333,3\n116#1:336,6\n*E\n"})
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(3);
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x006f;
     */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo9591a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1538687176(0xffffffffa4497f38, float:-4.3692686E-17)
            r12.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:112)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r1, r2)
        L_0x0017:
            androidx.compose.runtime.i1 r13 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.m12954c()
            java.lang.Object r13 = r12.mo15032w(r13)
            androidx.compose.foundation.text.selection.t r13 = (androidx.compose.foundation.text.selection.C2844t) r13
            long r1 = r13.mo9907b()
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r1)
            r5 = 0
            r3[r5] = r4
            boolean r4 = r10.$isStartHandle
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            r4 = 2
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r10.$direction
            r3[r4] = r6
            boolean r4 = r10.$handlesCrossed
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 3
            r3[r6] = r4
            boolean r4 = r10.$isStartHandle
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r10.$direction
            boolean r7 = r10.$handlesCrossed
            r8 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.mo14918M(r8)
            r8 = r5
        L_0x0055:
            if (r5 >= r0) goto L_0x0061
            r9 = r3[r5]
            boolean r9 = r12.mo15006n0(r9)
            r8 = r8 | r9
            int r5 = r5 + 1
            goto L_0x0055
        L_0x0061:
            java.lang.Object r0 = r12.mo14921N()
            if (r8 != 0) goto L_0x006f
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r0 != r3) goto L_0x007b
        L_0x006f:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 r8 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
            r0 = r8
            r3 = r4
            r4 = r6
            r5 = r7
            r0.<init>(r1, r3, r4, r5)
            r12.mo14893C(r8)
        L_0x007b:
            r12.mo15002m0()
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            androidx.compose.ui.m r13 = androidx.compose.p004ui.draw.DrawModifierKt.m32437b(r13, r0)
            androidx.compose.ui.m r11 = r11.mo17224k3(r13)
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x0091
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0091:
            r12.mo15002m0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1.mo9591a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9591a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
