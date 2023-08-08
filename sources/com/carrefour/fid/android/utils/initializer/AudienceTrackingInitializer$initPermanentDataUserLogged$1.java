package com.carrefour.fid.android.utils.initializer;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initPermanentDataUserLogged$1", mo22502f = "AudienceTrackingInitializer.kt", mo22503i = {}, mo22504l = {89}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AudienceTrackingInitializer$initPermanentDataUserLogged$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AudienceTrackingInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudienceTrackingInitializer$initPermanentDataUserLogged$1(AudienceTrackingInitializer audienceTrackingInitializer, C11045c<? super AudienceTrackingInitializer$initPermanentDataUserLogged$1> cVar) {
        super(2, cVar);
        this.this$0 = audienceTrackingInitializer;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AudienceTrackingInitializer$initPermanentDataUserLogged$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        String str;
        String str2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            AccountRepository f = this.this$0.mo67104f();
            this.label = 1;
            obj = f.mo31329n(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        HashMap b = this.this$0.f58176a;
        String str3 = null;
        if (accountInfo != null) {
            str = accountInfo.mo116663r();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        b.put(C13758b.f33473t0, str);
        HashMap b2 = this.this$0.f58176a;
        if (accountInfo != null) {
            str2 = accountInfo.mo116664s();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str4;
        }
        b2.put(C13758b.f33471s0, str2);
        HashMap b3 = this.this$0.f58176a;
        if (accountInfo != null) {
            str3 = accountInfo.mo116667u();
        }
        if (str3 != null) {
            str4 = str3;
        }
        b3.put(C13758b.f33475u0, str4);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AudienceTrackingInitializer$initPermanentDataUserLogged$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
