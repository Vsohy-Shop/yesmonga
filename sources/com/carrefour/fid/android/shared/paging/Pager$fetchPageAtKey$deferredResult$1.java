package com.carrefour.fid.android.shared.paging;

import com.carrefour.fid.android.shared.paging.C28844a;
import com.carrefour.fid.android.shared.paging.Pager;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.paging.Pager$fetchPageAtKey$deferredResult$1", mo22502f = "Pager.kt", mo22503i = {}, mo22504l = {167}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo22516d2 = {"", "Key", "Value", "Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/shared/paging/Pager$a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Pager$fetchPageAtKey$deferredResult$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Pager.C28838a<Key, Value>>, Object> {
    final /* synthetic */ Key $key;
    int label;
    final /* synthetic */ Pager<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$fetchPageAtKey$deferredResult$1(Pager<Key, Value> pager, Key key, C11045c<? super Pager$fetchPageAtKey$deferredResult$1> cVar) {
        super(2, cVar);
        this.this$0 = pager;
        this.$key = key;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new Pager$fetchPageAtKey$deferredResult$1(this.this$0, this.$key, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C28844a f = this.this$0.f70637b;
            C28844a.C28845a.C28846a aVar = new C28844a.C28845a.C28846a(this.$key, this.this$0.f70643h);
            this.label = 1;
            obj = f.mo80180a(aVar, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C28844a.C28847b bVar = (C28844a.C28847b) obj;
        if (bVar instanceof C28844a.C28847b.C28848a) {
            return new Pager.C28838a.C28839a(((C28844a.C28847b.C28848a) bVar).mo83943d());
        }
        if (bVar instanceof C28844a.C28847b.C28849b) {
            C28844a.C28847b.C28849b bVar2 = (C28844a.C28847b.C28849b) bVar;
            return new Pager.C28838a.C28841c(bVar2.mo83954h(), bVar2.mo83956i(), bVar2.mo83959l(), bVar2.mo83958k());
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Pager.C28838a<Key, Value>> cVar) {
        return ((Pager$fetchPageAtKey$deferredResult$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
