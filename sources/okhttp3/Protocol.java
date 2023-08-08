package okhttp3;

import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo22516d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo22516d2 = {"Lokhttp3/Protocol$Companion;", "", "()V", "get", "Lokhttp3/Protocol;", "protocol", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @C12579k
        @C11384m
        public final Protocol get(@C12579k String str) throws IOException {
            Intrinsics.checkNotNullParameter(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!Intrinsics.areEqual((Object) str, (Object) protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    @C12579k
    @C11384m
    public static final Protocol get(@C12579k String str) throws IOException {
        return Companion.get(str);
    }

    @C12579k
    public String toString() {
        return this.protocol;
    }
}
