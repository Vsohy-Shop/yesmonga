package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import com.carrefour.fid.android.account.p017io.CredentialsResponseThrowable;
import com.carrefour.fid.android.account.p017io.LoginNotFoundThrowable;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$2", mo22502f = "AccountRepository.kt", mo22503i = {}, mo22504l = {105}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AccountRepository$updatePassword$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $newPassword;
    final /* synthetic */ String $oldPassword;
    final /* synthetic */ String $userUid;
    int label;
    final /* synthetic */ AccountRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepository$updatePassword$2(AccountRepository accountRepository, String str, String str2, String str3, C11045c<? super AccountRepository$updatePassword$2> cVar) {
        super(1, cVar);
        this.this$0 = accountRepository;
        this.$userUid = str;
        this.$oldPassword = str2;
        this.$newPassword = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new AccountRepository$updatePassword$2(this.this$0, this.$userUid, this.$oldPassword, this.$newPassword, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            RemoteAccountDataSource d = this.this$0.f32375b;
            String str = this.$userUid;
            String str2 = this.$oldPassword;
            String str3 = this.$newPassword;
            this.label = 1;
            obj = d.mo31144g(str, str2, str3, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str4 = this.$userUid;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(C11064a.m42615a(true));
        } else {
            int b = wVar.mo30573b();
            if (400 > b || b >= 500) {
                z = false;
            }
            if (z) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new CredentialsResponseThrowable("Problem when updating password for user '" + str4 + "'")));
            } else {
                Result.C10852a aVar3 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new LoginNotFoundThrowable("Problem when updating password, maybe the account does not exist for user '" + str4 + "'")));
            }
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Boolean>> cVar) {
        return ((AccountRepository$updatePassword$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
