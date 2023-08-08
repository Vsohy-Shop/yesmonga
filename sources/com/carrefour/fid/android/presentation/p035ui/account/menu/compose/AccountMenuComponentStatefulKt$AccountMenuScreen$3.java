package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$3 */
public final class AccountMenuComponentStatefulKt$AccountMenuScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<AccountMenuItem> $accountMenuList;
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37950a> $airshipInbox;
    final /* synthetic */ String $appVersionText;
    final /* synthetic */ C8700z0<Boolean> $displayHelpDialog;
    final /* synthetic */ C8700z0<Boolean> $displayLogoutDialog;
    final /* synthetic */ boolean $displayUsabillaBanner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuScreen$3(C28892e<C37950a> eVar, boolean z, String str, List<? extends AccountMenuItem> list, C8700z0<Boolean> z0Var, C8700z0<Boolean> z0Var2, C11300l<? super C23130a, C11079d2> lVar, int i) {
        super(2);
        this.$airshipInbox = eVar;
        this.$displayUsabillaBanner = z;
        this.$appVersionText = str;
        this.$accountMenuList = list;
        this.$displayLogoutDialog = z0Var;
        this.$displayHelpDialog = z0Var2;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AccountMenuComponentStatefulKt.m103674h(this.$airshipInbox, this.$displayUsabillaBanner, this.$appVersionText, this.$accountMenuList, this.$displayLogoutDialog, this.$displayHelpDialog, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
