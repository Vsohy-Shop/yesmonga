package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel", mo22502f = "ServiceSlotViewModel.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 14, 15}, mo22504l = {123, 127, 137, 140, 146, 162, 167, 172, 176, 184, 193, 199, 209, 229, 240, 242}, mo22505m = "getSlotDetails", mo22506n = {"this", "facilityStoreId", "homeArgs", "slotId", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "storeFacility", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "standardService", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "promise", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "isFromHomePage", "isSlotBooked", "this", "slotId", "basket", "serviceSlot", "slotMap", "isSlotBooked", "this", "this"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$4", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$4", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$4", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$4", "L$5", "Z$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSlotViewModel$getSlotDetails$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSlotViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotViewModel$getSlotDetails$1(ServiceSlotViewModel serviceSlotViewModel, C11045c<? super ServiceSlotViewModel$getSlotDetails$1> cVar) {
        super(cVar);
        this.this$0 = serviceSlotViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo131740F0((String) null, (SlotArgsHome) null, false, (String) null, false, this);
    }
}
