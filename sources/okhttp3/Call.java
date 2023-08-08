package okhttp3;

import java.io.IOException;
import kotlin.C11076d0;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012"}, mo22516d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "Lkotlin/d2;", "enqueue", "cancel", "", "isExecuted", "isCanceled", "Lokio/r0;", "timeout", "clone", "Factory", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public interface Call extends Cloneable {

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo22516d2 = {"Lokhttp3/Call$Factory;", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public interface Factory {
        @C12579k
        Call newCall(@C12579k Request request);
    }

    void cancel();

    @C12579k
    Call clone();

    void enqueue(@C12579k Callback callback);

    @C12579k
    C12451Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @C12579k
    Request request();

    @C12579k
    C12516r0 timeout();
}
