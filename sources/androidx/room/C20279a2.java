package androidx.room;

import android.content.Context;
import androidx.annotation.C0376v0;
import androidx.camera.core.ImageSaver;
import androidx.room.util.C20378b;
import androidx.room.util.C20379c;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.p031db.framework.C20477e;
import androidx.sqlite.util.C20493a;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.a2 */
public final class C20279a2 implements C20481g, C20331k {
    @C12579k

    /* renamed from: a */
    public final Context f52328a;
    @C12580l

    /* renamed from: b */
    public final String f52329b;
    @C12580l

    /* renamed from: c */
    public final File f52330c;
    @C12580l

    /* renamed from: d */
    public final Callable<InputStream> f52331d;

    /* renamed from: e */
    public final int f52332e;
    @C12579k

    /* renamed from: f */
    public final C20481g f52333f;

    /* renamed from: g */
    public C20320i f52334g;

    /* renamed from: v */
    public boolean f52335v;

    /* renamed from: androidx.room.a2$a */
    public static final class C20280a extends C20481g.C20482a {

        /* renamed from: d */
        public final /* synthetic */ int f52336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20280a(int i, int i2) {
            super(i2);
            this.f52336d = i;
        }

        /* renamed from: d */
        public void mo60972d(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }

        /* renamed from: f */
        public void mo60973f(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
            int i = this.f52336d;
            if (i < 1) {
                fVar.mo60785u2(i);
            }
        }

        /* renamed from: g */
        public void mo60974g(@C12579k C20466f fVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }
    }

    public C20279a2(@C12579k Context context, @C12580l String str, @C12580l File file, @C12580l Callable<InputStream> callable, int i, @C12579k C20481g gVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(gVar, "delegate");
        this.f52328a = context;
        this.f52329b = str;
        this.f52330c = file;
        this.f52331d = callable;
        this.f52332e = i;
        this.f52333f = gVar;
    }

    @C12579k
    /* renamed from: Z2 */
    public C20466f mo18111Z2() {
        if (!this.f52335v) {
            mo60971f(false);
            this.f52335v = true;
        }
        return getDelegate().mo18111Z2();
    }

    /* renamed from: a */
    public final void mo60967a(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f52329b != null) {
            readableByteChannel = Channels.newChannel(this.f52328a.getAssets().open(this.f52329b));
            Intrinsics.checkNotNullExpressionValue(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f52330c != null) {
            readableByteChannel = new FileInputStream(this.f52330c).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f52331d;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                    Intrinsics.checkNotNullExpressionValue(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ImageSaver.f3843w, this.f52328a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "output");
        C20379c.m95147a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            Intrinsics.checkNotNullExpressionValue(createTempFile, "intermediateFile");
            mo60969c(createTempFile, z);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    /* renamed from: b */
    public final C20481g mo60968b(File file) {
        try {
            int g = C20378b.m95146g(file);
            return new C20477e().mo18120a(C20481g.C20484b.f52799f.mo61414a(this.f52328a).mo61412d(file.getAbsolutePath()).mo61411c(new C20280a(g, C11479u.m44447u(g, 1))).mo61410b());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60969c(java.io.File r4, boolean r5) {
        /*
            r3 = this;
            androidx.room.i r0 = r3.f52334g
            java.lang.String r1 = "databaseConfiguration"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x000b:
            androidx.room.RoomDatabase$e r0 = r0.f52467q
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            androidx.sqlite.db.g r4 = r3.mo60968b(r4)
            if (r5 == 0) goto L_0x001b
            androidx.sqlite.db.f r5 = r4.mo18117d3()     // Catch:{ all -> 0x0035 }
            goto L_0x001f
        L_0x001b:
            androidx.sqlite.db.f r5 = r4.mo18111Z2()     // Catch:{ all -> 0x0035 }
        L_0x001f:
            androidx.room.i r0 = r3.f52334g     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0027
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ all -> 0x0035 }
            r0 = r2
        L_0x0027:
            androidx.room.RoomDatabase$e r0 = r0.f52467q     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0035 }
            r0.mo60954a(r5)     // Catch:{ all -> 0x0035 }
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            kotlin.p010io.C11133b.m42950a(r4, r2)
            return
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20279a2.mo60969c(java.io.File, boolean):void");
    }

    public synchronized void close() {
        getDelegate().close();
        this.f52335v = false;
    }

    /* renamed from: d */
    public final void mo60970d(@C12579k C20320i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "databaseConfiguration");
        this.f52334g = iVar;
    }

    @C12579k
    /* renamed from: d3 */
    public C20466f mo18117d3() {
        if (!this.f52335v) {
            mo60971f(true);
            this.f52335v = true;
        }
        return getDelegate().mo18117d3();
    }

    /* renamed from: f */
    public final void mo60971f(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f52328a.getDatabasePath(databaseName);
            C20320i iVar = this.f52334g;
            C20320i iVar2 = null;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                iVar = null;
            }
            boolean z2 = iVar.f52470t;
            File filesDir = this.f52328a.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
            C20493a aVar = new C20493a(databaseName, filesDir, z2);
            try {
                C20493a.m95523c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    Intrinsics.checkNotNullExpressionValue(databasePath, "databaseFile");
                    mo60967a(databasePath, z);
                    aVar.mo61427d();
                    return;
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(databasePath, "databaseFile");
                    int g = C20378b.m95146g(databasePath);
                    if (g == this.f52332e) {
                        aVar.mo61427d();
                        return;
                    }
                    C20320i iVar3 = this.f52334g;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                    } else {
                        iVar2 = iVar3;
                    }
                    if (iVar2.mo61084a(g, this.f52332e)) {
                        aVar.mo61427d();
                        return;
                    }
                    if (this.f52328a.deleteDatabase(databaseName)) {
                        try {
                            mo60967a(databasePath, z);
                        } catch (IOException unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to delete database file (");
                        sb.append(databaseName);
                        sb.append(") for a copy destructive migration.");
                    }
                    aVar.mo61427d();
                } catch (IOException unused2) {
                    aVar.mo61427d();
                }
            } catch (IOException e) {
                throw new RuntimeException("Unable to copy database file.", e);
            } catch (Throwable th) {
                aVar.mo61427d();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @C12580l
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @C12579k
    public C20481g getDelegate() {
        return this.f52333f;
    }

    @C0376v0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
