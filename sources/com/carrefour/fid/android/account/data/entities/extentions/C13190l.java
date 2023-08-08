package com.carrefour.fid.android.account.data.entities.extentions;

import android.util.Base64;
import com.carrefour.fid.android.account.data.entities.UIDResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.l */
public final class C13190l {
    @C12579k
    /* renamed from: a */
    public static final String m57169a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = m57171c(str).getString("last_modification");
        if (string == null) {
            return "";
        }
        return string;
    }

    @C12579k
    /* renamed from: b */
    public static final UIDResponse m57170b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        JSONObject c = m57171c(str);
        UIDResponse uIDResponse = new UIDResponse((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (c.has("sub")) {
            String string = c.getString("sub");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(\"sub\")");
            uIDResponse.setUidIam(string);
        }
        if (c.has("uid_local")) {
            String string2 = c.getString("uid_local");
            Intrinsics.checkNotNullExpressionValue(string2, "data.getString(\"uid_local\")");
            uIDResponse.setUidLocal(string2);
        }
        return uIDResponse;
    }

    /* renamed from: c */
    public static final JSONObject m57171c(String str) {
        byte[] decode = Base64.decode((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).get(1), 2);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\n            this… Base64.NO_WRAP\n        )");
        return new JSONObject(new String(decode, C11602d.f28868b));
    }
}
