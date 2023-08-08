package okhttp3.internal.cache;

import androidx.camera.core.ImageSaver;
import com.bumptech.glide.disklrucache.C22050b;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p012io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.C12465c0;
import okio.C12505n;
import okio.C12510p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b*\u0001T\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u000206\u0012\u0006\u0010_\u001a\u00020B\u0012\u0006\u0010`\u001a\u00020B\u0012\u0006\u00100\u001a\u00020\u0017\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u0017J#\u0010 \u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010&\u001a\u00020\u000b2\n\u0010#\u001a\u00060\"R\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020\u0003H\u0016J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000-R*\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178F@FX\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\"R\u00020\u00000=8\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\"\u0010I\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u00101R\u0014\u0010R\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010DR\u001a\u0010`\u001a\u00020B8\u0000X\u0004¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\ba\u0010b¨\u0006k"}, mo22516d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/d2;", "readJournal", "Lokio/n;", "newJournalWriter", "", "line", "readJournalLine", "processJournal", "", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "key", "validateKey", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "value", "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "Ljava/io/File;", "journalFile", "Ljava/io/File;", "journalFileTmp", "journalFileBackup", "journalWriter", "Lokio/n;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "", "redundantOpCount", "I", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "directory", "getDirectory", "()Ljava/io/File;", "appVersion", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class DiskLruCache implements Closeable, Flushable {
    @C11287e
    public static final long ANY_SEQUENCE_NUMBER = -1;
    @C12579k
    @C11287e
    public static final String CLEAN = C22050b.f56573J0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    @C11287e
    public static final String DIRTY = C22050b.f56574K0;
    @C12579k
    @C11287e
    public static final String JOURNAL_FILE = C22050b.f56577Z;
    @C12579k
    @C11287e
    public static final String JOURNAL_FILE_BACKUP = C22050b.f56569F0;
    @C12579k
    @C11287e
    public static final String JOURNAL_FILE_TEMP = C22050b.f56568E0;
    @C12579k
    @C11287e
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    @C12579k
    @C11287e
    public static final String MAGIC = C22050b.f56570G0;
    @C12579k
    @C11287e
    public static final String READ = C22050b.f56576M0;
    @C12579k
    @C11287e
    public static final String REMOVE = C22050b.f56575L0;
    @C12579k
    @C11287e
    public static final String VERSION_1 = "1";
    private final int appVersion;
    /* access modifiers changed from: private */
    public boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    @C12579k
    private final File directory;
    @C12579k
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    /* access modifiers changed from: private */
    public C12505n journalWriter;
    @C12579k
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo22516d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0016R\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00060\u0016R\u00020\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lkotlin/d2;", "detach$okhttp", "()V", "detach", "", "index", "Lokio/p0;", "newSource", "Lokio/n0;", "newSink", "commit", "abort", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class Editor {
        private boolean done;
        @C12579k
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        @C12580l
        private final boolean[] written;

        public Editor(@C12579k DiskLruCache diskLruCache, Entry entry2) {
            boolean[] zArr;
            Intrinsics.checkNotNullParameter(entry2, C33541p.f81644a);
            this.this$0 = diskLruCache;
            this.entry = entry2;
            if (entry2.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (!Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                return;
            }
            if (this.this$0.civilizedFileSystem) {
                this.this$0.completeEdit$okhttp(this, false);
            } else {
                this.entry.setZombie$okhttp(true);
            }
        }

        @C12579k
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        @C12580l
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = okio.C12465c0.m50479b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
        @org.jetbrains.annotations.C12579k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.C12506n0 newSink(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x005f }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0053
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x005f }
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x005f }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                okio.n0 r5 = okio.C12465c0.m50479b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x001c:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x005f }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r4.written     // Catch:{ all -> 0x005f }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x005f }
                r1[r5] = r2     // Catch:{ all -> 0x005f }
            L_0x002b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x005f }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x005f }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ FileNotFoundException -> 0x004d }
                okhttp3.internal.io.FileSystem r2 = r2.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x004d }
                okio.n0 r1 = r2.sink(r1)     // Catch:{ FileNotFoundException -> 0x004d }
                okhttp3.internal.cache.FaultHidingSink r2 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x005f }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r2
            L_0x004d:
                okio.n0 r5 = okio.C12465c0.m50479b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x0053:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005f }
                r1.<init>(r5)     // Catch:{ all -> 0x005f }
                throw r1     // Catch:{ all -> 0x005f }
            L_0x005f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):okio.n0");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            return null;
         */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.C12510p0 newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x004f }
                r2 = 0
                if (r1 == 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x004f }
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getZombie$okhttp()     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0029
                goto L_0x0041
            L_0x0029:
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch:{ FileNotFoundException -> 0x003f }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x003f }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x003f }
                okio.p0 r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x003f }
            L_0x003f:
                monitor-exit(r0)
                return r2
            L_0x0041:
                monitor-exit(r0)
                return r2
            L_0x0043:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004f }
                r1.<init>(r5)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):okio.p0");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00101\u001a\b\u0018\u000100R\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, mo22516d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", "index", "Lokio/p0;", "newSource", "Lkotlin/d2;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/n;", "writer", "writeLengths$okhttp", "(Lokio/n;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class Entry {
        @C12579k
        private final List<File> cleanFiles = new ArrayList();
        @C12580l
        private Editor currentEditor;
        @C12579k
        private final List<File> dirtyFiles = new ArrayList();
        @C12579k
        private final String key;
        @C12579k
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@C12579k DiskLruCache diskLruCache, String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(ImageSaver.f3843w);
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final C12510p0 newSource(int i) {
            C12510p0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new DiskLruCache$Entry$newSource$1(this, source, source);
        }

        @C12579k
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @C12580l
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        @C12579k
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @C12579k
        public final String getKey$okhttp() {
            return this.key;
        }

        @C12579k
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@C12580l Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@C12579k List<String> list) throws IOException {
            Intrinsics.checkNotNullParameter(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new KotlinNothingValueException();
                }
            } else {
                invalidLengths(list);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        @C12580l
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<C12510p0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (C12510p0 closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(@C12579k C12505n nVar) throws IOException {
            Intrinsics.checkNotNullParameter(nVar, "writer");
            for (long g2 : this.lengths) {
                nVar.mo27225K2(32).mo27233g2(g2);
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo22516d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", "index", "Lokio/p0;", "getSource", "", "getLength", "Lkotlin/d2;", "close", "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<C12510p0> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(@C12579k DiskLruCache diskLruCache, String str, @C12579k long j, @C12579k List<? extends C12510p0> list, long[] jArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(list, "sources");
            Intrinsics.checkNotNullParameter(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (C12510p0 closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        @C12580l
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        @C12579k
        public final C12510p0 getSource(int i) {
            return this.sources.get(i);
        }

        @C12579k
        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(@C12579k FileSystem fileSystem2, @C12579k File file, int i, int i2, long j, @C12579k TaskRunner taskRunner) {
        boolean z;
        Intrinsics.checkNotNullParameter(fileSystem2, "fileSystem");
        Intrinsics.checkNotNullParameter(file, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        boolean z2 = false;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, Util.okHttpName + " Cache");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0 ? true : z2) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final C12505n newJournalWriter() throws FileNotFoundException {
        return C12465c0.m50480c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.redundantOpCount = r7 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo27275J2() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        kotlin.p010io.C11133b.m42950a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            okio.p0 r1 = r1.source(r2)
            okio.o r1 = okio.C12465c0.m50481d(r1)
            java.lang.String r2 = r1.mo27274J1()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo27274J1()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo27274J1()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo27274J1()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo27274J1()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.valueCount     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.mo27274J1()     // Catch:{ EOFException -> 0x0064 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo27275J2()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            okio.n r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) throws IOException {
        String str2;
        String str3 = str;
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            int i = indexOf$default + 1;
            int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
            if (indexOf$default2 == -1) {
                if (str3 != null) {
                    str2 = str3.substring(i);
                    Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).substring(startIndex)");
                    String str4 = REMOVE;
                    if (indexOf$default == str4.length() && C11622t.startsWith$default(str3, str4, false, 2, (Object) null)) {
                        this.lruEntries.remove(str2);
                        return;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str3 != null) {
                str2 = str3.substring(i, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf$default2 != -1) {
                String str5 = CLEAN;
                if (indexOf$default == str5.length() && C11622t.startsWith$default(str3, str5, false, 2, (Object) null)) {
                    int i2 = indexOf$default2 + 1;
                    if (str3 != null) {
                        String substring = str3.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        List split$default = StringsKt__StringsKt.split$default((CharSequence) substring, new char[]{' '}, false, 0, 6, (Object) null);
                        entry.setReadable$okhttp(true);
                        entry.setCurrentEditor$okhttp((Editor) null);
                        entry.setLengths$okhttp(split$default);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (indexOf$default2 == -1) {
                String str6 = DIRTY;
                if (indexOf$default == str6.length() && C11622t.startsWith$default(str3, str6, false, 2, (Object) null)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (indexOf$default2 == -1) {
                String str7 = READ;
                if (indexOf$default == str7.length() && C11622t.startsWith$default(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    private final boolean removeOldestEntry() {
        for (Entry next : this.lruEntries.values()) {
            if (!next.getZombie$okhttp()) {
                Intrinsics.checkNotNullExpressionValue(next, "toEvict");
                removeEntry$okhttp(next);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.mo23334k(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    for (Entry entry : (Entry[]) array) {
                        if (!(entry.getCurrentEditor$okhttp() == null || (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) == null)) {
                            currentEditor$okhttp.detach$okhttp();
                        }
                    }
                    trimToSize();
                    C12505n nVar = this.journalWriter;
                    Intrinsics.checkNotNull(nVar);
                    nVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(@org.jetbrains.annotations.C12579k okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0142 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r9)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0136
            r1 = 0
            if (r10 == 0) goto L_0x0061
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0142 }
            if (r2 != 0) goto L_0x0061
            int r2 = r8.valueCount     // Catch:{ all -> 0x0142 }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x0061
            boolean[] r4 = r9.getWritten$okhttp()     // Catch:{ all -> 0x0142 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ all -> 0x0142 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0047
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0142 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0142 }
            boolean r4 = r4.exists(r5)     // Catch:{ all -> 0x0142 }
            if (r4 != 0) goto L_0x0044
            r9.abort()     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0047:
            r9.abort()     // Catch:{ all -> 0x0142 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0142 }
            r10.append(r3)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0142 }
            r9.<init>(r10)     // Catch:{ all -> 0x0142 }
            throw r9     // Catch:{ all -> 0x0142 }
        L_0x0061:
            int r9 = r8.valueCount     // Catch:{ all -> 0x0142 }
        L_0x0063:
            if (r1 >= r9) goto L_0x00af
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00a7
            boolean r3 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0142 }
            if (r3 != 0) goto L_0x00a7
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x00ac
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0142 }
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            r4.rename(r2, r3)     // Catch:{ all -> 0x0142 }
            long[] r2 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0142 }
            r4 = r2[r1]     // Catch:{ all -> 0x0142 }
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            long r2 = r2.size(r3)     // Catch:{ all -> 0x0142 }
            long[] r6 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0142 }
            r6[r1] = r2     // Catch:{ all -> 0x0142 }
            long r6 = r8.size     // Catch:{ all -> 0x0142 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch:{ all -> 0x0142 }
            goto L_0x00ac
        L_0x00a7:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            r3.delete(r2)     // Catch:{ all -> 0x0142 }
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00af:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch:{ all -> 0x0142 }
            boolean r9 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x00be
            r8.removeEntry$okhttp(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x00be:
            int r9 = r8.redundantOpCount     // Catch:{ all -> 0x0142 }
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch:{ all -> 0x0142 }
            okio.n r9 = r8.journalWriter     // Catch:{ all -> 0x0142 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch:{ all -> 0x0142 }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0142 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00d6
            goto L_0x00f3
        L_0x00d6:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r10.remove(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = REMOVE     // Catch:{ all -> 0x0142 }
            okio.n r10 = r9.mo27236l1(r10)     // Catch:{ all -> 0x0142 }
            r10.mo27225K2(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r9.mo27236l1(r10)     // Catch:{ all -> 0x0142 }
            r9.mo27225K2(r3)     // Catch:{ all -> 0x0142 }
            goto L_0x0118
        L_0x00f3:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x0142 }
            okio.n r1 = r9.mo27236l1(r1)     // Catch:{ all -> 0x0142 }
            r1.mo27225K2(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r9.mo27236l1(r1)     // Catch:{ all -> 0x0142 }
            r0.writeLengths$okhttp(r9)     // Catch:{ all -> 0x0142 }
            r9.mo27225K2(r3)     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x0118
            long r1 = r8.nextSequenceNumber     // Catch:{ all -> 0x0142 }
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch:{ all -> 0x0142 }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x0142 }
        L_0x0118:
            r9.flush()     // Catch:{ all -> 0x0142 }
            long r9 = r8.size     // Catch:{ all -> 0x0142 }
            long r0 = r8.maxSize     // Catch:{ all -> 0x0142 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0129
            boolean r9 = r8.journalRebuildRequired()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x0134
        L_0x0129:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch:{ all -> 0x0142 }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0142 }
        L_0x0134:
            monitor-exit(r8)
            return
        L_0x0136:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0142 }
            r10.<init>(r9)     // Catch:{ all -> 0x0142 }
            throw r10     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @C12580l
    @C11315i
    public final Editor edit(@C12579k String str) throws IOException {
        return edit$default(this, str, 0, 2, (Object) null);
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            for (Entry entry : (Entry[]) array) {
                Intrinsics.checkNotNullExpressionValue(entry, C33541p.f81644a);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            C12505n nVar = this.journalWriter;
            Intrinsics.checkNotNull(nVar);
            nVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        return r0;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(@org.jetbrains.annotations.C12579k java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)     // Catch:{ all -> 0x005c }
            r7.initialize()     // Catch:{ all -> 0x005c }
            r7.checkNotClosed()     // Catch:{ all -> 0x005c }
            r7.validateKey(r8)     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = "lruEntries[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            int r1 = r7.redundantOpCount     // Catch:{ all -> 0x005c }
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch:{ all -> 0x005c }
            okio.n r1 = r7.journalWriter     // Catch:{ all -> 0x005c }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = READ     // Catch:{ all -> 0x005c }
            okio.n r1 = r1.mo27236l1(r2)     // Catch:{ all -> 0x005c }
            r2 = 32
            okio.n r1 = r1.mo27225K2(r2)     // Catch:{ all -> 0x005c }
            okio.n r8 = r1.mo27236l1(r8)     // Catch:{ all -> 0x005c }
            r1 = 10
            r8.mo27225K2(r1)     // Catch:{ all -> 0x005c }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0056
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch:{ all -> 0x005c }
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x005c }
        L_0x0056:
            monitor-exit(r7)
            return r0
        L_0x0058:
            monitor-exit(r7)
            return r1
        L_0x005a:
            monitor-exit(r7)
            return r1
        L_0x005c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    @C12579k
    public final File getDirectory() {
        return this.directory;
    }

    @C12579k
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    @C12579k
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            okio.n r0 = r6.journalWriter     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c5 }
        L_0x0008:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r6.journalFileTmp     // Catch:{ all -> 0x00c5 }
            okio.n0 r0 = r0.sink(r1)     // Catch:{ all -> 0x00c5 }
            okio.n r0 = okio.C12465c0.m50480c(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = MAGIC     // Catch:{ all -> 0x00be }
            okio.n r1 = r0.mo27236l1(r1)     // Catch:{ all -> 0x00be }
            r2 = 10
            r1.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = VERSION_1     // Catch:{ all -> 0x00be }
            okio.n r1 = r0.mo27236l1(r1)     // Catch:{ all -> 0x00be }
            r1.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            int r1 = r6.appVersion     // Catch:{ all -> 0x00be }
            long r3 = (long) r1     // Catch:{ all -> 0x00be }
            okio.n r1 = r0.mo27233g2(r3)     // Catch:{ all -> 0x00be }
            r1.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            int r1 = r6.valueCount     // Catch:{ all -> 0x00be }
            long r3 = (long) r1     // Catch:{ all -> 0x00be }
            okio.n r1 = r0.mo27233g2(r3)     // Catch:{ all -> 0x00be }
            r1.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            r0.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r6.lruEntries     // Catch:{ all -> 0x00be }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00be }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00be }
        L_0x0049:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Entry r3 = (okhttp3.internal.cache.DiskLruCache.Entry) r3     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r3.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00be }
            r5 = 32
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = DIRTY     // Catch:{ all -> 0x00be }
            okio.n r4 = r0.mo27236l1(r4)     // Catch:{ all -> 0x00be }
            r4.mo27225K2(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r3.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.mo27236l1(r3)     // Catch:{ all -> 0x00be }
            r0.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            goto L_0x0049
        L_0x0071:
            java.lang.String r4 = CLEAN     // Catch:{ all -> 0x00be }
            okio.n r4 = r0.mo27236l1(r4)     // Catch:{ all -> 0x00be }
            r4.mo27225K2(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r3.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.mo27236l1(r4)     // Catch:{ all -> 0x00be }
            r3.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00be }
            r0.mo27225K2(r2)     // Catch:{ all -> 0x00be }
            goto L_0x0049
        L_0x0088:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00be }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r6.journalFile     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a1
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r6.journalFile     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r6.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r6.journalFileTmp     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r6.journalFile     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r6.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.delete(r1)     // Catch:{ all -> 0x00c5 }
            okio.n r0 = r6.newJournalWriter()     // Catch:{ all -> 0x00c5 }
            r6.journalWriter = r0     // Catch:{ all -> 0x00c5 }
            r0 = 0
            r6.hasJournalErrors = r0     // Catch:{ all -> 0x00c5 }
            r6.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r6)
            return
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r1)     // Catch:{ all -> 0x00c5 }
            throw r2     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(@org.jetbrains.annotations.C12579k java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch:{ all -> 0x0033 }
            r5.initialize()     // Catch:{ all -> 0x0033 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0033 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0033 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0033 }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r6 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)     // Catch:{ all -> 0x0033 }
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x002f
            long r1 = r5.size     // Catch:{ all -> 0x0033 }
            long r3 = r5.maxSize     // Catch:{ all -> 0x0033 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r5)
            return r6
        L_0x0031:
            monitor-exit(r5)
            return r0
        L_0x0033:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(@C12579k Entry entry) throws IOException {
        C12505n nVar;
        Intrinsics.checkNotNullParameter(entry, C33541p.f81644a);
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (nVar = this.journalWriter) != null) {
                nVar.mo27236l1(DIRTY);
                nVar.mo27225K2(32);
                nVar.mo27236l1(entry.getKey$okhttp());
                nVar.mo27225K2(10);
                nVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        C12505n nVar2 = this.journalWriter;
        if (nVar2 != null) {
            nVar2.mo27236l1(REMOVE);
            nVar2.mo27225K2(32);
            nVar2.mo27236l1(entry.getKey$okhttp());
            nVar2.mo27225K2(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    @C12579k
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    @org.jetbrains.annotations.C12580l
    @kotlin.jvm.C11315i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.C12579k java.lang.String r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch:{ all -> 0x008f }
            r9.initialize()     // Catch:{ all -> 0x008f }
            r9.checkNotClosed()     // Catch:{ all -> 0x008f }
            r9.validateKey(r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x008f }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x008f }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r3 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x008f }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r9)
            return r2
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x008f }
            goto L_0x0032
        L_0x0031:
            r11 = r2
        L_0x0032:
            if (r11 == 0) goto L_0x0036
            monitor-exit(r9)
            return r2
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r11 = r0.getLockingSourceCount$okhttp()     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0040
            monitor-exit(r9)
            return r2
        L_0x0040:
            boolean r11 = r9.mostRecentTrimFailed     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x0082
            boolean r11 = r9.mostRecentRebuildFailed     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0049
            goto L_0x0082
        L_0x0049:
            okio.n r11 = r9.journalWriter     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)     // Catch:{ all -> 0x008f }
            java.lang.String r12 = DIRTY     // Catch:{ all -> 0x008f }
            okio.n r12 = r11.mo27236l1(r12)     // Catch:{ all -> 0x008f }
            r1 = 32
            okio.n r12 = r12.mo27225K2(r1)     // Catch:{ all -> 0x008f }
            okio.n r12 = r12.mo27236l1(r10)     // Catch:{ all -> 0x008f }
            r1 = 10
            r12.mo27225K2(r1)     // Catch:{ all -> 0x008f }
            r11.flush()     // Catch:{ all -> 0x008f }
            boolean r11 = r9.hasJournalErrors     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x006c
            monitor-exit(r9)
            return r2
        L_0x006c:
            if (r0 != 0) goto L_0x0078
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x008f }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch:{ all -> 0x008f }
            r11.put(r10, r0)     // Catch:{ all -> 0x008f }
        L_0x0078:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x008f }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x008f }
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r10
        L_0x0082:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.cleanupTask     // Catch:{ all -> 0x008f }
            r5 = 0
            r7 = 2
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r2
        L_0x008f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }
}
