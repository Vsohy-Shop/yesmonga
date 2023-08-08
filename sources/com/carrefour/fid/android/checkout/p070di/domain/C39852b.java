package com.carrefour.fid.android.checkout.p070di.domain;

import com.carrefour.fid.android.checkout.domain.interactors.CheckoutClearSlotUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotExpressUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotStoreUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutUpdateSlotLocalStorageUseCase;
import com.carrefour.fid.android.domain.interactors.slot.C37854a;
import com.carrefour.fid.android.domain.interactors.slot.C37855b;
import com.carrefour.fid.android.domain.interactors.slot.C37856c;
import com.carrefour.fid.android.domain.interactors.slot.C37858e;
import com.carrefour.fid.android.domain.interactors.slot.C37859f;
import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import com.carrefour.fid.android.domain.interactors.slot.C37865j;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.checkout.di.domain.b */
public interface C39852b {
    @C10147a
    @C12579k
    /* renamed from: a */
    C37859f mo131407a(@C12579k CheckoutGetSlotYieldListUseCase checkoutGetSlotYieldListUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37856c mo131408b(@C12579k CheckoutGetSlotListUseCase checkoutGetSlotListUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37865j mo131409c(@C12579k CheckoutUpdateSlotLocalStorageUseCase checkoutUpdateSlotLocalStorageUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37855b mo131410d(@C12579k CheckoutGetSlotExpressUseCase checkoutGetSlotExpressUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37858e mo131411e(@C12579k CheckoutGetSlotStoreUseCase checkoutGetSlotStoreUseCase);

    @C10147a
    @C12579k
    /* renamed from: f */
    C37861g mo131412f(@C12579k CheckoutGetSlotsUseCase checkoutGetSlotsUseCase);

    @C10147a
    @C12579k
    /* renamed from: g */
    C37854a mo131413g(@C12579k CheckoutClearSlotUseCase checkoutClearSlotUseCase);
}
