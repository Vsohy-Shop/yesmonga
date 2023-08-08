package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.account.core.type.PhoneCategory;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse;
import com.carrefour.fid.android.domain.models.account.Phone;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.i */
public final class C13186i {
    /* renamed from: a */
    public static final boolean m57154a(@C12579k PhonesUserResponse phonesUserResponse) {
        boolean z;
        Intrinsics.checkNotNullParameter(phonesUserResponse, "<this>");
        if (!phonesUserResponse.getPreference()) {
            return false;
        }
        if (phonesUserResponse.getNum().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        String category = phonesUserResponse.getCategory();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = category.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!Intrinsics.areEqual((Object) upperCase, (Object) PhoneCategory.MOBILE.mo31120q()) || phonesUserResponse.getKey() != 0) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: b */
    public static final PhonesUserResponse m57155b(@C12579k Phone phone) {
        Intrinsics.checkNotNullParameter(phone, "<this>");
        return new PhonesUserResponse(phone.mo116741e(), (String) null, (String) null, phone.mo116743f(), 0, 22, (DefaultConstructorMarker) null);
    }
}
