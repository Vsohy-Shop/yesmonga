package com.carrefour.fid.android.service.presentation.model;

import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, mo22516d2 = {"toModel", "Lcom/carrefour/fid/android/domain/models/account/Address;", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AddressModelKt {
    @C12579k
    public static final Address toModel(@C12579k Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return new Address(address.mo116685J(), address.mo116679D(), address.mo116678C(), address.mo116684I(), address.mo116677B(), address.mo116694S(), address.mo116686K(), address.mo116689N(), address.mo116692Q(), address.mo116682G(), address.mo116687L(), address.mo116688M(), address.mo116680E(), address.mo116683H(), 0, address.mo116695T(), address.mo116693R(), address.mo116691P(), address.mo116681F(), address.mo116696U(), 16384, (DefaultConstructorMarker) null);
    }
}
