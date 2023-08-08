package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.presentation.p035ui.account.menu.AccountMenuOptionFormatterKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAccountMenuComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountHomeMenuList$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,460:1\n171#2,12:461\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountHomeMenuList$1\n*L\n335#1:461,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1 */
public final class AccountMenuComponentStatefulKt$AccountHomeMenuList$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<AccountMenuItem> $accountMenuListItem;
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ String $appVersionText;
    final /* synthetic */ C8700z0<Boolean> $displayLogoutDialog;
    final /* synthetic */ boolean $displayUsabillaBanner;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$a */
    public /* synthetic */ class C23113a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem[] r0 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.USABILLA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.LOGOUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.APP_VERSION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1.C23113a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountHomeMenuList$1(List<? extends AccountMenuItem> list, boolean z, C11300l<? super C23130a, C11079d2> lVar, int i, C8700z0<Boolean> z0Var, String str) {
        super(1);
        this.$accountMenuListItem = list;
        this.$displayUsabillaBanner = z;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$displayLogoutDialog = z0Var;
        this.$appVersionText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<AccountMenuItem> list = this.$accountMenuListItem;
        List<AccountMenuItem> a = AccountMenuOptionFormatterKt.m103648a(list, this.$displayUsabillaBanner, list.size() - 2);
        C231121 r0 = C231121.f58768f;
        lazyListScope.mo8310k(a.size(), r0 != null ? new C23109xc79d2c38(r0, a) : null, new C23110xc79d2c39(a), C8553b.m31049c(-1091073711, true, new C23111xc79d2c3a(a, this.$actioner, this.$$dirty, this.$displayLogoutDialog, this.$appVersionText, this.$accountMenuListItem, this.$displayUsabillaBanner)));
    }
}
