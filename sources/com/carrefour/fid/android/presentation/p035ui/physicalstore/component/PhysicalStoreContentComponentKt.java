package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreContentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreContentComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContentComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,105:1\n79#2,2:106\n81#2:134\n85#2:180\n75#3:108\n76#3,11:110\n75#3:142\n76#3,11:144\n89#3:173\n89#3:179\n76#4:109\n76#4:143\n460#5,13:121\n460#5,13:155\n473#5,3:170\n473#5,3:176\n73#6,7:135\n80#6:168\n84#6:174\n154#7:169\n154#7:175\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreContentComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContentComponentKt\n*L\n31#1:106,2\n31#1:134\n31#1:180\n31#1:108\n31#1:110,11\n36#1:142\n36#1:144,11\n36#1:173\n31#1:179\n31#1:109\n36#1:143\n31#1:121,13\n36#1:155,13\n36#1:170,3\n31#1:176,3\n36#1:135,7\n36#1:168\n36#1:174\n42#1:169\n48#1:175\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContentComponentKt */
public final class PhysicalStoreContentComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109597a(@C12580l C8767m mVar, @C12579k C37396r1 r1Var, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        C37396r1 r1Var2 = r1Var;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(r1Var2, "storeInfo");
        C8592o o = oVar.mo15009o(424017023);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            mVar2 = mVar;
        } else if ((i6 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            mVar2 = mVar;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo15006n0(r1Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(424017023, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContentComponent (PhysicalStoreContentComponent.kt:26)");
            }
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e l = arrangement.mo7628l();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8737c q = aVar2.mo17070q();
            int i9 = (i3 & 14) | 432;
            o.mo14918M(693286680);
            int i10 = i9 >> 3;
            C15560f0 d = RowKt.m10071d(l, q, o, (i10 & 112) | (i10 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i11 >> 3) & 112));
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            o.mo14918M(-483455358);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar3);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C37475b bVar = C37475b.f94185a;
            long B = bVar.mo114205B();
            TextKt.m14196c(r1Var.mo113983f(), PaddingKt.m10028o(aVar3, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 8), 7, (Object) null), B, C37474a.f94133a.mo114182e(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), o, 48, 0, 65520);
            C8592o oVar3 = o;
            PhysicalStoreOpeningsTextKt.m109642d((C8767m) null, 0, r1Var, o, (C37396r1.f93965d << 6) | ((i3 << 3) & 896), 3);
            oVar3.mo15002m0();
            oVar3.mo14896D();
            oVar3.mo15002m0();
            oVar3.mo15002m0();
            C8767m o2 = PaddingKt.m10028o(aVar3, 0.0f, 0.0f, C16483g.m74435M((float) 16), 0.0f, 11, (Object) null);
            oVar2 = oVar3;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_chevron_right, oVar3, 0), (String) null, o2, (C8734c) null, (C15541c) null, 0.0f, C15249k2.C15250a.m66144d(C15249k2.f37569b, bVar.mo114218O(), 0, 2, (Object) null), oVar2, 440, 56);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = aVar;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreContentComponentKt$PhysicalStoreContentComponent$2(mVar2, r1Var2, i6, i7));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109598b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1610482182);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1610482182, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoClosedComponentPreview (PhysicalStoreContentComponent.kt:88)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreContentComponentKt.f62430a.mo73937f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25359x5144b6ef(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109599c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-308122147);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-308122147, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoNoInfoComponentPreview (PhysicalStoreContentComponent.kt:57)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreContentComponentKt.f62430a.mo73933b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25360x8b0830d2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109600d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2011608649);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2011608649, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpenedComponentPreview (PhysicalStoreContentComponent.kt:69)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreContentComponentKt.f62430a.mo73935d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25361xc9e7b8ac(i));
        }
    }
}
