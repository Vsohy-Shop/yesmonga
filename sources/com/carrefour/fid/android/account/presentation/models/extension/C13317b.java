package com.carrefour.fid.android.account.presentation.models.extension;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.models.extension.b */
public final class C13317b {
    @C12579k
    /* renamed from: a */
    public static final DQEAddressDomain m57654a(@C12579k DQEAddressModel dQEAddressModel) {
        Intrinsics.checkNotNullParameter(dQEAddressModel, "<this>");
        return new DQEAddressDomain(dQEAddressModel.mo31628j(), new String(), dQEAddressModel.mo31634p(), dQEAddressModel.mo31629k(), dQEAddressModel.mo31631m(), dQEAddressModel.mo31632n(), dQEAddressModel.mo31633o(), dQEAddressModel.mo31630l());
    }
}
