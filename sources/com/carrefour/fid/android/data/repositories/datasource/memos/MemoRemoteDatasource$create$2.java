package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.ShoppingListContentResponse;
import com.carrefour.fid.android.data.service.C36636o;
import com.carrefour.fid.android.domain.models.CreateMemoBodyDomain;
import java.util.HashMap;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource$create$2", mo22502f = "MemoRemoteDatasource.kt", mo22503i = {}, mo22504l = {124, 129}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/ShoppingListContentResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MemoRemoteDatasource$create$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ShoppingListContentResponse>>, Object> {
    int label;
    final /* synthetic */ MemoRemoteDatasource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoRemoteDatasource$create$2(MemoRemoteDatasource memoRemoteDatasource, C11045c<? super MemoRemoteDatasource$create$2> cVar) {
        super(1, cVar);
        this.this$0 = memoRemoteDatasource;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new MemoRemoteDatasource$create$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36636o b = this.this$0.f90469a;
            HashMap<String, String> a = this.this$0.f90470b.mo111450a(true);
            CreateMemoBodyDomain createMemoBodyDomain = new CreateMemoBodyDomain();
            this.label = 1;
            obj = b.mo111667e(a, createMemoBodyDomain, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MemoRemoteDatasource memoRemoteDatasource = this.this$0;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            this.label = 2;
            obj2 = memoRemoteDatasource.mo111599j(this);
            if (obj2 == h) {
                return h;
            }
        } else {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error creating shopping list")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<ShoppingListContentResponse>> cVar) {
        return ((MemoRemoteDatasource$create$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
