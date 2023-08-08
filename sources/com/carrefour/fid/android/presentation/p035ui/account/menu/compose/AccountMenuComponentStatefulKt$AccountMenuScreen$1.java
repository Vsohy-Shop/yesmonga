package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$1 */
public final class AccountMenuComponentStatefulKt$AccountMenuScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37950a> $airshipInbox;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuScreen$1(C28892e<C37950a> eVar, C11300l<? super C23130a, C11079d2> lVar, int i) {
        super(2);
        this.$airshipInbox = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(-588683968, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuScreen.<anonymous> (AccountMenuComponentStateful.kt:163)");
            }
            C28892e<C37950a> eVar = this.$airshipInbox;
            C11300l<C23130a, C11079d2> lVar = this.$actioner;
            int i2 = C28892e.f70778a;
            int i3 = this.$$dirty;
            AccountMenuComponentStatefulKt.m103671e(eVar, lVar, oVar, i2 | (i3 & 14) | ((i3 >> 15) & 112));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
