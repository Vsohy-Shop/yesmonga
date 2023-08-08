package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.Phone;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource", mo22502f = "LocalAccountDataSource.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1, 1}, mo22504l = {46, 46, 52}, mo22505m = "saveAddressesUserAccount", mo22506n = {"this", "addressDelivery", "addressBilling", "listPhones", "this", "addressDelivery", "addressBilling", "listPhones"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LocalAccountDataSource$saveAddressesUserAccount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalAccountDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalAccountDataSource$saveAddressesUserAccount$1(LocalAccountDataSource localAccountDataSource, C11045c<? super LocalAccountDataSource$saveAddressesUserAccount$1> cVar) {
        super(cVar);
        this.this$0 = localAccountDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo31127f((Address) null, (Address) null, (List<Phone>) null, this);
    }
}
