package okhttp3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo22516d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo22517k = 3, mo22518mv = {1, 4, 0})
public final class OkHttpClient$Builder$addNetworkInterceptor$2 implements Interceptor {
    final /* synthetic */ C11300l $block;

    public OkHttpClient$Builder$addNetworkInterceptor$2(C11300l lVar) {
        this.$block = lVar;
    }

    @C12579k
    public final C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return (C12451Response) this.$block.invoke(chain);
    }
}
