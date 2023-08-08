package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.UserInfo;
import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import com.carrefour.fid.android.account.data.entities.extentions.C13188k;
import com.carrefour.fid.android.account.domain.extension.C13242a;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$2", mo22502f = "AccountRepository.kt", mo22503i = {}, mo22504l = {226, 229}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AccountRepository$updateAccountInfo$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends AccountInfo>>, Object> {
    final /* synthetic */ AccountInfo $newUserInfo;
    int label;
    final /* synthetic */ AccountRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepository$updateAccountInfo$2(AccountRepository accountRepository, AccountInfo accountInfo, C11045c<? super AccountRepository$updateAccountInfo$2> cVar) {
        super(1, cVar);
        this.this$0 = accountRepository;
        this.$newUserInfo = accountInfo;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new AccountRepository$updateAccountInfo$2(this.this$0, this.$newUserInfo, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            RemoteAccountDataSource d = this.this$0.f32375b;
            AccountResponse e = C13242a.m57375e(this.$newUserInfo);
            this.label = 1;
            obj = d.mo31143f(e, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(this.$newUserInfo);
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            LocalAccountDataSource c = this.this$0.f32374a;
            UserInfo g = C13188k.m57167g(this.$newUserInfo);
            this.label = 2;
            if (c.mo31123c(g, this) == h) {
                return h;
            }
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(this.$newUserInfo);
            return Result.m38701a(obj2);
        }
        Result.C10852a aVar3 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Unable to save the user info")));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<AccountInfo>> cVar) {
        return ((AccountRepository$updateAccountInfo$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
