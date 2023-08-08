package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import com.carrefour.fid.android.design.components.compose.C37019o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShoppingListLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListLoadingScreen.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListLoadingScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,111:1\n154#2:112\n154#2:113\n154#2:147\n154#2:148\n154#2:154\n154#2:188\n154#2:189\n154#2:190\n154#2:224\n154#2:225\n154#2:226\n154#2:227\n154#2:228\n154#2:229\n154#2:230\n154#2:231\n154#2:232\n154#2:238\n154#2:272\n154#2:273\n154#2:274\n154#2:275\n154#2:276\n154#2:277\n154#2:288\n154#2:289\n74#3,6:114\n80#3:146\n84#3:153\n74#3,6:191\n80#3:223\n84#3:237\n74#3,6:239\n80#3:271\n84#3:282\n75#4:120\n76#4,11:122\n89#4:152\n75#4:161\n76#4,11:163\n75#4:197\n76#4,11:199\n89#4:236\n75#4:245\n76#4,11:247\n89#4:281\n89#4:286\n76#5:121\n76#5:162\n76#5:198\n76#5:246\n460#6,13:133\n473#6,3:149\n460#6,13:174\n460#6,13:210\n473#6,3:233\n460#6,13:258\n473#6,3:278\n473#6,3:283\n75#7,6:155\n81#7:187\n85#7:287\n*S KotlinDebug\n*F\n+ 1 ShoppingListLoadingScreen.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListLoadingScreenKt\n*L\n22#1:112\n23#1:113\n29#1:147\n30#1:148\n45#1:154\n48#1:188\n49#1:189\n53#1:190\n58#1:224\n59#1:225\n60#1:226\n65#1:227\n66#1:228\n67#1:229\n72#1:230\n73#1:231\n74#1:232\n84#1:238\n88#1:272\n89#1:273\n90#1:274\n95#1:275\n96#1:276\n97#1:277\n107#1:288\n108#1:289\n20#1:114,6\n20#1:146\n20#1:153\n52#1:191,6\n52#1:223\n52#1:237\n83#1:239,6\n83#1:271\n83#1:282\n20#1:120\n20#1:122,11\n20#1:152\n45#1:161\n45#1:163,11\n52#1:197\n52#1:199,11\n52#1:236\n83#1:245\n83#1:247,11\n83#1:281\n45#1:286\n20#1:121\n45#1:162\n52#1:198\n83#1:246\n20#1:133,13\n20#1:149,3\n45#1:174,13\n52#1:210,13\n52#1:233,3\n83#1:258,13\n83#1:278,3\n45#1:283,3\n45#1:155,6\n45#1:187\n45#1:287\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListLoadingScreenKt */
public final class ShoppingListLoadingScreenKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103531a(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(1185435873);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            mVar2 = mVar;
        } else if ((i5 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            mVar2 = mVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar3 = C8767m.f23478j;
            } else {
                mVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1185435873, i3, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.OrderOnlineLoadingScreen (ShoppingListLoadingScreen.kt:18)");
            }
            float f = (float) 16;
            C8767m n = SizeKt.m10114n(PaddingKt.m10026m(PaddingKt.m10026m(mVar3, 0.0f, C16483g.m74435M((float) 6), 1, (Object) null), C16483g.m74435M(f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            C8734c.C8736b u = C8734c.f23406a.mo17072u();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), u, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10092H(C8767m.f23478j, C16483g.m74435M((float) 200)), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            int i8 = i3 & 14;
            m103532b(mVar3, o, i8);
            m103532b(mVar3, o, i8);
            m103532b(mVar3, o, i8);
            m103532b(mVar3, o, i8);
            m103532b(mVar3, o, i8);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListLoadingScreenKt$OrderOnlineLoadingScreen$2(mVar3, i5, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103532b(C8767m mVar, C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(1900261436);
        if ((i2 & 1) != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1900261436, i2, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ProductCardShimmer (ShoppingListLoadingScreen.kt:43)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null);
            o.mo14918M(693286680);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2269d p = arrangement.mo7630p();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(p, aVar2.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o2);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            float f2 = (float) 100;
            C2428y0.m10726a(m103534d(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f2)), C16483g.m74435M(f2))), o, 0);
            float f3 = (float) 10;
            float f4 = f3;
            C8767m o3 = PaddingKt.m10028o(aVar, C16483g.m74435M(f3), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o3);
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
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f6 = (float) 110;
            float f7 = (float) 20;
            float f8 = (float) 6;
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f6)), C16483g.m74435M(f7)), 0.0f, C16483g.m74435M(f8), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f6)), C16483g.m74435M(f7)), 0.0f, C16483g.m74435M(f8), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f6)), C16483g.m74435M(f7)), 0.0f, C16483g.m74435M(f8), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C2428y0.m10726a(SizeKt.m10114n(C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null), o, 0);
            float f9 = f8;
            C8767m o4 = PaddingKt.m10028o(aVar, C16483g.m74435M(f4), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b4 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f10 = LayoutKt.m68908f(o4);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a3);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b5 = Updater.m30180b(o);
            Updater.m30188j(b5, b4, companion.mo44588d());
            Updater.m30188j(b5, dVar3, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b5, c4Var3, companion.mo44590f());
            o.mo14972e();
            f10.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            float f11 = (float) 40;
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f11)), C16483g.m74435M(f11)), 0.0f, C16483g.m74435M(f9), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m103534d(PaddingKt.m10028o(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f11)), C16483g.m74435M(f11)), 0.0f, C16483g.m74435M(f9), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListLoadingScreenKt$ProductCardShimmer$2(mVar, i2));
        }
    }

    /* renamed from: d */
    public static final C8767m m103534d(C8767m mVar) {
        return C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(mVar, C16483g.m74435M((float) 14)), C2694o.m12166h(C16483g.m74435M((float) 8))), true, (C15218g4) null, 2, (Object) null);
    }
}
