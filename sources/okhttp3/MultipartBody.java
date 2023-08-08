package okhttp3;

import com.urbanairship.automation.C8970v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.C12505n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0003(')B'\b\u0000\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, mo22516d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/n;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "index", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "Lkotlin/d2;", "writeTo", "Lokhttp3/MediaType;", "J", "Lokio/ByteString;", "boundaryByteString", "Lokio/ByteString;", "Ljava/util/List;", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class MultipartBody extends RequestBody {
    @C12579k
    @C11287e
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE = {(byte) 58, (byte) 32};
    private static final byte[] CRLF = {(byte) 13, (byte) 10};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final byte[] DASHDASH;
    @C12579k
    @C11287e
    public static final MediaType DIGEST;
    @C12579k
    @C11287e
    public static final MediaType FORM;
    @C12579k
    @C11287e
    public static final MediaType MIXED;
    @C12579k
    @C11287e
    public static final MediaType PARALLEL;
    private final ByteString boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    @C12579k
    private final List<Part> parts;
    @C12579k
    private final MediaType type;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo22516d2 = {"Lokhttp3/MultipartBody$Builder;", "", "boundary", "", "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", "", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", "value", "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        @C11315i
        public Builder() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        @C12579k
        public final Builder addFormDataPart(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        @C12579k
        public final Builder addPart(@C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        @C12579k
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @C12579k
        public final Builder setType(@C12579k MediaType mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "type");
            if (Intrinsics.areEqual((Object) mediaType.type(), (Object) "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }

        @C11315i
        public Builder(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C8970v.f24101l);
            this.boundary = ByteString.f30388d.mo27167l(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        @C12579k
        public final Builder addFormDataPart(@C12579k String str, @C12580l String str2, @C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        @C12579k
        public final Builder addPart(@C12580l Headers headers, @C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        @C12579k
        public final Builder addPart(@C12579k Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, mo22516d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/d2;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(@C12579k StringBuilder sb, @C12579k String str) {
            Intrinsics.checkNotNullParameter(sb, "$this$appendQuotedString");
            Intrinsics.checkNotNullParameter(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, mo22516d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Part {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        @C12579k
        private final RequestBody body;
        @C12580l
        private final Headers headers;

        @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, mo22516d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @C12579k
            @C11384m
            public final Part create(@C12579k RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(requestBody, "body");
                return create((Headers) null, requestBody);
            }

            @C12579k
            @C11384m
            public final Part createFormData(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(str2, "value");
                return createFormData(str, (String) null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            @C11384m
            public final Part create(@C12580l Headers headers, @C12579k RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(requestBody, "body");
                boolean z = true;
                if ((headers != null ? headers.get("Content-Type") : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new Part(headers, requestBody, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            @C12579k
            @C11384m
            public final Part createFormData(@C12579k String str, @C12580l String str2, @C12579k RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), requestBody);
            }
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        @C12579k
        @C11384m
        public static final Part create(@C12580l Headers headers2, @C12579k RequestBody requestBody) {
            return Companion.create(headers2, requestBody);
        }

        @C12579k
        @C11384m
        public static final Part createFormData(@C12579k String str, @C12579k String str2) {
            return Companion.createFormData(str, str2);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "body", imports = {}))
        @C11314h(name = "-deprecated_body")
        @C12579k
        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m172671deprecated_body() {
            return this.body;
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "headers", imports = {}))
        @C12580l
        @C11314h(name = "-deprecated_headers")
        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m172672deprecated_headers() {
            return this.headers;
        }

        @C11314h(name = "body")
        @C12579k
        public final RequestBody body() {
            return this.body;
        }

        @C12580l
        @C11314h(name = "headers")
        public final Headers headers() {
            return this.headers;
        }

        public /* synthetic */ Part(Headers headers2, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers2, requestBody);
        }

        @C12579k
        @C11384m
        public static final Part create(@C12579k RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @C12579k
        @C11384m
        public static final Part createFormData(@C12579k String str, @C12580l String str2, @C12579k RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        byte b = (byte) 45;
        DASHDASH = new byte[]{b, b};
    }

    public MultipartBody(@C12579k ByteString byteString, @C12579k MediaType mediaType, @C12579k List<Part> list) {
        Intrinsics.checkNotNullParameter(byteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(mediaType, "type");
        Intrinsics.checkNotNullParameter(list, "parts");
        this.boundaryByteString = byteString;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long writeOrCountBytes(okio.C12505n r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            okio.m r13 = new okio.m
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers()
            okhttp3.RequestBody r6 = r6.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            byte[] r8 = DASHDASH
            r13.mo27226Q1(r8)
            okio.ByteString r8 = r12.boundaryByteString
            r13.mo27222G3(r8)
            byte[] r8 = CRLF
            r13.mo27226Q1(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = r2
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.name(r9)
            okio.n r10 = r13.mo27236l1(r10)
            byte[] r11 = COLONSPACE
            okio.n r10 = r10.mo27226Q1(r11)
            java.lang.String r11 = r7.value(r9)
            okio.n r10 = r10.mo27236l1(r11)
            byte[] r11 = CRLF
            r10.mo27226Q1(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            okio.n r8 = r13.mo27236l1(r8)
            java.lang.String r7 = r7.toString()
            okio.n r7 = r8.mo27236l1(r7)
            byte[] r8 = CRLF
            r7.mo27226Q1(r8)
        L_0x0078:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            okio.n r9 = r13.mo27236l1(r9)
            okio.n r9 = r9.mo27233g2(r7)
            byte[] r10 = CRLF
            r9.mo27226Q1(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.mo27367f()
            return r9
        L_0x009b:
            byte[] r9 = CRLF
            r13.mo27226Q1(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.writeTo(r13)
        L_0x00a7:
            r13.mo27226Q1(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            byte[] r1 = DASHDASH
            r13.mo27226Q1(r1)
            okio.ByteString r2 = r12.boundaryByteString
            r13.mo27222G3(r2)
            r13.mo27226Q1(r1)
            byte[] r1 = CRLF
            r13.mo27226Q1(r1)
            if (r14 == 0) goto L_0x00d0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r13 = r0.mo27362c0()
            long r3 = r3 + r13
            r0.mo27367f()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(okio.n, boolean):long");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "boundary", imports = {}))
    @C11314h(name = "-deprecated_boundary")
    @C12579k
    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m172667deprecated_boundary() {
        return boundary();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "parts", imports = {}))
    @C11314h(name = "-deprecated_parts")
    @C12579k
    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m172668deprecated_parts() {
        return this.parts;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "size", imports = {}))
    @C11314h(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m172669deprecated_size() {
        return size();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "type", imports = {}))
    @C11314h(name = "-deprecated_type")
    @C12579k
    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m172670deprecated_type() {
        return this.type;
    }

    @C11314h(name = "boundary")
    @C12579k
    public final String boundary() {
        return this.boundaryByteString.mo27148s2();
    }

    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes((C12505n) null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @C12579k
    public MediaType contentType() {
        return this.contentType;
    }

    @C12579k
    public final Part part(int i) {
        return this.parts.get(i);
    }

    @C11314h(name = "parts")
    @C12579k
    public final List<Part> parts() {
        return this.parts;
    }

    @C11314h(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @C11314h(name = "type")
    @C12579k
    public final MediaType type() {
        return this.type;
    }

    public void writeTo(@C12579k C12505n nVar) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "sink");
        writeOrCountBytes(nVar, false);
    }
}
