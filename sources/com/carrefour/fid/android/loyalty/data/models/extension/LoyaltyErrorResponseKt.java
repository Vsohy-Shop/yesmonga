package com.carrefour.fid.android.loyalty.data.models.extension;

import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyErrorResponse;
import com.google.gson.C33614e;
import com.google.gson.JsonSyntaxException;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, mo22516d2 = {"isActiveFidError", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyErrorResponse;", "transform", "Lokhttp3/ResponseBody;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyErrorResponseKt {
    public static final boolean isActiveFidError(@C12579k LoyaltyErrorResponse loyaltyErrorResponse) {
        Intrinsics.checkNotNullParameter(loyaltyErrorResponse, "<this>");
        String error_code = loyaltyErrorResponse.getError_code();
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        String upperCase = error_code.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return Intrinsics.areEqual((Object) upperCase, (Object) "B0003");
    }

    @C12579k
    public static final LoyaltyErrorResponse transform(@C12579k ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        try {
            Object n = new C33614e().mo97479n(responseBody.string(), LoyaltyErrorResponse.class);
            Intrinsics.checkNotNullExpressionValue(n, "{\n        Gson().fromJso…sponse::class.java)\n    }");
            return (LoyaltyErrorResponse) n;
        } catch (JsonSyntaxException unused) {
            return new LoyaltyErrorResponse(new String());
        }
    }
}
