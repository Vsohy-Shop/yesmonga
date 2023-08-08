package androidx.core.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.util.b */
public class C17964b {

    /* renamed from: d */
    public static final String f46450d = "AtomicFile";

    /* renamed from: a */
    public final File f46451a;

    /* renamed from: b */
    public final File f46452b;

    /* renamed from: c */
    public final File f46453c;

    public C17964b(@C0359n0 File file) {
        this.f46451a = file;
        this.f46452b = new File(file.getPath() + ".new");
        this.f46453c = new File(file.getPath() + ".bak");
    }

    /* renamed from: g */
    public static void m81598g(@C0359n0 File file, @C0359n0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
        }
        if (!file.renameTo(file2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to rename ");
            sb2.append(file);
            sb2.append(" to ");
            sb2.append(file2);
        }
    }

    /* renamed from: i */
    public static boolean m81599i(@C0359n0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo52419a() {
        this.f46451a.delete();
        this.f46452b.delete();
        this.f46453c.delete();
    }

    /* renamed from: b */
    public void mo52420b(@C0363p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m81599i(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            if (!this.f46452b.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to delete new file ");
                sb.append(this.f46452b);
            }
        }
    }

    /* renamed from: c */
    public void mo52421c(@C0363p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m81599i(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            m81598g(this.f46452b, this.f46451a);
        }
    }

    @C0359n0
    /* renamed from: d */
    public File mo52422d() {
        return this.f46451a;
    }

    @C0359n0
    /* renamed from: e */
    public FileInputStream mo52423e() throws FileNotFoundException {
        if (this.f46453c.exists()) {
            m81598g(this.f46453c, this.f46451a);
        }
        if (this.f46452b.exists() && this.f46451a.exists() && !this.f46452b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete outdated new file ");
            sb.append(this.f46452b);
        }
        return new FileInputStream(this.f46451a);
    }

    @C0359n0
    /* renamed from: f */
    public byte[] mo52424f() throws IOException {
        FileInputStream e = mo52423e();
        try {
            byte[] bArr = new byte[e.available()];
            int i = 0;
            while (true) {
                int read = e.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = e.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            e.close();
        }
    }

    @C0359n0
    /* renamed from: h */
    public FileOutputStream mo52425h() throws IOException {
        if (this.f46453c.exists()) {
            m81598g(this.f46453c, this.f46451a);
        }
        try {
            return new FileOutputStream(this.f46452b);
        } catch (FileNotFoundException unused) {
            if (this.f46452b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f46452b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f46452b, e);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.f46452b);
            }
        }
    }
}
