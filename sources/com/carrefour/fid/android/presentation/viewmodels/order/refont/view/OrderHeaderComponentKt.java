package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
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
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOrderHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderHeaderComponent.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,83:1\n74#2,6:84\n80#2:116\n74#2,6:153\n80#2:185\n84#2:190\n84#2:201\n75#3:90\n76#3,11:92\n75#3:124\n76#3,11:126\n75#3:159\n76#3,11:161\n89#3:189\n89#3:194\n89#3:200\n76#4:91\n76#4:125\n76#4:160\n460#5,13:103\n460#5,13:137\n460#5,13:172\n473#5,3:186\n473#5,3:191\n473#5,3:197\n154#6:117\n154#6:151\n154#6:152\n154#6:196\n75#7,6:118\n81#7:150\n85#7:195\n*S KotlinDebug\n*F\n+ 1 OrderHeaderComponent.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderComponentKt\n*L\n34#1:84,6\n34#1:116\n44#1:153,6\n44#1:185\n44#1:190\n34#1:201\n34#1:90\n34#1:92,11\n35#1:124\n35#1:126,11\n44#1:159\n44#1:161,11\n44#1:189\n35#1:194\n34#1:200\n34#1:91\n35#1:125\n44#1:160\n34#1:103,13\n35#1:137,13\n44#1:172,13\n44#1:186,3\n35#1:191,3\n34#1:197,3\n35#1:117\n38#1:151\n39#1:152\n59#1:196\n35#1:118,6\n35#1:150\n35#1:195\n*E\n"})
public final class OrderHeaderComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m114484a(@C12580l C8767m mVar, @C12580l OrderHeaderModel orderHeaderModel, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        OrderHeaderModel orderHeaderModel2;
        OrderHeaderModel orderHeaderModel3;
        C8767m mVar3;
        C8767m mVar4;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(472075989);
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
        int i8 = i6 & 2;
        if (i8 != 0) {
            i3 |= 16;
        }
        if (i8 == 2 && (i3 & 91) == 18 && o.mo15011p()) {
            o.mo14958a0();
            orderHeaderModel2 = orderHeaderModel;
            oVar2 = o;
        } else {
            o.mo14930Q();
            if ((i5 & 1) == 0 || o.mo14977f0()) {
                if (i7 != 0) {
                    mVar4 = C8767m.f23478j;
                } else {
                    mVar4 = mVar2;
                }
                if (i8 != 0) {
                    mVar3 = mVar4;
                    orderHeaderModel3 = new OrderHeaderModel(0, 0, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
                } else {
                    orderHeaderModel3 = orderHeaderModel;
                    mVar3 = mVar4;
                }
            } else {
                o.mo14958a0();
                orderHeaderModel3 = orderHeaderModel;
                mVar3 = mVar2;
            }
            o.mo14899E();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(472075989, i5, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderComponent (OrderHeaderComponent.kt:29)");
            }
            C8767m n = SizeKt.m10114n(mVar3, 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar2 = C8767m.f23478j;
            float f2 = (float) 16;
            C8767m o2 = PaddingKt.m10028o(aVar2, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f2), 7, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), aVar.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m.C8768a aVar3 = aVar2;
            C8767m mVar5 = mVar3;
            ImageKt.m8967b(C16015f.m71849d(orderHeaderModel3.mo78712j(), o, 0), C16018i.m71858d(orderHeaderModel3.mo78714l(), o, 0), rowScopeInstance.mo7845f(SizeKt.m10087C(PaddingKt.m10028o(aVar2, 0.0f, 0.0f, C16483g.m74435M(f2), 0.0f, 11, (Object) null), C16483g.m74435M((float) 32)), aVar.mo17070q()), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 8, 120);
            C8767m f4 = rowScopeInstance.mo7845f(aVar3, aVar.mo17070q());
            o.mo14918M(-483455358);
            C15560f0 b4 = ColumnKt.m9863b(arrangement.mo7631r(), aVar.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(f4);
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
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            String d2 = C16018i.m71858d(orderHeaderModel3.mo78714l(), o, 0);
            C16361p0 m = C37477d.m153901m(C37477d.m153887N());
            C37475b bVar = C37475b.f94185a;
            C8767m mVar6 = mVar5;
            C8767m.C8768a aVar4 = aVar3;
            C8592o oVar3 = o;
            C8592o oVar4 = oVar3;
            TextKt.m14196c(d2, (C8767m) null, bVar.mo114212I(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, m, oVar4, 0, 0, 65530);
            TextKt.m14196c("N° " + orderHeaderModel3.mo78713k(), (C8767m) null, bVar.mo114207D(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), oVar4, 0, 0, 65530);
            oVar3.mo15002m0();
            oVar3.mo14896D();
            oVar3.mo15002m0();
            oVar3.mo15002m0();
            oVar3.mo15002m0();
            oVar3.mo14896D();
            oVar3.mo15002m0();
            oVar3.mo15002m0();
            C8592o oVar5 = oVar3;
            oVar5.mo14918M(-1260603705);
            if (orderHeaderModel3.mo78711i()) {
                C8767m o3 = PaddingKt.m10028o(aVar4, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 2), 7, (Object) null);
                oVar2 = oVar5;
                TextKt.m14196c(orderHeaderModel3.mo78709h(), o3, bVar.mo114207D(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), oVar2, 48, 0, 65528);
            } else {
                oVar2 = oVar5;
            }
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            orderHeaderModel2 = orderHeaderModel3;
            mVar2 = mVar6;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderHeaderComponentKt$OrderHeaderComponent$2(mVar2, orderHeaderModel2, i5, i6));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m114485b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1620048083);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1620048083, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderDefaultComponentPreview (OrderHeaderComponent.kt:69)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderHeaderComponentKt.f65824a.mo78671a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderHeaderComponentKt$OrderHeaderDefaultComponentPreview$1(i));
        }
    }
}
