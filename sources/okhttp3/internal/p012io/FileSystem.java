package okhttp3.internal.p012io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C12465c0;
import okio.C12467d0;
import okio.C12506n0;
import okio.C12510p0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, mo22516d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "Lokio/p0;", "source", "Lokio/n0;", "sink", "appendingSink", "Lkotlin/d2;", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    @C11287e
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0006"}, mo22516d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        @C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, mo22516d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "Lokio/p0;", "source", "Lokio/n0;", "sink", "appendingSink", "Lkotlin/d2;", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "", "toString", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.io.FileSystem$Companion$SystemFileSystem */
        public static final class SystemFileSystem implements FileSystem {
            @C12579k
            public C12506n0 appendingSink(@C12579k File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return C12465c0.m50478a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C12465c0.m50478a(file);
                }
            }

            public void delete(@C12579k File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public void deleteContents(@C12579k File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        Intrinsics.checkNotNullExpressionValue(file2, "file");
                        if (file2.isDirectory()) {
                            deleteContents(file2);
                        }
                        if (file2.delete()) {
                            i++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            public boolean exists(@C12579k File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            public void rename(@C12579k File file, @C12579k File file2) throws IOException {
                Intrinsics.checkNotNullParameter(file, "from");
                Intrinsics.checkNotNullParameter(file2, "to");
                delete(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            @C12579k
            public C12506n0 sink(@C12579k File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return C12467d0.m50517p(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C12467d0.m50517p(file, false, 1, (Object) null);
                }
            }

            public long size(@C12579k File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @C12579k
            public C12510p0 source(@C12579k File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return C12465c0.m50495r(file);
            }

            @C12579k
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12579k
    C12506n0 appendingSink(@C12579k File file) throws FileNotFoundException;

    void delete(@C12579k File file) throws IOException;

    void deleteContents(@C12579k File file) throws IOException;

    boolean exists(@C12579k File file);

    void rename(@C12579k File file, @C12579k File file2) throws IOException;

    @C12579k
    C12506n0 sink(@C12579k File file) throws FileNotFoundException;

    long size(@C12579k File file);

    @C12579k
    C12510p0 source(@C12579k File file) throws FileNotFoundException;
}
