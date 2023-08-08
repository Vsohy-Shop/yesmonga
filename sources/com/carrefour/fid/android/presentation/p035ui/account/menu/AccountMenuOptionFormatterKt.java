package com.carrefour.fid.android.presentation.p035ui.account.menu;

import android.content.Context;
import androidx.compose.p004ui.graphics.C15240j2;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.presentation.p035ui.account.menu.compose.C23139b;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountMenuOptionFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuOptionFormatter.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/AccountMenuOptionFormatterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuOptionFormatterKt */
public final class AccountMenuOptionFormatterKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuOptionFormatterKt$a */
    public /* synthetic */ class C23103a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem[] r0 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.ORDERS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.LOYALTY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.PERSONAL_DATA     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.PAYMENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.HELP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.USER_CONSENTS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.SERVICES     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.LEGALS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.AccountMenuOptionFormatterKt.C23103a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<AccountMenuItem> m103648a(@C12579k List<? extends AccountMenuItem> list, boolean z, int i) {
        Intrinsics.checkNotNullParameter(list, "accountMenuItemList");
        if (!z || i <= 0) {
            return list;
        }
        List T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        T5.add(i, AccountMenuItem.USABILLA);
        return CollectionsKt___CollectionsKt.m40557Q5(T5);
    }

    @C12580l
    /* renamed from: b */
    public static final C23139b m103649b(@C12579k AccountMenuItem accountMenuItem, @C12579k Context context, @C12579k C11289a<C11079d2> aVar) {
        C11289a<C11079d2> aVar2 = aVar;
        Intrinsics.checkNotNullParameter(accountMenuItem, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar2, "onItemClicked");
        switch (C23103a.$EnumSwitchMapping$0[accountMenuItem.ordinal()]) {
            case 1:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[0], Integer.valueOf(R.drawable.ds_ic_file), C15240j2.m66071n(C37475b.f94185a.mo114218O()), new AccountMenuOptionFormatterKt$toAccountMenuOption$1(aVar2), (DefaultConstructorMarker) null);
            case 2:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[1], Integer.valueOf(R.drawable.ds_ic_horizontal_card_fid), C15240j2.m66071n(C37475b.f94185a.mo114218O()), new AccountMenuOptionFormatterKt$toAccountMenuOption$2(aVar2), (DefaultConstructorMarker) null);
            case 3:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[2], Integer.valueOf(R.drawable.ic_account_navigation_selected), C15240j2.m66071n(C37475b.f94185a.mo114218O()), new AccountMenuOptionFormatterKt$toAccountMenuOption$3(aVar2), (DefaultConstructorMarker) null);
            case 4:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[3], Integer.valueOf(R.drawable.ds_ic_credit_card), C15240j2.m66071n(C37475b.f94185a.mo114218O()), new AccountMenuOptionFormatterKt$toAccountMenuOption$4(aVar2), (DefaultConstructorMarker) null);
            case 5:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[4], Integer.valueOf(R.drawable.ds_ic_help), (C15240j2) null, new AccountMenuOptionFormatterKt$toAccountMenuOption$5(aVar2), 4, (DefaultConstructorMarker) null);
            case 6:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[5], (Integer) null, (C15240j2) null, new AccountMenuOptionFormatterKt$toAccountMenuOption$6(aVar2), 6, (DefaultConstructorMarker) null);
            case 7:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[6], (Integer) null, (C15240j2) null, new AccountMenuOptionFormatterKt$toAccountMenuOption$7(aVar2), 6, (DefaultConstructorMarker) null);
            case 8:
                return new C23139b(context.getResources().getStringArray(R.array.account_logged_services_list)[7], (Integer) null, (C15240j2) null, new AccountMenuOptionFormatterKt$toAccountMenuOption$8(aVar2), 6, (DefaultConstructorMarker) null);
            default:
                return null;
        }
    }
}
