package com.carrefour.fid.android.airship.data.repositories;

import com.carrefour.fid.android.shared.p046io.GaidUnavailableThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.ads.identifier.C40365a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$2", mo22502f = "GoogleAdsImpl.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class GoogleAdsImpl$getGaid$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Result<? extends String>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoogleAdsImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleAdsImpl$getGaid$2(GoogleAdsImpl googleAdsImpl, C11045c<? super GoogleAdsImpl$getGaid$2> cVar) {
        super(2, cVar);
        this.this$0 = googleAdsImpl;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        GoogleAdsImpl$getGaid$2 googleAdsImpl$getGaid$2 = new GoogleAdsImpl$getGaid$2(this.this$0, cVar);
        googleAdsImpl$getGaid$2.L$0 = obj;
        return googleAdsImpl$getGaid$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String str;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            GoogleAdsImpl googleAdsImpl = this.this$0;
            try {
                Result.C10852a aVar = Result.f28060a;
                C40365a.C40366a a = googleAdsImpl.f33386a.mo32664a();
                if (!a.mo133251b()) {
                    C28935i iVar = C28935i.f70940a;
                    String a2 = a.mo133250a();
                    boolean b = a.mo133251b();
                    C28935i.m119704b(iVar, "GAID : advertisingIdInfo id -> " + a2 + ", isLimitAdTrackingEnabled -> " + b, (Throwable) null, 0, 6, (Object) null);
                    str = a.mo133250a();
                    if (str == null) {
                        str = new String();
                    }
                } else {
                    C28935i.m119704b(C28935i.f70940a, "GAID : advertisingIdInfo id isLimitAdTrackingEnabled -> true", (Throwable) null, 0, 6, (Object) null);
                    str = new String();
                }
                obj2 = Result.m38702b(str);
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(th));
            }
            Throwable e = Result.m38705e(obj2);
            if (e != null) {
                C28935i iVar2 = C28935i.f70940a;
                e.printStackTrace();
                C11079d2 d2Var = C11079d2.f28267a;
                C28935i.m119705e(iVar2, "GAID : failure : " + d2Var, (Throwable) null, 0, 6, (Object) null);
                new GaidUnavailableThrowable();
            }
            return Result.m38701a(obj2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Result<String>> cVar) {
        return ((GoogleAdsImpl$getGaid$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
