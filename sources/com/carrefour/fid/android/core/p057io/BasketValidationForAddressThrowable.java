package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/BasketValidationForAddressThrowable;", "", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "f", "()Lcom/carrefour/fid/android/domain/models/service/models/l;", "", "hasBillingAddress", "Z", "b", "()Z", "hasDeliveryAddress", "c", "hasFailedPhoneNumber", "d", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "Lcom/carrefour/fid/android/domain/models/account/Address;", "a", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "Lcom/carrefour/fid/android/domain/models/account/Phone;", "phoneNumber", "Lcom/carrefour/fid/android/domain/models/account/Phone;", "e", "()Lcom/carrefour/fid/android/domain/models/account/Phone;", "<init>", "(Lcom/carrefour/fid/android/domain/models/service/models/l;ZZZLcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/domain/models/account/Phone;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.BasketValidationForAddressThrowable */
public final class BasketValidationForAddressThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89668a = 8;
    @C12580l
    private final Address address;
    private final boolean hasBillingAddress;
    private final boolean hasDeliveryAddress;
    private final boolean hasFailedPhoneNumber;
    @C12580l
    private final Phone phoneNumber;
    @C12580l
    private final C38163l store;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketValidationForAddressThrowable(C38163l lVar, boolean z, boolean z2, boolean z3, Address address2, Phone phone, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, z, z2, z3, (i & 16) != 0 ? null : address2, (i & 32) != 0 ? null : phone);
    }

    @C12580l
    /* renamed from: a */
    public final Address mo108319a() {
        return this.address;
    }

    /* renamed from: b */
    public final boolean mo108320b() {
        return this.hasBillingAddress;
    }

    /* renamed from: c */
    public final boolean mo108321c() {
        return this.hasDeliveryAddress;
    }

    /* renamed from: d */
    public final boolean mo108322d() {
        return this.hasFailedPhoneNumber;
    }

    @C12580l
    /* renamed from: e */
    public final Phone mo108323e() {
        return this.phoneNumber;
    }

    @C12580l
    /* renamed from: f */
    public final C38163l mo108324f() {
        return this.store;
    }

    public BasketValidationForAddressThrowable(@C12580l C38163l lVar, boolean z, boolean z2, boolean z3, @C12580l Address address2, @C12580l Phone phone) {
        super("Address is invalid");
        this.store = lVar;
        this.hasBillingAddress = z;
        this.hasDeliveryAddress = z2;
        this.hasFailedPhoneNumber = z3;
        this.address = address2;
        this.phoneNumber = phone;
    }
}
