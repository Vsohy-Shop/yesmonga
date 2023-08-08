package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014"}, mo22516d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "", "isSupported", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "matchesSocketFactory", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lkotlin/d2;", "configureTlsExtensions", "getSelectedProtocol", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public interface SocketAdapter {

    @C11076d0(mo22514bv = {1, 0, 3}, mo22517k = 3, mo22518mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(@C12579k SocketAdapter socketAdapter, @C12579k SSLSocketFactory sSLSocketFactory) {
            Intrinsics.checkNotNullParameter(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        @C12580l
        public static X509TrustManager trustManager(@C12579k SocketAdapter socketAdapter, @C12579k SSLSocketFactory sSLSocketFactory) {
            Intrinsics.checkNotNullParameter(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    void configureTlsExtensions(@C12579k SSLSocket sSLSocket, @C12580l String str, @C12579k List<? extends Protocol> list);

    @C12580l
    String getSelectedProtocol(@C12579k SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(@C12579k SSLSocket sSLSocket);

    boolean matchesSocketFactory(@C12579k SSLSocketFactory sSLSocketFactory);

    @C12580l
    X509TrustManager trustManager(@C12579k SSLSocketFactory sSLSocketFactory);
}
