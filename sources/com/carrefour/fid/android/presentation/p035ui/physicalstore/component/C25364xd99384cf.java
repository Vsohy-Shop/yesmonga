package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2426y;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreInfoOpeningsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoOpeningsComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreExceptionalOpeningsComponent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,480:1\n154#2:481\n154#2:515\n154#2:516\n154#2:522\n154#2:556\n75#3,6:482\n81#3:514\n85#3:521\n75#4:488\n76#4,11:490\n89#4:520\n75#4:529\n76#4,11:531\n89#4:560\n76#5:489\n76#5:530\n460#6,13:501\n473#6,3:517\n460#6,13:542\n473#6,3:557\n74#7,6:523\n80#7:555\n84#7:561\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoOpeningsComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreExceptionalOpeningsComponent$2\n*L\n218#1:481\n233#1:515\n234#1:516\n251#1:522\n262#1:556\n215#1:482,6\n215#1:514\n215#1:521\n215#1:488\n215#1:490,11\n215#1:520\n247#1:529\n247#1:531,11\n247#1:560\n215#1:489\n247#1:530\n215#1:501,13\n215#1:517,3\n247#1:542,13\n247#1:557,3\n247#1:523,6\n247#1:555\n247#1:561\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreExceptionalOpeningsComponent$2 */
public final class C25364xd99384cf extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<C38154g> $exceptionalClosing;
    final /* synthetic */ List<C38154g> $exceptionalOpening;
    final /* synthetic */ boolean $showHorizontally;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25364xd99384cf(boolean z, List<C38154g> list, List<C38154g> list2) {
        super(2);
        this.$showHorizontally = z;
        this.$exceptionalOpening = list;
        this.$exceptionalClosing = list2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        float f;
        C8767m.C8768a aVar;
        List<C38154g> list;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1052118620, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsComponent.<anonymous> (PhysicalStoreInfoOpeningsComponent.kt:212)");
            }
            if (this.$showHorizontally) {
                oVar2.mo14918M(-637693673);
                C8767m.C8768a aVar2 = C8767m.f23478j;
                float f2 = (float) 16;
                C8767m k = PaddingKt.m10024k(C2426y.m10722a(aVar2, IntrinsicSize.Min), C16483g.m74435M(f2));
                List<C38154g> list2 = this.$exceptionalOpening;
                List<C38154g> list3 = this.$exceptionalClosing;
                oVar2.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar2, 0);
                oVar2.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(k);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar2.mo14947W(a);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b = Updater.m30180b(oVar);
                Updater.m30188j(b, d, companion.mo44588d());
                Updater.m30188j(b, dVar, companion.mo44586b());
                Updater.m30188j(b, layoutDirection, companion.mo44587c());
                Updater.m30188j(b, c4Var, companion.mo44590f());
                oVar.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                oVar2.mo14918M(-739709470);
                Collection collection = list2;
                if (!collection.isEmpty()) {
                    list = list3;
                    f = f2;
                    aVar = aVar2;
                    PhysicalStoreInfoOpeningsComponentKt.m109604a(C2411u0.m10660e(rowScopeInstance, aVar2, 1.0f, false, 2, (Object) null), R.drawable.dot_green, R.string.store_exceptional_opening_title, list2, oVar, 4096, 0);
                } else {
                    aVar = aVar2;
                    list = list3;
                    f = f2;
                }
                oVar.mo15002m0();
                oVar2.mo14918M(-739709089);
                if ((!collection.isEmpty()) && (!list.isEmpty())) {
                    DividerKt.m13428a(SizeKt.m10092H(PaddingKt.m10026m(SizeKt.m10110j(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f), 0.0f, 2, (Object) null), C16483g.m74435M((float) 1)), C37475b.f94185a.mo114206C(), 0.0f, 0.0f, oVar, 6, 12);
                }
                oVar.mo15002m0();
                oVar2.mo14918M(-637692728);
                if (!list.isEmpty()) {
                    PhysicalStoreInfoOpeningsComponentKt.m109604a(C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), R.drawable.dot_red, R.string.store_exceptional_close_title, list, oVar, 4096, 0);
                }
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-637692338);
                C8767m.C8768a aVar3 = C8767m.f23478j;
                float f4 = (float) 16;
                C8767m k2 = PaddingKt.m10024k(C2426y.m10722a(SizeKt.m10114n(aVar3, 0.0f, 1, (Object) null), IntrinsicSize.Min), C16483g.m74435M(f4));
                List<C38154g> list4 = this.$exceptionalOpening;
                List<C38154g> list5 = this.$exceptionalClosing;
                oVar2.mo14918M(-483455358);
                C15560f0 b2 = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
                oVar2.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a2 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(k2);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar2.mo14947W(a2);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b3 = Updater.m30180b(oVar);
                Updater.m30188j(b3, b2, companion2.mo44588d());
                Updater.m30188j(b3, dVar2, companion2.mo44586b());
                Updater.m30188j(b3, layoutDirection2, companion2.mo44587c());
                Updater.m30188j(b3, c4Var2, companion2.mo44590f());
                oVar.mo14972e();
                f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
                oVar2.mo14918M(-739708096);
                if (!list4.isEmpty()) {
                    PhysicalStoreInfoOpeningsComponentKt.m109604a(C2373k.m10461c(columnScopeInstance, aVar3, 1.0f, false, 2, (Object) null), R.drawable.dot_green, R.string.store_exceptional_opening_title, list4, oVar, 4096, 0);
                    C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M(f4)), oVar2, 6);
                }
                oVar.mo15002m0();
                oVar2.mo14918M(-637691615);
                if (!list5.isEmpty()) {
                    PhysicalStoreInfoOpeningsComponentKt.m109604a(C2373k.m10461c(columnScopeInstance, aVar3, 1.0f, false, 2, (Object) null), R.drawable.dot_red, R.string.store_exceptional_close_title, list5, oVar, 4096, 0);
                }
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
