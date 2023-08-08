package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.EditableSectionKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$slotSection$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,739:1\n154#2:740\n154#2:741\n154#2:780\n75#3,6:742\n81#3:774\n85#3:779\n75#4:748\n76#4,11:750\n89#4:778\n76#5:749\n460#6,13:761\n473#6,3:775\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$slotSection$1\n*L\n348#1:740\n350#1:741\n359#1:780\n346#1:742,6\n346#1:774\n346#1:779\n346#1:748\n346#1:750,11\n346#1:778\n346#1:749\n346#1:761,13\n346#1:775,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$slotSection$1 */
public final class CheckoutStep2ScreenKt$slotSection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onSlotEdit;
    final /* synthetic */ C26105b $slotSectionState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$slotSection$1(C26105b bVar, C11289a<C11079d2> aVar) {
        super(3);
        this.$slotSectionState = bVar;
        this.$onSlotEdit = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1935544953, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.slotSection.<anonymous> (CheckoutStep2Screen.kt:340)");
            }
            C26105b bVar = this.$slotSectionState;
            if (Intrinsics.areEqual((Object) bVar, (Object) C26105b.C26106a.f63790a)) {
                oVar2.mo14918M(1236021285);
                BlockDividerKt.m104587a(oVar2, 0);
                C8767m b = C37019o.m151909b(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 16), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 85)), true, (C15218g4) null, 2, (Object) null);
                oVar2.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar2, 0);
                oVar2.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
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
                C8592o b2 = Updater.m30180b(oVar);
                Updater.m30188j(b2, d, companion.mo44588d());
                Updater.m30188j(b2, dVar, companion.mo44586b());
                Updater.m30188j(b2, layoutDirection, companion.mo44587c());
                Updater.m30188j(b2, c4Var, companion.mo44590f());
                oVar.mo14972e();
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else if (bVar instanceof C26105b.C26107b) {
                oVar2.mo14918M(1236021623);
                BlockDividerKt.m104587a(oVar2, 0);
                C8767m e = ClickableKt.m8878e(SizeKt.m10114n(PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16)), 0.0f, 1, (Object) null), false, (String) null, (C16031g) null, this.$onSlotEdit, 7, (Object) null);
                String d2 = C16018i.m71858d(R.string.checkout_slot_title_drive, oVar2, 0);
                C11289a<C11079d2> aVar = this.$onSlotEdit;
                final C26105b bVar2 = this.$slotSectionState;
                EditableSectionKt.m104616c(e, d2, aVar, C8553b.m31048b(oVar2, 1528151699, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        C8592o oVar2 = oVar;
                        int i2 = i;
                        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(1528151699, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.slotSection.<anonymous>.<anonymous> (CheckoutStep2Screen.kt:363)");
                            }
                            TextKt.m14196c(CheckoutStep2ScreenKt.m104356K(((C26105b.C26107b) bVar2).mo75808e(), oVar2, 8), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65534);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }), oVar, 3072, 0);
                oVar.mo15002m0();
            } else if (bVar instanceof C26105b.C26108c) {
                oVar2.mo14918M(1236022282);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(1236022349);
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
