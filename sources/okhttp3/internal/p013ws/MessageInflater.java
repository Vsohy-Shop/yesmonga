package okhttp3.internal.p013ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okio.C12461a0;
import okio.C12500m;
import okio.C12510p0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Lokio/m;", "buffer", "Lkotlin/d2;", "inflate", "close", "deflatedBytes", "Lokio/m;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lokio/a0;", "inflaterSource", "Lokio/a0;", "", "noContextTakeover", "Z", "<init>", "(Z)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.MessageInflater */
public final class MessageInflater implements Closeable {
    private final C12500m deflatedBytes;
    private final Inflater inflater;
    private final C12461a0 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C12500m mVar = new C12500m();
        this.deflatedBytes = mVar;
        Inflater inflater2 = new Inflater(true);
        this.inflater = inflater2;
        this.inflaterSource = new C12461a0((C12510p0) mVar, inflater2);
    }

    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(@C12579k C12500m mVar) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "buffer");
        if (this.deflatedBytes.mo27362c0() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.mo27245x1(mVar);
            this.deflatedBytes.mo27246z0(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.mo27362c0();
            do {
                this.inflaterSource.mo27175a(mVar, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
