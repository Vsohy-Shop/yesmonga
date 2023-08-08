package com.carrefour.fid.android.presentation.viewmodels.account.home;

import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.domain.models.accountmenu.C37951b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11308t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$state$1", mo22502f = "AccountMenuViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@"}, mo22516d2 = {"", "Lcom/carrefour/fid/android/domain/models/accountmenu/AccountMenuItem;", "accountMenuList", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/accountmenu/a;", "accountInbox", "", "displayUsabillaBanner", "Lcom/carrefour/fid/android/domain/models/accountmenu/b;", "userInfo", "", "userUuid", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/c;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AccountMenuViewModel$state$1 extends SuspendLambda implements C11308t<List<? extends AccountMenuItem>, C28892e<? extends C37950a>, Boolean, C28892e<? extends C37951b>, String, C11045c<? super C25798c>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;

    public AccountMenuViewModel$state$1(C11045c<? super AccountMenuViewModel$state$1> cVar) {
        super(6, cVar);
    }

    /* renamed from: M1 */
    public /* bridge */ /* synthetic */ Object mo10648M1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return mo74879g((List) obj, (C28892e) obj2, ((Boolean) obj3).booleanValue(), (C28892e) obj4, (String) obj5, (C11045c) obj6);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo74879g(@C12579k List<? extends AccountMenuItem> list, @C12579k C28892e<C37950a> eVar, boolean z, @C12579k C28892e<C37951b> eVar2, @C12580l String str, @C12580l C11045c<? super C25798c> cVar) {
        AccountMenuViewModel$state$1 accountMenuViewModel$state$1 = new AccountMenuViewModel$state$1(cVar);
        accountMenuViewModel$state$1.L$0 = list;
        accountMenuViewModel$state$1.L$1 = eVar;
        accountMenuViewModel$state$1.Z$0 = z;
        accountMenuViewModel$state$1.L$2 = eVar2;
        accountMenuViewModel$state$1.L$3 = str;
        return accountMenuViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C28892e eVar = (C28892e) this.L$1;
            boolean z = this.Z$0;
            return new C25798c(eVar, (C28892e) this.L$2, z, (List) this.L$0, (String) this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
