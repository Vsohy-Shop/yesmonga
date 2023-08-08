package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDepartmentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentHeader$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,340:1\n154#2:341\n50#3:342\n49#3:343\n50#3:350\n49#3:351\n1114#4,6:344\n1114#4,6:352\n*S KotlinDebug\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentHeader$1$1$2\n*L\n228#1:341\n232#1:342\n232#1:343\n236#1:350\n236#1:351\n232#1:344,6\n236#1:352,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2 */
public final class DepartmentStatefulKt$DepartmentHeader$1$1$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ boolean $isTopAppBarFullyCollapsed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentHeader$1$1$2(boolean z, C11300l<? super C39769a, C11079d2> lVar, int i) {
        super(2);
        this.$isTopAppBarFullyCollapsed = z;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r13 = r18
            r1 = r19
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r18.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r18.mo14958a0()
            goto L_0x00c3
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentHeader.<anonymous>.<anonymous>.<anonymous> (DepartmentStateful.kt:225)"
            r4 = -15281704(0xffffffffff16d1d8, float:-2.0047377E38)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r7 = 0
            r1 = 16
            float r1 = (float) r1
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r9 = 0
            r10 = 11
            r11 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.design.components.compose.SearchBarVariant r2 = com.carrefour.fid.android.design.components.compose.SearchBarVariant.GREY
            int r3 = com.carrefour.fid.android.categories.C39711b.C39729r.search_bar_placeholder
            r4 = 0
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r13, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            boolean r10 = r0.$isTopAppBarFullyCollapsed
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            kotlin.jvm.functions.l<com.carrefour.fid.android.categories.presentation.ui.department.a, kotlin.d2> r11 = r0.$actioner
            boolean r12 = r0.$isTopAppBarFullyCollapsed
            r14 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r14)
            boolean r10 = r13.mo15006n0(r10)
            boolean r15 = r13.mo15006n0(r11)
            r10 = r10 | r15
            java.lang.Object r15 = r18.mo14921N()
            if (r10 != 0) goto L_0x006f
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r15 != r10) goto L_0x0077
        L_0x006f:
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2$1$1 r15 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2$1$1
            r15.<init>(r12, r11)
            r13.mo14893C(r15)
        L_0x0077:
            r18.mo15002m0()
            r10 = r15
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            boolean r12 = r0.$isTopAppBarFullyCollapsed
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            kotlin.jvm.functions.l<com.carrefour.fid.android.categories.presentation.ui.department.a, kotlin.d2> r15 = r0.$actioner
            boolean r11 = r0.$isTopAppBarFullyCollapsed
            r13.mo14918M(r14)
            boolean r12 = r13.mo15006n0(r12)
            boolean r14 = r13.mo15006n0(r15)
            r12 = r12 | r14
            java.lang.Object r14 = r18.mo14921N()
            if (r12 != 0) goto L_0x00a1
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r14 != r12) goto L_0x00a9
        L_0x00a1:
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2$2$1 r14 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2$2$1
            r14.<init>(r11, r15)
            r13.mo14893C(r14)
        L_0x00a9:
            r18.mo15002m0()
            r12 = r14
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r14 = 24630(0x6036, float:3.4514E-41)
            r15 = 0
            r16 = 1512(0x5e8, float:2.119E-42)
            r11 = 0
            r13 = r18
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151597c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00c3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.presentation.p067ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
