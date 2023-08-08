package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.C12505n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0010"}, mo22516d2 = {"Lokhttp3/RequestBody;", "", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/n;", "sink", "Lkotlin/d2;", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public abstract class RequestBody {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, mo22516d2 = {"Lokhttp3/RequestBody$Companion;", "", "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "file", "Ljava/io/File;", "content", "", "offset", "", "byteCount", "", "Lokio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr, int i) {
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @C11314h(name = "create")
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @C11314h(name = "create")
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @C11314h(name = "create")
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType, int i) {
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        @C11314h(name = "create")
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k String str, @C12580l MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "$this$toRequestBody");
            Charset charset = C11602d.f28868b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @C11314h(name = "create")
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k ByteString byteString, @C12580l MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "$this$toRequestBody");
            return new RequestBody$Companion$toRequestBody$1(byteString, mediaType);
        }

        @C11314h(name = "create")
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "$this$toRequestBody");
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody$Companion$toRequestBody$2(bArr, mediaType, i2, i);
        }

        @C11314h(name = "create")
        @C12579k
        @C11384m
        public final RequestBody create(@C12579k File file, @C12580l MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "$this$asRequestBody");
            return new RequestBody$Companion$asRequestBody$1(file, mediaType);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "content");
            return create(str, mediaType);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "content");
            return create(byteString, mediaType);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @C11315i
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "content");
            return create(bArr, mediaType, i, i2);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @C11587t0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @C12579k
        @C11384m
        public final RequestBody create(@C12580l MediaType mediaType, @C12579k File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return create(file, mediaType);
        }
    }

    @C11314h(name = "create")
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k File file, @C12580l MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @C12580l
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@C12579k C12505n nVar) throws IOException;

    @C11314h(name = "create")
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k String str, @C12580l MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @C11587t0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k File file) {
        return Companion.create(mediaType, file);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k String str) {
        return Companion.create(mediaType, str);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr) {
        return Companion.create$default(Companion, mediaType, bArr, 0, 0, 12, (Object) null);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr, int i) {
        return Companion.create$default(Companion, mediaType, bArr, i, 0, 8, (Object) null);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @C11587t0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12580l MediaType mediaType, @C12579k byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    @C11314h(name = "create")
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k ByteString byteString, @C12580l MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    @C11314h(name = "create")
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k byte[] bArr) {
        return Companion.create$default(Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    @C11314h(name = "create")
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType) {
        return Companion.create$default(Companion, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    @C11314h(name = "create")
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType, int i) {
        return Companion.create$default(Companion, bArr, mediaType, i, 0, 4, (Object) null);
    }

    @C11314h(name = "create")
    @C11315i
    @C12579k
    @C11384m
    public static final RequestBody create(@C12579k byte[] bArr, @C12580l MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }
}
