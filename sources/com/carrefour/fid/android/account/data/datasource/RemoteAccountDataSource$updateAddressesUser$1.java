package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource", mo22502f = "RemoteAccountDataSource.kt", mo22503i = {0, 0, 0}, mo22504l = {43, 44}, mo22505m = "updateAddressesUser", mo22506n = {"this", "listAddress", "listPhones"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RemoteAccountDataSource$updateAddressesUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteAccountDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteAccountDataSource$updateAddressesUser$1(RemoteAccountDataSource remoteAccountDataSource, C11045c<? super RemoteAccountDataSource$updateAddressesUser$1> cVar) {
        super(cVar);
        this.this$0 = remoteAccountDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo31141d((List<AddressUserResponse>) null, (List<PhonesUserResponse>) null, this);
    }
}
