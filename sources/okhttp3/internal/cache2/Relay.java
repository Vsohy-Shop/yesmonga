package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.C12500m;
import okio.C12510p0;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u00101\u001a\u0004\u0018\u00010\f\u0012\u0006\u00107\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u0011\u0010@\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b@\u0010\u001e¨\u0006E"}, mo22516d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lokio/ByteString;", "prefix", "", "upstreamSize", "metadataSize", "Lkotlin/d2;", "writeHeader", "writeMetadata", "commit", "metadata", "Lokio/p0;", "newSource", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lokio/m;", "upstreamBuffer", "Lokio/m;", "getUpstreamBuffer", "()Lokio/m;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lokio/p0;", "getUpstream", "()Lokio/p0;", "setUpstream", "(Lokio/p0;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lokio/ByteString;", "bufferMaxSize", "getBufferMaxSize", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lokio/p0;JLokio/ByteString;J)V", "Companion", "RelaySource", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Relay {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FILE_HEADER_SIZE = 32;
    @C12579k
    @C11287e
    public static final ByteString PREFIX_CLEAN;
    @C12579k
    @C11287e
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    @C12579k
    private final C12500m buffer;
    private final long bufferMaxSize;
    private boolean complete;
    @C12580l
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    @C12580l
    private C12510p0 upstream;
    @C12579k
    private final C12500m upstreamBuffer;
    private long upstreamPos;
    @C12580l
    private Thread upstreamReader;

    @C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, mo22516d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lokio/p0;", "upstream", "Lokio/ByteString;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @C12579k
        public final Relay edit(@C12579k File file, @C12579k C12510p0 p0Var, @C12579k ByteString byteString, long j) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(p0Var, "upstream");
            Intrinsics.checkNotNullParameter(byteString, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, p0Var, 0, byteString, j, (DefaultConstructorMarker) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        @C12579k
        public final Relay read(@C12579k File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C12500m mVar = new C12500m();
            fileOperator.read(0, mVar, 32);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (!(!Intrinsics.areEqual((Object) mVar.mo27312t2((long) byteString.size()), (Object) byteString))) {
                long readLong = mVar.readLong();
                long readLong2 = mVar.readLong();
                C12500m mVar2 = new C12500m();
                fileOperator.read(readLong + 32, mVar2, readLong2);
                return new Relay(randomAccessFile, (C12510p0) null, readLong, mVar2.mo27301n3(), 0, (DefaultConstructorMarker) null);
            }
            throw new IOException("unreadable cache file");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo22516d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/p0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/r0;", "timeout", "Lkotlin/d2;", "close", "Lokio/r0;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class RelaySource implements C12510p0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C12516r0 timeout = new C12516r0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (Relay.this.getSourceCount() == 0) {
                        RandomAccessFile file = Relay.this.getFile();
                        Relay.this.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            if (r4 != true) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
            r8 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
            r2.read(r1.sourcePos + 32, r20, r8);
            r1.sourcePos += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = r1.this$0.getUpstream();
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
            if (r14 != -1) goto L_0x00f3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
            r0 = r1.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
            if (r0 == null) goto L_0x00e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
            r0.notifyAll();
            r0 = kotlin.C11079d2.f28267a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r9 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().mo27383s(r20, 0, r9);
            r1.sourcePos += r9;
            r13 = r1.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + 32, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r1.this$0.getBuffer().write(r1.this$0.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
            if (r1.this$0.getBuffer().mo27362c0() <= r1.this$0.getBufferMaxSize()) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
            r1.this$0.getBuffer().skip(r1.this$0.getBuffer().mo27362c0() - r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
            r0 = r1.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r4);
            r0 = kotlin.C11079d2.f28267a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
            if (r0 == null) goto L_0x0186;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
            monitor-enter(r1.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r3 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
            if (r3 == null) goto L_0x01a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a9, code lost:
            r3.notifyAll();
            r3 = kotlin.C11079d2.f28267a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01af, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(@org.jetbrains.annotations.C12579k okio.C12500m r20, long r21) throws java.io.IOException {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = r4
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x01b6
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r8)
            L_0x0018:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r6 = 2
                r9 = -1
                if (r0 == 0) goto L_0x0065
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r11 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                okio.m r0 = r0.getBuffer()     // Catch:{ all -> 0x01b3 }
                long r13 = r0.mo27362c0()     // Catch:{ all -> 0x01b3 }
                long r11 = r11 - r13
                long r13 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x0040
                r4 = r6
                goto L_0x0088
            L_0x0040:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r6 = r6 - r9
                long r9 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                okio.m r2 = r0.getBuffer()     // Catch:{ all -> 0x01b3 }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r6 = r3 - r11
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo27383s(r3, r4, r6)     // Catch:{ all -> 0x01b3 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x01b3 }
                monitor-exit(r8)
                return r9
            L_0x0065:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                boolean r0 = r0.getComplete()     // Catch:{ all -> 0x01b3 }
                if (r0 == 0) goto L_0x006f
                monitor-exit(r8)
                return r9
            L_0x006f:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r0 = r0.getUpstreamReader()     // Catch:{ all -> 0x01b3 }
                if (r0 == 0) goto L_0x007f
                okio.r0 r0 = r1.timeout     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                r0.waitUntilNotified(r6)     // Catch:{ all -> 0x01b3 }
                goto L_0x0018
            L_0x007f:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01b3 }
                r0.setUpstreamReader(r7)     // Catch:{ all -> 0x01b3 }
            L_0x0088:
                monitor-exit(r8)
                r11 = 32
                if (r4 != r6) goto L_0x00ae
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this
                long r6 = r0.getUpstreamPos()
                long r8 = r1.sourcePos
                long r6 = r6 - r8
                long r8 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                long r3 = r1.sourcePos
                long r3 = r3 + r11
                r5 = r20
                r6 = r8
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r8
                r1.sourcePos = r2
                return r8
            L_0x00ae:
                r8 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                okio.p0 r0 = r0.getUpstream()     // Catch:{ all -> 0x0194 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                okio.m r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x0194 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x0194 }
                int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x00f3
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0194 }
                r0.commit(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f0 }
                r0.setUpstreamReader(r8)     // Catch:{ all -> 0x00f0 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f0 }
                if (r0 == 0) goto L_0x00e8
                r0.notifyAll()     // Catch:{ all -> 0x00f0 }
                kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r2)
                return r9
            L_0x00e8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00f0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f3:
                long r9 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                okio.m r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo27383s(r3, r4, r6)     // Catch:{ all -> 0x0194 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x0194 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r13)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r11
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                okio.m r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                okio.m r16 = r0.clone()     // Catch:{ all -> 0x0194 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                monitor-enter(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                okio.m r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                okio.m r3 = r3.getUpstreamBuffer()     // Catch:{ all -> 0x0191 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                okio.m r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                long r6 = r0.mo27362c0()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r11 = r0.getBufferMaxSize()     // Catch:{ all -> 0x0191 }
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x0168
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                okio.m r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                okio.m r3 = r3.getBuffer()     // Catch:{ all -> 0x0191 }
                long r6 = r3.mo27362c0()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r11 = r3.getBufferMaxSize()     // Catch:{ all -> 0x0191 }
                long r6 = r6 - r11
                r0.skip(r6)     // Catch:{ all -> 0x0191 }
            L_0x0168:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x0191 }
                long r6 = r6 + r4
                r0.setUpstreamPos(r6)     // Catch:{ all -> 0x0191 }
                kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0191 }
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018e }
                r0.setUpstreamReader(r8)     // Catch:{ all -> 0x018e }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0186
                r0.notifyAll()     // Catch:{ all -> 0x018e }
                monitor-exit(r2)
                return r9
            L_0x0186:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018e }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x018e }
                throw r0     // Catch:{ all -> 0x018e }
            L_0x018e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0191:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                throw r0     // Catch:{ all -> 0x0194 }
            L_0x0194:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b0 }
                r3.setUpstreamReader(r8)     // Catch:{ all -> 0x01b0 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b0 }
                if (r3 != 0) goto L_0x01a9
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01b0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01b0 }
                throw r0     // Catch:{ all -> 0x01b0 }
            L_0x01a9:
                r3.notifyAll()     // Catch:{ all -> 0x01b0 }
                kotlin.d2 r3 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x01b0 }
                monitor-exit(r2)
                throw r0
            L_0x01b0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01b3:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x01b6:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.m, long):long");
        }

        @C12579k
        public C12516r0 timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.C12459a aVar = ByteString.f30388d;
        PREFIX_CLEAN = aVar.mo27167l("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.mo27167l("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, C12510p0 p0Var, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = p0Var;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C12500m();
        this.complete = this.upstream == null;
        this.buffer = new C12500m();
    }

    /* access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        boolean z;
        C12500m mVar = new C12500m();
        mVar.mo27222G3(byteString);
        mVar.mo27227T3(j);
        mVar.mo27227T3(j2);
        if (mVar.mo27362c0() == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RandomAccessFile randomAccessFile = this.file;
            Intrinsics.checkNotNull(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            new FileOperator(channel).write(0, mVar, 32);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        C12500m mVar = new C12500m();
        mVar.mo27222G3(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, mVar, (long) this.metadata.size());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            C11079d2 d2Var = C11079d2.f28267a;
        }
        C12510p0 p0Var = this.upstream;
        if (p0Var != null) {
            Util.closeQuietly((Closeable) p0Var);
        }
        this.upstream = null;
    }

    @C12579k
    public final C12500m getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @C12580l
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @C12580l
    public final C12510p0 getUpstream() {
        return this.upstream;
    }

    @C12579k
    public final C12500m getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @C12580l
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    @C12579k
    public final ByteString metadata() {
        return this.metadata;
    }

    @C12580l
    public final C12510p0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(@C12580l RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(@C12580l C12510p0 p0Var) {
        this.upstream = p0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(@C12580l Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C12510p0 p0Var, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, p0Var, j, byteString, j2);
    }
}
