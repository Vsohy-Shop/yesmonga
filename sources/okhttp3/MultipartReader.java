package okhttp3;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.urbanairship.automation.C8970v;
import com.urbanairship.wallet.C9700d;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import okio.ByteString;
import okio.C12465c0;
import okio.C12471f0;
import okio.C12500m;
import okio.C12507o;
import okio.C12510p0;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006&"}, mo22516d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lkotlin/d2;", "close", "Lokio/ByteString;", "dashDashBoundary", "Lokio/ByteString;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Lokio/o;", "source", "Lokio/o;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lokio/o;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @C12579k
    public static final C12471f0 afterBoundaryOptions;
    @C12579k
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    /* access modifiers changed from: private */
    public PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    /* access modifiers changed from: private */
    public final C12507o source;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lokio/f0;", "afterBoundaryOptions", "Lokio/f0;", "getAfterBoundaryOptions", "()Lokio/f0;", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @C12579k
        public final C12471f0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, mo22516d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lkotlin/d2;", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lokio/o;", "body", "Lokio/o;", "()Lokio/o;", "<init>", "(Lokhttp3/Headers;Lokio/o;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Part implements Closeable {
        @C12579k
        private final C12507o body;
        @C12579k
        private final Headers headers;

        public Part(@C12579k Headers headers2, @C12579k C12507o oVar) {
            Intrinsics.checkNotNullParameter(headers2, C9700d.f26570q);
            Intrinsics.checkNotNullParameter(oVar, "body");
            this.headers = headers2;
            this.body = oVar;
        }

        @C11314h(name = "body")
        @C12579k
        public final C12507o body() {
            return this.body;
        }

        public void close() {
            this.body.close();
        }

        @C11314h(name = "headers")
        @C12579k
        public final Headers headers() {
            return this.headers;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo22516d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/p0;", "Lkotlin/d2;", "close", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/r0;", "timeout", "Lokio/r0;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class PartSource implements C12510p0 {
        private final C12516r0 timeout = new C12516r0();

        public PartSource() {
        }

        public void close() {
            if (Intrinsics.areEqual((Object) MultipartReader.this.currentPart, (Object) this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        public long read(@C12579k C12500m mVar, long j) {
            boolean z;
            long j2;
            long j3;
            C12500m mVar2 = mVar;
            long j4 = j;
            Intrinsics.checkNotNullParameter(mVar2, "sink");
            if (j4 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            } else if (Intrinsics.areEqual((Object) MultipartReader.this.currentPart, (Object) this)) {
                C12516r0 timeout2 = MultipartReader.this.source.timeout();
                C12516r0 r0Var = this.timeout;
                long timeoutNanos = timeout2.timeoutNanos();
                long a = C12516r0.Companion.mo27441a(r0Var.timeoutNanos(), timeout2.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout2.timeout(a, timeUnit);
                if (timeout2.hasDeadline()) {
                    long deadlineNanoTime = timeout2.deadlineNanoTime();
                    if (r0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), r0Var.deadlineNanoTime()));
                    }
                    try {
                        long access$currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining == 0) {
                            j3 = -1;
                        } else {
                            j3 = MultipartReader.this.source.read(mVar2, access$currentPartBytesRemaining);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (r0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        return j3;
                    } catch (Throwable th) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (r0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (r0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(r0Var.deadlineNanoTime());
                    }
                    try {
                        long access$currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining2 == 0) {
                            j2 = -1;
                        } else {
                            j2 = MultipartReader.this.source.read(mVar2, access$currentPartBytesRemaining2);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (r0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        return j2;
                    } catch (Throwable th2) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (r0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @C12579k
        public C12516r0 timeout() {
            return this.timeout;
        }
    }

    static {
        C12471f0.C12472a aVar = C12471f0.f30406d;
        ByteString.C12459a aVar2 = ByteString.f30388d;
        afterBoundaryOptions = aVar.mo27201d(aVar2.mo27167l("\r\n"), aVar2.mo27167l("--"), aVar2.mo27167l(" "), aVar2.mo27167l("\t"));
    }

    public MultipartReader(@C12579k C12507o oVar, @C12579k String str) throws IOException {
        Intrinsics.checkNotNullParameter(oVar, "source");
        Intrinsics.checkNotNullParameter(str, C8970v.f24101l);
        this.source = oVar;
        this.boundary = str;
        this.dashDashBoundary = new C12500m().mo27236l1("--").mo27236l1(str).mo27301n3();
        this.crlfDashDashBoundary = new C12500m().mo27236l1("\r\n--").mo27236l1(str).mo27301n3();
    }

    /* access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo27293f2((long) this.crlfDashDashBoundary.size());
        long J0 = this.source.mo27292e().mo27273J0(this.crlfDashDashBoundary);
        if (J0 == -1) {
            return Math.min(j, (this.source.mo27292e().mo27362c0() - ((long) this.crlfDashDashBoundary.size())) + 1);
        }
        return Math.min(j, J0);
    }

    @C11314h(name = "boundary")
    @C12579k
    public final String boundary() {
        return this.boundary;
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.currentPart = null;
            this.source.close();
        }
    }

    @C12580l
    public final Part nextPart() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.noMoreParts) {
            return null;
        } else {
            if (this.partCount != 0 || !this.source.mo27302o1(0, this.dashDashBoundary)) {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.f473O0);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip((long) this.crlfDashDashBoundary.size());
            } else {
                this.source.skip((long) this.dashDashBoundary.size());
            }
            boolean z = false;
            while (true) {
                int Y3 = this.source.mo27289Y3(afterBoundaryOptions);
                if (Y3 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (Y3 == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource();
                    this.currentPart = partSource;
                    return new Part(readHeaders, C12465c0.m50481d(partSource));
                } else if (Y3 != 1) {
                    if (Y3 == 2 || Y3 == 3) {
                        z = true;
                    }
                } else if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                } else {
                    throw new ProtocolException("expected at least 1 part");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipartReader(@org.jetbrains.annotations.C12579k okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.o r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L_0x001b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L_0x001b
            r2.<init>(r0, r3)
            return
        L_0x001b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
