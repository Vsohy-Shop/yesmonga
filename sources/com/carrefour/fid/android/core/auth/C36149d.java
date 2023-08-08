package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.network.C28811g;
import com.carrefour.fid.android.shared.util.C28954v;
import com.carrefour.fid.android.shared.util.C28956w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Authenticator;
import okhttp3.C12451Response;
import okhttp3.Request;
import okhttp3.Route;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.auth.d */
public final class C36149d implements Authenticator {

    /* renamed from: d */
    public static final int f89223d = 8;
    @C12579k

    /* renamed from: a */
    public final TokenRefresher f89224a;
    @C12579k

    /* renamed from: b */
    public final C36145a f89225b;

    /* renamed from: c */
    public final int f89226c;

    public C36149d(@C12579k TokenRefresher tokenRefresher, @C12579k C36145a aVar, int i) {
        Intrinsics.checkNotNullParameter(tokenRefresher, "refresher");
        Intrinsics.checkNotNullParameter(aVar, "bearerSelector");
        this.f89224a = tokenRefresher;
        this.f89225b = aVar;
        this.f89226c = i;
    }

    /* renamed from: a */
    public final String mo107993a(C12451Response response) {
        String header;
        boolean z;
        if (response == null || (header = response.request().header(C28534f.f69113B)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("earer", "this as java.lang.String).substring(startIndex)");
        String substringAfter = StringsKt__StringsKt.substringAfter(header, "earer" + " ", "");
        if (substringAfter == null) {
            return null;
        }
        if (substringAfter.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return substringAfter;
        }
        return null;
    }

    @C12580l
    public Request authenticate(@C12580l Route route, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String a = mo107993a(response);
        int c = mo107995c(response) + 1;
        String str = null;
        if (c > this.f89226c) {
            return null;
        }
        synchronized (this.f89224a) {
            C28811g a2 = this.f89224a.mo107984a();
            if (a2 != null) {
                str = this.f89225b.mo107991a(response.request(), a2);
            }
            if (str == null || Intrinsics.areEqual((Object) a, (Object) str)) {
                Request b = mo107994b(response.request(), c, this.f89225b);
                return b;
            }
            Request d = mo107996d(response.request(), c, a2.mo83886e(), str);
            return d;
        }
    }

    /* renamed from: b */
    public final Request mo107994b(Request request, int i, C36145a aVar) {
        C28811g e = this.f89224a.mo107988e();
        if (e == null) {
            return null;
        }
        return mo107996d(request, i, e.mo83886e(), aVar.mo107991a(request, e));
    }

    /* renamed from: c */
    public final int mo107995c(C12451Response response) {
        Request request;
        String header;
        if (response == null || (request = response.request()) == null || (header = request.header(C28534f.f69130O)) == null) {
            return 0;
        }
        return Integer.parseInt(header);
    }

    /* renamed from: d */
    public final Request mo107996d(Request request, int i, String str, String str2) {
        boolean z;
        String a = C28956w.f70984a.mo84288a();
        String a2 = C28954v.f70982a.mo84287a(a);
        Request.Builder newBuilder = request.newBuilder();
        boolean z2 = true;
        if (request.headers().get(C28534f.f69113B) != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                newBuilder.header(C28534f.f69113B, "Bearer " + str2);
            }
        }
        if (request.headers().get(C28534f.f69111A) != null) {
            if (str.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                newBuilder.header(C28534f.f69111A, str);
            }
        }
        return newBuilder.header(C28534f.f69130O, String.valueOf(i)).header("X-Correlation-Id", a2).header("X-Request-Id", a).build();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36149d(TokenRefresher tokenRefresher, C36145a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenRefresher, aVar, (i2 & 4) != 0 ? 2 : i);
    }
}
