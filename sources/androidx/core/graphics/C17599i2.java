package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.provider.C17866h;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.i2 */
public class C17599i2 {

    /* renamed from: a */
    public static final String f45967a = "TypefaceCompatUtil";

    /* renamed from: b */
    public static final String f45968b = ".font";

    @C0376v0(19)
    /* renamed from: androidx.core.graphics.i2$a */
    public static class C17600a {
        @C0373u
        /* renamed from: a */
        public static ParcelFileDescriptor m80651a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m80643a(@C0363p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: b */
    public static ByteBuffer m80644b(@C0359n0 Context context, @C0359n0 Resources resources, int i) {
        File e = m80647e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!m80645c(e, resources, i)) {
                return null;
            }
            ByteBuffer g = m80649g(e);
            e.delete();
            return g;
        } finally {
            e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m80645c(@C0359n0 File file, @C0359n0 Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = m80646d(file, inputStream);
                m80643a(inputStream);
                return d;
            } catch (Throwable th) {
                th = th;
                m80643a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m80643a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m80646d(@C0359n0 File file, @C0359n0 InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m80643a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    m80643a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m80643a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m80643a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            m80643a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    @C0363p0
    /* renamed from: e */
    public static File m80647e(@C0359n0 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f45968b + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: f */
    public static ByteBuffer m80648f(@C0359n0 Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor a = C17600a.m80651a(context.getContentResolver(), uri, C28515a1.f68703k, cancellationSignal);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(a.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                a.close();
                return map;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: g */
    public static ByteBuffer m80649g(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0359n0
    @C0376v0(19)
    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m80650h(@C0359n0 Context context, @C0359n0 C17866h.C17869c[] cVarArr, @C0363p0 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C17866h.C17869c cVar : cVarArr) {
            if (cVar.mo52283b() == 0) {
                Uri d = cVar.mo52285d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, m80648f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
