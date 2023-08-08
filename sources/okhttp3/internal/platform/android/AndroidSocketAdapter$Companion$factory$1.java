package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo22516d2 = {"okhttp3/internal/platform/android/AndroidSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "create", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "matchesSocket", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    final /* synthetic */ String $packageName;

    public AndroidSocketAdapter$Companion$factory$1(String str) {
        this.$packageName = str;
    }

    @C12579k
    public SocketAdapter create(@C12579k SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
    }

    public boolean matchesSocket(@C12579k SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return C11622t.startsWith$default(name, this.$packageName + '.', false, 2, (Object) null);
    }
}
