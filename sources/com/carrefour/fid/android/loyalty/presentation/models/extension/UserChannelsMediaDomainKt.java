package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain;
import com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo22516d2 = {"toUserChannelsMediaModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/UserChannelsMediaDomain;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UserChannelsMediaDomainKt {
    @C12579k
    public static final UserChannelsMediaModel toUserChannelsMediaModel(@C12579k UserChannelsMediaDomain userChannelsMediaDomain) {
        Intrinsics.checkNotNullParameter(userChannelsMediaDomain, "<this>");
        return new UserChannelsMediaModel(userChannelsMediaDomain.getMediaKey(), userChannelsMediaDomain.getMediaValue(), userChannelsMediaDomain.getMediaType());
    }
}
