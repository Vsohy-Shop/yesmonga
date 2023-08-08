package com.carrefour.fid.android.shared.data.headers;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.datastore.pref.C28631e;
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

@C11067d(mo22501c = "com.carrefour.fid.android.shared.data.headers.BaseHeaders$build$1", mo22502f = "BaseHeaders.kt", mo22503i = {0}, mo22504l = {51}, mo22505m = "invokeSuspend", mo22506n = {"$this$invokeSuspend_u24lambda_u240"}, mo22507s = {"L$2"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BaseHeaders$build$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super HashMap<String, String>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BaseHeaders this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseHeaders$build$1(BaseHeaders baseHeaders, C11045c<? super BaseHeaders$build$1> cVar) {
        super(2, cVar);
        this.this$0 = baseHeaders;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseHeaders$build$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        HashMap<String, String> hashMap;
        BaseHeaders baseHeaders;
        HashMap<String, String> hashMap2;
        String str;
        HashMap<String, String> hashMap3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            HashMap<String, String> D = this.this$0.mo83539D();
            baseHeaders = this.this$0;
            BaseAppPreferencesStorage b = baseHeaders.f70228a;
            this.L$0 = D;
            this.L$1 = baseHeaders;
            this.L$2 = D;
            this.L$3 = C28534f.f69128M;
            this.L$4 = D;
            this.label = 1;
            Object c = b.mo83495c(this);
            if (c == h) {
                return h;
            }
            hashMap3 = D;
            hashMap2 = hashMap3;
            obj = c;
            str = C28534f.f69128M;
            hashMap = hashMap2;
        } else if (i == 1) {
            hashMap3 = (HashMap) this.L$4;
            str = (String) this.L$3;
            hashMap2 = (HashMap) this.L$2;
            baseHeaders = (BaseHeaders) this.L$1;
            hashMap = (HashMap) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hashMap3.put(str, ((C28631e) obj).mo83520d());
        hashMap2.put("User-Agent", baseHeaders.f70230c.mo84151b());
        return hashMap;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super HashMap<String, String>> cVar) {
        return ((BaseHeaders$build$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
