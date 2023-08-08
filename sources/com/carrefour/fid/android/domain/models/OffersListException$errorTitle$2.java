package com.carrefour.fid.android.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OffersListExceptionTitle;", "a", "()Lcom/carrefour/fid/android/domain/models/OffersListExceptionTitle;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OffersListException$errorTitle$2 extends Lambda implements C11289a<OffersListExceptionTitle> {
    final /* synthetic */ OffersListException this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffersListException$errorTitle$2(OffersListException offersListException) {
        super(0);
        this.this$0 = offersListException;
    }

    @C12579k
    /* renamed from: a */
    public final OffersListExceptionTitle invoke() {
        String a = this.this$0.mo116086a();
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.UnavailableService.mo116091q())) {
            return OffersListExceptionTitle.RemoteConfigError;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.Disconnected.mo116091q())) {
            return OffersListExceptionTitle.DisconnectedError;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.DisconnectedLastOrder.mo116091q())) {
            return OffersListExceptionTitle.DisconnectedLastOrder;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.EmptyList.mo116091q())) {
            return OffersListExceptionTitle.EmptyList;
        }
        if (Intrinsics.areEqual((Object) a, (Object) OffersListExceptionCode.EmptyOrdersList.mo116091q())) {
            return OffersListExceptionTitle.EmptyOrdersList;
        }
        return OffersListExceptionTitle.DefaultError;
    }
}
