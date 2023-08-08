package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.C12500m;
import okio.C12505n;
import okio.C12507o;
import okio.C12510p0;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, mo22516d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "Lokio/p0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/r0;", "timeout", "Lkotlin/d2;", "close", "", "cacheRequestClosed", "Z", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements C12510p0 {
    final /* synthetic */ C12505n $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ C12507o $source;
    private boolean cacheRequestClosed;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(C12507o oVar, CacheRequest cacheRequest, C12505n nVar) {
        this.$source = oVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = nVar;
    }

    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public long read(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        try {
            long read = this.$source.read(mVar, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            mVar.mo27383s(this.$cacheBody.mo27232e(), mVar.mo27362c0() - read, read);
            this.$cacheBody.mo27229Y0();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    @C12579k
    public C12516r0 timeout() {
        return this.$source.timeout();
    }
}
