package okhttp3.internal.p013ws;

import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.C12500m;
import okio.C12505n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u0010-\u001a\u00020\u0015\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, mo22516d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", "payload", "Lkotlin/d2;", "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "Lokio/m;", "messageBuffer", "Lokio/m;", "sinkBuffer", "", "writerClosed", "Z", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lokio/m$a;", "maskCursor", "Lokio/m$a;", "isClient", "Lokio/n;", "sink", "Lokio/n;", "getSink", "()Lokio/n;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "<init>", "(ZLokio/n;Ljava/util/Random;ZZJ)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.WebSocketWriter */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C12500m.C12501a maskCursor;
    private final byte[] maskKey;
    private final C12500m messageBuffer = new C12500m();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    @C12579k
    private final Random random;
    @C12579k
    private final C12505n sink;
    private final C12500m sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, @C12579k C12505n nVar, @C12579k Random random2, boolean z2, boolean z3, long j) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(nVar, "sink");
        Intrinsics.checkNotNullParameter(random2, BaseOptionModel.f27465E0);
        this.isClient = z;
        this.sink = nVar;
        this.random = random2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = nVar.mo27232e();
        C12500m.C12501a aVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new C12500m.C12501a() : aVar;
    }

    private final void writeControlFrame(int i, ByteString byteString) throws IOException {
        boolean z;
        if (!this.writerClosed) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.mo27225K2(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.mo27225K2(size | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    random2.nextBytes(bArr);
                    this.sinkBuffer.mo27226Q1(this.maskKey);
                    if (size > 0) {
                        long c0 = this.sinkBuffer.mo27362c0();
                        this.sinkBuffer.mo27222G3(byteString);
                        C12500m mVar = this.sinkBuffer;
                        C12500m.C12501a aVar = this.maskCursor;
                        Intrinsics.checkNotNull(aVar);
                        mVar.mo27343L(aVar);
                        this.maskCursor.mo27395f(c0);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.mo27225K2(size);
                    this.sinkBuffer.mo27222G3(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public void close() {
        MessageDeflater messageDeflater2 = this.messageDeflater;
        if (messageDeflater2 != null) {
            messageDeflater2.close();
        }
    }

    @C12579k
    public final Random getRandom() {
        return this.random;
    }

    @C12579k
    public final C12505n getSink() {
        return this.sink;
    }

    public final void writeClose(int i, @C12580l ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.f30387c;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C12500m mVar = new C12500m();
            mVar.mo27247z2(i);
            if (byteString != null) {
                mVar.mo27222G3(byteString);
            }
            byteString2 = mVar.mo27301n3();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, @C12579k ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "data");
        if (!this.writerClosed) {
            this.messageBuffer.mo27222G3(byteString);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && ((long) byteString.size()) >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater2 = this.messageDeflater;
                if (messageDeflater2 == null) {
                    messageDeflater2 = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater2;
                }
                messageDeflater2.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long c0 = this.messageBuffer.mo27362c0();
            this.sinkBuffer.mo27225K2(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (c0 <= 125) {
                this.sinkBuffer.mo27225K2(((int) c0) | i2);
            } else if (c0 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.mo27225K2(i2 | 126);
                this.sinkBuffer.mo27247z2((int) c0);
            } else {
                this.sinkBuffer.mo27225K2(i2 | 127);
                this.sinkBuffer.mo27227T3(c0);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                random2.nextBytes(bArr);
                this.sinkBuffer.mo27226Q1(this.maskKey);
                if (c0 > 0) {
                    C12500m mVar = this.messageBuffer;
                    C12500m.C12501a aVar = this.maskCursor;
                    Intrinsics.checkNotNull(aVar);
                    mVar.mo27343L(aVar);
                    this.maskCursor.mo27395f(0);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, c0);
            this.sink.mo27241u0();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(@C12579k ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "payload");
        writeControlFrame(9, byteString);
    }

    public final void writePong(@C12579k ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "payload");
        writeControlFrame(10, byteString);
    }
}
