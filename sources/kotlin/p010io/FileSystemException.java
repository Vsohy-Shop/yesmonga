package kotlin.p010io;

import java.io.File;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo22516d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "Ljava/io/File;", "a", "()Ljava/io/File;", "other", "b", "", "reason", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    @C12579k
    private final File file;
    @C12580l
    private final File other;
    @C12580l
    private final String reason;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystemException(File file2, File file3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file2, (i & 2) != 0 ? null : file3, (i & 4) != 0 ? null : str);
    }

    @C12579k
    /* renamed from: a */
    public final File mo22546a() {
        return this.file;
    }

    @C12580l
    /* renamed from: b */
    public final File mo22547b() {
        return this.other;
    }

    @C12580l
    /* renamed from: c */
    public final String mo22548c() {
        return this.reason;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(@C12579k File file2, @C12580l File file3, @C12580l String str) {
        super(C11136e.m42976a(file2, file3, str));
        Intrinsics.checkNotNullParameter(file2, "file");
        this.file = file2;
        this.other = file3;
        this.reason = str;
    }
}
