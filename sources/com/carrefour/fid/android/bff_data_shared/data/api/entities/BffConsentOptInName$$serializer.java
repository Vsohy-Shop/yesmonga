package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.EnumDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffConsentOptInName$$serializer implements C12327y<BffConsentOptInName> {
    @C12579k
    public static final BffConsentOptInName$$serializer INSTANCE = new BffConsentOptInName$$serializer();
    private static final /* synthetic */ EnumDescriptor descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName", 12);
        enumDescriptor.mo24966k("OPTIN_CARREFOUR_EMAIL", false);
        enumDescriptor.mo24966k("OPTIN_CARREFOUR_SMS", false);
        enumDescriptor.mo24966k("CGU_CLIENT", false);
        enumDescriptor.mo24966k("DATA_NO_CARD", false);
        enumDescriptor.mo24966k("DATA_CARD", false);
        enumDescriptor.mo24966k("OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING", false);
        enumDescriptor.mo24966k("OPTIN_PARTNER_PERSONALIZED_ADVERTISING", false);
        enumDescriptor.mo24966k("OPTIN_FID_EMAIL", false);
        enumDescriptor.mo24966k("OPTIN_FID_SMS", false);
        enumDescriptor.mo24966k("OPTIN_FID_POST", false);
        enumDescriptor.mo24966k("OPTIN_FID_CARREFOUR_GROUP", false);
        enumDescriptor.mo24966k("OPTIN_FID_TIERS", false);
        descriptor = enumDescriptor;
    }

    private BffConsentOptInName$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        return new C12248g[]{C12310s1.f30117a};
    }

    @C12579k
    public BffConsentOptInName deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return BffConsentOptInName.values()[eVar.mo24877e(getDescriptor())];
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffConsentOptInName bffConsentOptInName) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffConsentOptInName, "value");
        gVar.mo24914k(getDescriptor(), bffConsentOptInName.ordinal());
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
