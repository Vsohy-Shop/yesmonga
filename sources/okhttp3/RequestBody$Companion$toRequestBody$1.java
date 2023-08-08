package okhttp3;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.C12505n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo22516d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/n;", "sink", "Lkotlin/d2;", "writeTo", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ ByteString $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$1(ByteString byteString, MediaType mediaType) {
        this.$this_toRequestBody = byteString;
        this.$contentType = mediaType;
    }

    public long contentLength() {
        return (long) this.$this_toRequestBody.size();
    }

    @C12580l
    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(@C12579k C12505n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "sink");
        nVar.mo27222G3(this.$this_toRequestBody);
    }
}
