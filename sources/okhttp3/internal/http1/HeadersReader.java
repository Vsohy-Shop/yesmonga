package okhttp3.internal.http1;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.C12507o;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "", "readLine", "Lokhttp3/Headers;", "readHeaders", "", "headerLimit", "J", "Lokio/o;", "source", "Lokio/o;", "getSource", "()Lokio/o;", "<init>", "(Lokio/o;)V", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class HeadersReader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = ((long) 262144);
    @C12579k
    private final C12507o source;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "()V", "HEADER_LIMIT", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HeadersReader(@C12579k C12507o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "source");
        this.source = oVar;
    }

    @C12579k
    public final C12507o getSource() {
        return this.source;
    }

    @C12579k
    public final Headers readHeaders() {
        boolean z;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    @C12579k
    public final String readLine() {
        String b1 = this.source.mo27290b1(this.headerLimit);
        this.headerLimit -= (long) b1.length();
        return b1;
    }
}
