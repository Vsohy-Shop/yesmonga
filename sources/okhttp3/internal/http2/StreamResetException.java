package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "(Lokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class StreamResetException extends IOException {
    @C12579k
    @C11287e
    public final ErrorCode errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(@C12579k ErrorCode errorCode2) {
        super("stream was reset: " + errorCode2);
        Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
        this.errorCode = errorCode2;
    }
}
