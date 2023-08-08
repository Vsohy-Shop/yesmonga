package com.carrefour.fid.android.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OffersListExceptionMessage;", "a", "()Lcom/carrefour/fid/android/domain/models/OffersListExceptionMessage;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OffersListException$errorMessage$2 extends Lambda implements C11289a<OffersListExceptionMessage> {
    final /* synthetic */ OffersListException this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffersListException$errorMessage$2(OffersListException offersListException) {
        super(0);
        this.this$0 = offersListException;
    }

    @C12580l
    /* renamed from: a */
    public final OffersListExceptionMessage invoke() {
        String a = this.this$0.mo116086a();
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.UnavailableService.mo116091q())) {
            return OffersListExceptionMessage.RemoteConfigError;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.Disconnected.mo116091q())) {
            return OffersListExceptionMessage.DisconnectedError;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.DisconnectedLastOrder.mo116091q())) {
            return OffersListExceptionMessage.DisconnectedLastOrder;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.EmptyList.mo116091q())) {
            return OffersListExceptionMessage.EmptyList;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.EmptyOrdersList.mo116091q())) {
            return OffersListExceptionMessage.EmptyOrdersList;
        }
        return null;
    }
}
