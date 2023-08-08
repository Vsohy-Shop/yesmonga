package okhttp3.internal.connection;

import kotlin.C11076d0;
import okio.C12490k;

@C11076d0(mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo22516d2 = {"okhttp3/internal/connection/RealCall$timeout$1", "Lokio/k;", "Lkotlin/d2;", "timedOut", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class RealCall$timeout$1 extends C12490k {
    final /* synthetic */ RealCall this$0;

    public RealCall$timeout$1(RealCall realCall) {
        this.this$0 = realCall;
    }

    public void timedOut() {
        this.this$0.cancel();
    }
}
