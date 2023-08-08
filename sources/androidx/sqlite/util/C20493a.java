package androidx.sqlite.util;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.sqlite.util.a */
public final class C20493a {
    @C12579k

    /* renamed from: e */
    public static final C20494a f52821e = new C20494a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final String f52822f = "SupportSQLiteLock";
    @C12579k

    /* renamed from: g */
    public static final Map<String, Lock> f52823g = new HashMap();

    /* renamed from: a */
    public final boolean f52824a;
    @C12579k

    /* renamed from: b */
    public final File f52825b;
    @SuppressLint({"SyntheticAccessor"})
    @C12579k

    /* renamed from: c */
    public final Lock f52826c;
    @C12580l

    /* renamed from: d */
    public FileChannel f52827d;

    /* renamed from: androidx.sqlite.util.a$a */
    public static final class C20494a {
        public /* synthetic */ C20494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Lock mo61428b(String str) {
            Lock lock;
            synchronized (C20493a.f52823g) {
                Map a = C20493a.f52823g;
                Object obj = a.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    a.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }

        public C20494a() {
        }
    }

    public C20493a(@C12579k String str, @C12579k File file, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(file, "lockDir");
        this.f52824a = z;
        File file2 = new File(file, str + ".lck");
        this.f52825b = file2;
        C20494a aVar = f52821e;
        String absolutePath = file2.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        this.f52826c = aVar.mo61428b(absolutePath);
    }

    /* renamed from: c */
    public static /* synthetic */ void m95523c(C20493a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f52824a;
        }
        aVar.mo61426b(z);
    }

    /* renamed from: b */
    public final void mo61426b(boolean z) {
        this.f52826c.lock();
        if (z) {
            try {
                File parentFile = this.f52825b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f52825b).getChannel();
                channel.lock();
                this.f52827d = channel;
            } catch (IOException unused) {
                this.f52827d = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo61427d() {
        try {
            FileChannel fileChannel = this.f52827d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f52826c.unlock();
    }
}
