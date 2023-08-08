package okhttp3;

import kotlin.C11076d0;
import okio.C12507o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo22516d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/o;", "source", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C12507o $this_asResponseBody;

    public ResponseBody$Companion$asResponseBody$1(C12507o oVar, MediaType mediaType, long j) {
        this.$this_asResponseBody = oVar;
        this.$contentType = mediaType;
        this.$contentLength = j;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    @C12580l
    public MediaType contentType() {
        return this.$contentType;
    }

    @C12579k
    public C12507o source() {
        return this.$this_asResponseBody;
    }
}
