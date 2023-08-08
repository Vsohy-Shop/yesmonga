package com.carrefour.fid.android.loyalty.core.type;

import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import okhttp3.internal.Util;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, mo22516d2 = {"getLoyaltyCardType", "Lcom/carrefour/fid/android/loyalty/core/type/CardType;", "cardNumber", "", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CardTypeKt {
    @C12580l
    public static final CardType getLoyaltyCardType(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        boolean z2 = true;
        if (str.length() == 19 && C11622t.startsWith$default(str, "91357", false, 2, (Object) null)) {
            long longOrDefault = Util.toLongOrDefault(str, -1);
            if (9135720000643225010L > longOrDefault || longOrDefault >= 9135720000648225001L) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return CardType.CZAM;
            }
        }
        if (str.length() == 19 && C11622t.startsWith$default(str, "91357", false, 2, (Object) null)) {
            long longOrDefault2 = Util.toLongOrDefault(str, -1);
            if (9135720000643225010L > longOrDefault2 || longOrDefault2 >= 9135720000648225001L) {
                z2 = false;
            }
            if (!z2) {
                return CardType.FID;
            }
        }
        if (C11622t.startsWith$default(str, "103", false, 2, (Object) null) || str.length() == 16) {
            return CardType.PASS;
        }
        return null;
    }
}
