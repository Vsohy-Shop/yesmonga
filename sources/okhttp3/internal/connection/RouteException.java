package okhttp3.internal.connection;

import com.google.zxing.client.android.C34651e;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.C11414o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, mo22516d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lkotlin/d2;", "addConnectException", "<set-?>", "lastConnectException", "Ljava/io/IOException;", "getLastConnectException", "()Ljava/io/IOException;", "firstConnectException", "getFirstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class RouteException extends RuntimeException {
    @C12579k
    private final IOException firstConnectException;
    @C12579k
    private IOException lastConnectException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(@C12579k IOException iOException) {
        super(iOException);
        Intrinsics.checkNotNullParameter(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(@C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, C34651e.f83829d);
        C11414o.m43942a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    @C12579k
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @C12579k
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
