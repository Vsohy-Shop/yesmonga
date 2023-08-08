package com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketListResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13091w;

/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.BasketResponseKt */
public final class BasketResponseKt {
    @C12579k

    /* renamed from: a */
    public static final C11677z f33838a = C10864b0.m38748c(BasketResponseKt$pattern$2.f33839f);

    /* renamed from: a */
    public static final int m58857a(@C12579k C13091w<BasketListResponse> wVar) {
        String string;
        Integer b;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        ResponseBody e = wVar.mo30574e();
        if (e == null || (string = e.string()) == null || (b = m58858b(string)) == null) {
            return wVar.mo30573b();
        }
        return b.intValue();
    }

    /* renamed from: b */
    public static final Integer m58858b(String str) {
        String group;
        Matcher matcher = m58859c().matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(group, "group(1)");
        return Integer.valueOf(Integer.parseInt(group));
    }

    /* renamed from: c */
    public static final Pattern m58859c() {
        return (Pattern) f33838a.getValue();
    }
}
