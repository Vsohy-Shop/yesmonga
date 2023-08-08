package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.network.C28811g;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.auth.b */
public final class C36146b implements C36145a {

    /* renamed from: a */
    public static final int f89221a = 0;

    @C12579k
    /* renamed from: a */
    public String mo107991a(@C12579k Request request, @C12579k C28811g gVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(gVar, "token");
        String path = request.url().url().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "request.url.toUrl().path");
        if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) C28534f.f69147c0, false, 2, (Object) null)) {
            return gVar.mo83886e();
        }
        return gVar.mo83888f();
    }
}
