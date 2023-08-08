package com.carrefour.fid.android.checkout.data.datastore.datasources;

import com.carrefour.fid.android.SlotItem;
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

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource$addOrReplace$2", mo22502f = "SlotDataStoreSource.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/SlotItem;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SlotDataStoreSource$addOrReplace$2 extends SuspendLambda implements C11304p<SlotItem, C11045c<? super SlotItem>, Object> {
    final /* synthetic */ SlotItem $item;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotDataStoreSource$addOrReplace$2(SlotItem slotItem, C11045c<? super SlotDataStoreSource$addOrReplace$2> cVar) {
        super(2, cVar);
        this.$item = slotItem;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SlotDataStoreSource$addOrReplace$2(this.$item, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k SlotItem slotItem, @C12580l C11045c<? super SlotItem> cVar) {
        return ((SlotDataStoreSource$addOrReplace$2) create(slotItem, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.$item;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
