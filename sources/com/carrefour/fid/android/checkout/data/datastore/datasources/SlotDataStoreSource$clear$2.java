package com.carrefour.fid.android.checkout.data.datastore.datasources;

import com.carrefour.fid.android.SlotItem;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource$clear$2", mo22502f = "SlotDataStoreSource.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/SlotItem;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SlotDataStoreSource$clear$2 extends SuspendLambda implements C11304p<SlotItem, C11045c<? super SlotItem>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public SlotDataStoreSource$clear$2(C11045c<? super SlotDataStoreSource$clear$2> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SlotDataStoreSource$clear$2 slotDataStoreSource$clear$2 = new SlotDataStoreSource$clear$2(cVar);
        slotDataStoreSource$clear$2.L$0 = obj;
        return slotDataStoreSource$clear$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k SlotItem slotItem, @C12580l C11045c<? super SlotItem> cVar) {
        return ((SlotDataStoreSource$clear$2) create(slotItem, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            GeneratedMessageLite B = ((SlotItem.C13129b) ((SlotItem.C13129b) ((SlotItem) this.L$0).toBuilder()).clear()).mo100473g();
            Intrinsics.checkNotNullExpressionValue(B, "it.toBuilder().clear().build()");
            return B;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
