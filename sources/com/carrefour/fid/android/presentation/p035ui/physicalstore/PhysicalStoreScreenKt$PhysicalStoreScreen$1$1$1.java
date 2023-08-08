package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e;
import com.carrefour.fid.android.shared.util.C28932h;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27101a, C11079d2> $actioner;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C27127e $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1(C27127e eVar, C8767m mVar, C11300l<? super C27101a, C11079d2> lVar, int i) {
        super(1);
        this.$state = eVar;
        this.$modifier = mVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final C8767m mVar = this.$modifier;
        final C27127e eVar = this.$state;
        final C11300l<C27101a, C11079d2> lVar = this.$actioner;
        final int i = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "PhysicalStoreContent", (Object) null, C8553b.m31049c(777571165, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: kotlin.jvm.functions.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43) {
                /*
                    r40 = this;
                    r0 = r40
                    r14 = r42
                    r1 = r43
                    java.lang.String r2 = "$this$item"
                    r3 = r41
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    r2 = r1 & 81
                    r3 = 16
                    if (r2 != r3) goto L_0x001f
                    boolean r2 = r42.mo15011p()
                    if (r2 != 0) goto L_0x001a
                    goto L_0x001f
                L_0x001a:
                    r42.mo14958a0()
                    goto L_0x033b
                L_0x001f:
                    boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r2 == 0) goto L_0x002e
                    r2 = -1
                    java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreScreen.kt:221)"
                    r5 = 777571165(0x2e58cb5d, float:4.9293337E-11)
                    androidx.compose.runtime.ComposerKt.m29845w0(r5, r1, r2, r4)
                L_0x002e:
                    androidx.compose.ui.m r6 = r1
                    androidx.compose.ui.graphics.z1$a r7 = androidx.compose.p004ui.graphics.C15421z1.f38108b
                    r1 = 2
                    androidx.compose.ui.graphics.j2[] r1 = new androidx.compose.p004ui.graphics.C15240j2[r1]
                    r2 = 2131100377(0x7f0602d9, float:1.7813134E38)
                    r15 = 0
                    long r4 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r14, r15)
                    androidx.compose.ui.graphics.j2 r2 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r4)
                    r1[r15] = r2
                    r2 = 2131100376(0x7f0602d8, float:1.7813132E38)
                    long r4 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r14, r15)
                    androidx.compose.ui.graphics.j2 r2 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r4)
                    r5 = 1
                    r1[r5] = r2
                    java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r1)
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 14
                    r13 = 0
                    androidx.compose.ui.graphics.z1 r7 = androidx.compose.p004ui.graphics.C15421z1.C15422a.m67312c(r7, r8, r9, r10, r11, r12, r13)
                    r8 = 0
                    r10 = 6
                    r11 = 0
                    androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8823b(r6, r7, r8, r9, r10, r11)
                    r11 = 0
                    r12 = 0
                    androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r11, r5, r12)
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r13 = r4
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r10 = r5
                    int r9 = r6
                    r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
                    r14.mo14918M(r2)
                    androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
                    androidx.compose.ui.c r2 = r16.mo17061C()
                    androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.BoxKt.m9849k(r2, r15, r14, r15)
                    r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                    r14.mo14918M(r8)
                    androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
                    java.lang.Object r4 = r14.mo15032w(r4)
                    androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
                    androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
                    java.lang.Object r6 = r14.mo15032w(r6)
                    androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
                    androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
                    java.lang.Object r7 = r14.mo15032w(r7)
                    androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
                    androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
                    kotlin.jvm.functions.a r8 = r17.mo44585a()
                    kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
                    androidx.compose.runtime.d r3 = r42.mo15017r()
                    boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
                    if (r3 != 0) goto L_0x00bb
                    androidx.compose.runtime.ComposablesKt.m29519n()
                L_0x00bb:
                    r42.mo14938T()
                    boolean r3 = r42.mo14997l()
                    if (r3 == 0) goto L_0x00c8
                    r14.mo14947W(r8)
                    goto L_0x00cb
                L_0x00c8:
                    r42.mo14888A()
                L_0x00cb:
                    r42.mo14941U()
                    androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r42)
                    kotlin.jvm.functions.p r8 = r17.mo44588d()
                    androidx.compose.runtime.Updater.m30188j(r3, r2, r8)
                    kotlin.jvm.functions.p r2 = r17.mo44586b()
                    androidx.compose.runtime.Updater.m30188j(r3, r4, r2)
                    kotlin.jvm.functions.p r2 = r17.mo44587c()
                    androidx.compose.runtime.Updater.m30188j(r3, r6, r2)
                    kotlin.jvm.functions.p r2 = r17.mo44590f()
                    androidx.compose.runtime.Updater.m30188j(r3, r7, r2)
                    r42.mo14972e()
                    androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r42)
                    androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                    r1.invoke(r2, r14, r3)
                    r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                    r14.mo14918M(r8)
                    androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
                    r2 = 2131231729(0x7f0803f1, float:1.8079547E38)
                    androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r2, r14, r15)
                    androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
                    r3 = -19
                    float r3 = (float) r3
                    float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
                    androidx.compose.ui.m r3 = androidx.compose.foundation.layout.OffsetKt.m10000f(r7, r11, r3, r5, r12)
                    androidx.compose.ui.c r4 = r16.mo17060A()
                    androidx.compose.ui.m r19 = r1.mo7701c(r3, r4)
                    r20 = 0
                    r21 = 0
                    r1 = 16
                    float r6 = (float) r1
                    float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
                    r23 = 0
                    r24 = 11
                    r25 = 0
                    androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r19, r20, r21, r22, r23, r24, r25)
                    r4 = 0
                    r18 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 56
                    r23 = 120(0x78, float:1.68E-43)
                    r1 = r2
                    r2 = r4
                    r4 = r18
                    r15 = r5
                    r5 = r19
                    r26 = r6
                    r6 = r20
                    r18 = r13
                    r13 = r7
                    r7 = r21
                    r8 = r42
                    r29 = r9
                    r9 = r22
                    r30 = r10
                    r10 = r23
                    androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    androidx.compose.ui.m r31 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r11, r15, r12)
                    r1 = 64
                    float r1 = (float) r1
                    float r33 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
                    float r32 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
                    float r34 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
                    r35 = 0
                    r36 = 8
                    r37 = 0
                    androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r31, r32, r33, r34, r35, r36, r37)
                    androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
                    androidx.compose.foundation.layout.Arrangement$e r2 = r2.mo7628l()
                    androidx.compose.ui.c$c r3 = r16.mo17070q()
                    r4 = 693286680(0x2952b718, float:4.6788176E-14)
                    r14.mo14918M(r4)
                    r4 = 54
                    androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r3, r14, r4)
                    r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                    r14.mo14918M(r3)
                    androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
                    java.lang.Object r3 = r14.mo15032w(r3)
                    androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
                    androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
                    java.lang.Object r4 = r14.mo15032w(r4)
                    androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
                    androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
                    java.lang.Object r5 = r14.mo15032w(r5)
                    androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
                    kotlin.jvm.functions.a r6 = r17.mo44585a()
                    kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
                    androidx.compose.runtime.d r7 = r42.mo15017r()
                    boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
                    if (r7 != 0) goto L_0x01cb
                    androidx.compose.runtime.ComposablesKt.m29519n()
                L_0x01cb:
                    r42.mo14938T()
                    boolean r7 = r42.mo14997l()
                    if (r7 == 0) goto L_0x01d8
                    r14.mo14947W(r6)
                    goto L_0x01db
                L_0x01d8:
                    r42.mo14888A()
                L_0x01db:
                    r42.mo14941U()
                    androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r42)
                    kotlin.jvm.functions.p r7 = r17.mo44588d()
                    androidx.compose.runtime.Updater.m30188j(r6, r2, r7)
                    kotlin.jvm.functions.p r2 = r17.mo44586b()
                    androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
                    kotlin.jvm.functions.p r2 = r17.mo44587c()
                    androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
                    kotlin.jvm.functions.p r2 = r17.mo44590f()
                    androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
                    r42.mo14972e()
                    androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r42)
                    androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
                    r15 = 0
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                    r1.invoke(r2, r14, r3)
                    r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                    r14.mo14918M(r1)
                    androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
                    r1 = 2131953500(0x7f13075c, float:1.9543473E38)
                    java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
                    r2 = 0
                    r3 = 0
                    r5 = 28
                    long r5 = androidx.compose.p004ui.unit.C16506u.m74712m(r5)
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r12 = 0
                    r16 = 0
                    r41 = r13
                    r27 = r18
                    r13 = r16
                    r16 = 0
                    r2 = r14
                    r14 = r16
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
                    int r4 = androidx.compose.material.C7933t0.f19076b
                    androidx.compose.material.w1 r21 = r3.mo11077c(r2, r4)
                    androidx.compose.ui.text.p0 r21 = r21.mo11094h()
                    r23 = 3072(0xc00, float:4.305E-42)
                    r24 = 0
                    r25 = 65526(0xfff6, float:9.1821E-41)
                    r22 = r42
                    r0 = r2
                    r38 = r3
                    r39 = r4
                    r2 = 0
                    r3 = 0
                    androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    r1 = -658131229(0xffffffffd8c5b6e3, float:-1.73911427E15)
                    r0.mo14918M(r1)
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.c r1 = r27.mo78878f()
                    boolean r1 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c.C27119c
                    if (r1 == 0) goto L_0x02ee
                    r1 = 2131953496(0x7f130758, float:1.9543465E38)
                    r2 = 0
                    java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r0, r2)
                    r3 = 2131099840(0x7f0600c0, float:1.7812045E38)
                    long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r3, r0, r2)
                    r2 = r38
                    r5 = r39
                    androidx.compose.material.w1 r2 = r2.mo11077c(r0, r5)
                    androidx.compose.ui.text.p0 r28 = com.carrefour.fid.android.design.theme.C37477d.m153895g(r2)
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r2 = 1157296644(0x44faf204, float:2007.563)
                    r0.mo14918M(r2)
                    r14 = r30
                    boolean r2 = r0.mo15006n0(r14)
                    java.lang.Object r5 = r42.mo14921N()
                    if (r2 != 0) goto L_0x02af
                    androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r2 = r2.mo16277a()
                    if (r5 != r2) goto L_0x02b7
                L_0x02af:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$1$1$1$1$1 r5 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$1$1$1$1$1
                    r5.<init>(r14)
                    r0.mo14893C(r5)
                L_0x02b7:
                    r42.mo15002m0()
                    r23 = r5
                    kotlin.jvm.functions.a r23 = (kotlin.jvm.functions.C11289a) r23
                    r24 = 7
                    r25 = 0
                    r19 = r41
                    androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8878e(r19, r20, r21, r22, r23, r24, r25)
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r12 = 0
                    r13 = 0
                    r15 = 0
                    r30 = r14
                    r14 = r15
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 65528(0xfff8, float:9.1824E-41)
                    r21 = r28
                    r22 = r42
                    androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                L_0x02ee:
                    r42.mo15002m0()
                    r42.mo15002m0()
                    r42.mo14896D()
                    r42.mo15002m0()
                    r42.mo15002m0()
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.c r2 = r27.mo78878f()
                    r1 = 116(0x74, float:1.63E-43)
                    float r1 = (float) r1
                    float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
                    float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
                    float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
                    float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
                    r6 = r41
                    androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10027n(r6, r4, r1, r5, r3)
                    r3 = r29
                    r5 = r3 & 896(0x380, float:1.256E-42)
                    r6 = 0
                    r3 = r30
                    r4 = r42
                    com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt.m109458a(r1, r2, r3, r4, r5, r6)
                    r42.mo15002m0()
                    r42.mo14896D()
                    r42.mo15002m0()
                    r42.mo15002m0()
                    boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r0 == 0) goto L_0x033b
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x033b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1.C253181.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
        if (this.$state.mo78878f() instanceof C27116c.C27119c) {
            final C27127e eVar2 = this.$state;
            LazyListScope.m10824g(lazyListScope, "PhysicalStoreExceptionalOpeningHoursComponent", (Object) null, C8553b.m31049c(1201419234, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                    Intrinsics.checkNotNullParameter(eVar, "$this$item");
                    if ((i & 81) != 16 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1201419234, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreScreen.kt:276)");
                        }
                        C8767m m = PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 16), 0.0f, 2, (Object) null);
                        ArrayList arrayList = new ArrayList();
                        for (Object next : ((C27116c.C27119c) eVar2.mo78878f()).mo78846e().mo119362F()) {
                            if (C28932h.f70914a.mo84234c(((C38154g) next).mo119299i(), 7)) {
                                arrayList.add(next);
                            }
                        }
                        PhysicalStoreInfoOpeningsComponentKt.m109606c(m, false, arrayList, oVar, C14092c.f34620k1, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), 2, (Object) null);
        }
        final C27127e eVar3 = this.$state;
        final C11300l<C27101a, C11079d2> lVar2 = this.$actioner;
        final int i2 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "PhysicalStoreCatalogComponent", (Object) null, C8553b.m31049c(-1327436922, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.jvm.functions.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
                /*
                    r10 = this;
                    java.lang.String r0 = "$this$item"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    r11 = r13 & 81
                    r0 = 16
                    if (r11 != r0) goto L_0x0016
                    boolean r11 = r12.mo15011p()
                    if (r11 != 0) goto L_0x0012
                    goto L_0x0016
                L_0x0012:
                    r12.mo14958a0()
                    goto L_0x0083
                L_0x0016:
                    boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r11 == 0) goto L_0x0025
                    r11 = -1
                    java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreScreen.kt:287)"
                    r2 = -1327436922(0xffffffffb0e0eb86, float:-1.6365085E-9)
                    androidx.compose.runtime.ComposerKt.m29845w0(r2, r13, r11, r1)
                L_0x0025:
                    androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
                    r4 = 0
                    r11 = 24
                    float r11 = (float) r11
                    float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
                    r6 = 0
                    r7 = 0
                    r8 = 13
                    r9 = 0
                    androidx.compose.ui.m r11 = androidx.compose.foundation.layout.PaddingKt.m10028o(r3, r4, r5, r6, r7, r8, r9)
                    float r13 = (float) r0
                    float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
                    r0 = 2
                    r1 = 0
                    r2 = 0
                    androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10026m(r11, r13, r2, r0, r1)
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r11 = r1
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.c r11 = r11.mo78878f()
                    boolean r4 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c.C27119c
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r11 = r2
                    r13 = 1157296644(0x44faf204, float:2007.563)
                    r12.mo14918M(r13)
                    boolean r13 = r12.mo15006n0(r11)
                    java.lang.Object r0 = r12.mo14921N()
                    if (r13 != 0) goto L_0x0066
                    androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r13 = r13.mo16277a()
                    if (r0 != r13) goto L_0x006e
                L_0x0066:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$3$1$1 r0 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$3$1$1
                    r0.<init>(r11)
                    r12.mo14893C(r0)
                L_0x006e:
                    r12.mo15002m0()
                    r5 = r0
                    kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
                    r7 = 6
                    r8 = 0
                    r6 = r12
                    com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreCatalogComponentKt.m109577a(r3, r4, r5, r6, r7, r8)
                    boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r11 == 0) goto L_0x0083
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x0083:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1.C253203.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
        final C27127e eVar4 = this.$state;
        final C11300l<C27101a, C11079d2> lVar3 = this.$actioner;
        final int i3 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "PhysicalStoreFidelityComponent", (Object) null, C8553b.m31049c(2137881381, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.jvm.functions.p} */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21) {
                /*
                    r18 = this;
                    r0 = r18
                    r10 = r20
                    r1 = r21
                    java.lang.String r2 = "$this$item"
                    r3 = r19
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    r2 = r1 & 81
                    r3 = 16
                    if (r2 != r3) goto L_0x001f
                    boolean r2 = r20.mo15011p()
                    if (r2 != 0) goto L_0x001a
                    goto L_0x001f
                L_0x001a:
                    r20.mo14958a0()
                    goto L_0x0166
                L_0x001f:
                    boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r2 == 0) goto L_0x002e
                    r2 = -1
                    java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreScreen.kt:297)"
                    r4 = 2137881381(0x7f6d7b25, float:3.1566644E38)
                    androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
                L_0x002e:
                    androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
                    r12 = 0
                    r1 = 24
                    float r1 = (float) r1
                    float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
                    r14 = 0
                    r15 = 0
                    r16 = 13
                    r17 = 0
                    androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r11, r12, r13, r14, r15, r16, r17)
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = r3
                    com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r2 = r2.mo78876e()
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r3 = r4
                    r4 = 1157296644(0x44faf204, float:2007.563)
                    r10.mo14918M(r4)
                    boolean r5 = r10.mo15006n0(r3)
                    java.lang.Object r6 = r20.mo14921N()
                    if (r5 != 0) goto L_0x0062
                    androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r5 = r5.mo16277a()
                    if (r6 != r5) goto L_0x006a
                L_0x0062:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$1$1 r6 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$1$1
                    r6.<init>(r3)
                    r10.mo14893C(r6)
                L_0x006a:
                    r20.mo15002m0()
                    r3 = r6
                    kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r5 = r4
                    r10.mo14918M(r4)
                    boolean r6 = r10.mo15006n0(r5)
                    java.lang.Object r7 = r20.mo14921N()
                    if (r6 != 0) goto L_0x0087
                    androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r6 = r6.mo16277a()
                    if (r7 != r6) goto L_0x008f
                L_0x0087:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$2$1 r7 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$2$1
                    r7.<init>(r5)
                    r10.mo14893C(r7)
                L_0x008f:
                    r20.mo15002m0()
                    r5 = r7
                    kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r6 = r4
                    r10.mo14918M(r4)
                    boolean r7 = r10.mo15006n0(r6)
                    java.lang.Object r8 = r20.mo14921N()
                    if (r7 != 0) goto L_0x00ac
                    androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r7 = r7.mo16277a()
                    if (r8 != r7) goto L_0x00b4
                L_0x00ac:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$3$1 r8 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$3$1
                    r8.<init>(r6)
                    r10.mo14893C(r8)
                L_0x00b4:
                    r20.mo15002m0()
                    r6 = r8
                    kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r7 = r4
                    r10.mo14918M(r4)
                    boolean r8 = r10.mo15006n0(r7)
                    java.lang.Object r9 = r20.mo14921N()
                    if (r8 != 0) goto L_0x00d1
                    androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r8 = r8.mo16277a()
                    if (r9 != r8) goto L_0x00d9
                L_0x00d1:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$4$1 r9 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$4$1
                    r9.<init>(r7)
                    r10.mo14893C(r9)
                L_0x00d9:
                    r20.mo15002m0()
                    r7 = r9
                    kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r8 = r4
                    r10.mo14918M(r4)
                    boolean r9 = r10.mo15006n0(r8)
                    java.lang.Object r11 = r20.mo14921N()
                    if (r9 != 0) goto L_0x00f6
                    androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r9 = r9.mo16277a()
                    if (r11 != r9) goto L_0x00fe
                L_0x00f6:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$5$1 r11 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$5$1
                    r11.<init>(r8)
                    r10.mo14893C(r11)
                L_0x00fe:
                    r20.mo15002m0()
                    r8 = r11
                    kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r9 = r4
                    r10.mo14918M(r4)
                    boolean r11 = r10.mo15006n0(r9)
                    java.lang.Object r12 = r20.mo14921N()
                    if (r11 != 0) goto L_0x011b
                    androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r11 = r11.mo16277a()
                    if (r12 != r11) goto L_0x0123
                L_0x011b:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$6$1 r12 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$6$1
                    r12.<init>(r9)
                    r10.mo14893C(r12)
                L_0x0123:
                    r20.mo15002m0()
                    r9 = r12
                    kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.a, kotlin.d2> r11 = r4
                    r10.mo14918M(r4)
                    boolean r4 = r10.mo15006n0(r11)
                    java.lang.Object r12 = r20.mo14921N()
                    if (r4 != 0) goto L_0x0140
                    androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r4 = r4.mo16277a()
                    if (r12 != r4) goto L_0x0148
                L_0x0140:
                    com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$7$1 r12 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$7$1
                    r12.<init>(r11)
                    r10.mo14893C(r12)
                L_0x0148:
                    r20.mo15002m0()
                    r11 = r12
                    kotlin.jvm.functions.p r11 = (kotlin.jvm.functions.C11304p) r11
                    r12 = 6
                    r13 = 0
                    r4 = r5
                    r5 = r6
                    r6 = r7
                    r7 = r8
                    r8 = r9
                    r9 = r11
                    r10 = r20
                    r11 = r12
                    r12 = r13
                    com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreLoyaltyComponentKt.m109629a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r1 == 0) goto L_0x0166
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x0166:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1.C253214.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
    }
}
