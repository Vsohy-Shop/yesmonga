package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.o0 */
public final class C12508o0 extends C12490k {

    /* renamed from: a */
    public final Socket f30480a;

    public C12508o0(@C12579k Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f30480a = socket;
    }

    @C12579k
    public IOException newTimeoutException(@C12580l IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void timedOut() {
        try {
            this.f30480a.close();
        } catch (Exception e) {
            Logger a = C12467d0.f30404a;
            Level level = Level.WARNING;
            a.log(level, "Failed to close timed out socket " + this.f30480a, e);
        } catch (AssertionError e2) {
            if (C12465c0.m50488k(e2)) {
                Logger a2 = C12467d0.f30404a;
                Level level2 = Level.WARNING;
                a2.log(level2, "Failed to close timed out socket " + this.f30480a, e2);
                return;
            }
            throw e2;
        }
    }
}
