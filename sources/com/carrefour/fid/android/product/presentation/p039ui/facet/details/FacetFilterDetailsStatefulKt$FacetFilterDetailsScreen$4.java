package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFacetFilterDetailsStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n154#2:337\n74#3,6:338\n80#3:370\n84#3:382\n75#4:344\n76#4,11:346\n89#4:381\n76#5:345\n460#6,13:357\n36#6:371\n473#6,3:378\n1114#7,6:372\n*S KotlinDebug\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4\n*L\n180#1:337\n177#1:338,6\n177#1:370\n177#1:382\n177#1:344\n177#1:346,11\n177#1:381\n177#1:345\n177#1:357,13\n185#1:371\n177#1:378,3\n185#1:372,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27965a, C11079d2> $actioner;
    final /* synthetic */ Filter.CheckboxFilter $currentFilters;
    final /* synthetic */ Facet $facet;
    final /* synthetic */ boolean $isUpdating;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4(Facet facet, Filter.CheckboxFilter checkboxFilter, C11300l<? super C27965a, C11079d2> lVar, int i, boolean z) {
        super(2);
        this.$facet = facet;
        this.$currentFilters = checkboxFilter;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$isUpdating = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r13 = r19
            r1 = r20
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r19.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r19.mo14958a0()
            goto L_0x0193
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsScreen.<anonymous> (FacetFilterDetailsStateful.kt:172)"
            r4 = 1122468707(0x42e78363, float:115.756615)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            com.carrefour.fid.android.domain.models.product.Facet r1 = r0.$facet
            int r1 = r1.mo118346j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r1 = com.carrefour.fid.android.shared.extension.C28759i.m119064a(r1, r3)
            if (r1 != 0) goto L_0x0043
            com.carrefour.fid.android.domain.models.product.Filter$CheckboxFilter r3 = r0.$currentFilters
            boolean r3 = r3.mo118369j()
            if (r3 == 0) goto L_0x018a
        L_0x0043:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r4, r6, r5)
            r4 = 16
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r4)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r4.mo17068m()
            kotlin.jvm.functions.l<com.carrefour.fid.android.product.presentation.ui.facet.details.a, kotlin.d2> r14 = r0.$actioner
            int r15 = r0.$$dirty
            com.carrefour.fid.android.domain.models.product.Facet r5 = r0.$facet
            boolean r7 = r0.$isUpdating
            com.carrefour.fid.android.domain.models.product.Filter$CheckboxFilter r12 = r0.$currentFilters
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r13.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r8 = r8.mo7631r()
            r9 = 48
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r8, r4, r13, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r13.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r13.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r11.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r2 = r19.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x00b2
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00b2:
            r19.mo14938T()
            boolean r2 = r19.mo14997l()
            if (r2 == 0) goto L_0x00bf
            r13.mo14947W(r6)
            goto L_0x00c2
        L_0x00bf:
            r19.mo14888A()
        L_0x00c2:
            r19.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r19)
            kotlin.jvm.functions.p r6 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r4, r6)
            kotlin.jvm.functions.p r4 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r4)
            kotlin.jvm.functions.p r4 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r4)
            kotlin.jvm.functions.p r4 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r4)
            r19.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r19)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.invoke(r2, r13, r6)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r2 = -1481233292(0xffffffffa7b62c74, float:-5.0563344E-15)
            r13.mo14918M(r2)
            if (r1 == 0) goto L_0x0163
            r1 = 0
            r2 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r14)
            java.lang.Object r3 = r19.mo14921N()
            if (r2 != 0) goto L_0x0121
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0129
        L_0x0121:
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4$1$1$1 r3 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4$1$1$1
            r3.<init>(r14)
            r13.mo14893C(r3)
        L_0x0129:
            r19.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            r6 = 0
            int r8 = com.carrefour.fid.android.product.C27609f.C27625p.filter_validate_button
            int r9 = r5.mo118346j()
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r5 = r5.mo118346j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11 = 0
            r10[r11] = r5
            r5 = 512(0x200, float:7.175E-43)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71856b(r8, r9, r10, r13, r5)
            r9 = 0
            r10 = 0
            int r5 = r15 << 9
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r5
            r16 = 413(0x19d, float:5.79E-43)
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r19
            r17 = r12
            r12 = r16
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151339f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0165
        L_0x0163:
            r17 = r12
        L_0x0165:
            r19.mo15002m0()
            r1 = 1553398911(0x5c96fc7f, float:3.39990951E17)
            r13.mo14918M(r1)
            boolean r1 = r17.mo118369j()
            if (r1 == 0) goto L_0x017b
            int r1 = r15 >> 12
            r1 = r1 & 14
            com.carrefour.fid.android.product.presentation.p039ui.facet.details.FacetFilterDetailsStatefulKt.m117339a(r14, r13, r1)
        L_0x017b:
            r19.mo15002m0()
            r19.mo15002m0()
            r19.mo14896D()
            r19.mo15002m0()
            r19.mo15002m0()
        L_0x018a:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0193
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4.invoke(androidx.compose.runtime.o, int):void");
    }
}
