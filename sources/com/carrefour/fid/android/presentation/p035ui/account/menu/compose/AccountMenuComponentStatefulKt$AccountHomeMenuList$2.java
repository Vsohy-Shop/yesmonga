package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$2 */
public final class AccountMenuComponentStatefulKt$AccountHomeMenuList$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<AccountMenuItem> $accountMenuListItem;
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ String $appVersionText;
    final /* synthetic */ C8700z0<Boolean> $displayLogoutDialog;
    final /* synthetic */ boolean $displayUsabillaBanner;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountHomeMenuList$2(C8767m mVar, boolean z, C8700z0<Boolean> z0Var, List<? extends AccountMenuItem> list, String str, C11300l<? super C23130a, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$displayUsabillaBanner = z;
        this.$displayLogoutDialog = z0Var;
        this.$accountMenuListItem = list;
        this.$appVersionText = str;
        this.$actioner = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AccountMenuComponentStatefulKt.m103667a(this.$modifier, this.$displayUsabillaBanner, this.$displayLogoutDialog, this.$accountMenuListItem, this.$appVersionText, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
