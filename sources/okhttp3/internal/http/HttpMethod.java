package okhttp3.internal.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo22516d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @C11384m
    public static final boolean permitsRequestBody(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        if (Intrinsics.areEqual((Object) str, (Object) "GET") || Intrinsics.areEqual((Object) str, (Object) "HEAD")) {
            return false;
        }
        return true;
    }

    @C11384m
    public static final boolean requiresRequestBody(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        if (Intrinsics.areEqual((Object) str, (Object) "POST") || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PROPPATCH") || Intrinsics.areEqual((Object) str, (Object) "REPORT")) {
            return true;
        }
        return false;
    }

    public final boolean invalidatesCache(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        if (Intrinsics.areEqual((Object) str, (Object) "POST") || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "DELETE") || Intrinsics.areEqual((Object) str, (Object) "MOVE")) {
            return true;
        }
        return false;
    }

    public final boolean redirectsToGet(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        return !Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }

    public final boolean redirectsWithBody(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        return Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }
}
