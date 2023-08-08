package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.MemoItemList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$3", mo22502f = "MemoDataStoreSource.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/MemoItemList;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MemoDataStoreSource$clearType$3 extends SuspendLambda implements C11304p<MemoItemList, C11045c<? super MemoItemList>, Object> {
    final /* synthetic */ MemoItemList $data;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoDataStoreSource$clearType$3(MemoItemList memoItemList, C11045c<? super MemoDataStoreSource$clearType$3> cVar) {
        super(2, cVar);
        this.$data = memoItemList;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new MemoDataStoreSource$clearType$3(this.$data, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k MemoItemList memoItemList, @C12580l C11045c<? super MemoItemList> cVar) {
        return ((MemoDataStoreSource$clearType$3) create(memoItemList, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.$data;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
