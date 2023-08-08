package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.domain.models.accountmenu.C37951b;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$2 */
public final class AccountMenuComponentStatefulKt$AccountMenuComponentStateful$2 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C25796a $accountMenuAnalyticsHandler;
    final /* synthetic */ C8578k2<C25798c> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuComponentStateful$2(C8578k2<C25798c> k2Var, C25796a aVar) {
        super(0);
        this.$state = k2Var;
        this.$accountMenuAnalyticsHandler = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        boolean z;
        C37951b bVar = (C37951b) C28897f.m119478b(this.$state.getValue().mo74901k());
        if (bVar != null) {
            this.$accountMenuAnalyticsHandler.mo74882c(bVar.mo116793b().mo116663r(), bVar.mo116793b().mo116664s(), bVar.mo116793b().mo116667u());
            Integer a = bVar.mo116792a();
            if (a != null) {
                this.$accountMenuAnalyticsHandler.mo74888i(a.intValue());
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
