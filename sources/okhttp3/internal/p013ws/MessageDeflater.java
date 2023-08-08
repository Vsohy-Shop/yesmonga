package okhttp3.internal.p013ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.C11076d0;
import okio.ByteString;
import okio.C12500m;
import okio.C12506n0;
import okio.C12515r;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo22516d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lokio/m;", "Lokio/ByteString;", "suffix", "", "endsWith", "buffer", "Lkotlin/d2;", "deflate", "close", "deflatedBytes", "Lokio/m;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/r;", "deflaterSink", "Lokio/r;", "noContextTakeover", "Z", "<init>", "(Z)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.MessageDeflater */
public final class MessageDeflater implements Closeable {
    private final C12500m deflatedBytes;
    private final Deflater deflater;
    private final C12515r deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C12500m mVar = new C12500m();
        this.deflatedBytes = mVar;
        Deflater deflater2 = new Deflater(-1, true);
        this.deflater = deflater2;
        this.deflaterSink = new C12515r((C12506n0) mVar, deflater2);
    }

    private final boolean endsWith(C12500m mVar, ByteString byteString) {
        return mVar.mo27302o1(mVar.mo27362c0() - ((long) byteString.size()), byteString);
    }

    public void close() throws IOException {
        this.deflaterSink.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deflate(@org.jetbrains.annotations.C12579k okio.C12500m r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.m r0 = r6.deflatedBytes
            long r0 = r0.mo27362c0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r6.deflater
            r0.reset()
        L_0x0021:
            okio.r r0 = r6.deflaterSink
            long r3 = r7.mo27362c0()
            r0.write(r7, r3)
            okio.r r0 = r6.deflaterSink
            r0.flush()
            okio.m r0 = r6.deflatedBytes
            okio.ByteString r3 = okhttp3.internal.p013ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            boolean r0 = r6.endsWith(r0, r3)
            if (r0 == 0) goto L_0x0059
            okio.m r0 = r6.deflatedBytes
            long r2 = r0.mo27362c0()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            okio.m r0 = r6.deflatedBytes
            r4 = 0
            okio.m$a r0 = okio.C12500m.m50841N(r0, r4, r1, r4)
            r0.mo27394d(r2)     // Catch:{ all -> 0x0052 }
            kotlin.p010io.C11133b.m42950a(r0, r4)
            goto L_0x005e
        L_0x0052:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r7)
            throw r1
        L_0x0059:
            okio.m r0 = r6.deflatedBytes
            r0.mo27225K2(r2)
        L_0x005e:
            okio.m r0 = r6.deflatedBytes
            long r1 = r0.mo27362c0()
            r7.write(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p013ws.MessageDeflater.deflate(okio.m):void");
    }
}
