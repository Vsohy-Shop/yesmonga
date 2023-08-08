package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C11076d0;
import okio.C12506n0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, mo22516d2 = {"Lokhttp3/internal/cache/CacheRequest;", "", "Lokio/n0;", "body", "Lkotlin/d2;", "abort", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public interface CacheRequest {
    void abort();

    @C12579k
    C12506n0 body() throws IOException;
}
