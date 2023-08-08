package com.carrefour.fid.android.presentation.p035ui.account.list.memo;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.ComposeView;
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
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$initMemoListInput$1$1 */
public final class MemoListFragment$initMemoListInput$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ComposeView $this_with;
    final /* synthetic */ MemoListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListFragment$initMemoListInput$1$1(MemoListFragment memoListFragment, ComposeView composeView) {
        super(2);
        this.this$0 = memoListFragment;
        this.$this_with = composeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2020068162, i, -1, "com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment.initMemoListInput.<anonymous>.<anonymous> (MemoListFragment.kt:192)");
            }
            final MemoListFragment memoListFragment = this.this$0;
            final ComposeView composeView = this.$this_with;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1490108667, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-1490108667, i2, -1, "com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment.initMemoListInput.<anonymous>.<anonymous>.<anonymous> (MemoListFragment.kt:193)");
                        }
                        C8767m.C8768a aVar = C8767m.f23478j;
                        C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null);
                        MemoListFragment memoListFragment = memoListFragment;
                        ComposeView composeView = composeView;
                        oVar2.mo14918M(733328855);
                        C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(d);
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
                        Updater.m30188j(b, k, companion.mo44588d());
                        Updater.m30188j(b, dVar, companion.mo44586b());
                        Updater.m30188j(b, layoutDirection, companion.mo44587c());
                        Updater.m30188j(b, c4Var, companion.mo44590f());
                        oVar.mo14972e();
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                        float f2 = (float) 16;
                        MemoListInputComponentKt.m151532b(PaddingKt.m10027n(aVar, C16483g.m74435M(f2), C16483g.m74435M((float) 8), C16483g.m74435M(f2), C16483g.m74435M(f2)), false, memoListFragment.f58611w, new MemoListFragment$initMemoListInput$1$1$1$1$1(memoListFragment, composeView), (C11289a<C11079d2>) null, oVar, 6, 18);
                        oVar.mo15002m0();
                        oVar.mo14896D();
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
