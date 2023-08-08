package com.carrefour.fid.android.ecommerce.utils;

import android.util.Base64;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.google.android.gms.common.C40928r;
import com.google.firebase.installations.local.C33093b;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecommerce.utils.c */
public final class C38213c {
    @C12579k

    /* renamed from: a */
    public static final C38213c f96819a = new C38213c();

    /* renamed from: b */
    public static final int f96820b = 0;

    @C12579k
    /* renamed from: a */
    public final String mo119639a(@C12579k AccountInfo accountInfo, @C12579k String str, @C12579k String str2) {
        String str3;
        Phone phone;
        Intrinsics.checkNotNullParameter(accountInfo, C40928r.f104100a);
        Intrinsics.checkNotNullParameter(str, "uidIam");
        Intrinsics.checkNotNullParameter(str2, "orderId");
        String u = accountInfo.mo116667u();
        String s = accountInfo.mo116664s();
        String r = accountInfo.mo116663r();
        List<Phone> x = accountInfo.mo116671x();
        if (x == null || (phone = (Phone) CollectionsKt___CollectionsKt.m40479B2(x)) == null) {
            str3 = null;
        } else {
            str3 = phone.mo116741e();
        }
        String str4 = u + C33093b.f80279g + s + C33093b.f80279g + r + C33093b.f80279g + str3 + C33093b.f80279g + str + C33093b.f80279g + str2;
        byte[] bytes = str4.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Base64.encodeToString(bytes, 0);
        return str4;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119640b() {
        return "<html><body><p style=\"text-align: center;\">Paiement en cours</p></body></html>";
    }
}
