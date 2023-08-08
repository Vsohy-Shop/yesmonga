package com.google.firebase.crashlytics.internal.metadata;

import android.support.p002v4.media.session.PlaybackStateCompat;
import androidx.camera.core.ImageSaver;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.e */
public class C32750e implements Closeable {

    /* renamed from: g */
    public static final Logger f79505g = Logger.getLogger(C32750e.class.getName());

    /* renamed from: v */
    public static final int f79506v = 4096;

    /* renamed from: w */
    public static final int f79507w = 16;

    /* renamed from: a */
    public final RandomAccessFile f79508a;

    /* renamed from: b */
    public int f79509b;

    /* renamed from: c */
    public int f79510c;

    /* renamed from: d */
    public C32752b f79511d;

    /* renamed from: e */
    public C32752b f79512e;

    /* renamed from: f */
    public final byte[] f79513f = new byte[16];

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.e$a */
    public class C32751a implements C32754d {

        /* renamed from: a */
        public boolean f79514a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f79515b;

        public C32751a(StringBuilder sb) {
            this.f79515b = sb;
        }

        /* renamed from: a */
        public void mo95112a(InputStream inputStream, int i) throws IOException {
            if (this.f79514a) {
                this.f79514a = false;
            } else {
                this.f79515b.append(", ");
            }
            this.f79515b.append(i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.e$b */
    public static class C32752b {

        /* renamed from: c */
        public static final int f79517c = 4;

        /* renamed from: d */
        public static final C32752b f79518d = new C32752b(0, 0);

        /* renamed from: a */
        public final int f79519a;

        /* renamed from: b */
        public final int f79520b;

        public C32752b(int i, int i2) {
            this.f79519a = i;
            this.f79520b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f79519a + ", length = " + this.f79520b + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.e$c */
    public final class C32753c extends InputStream {

        /* renamed from: a */
        public int f79521a;

        /* renamed from: b */
        public int f79522b;

        public /* synthetic */ C32753c(C32750e eVar, C32752b bVar, C32751a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            Object unused = C32750e.m132313o(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f79522b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C32750e.this.mo95109x(this.f79521a, bArr, i, i2);
            this.f79521a = C32750e.this.mo95092D(this.f79521a + i2);
            this.f79522b -= i2;
            return i2;
        }

        public C32753c(C32752b bVar) {
            this.f79521a = C32750e.this.mo95092D(bVar.f79519a + 4);
            this.f79522b = bVar.f79520b;
        }

        public int read() throws IOException {
            if (this.f79522b == 0) {
                return -1;
            }
            C32750e.this.f79508a.seek((long) this.f79521a);
            int read = C32750e.this.f79508a.read();
            this.f79521a = C32750e.this.mo95092D(this.f79521a + 1);
            this.f79522b--;
            return read;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.e$d */
    public interface C32754d {
        /* renamed from: a */
        void mo95112a(InputStream inputStream, int i) throws IOException;
    }

    public C32750e(File file) throws IOException {
        if (!file.exists()) {
            m132312m(file);
        }
        this.f79508a = m132314p(file);
        mo95105t();
    }

    /* renamed from: F */
    public static void m132306F(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: G */
    public static void m132307G(byte[] bArr, int... iArr) {
        int i = 0;
        for (int F : iArr) {
            m132306F(bArr, i, F);
            i += 4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public static void m132312m(File file) throws IOException {
        File file2 = new File(file.getPath() + ImageSaver.f3843w);
        RandomAccessFile p = m132314p(file2);
        try {
            p.setLength(PlaybackStateCompat.f472N0);
            p.seek(0);
            byte[] bArr = new byte[16];
            m132307G(bArr, 4096, 0, 0, 0);
            p.write(bArr);
            p.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            p.close();
            throw th;
        }
    }

    /* renamed from: o */
    public static <T> T m132313o(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: p */
    public static RandomAccessFile m132314p(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: u */
    public static int m132315u(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << DateTimeFieldType.f30603E0) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: B */
    public synchronized int mo95090B() {
        return this.f79510c;
    }

    /* renamed from: C */
    public int mo95091C() {
        if (this.f79510c == 0) {
            return 16;
        }
        C32752b bVar = this.f79512e;
        int i = bVar.f79519a;
        int i2 = this.f79511d.f79519a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f79520b + 16;
        }
        return (((i + 4) + bVar.f79520b) + this.f79509b) - i2;
    }

    /* renamed from: D */
    public final int mo95092D(int i) {
        int i2 = this.f79509b;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: E */
    public final void mo95093E(int i, int i2, int i3, int i4) throws IOException {
        m132307G(this.f79513f, i, i2, i3, i4);
        this.f79508a.seek(0);
        this.f79508a.write(this.f79513f);
    }

    public synchronized void close() throws IOException {
        this.f79508a.close();
    }

    /* renamed from: f */
    public void mo95095f(byte[] bArr) throws IOException {
        mo95096g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public synchronized void mo95096g(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        m132313o(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        mo95098j(i2);
        boolean n = mo95101n();
        if (n) {
            i3 = 16;
        } else {
            C32752b bVar = this.f79512e;
            i3 = mo95092D(bVar.f79519a + 4 + bVar.f79520b);
        }
        C32752b bVar2 = new C32752b(i3, i2);
        m132306F(this.f79513f, 0, i2);
        mo95110y(bVar2.f79519a, this.f79513f, 0, 4);
        mo95110y(bVar2.f79519a + 4, bArr, i, i2);
        if (n) {
            i4 = bVar2.f79519a;
        } else {
            i4 = this.f79511d.f79519a;
        }
        mo95093E(this.f79509b, this.f79510c + 1, i4, bVar2.f79519a);
        this.f79512e = bVar2;
        this.f79510c++;
        if (n) {
            this.f79511d = bVar2;
        }
    }

    /* renamed from: i */
    public synchronized void mo95097i() throws IOException {
        mo95093E(4096, 0, 0, 0);
        this.f79510c = 0;
        C32752b bVar = C32752b.f79518d;
        this.f79511d = bVar;
        this.f79512e = bVar;
        if (this.f79509b > 4096) {
            mo95111z(4096);
        }
        this.f79509b = 4096;
    }

    /* renamed from: j */
    public final void mo95098j(int i) throws IOException {
        int i2 = i + 4;
        int v = mo95107v();
        if (v < i2) {
            int i3 = this.f79509b;
            do {
                v += i3;
                i3 <<= 1;
            } while (v < i2);
            mo95111z(i3);
            C32752b bVar = this.f79512e;
            int D = mo95092D(bVar.f79519a + 4 + bVar.f79520b);
            if (D < this.f79511d.f79519a) {
                FileChannel channel = this.f79508a.getChannel();
                channel.position((long) this.f79509b);
                long j = (long) (D - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f79512e.f79519a;
            int i5 = this.f79511d.f79519a;
            if (i4 < i5) {
                int i6 = (this.f79509b + i4) - 16;
                mo95093E(i3, this.f79510c, i5, i6);
                this.f79512e = new C32752b(i6, this.f79512e.f79520b);
            } else {
                mo95093E(i3, this.f79510c, i5, i4);
            }
            this.f79509b = i3;
        }
    }

    /* renamed from: k */
    public synchronized void mo95099k(C32754d dVar) throws IOException {
        int i = this.f79511d.f79519a;
        for (int i2 = 0; i2 < this.f79510c; i2++) {
            C32752b s = mo95104s(i);
            dVar.mo95112a(new C32753c(this, s, (C32751a) null), s.f79520b);
            i = mo95092D(s.f79519a + 4 + s.f79520b);
        }
    }

    /* renamed from: l */
    public boolean mo95100l(int i, int i2) {
        return (mo95091C() + 4) + i <= i2;
    }

    /* renamed from: n */
    public synchronized boolean mo95101n() {
        boolean z;
        if (this.f79510c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: q */
    public synchronized void mo95102q(C32754d dVar) throws IOException {
        if (this.f79510c > 0) {
            dVar.mo95112a(new C32753c(this, this.f79511d, (C32751a) null), this.f79511d.f79520b);
        }
    }

    /* renamed from: r */
    public synchronized byte[] mo95103r() throws IOException {
        if (mo95101n()) {
            return null;
        }
        C32752b bVar = this.f79511d;
        int i = bVar.f79520b;
        byte[] bArr = new byte[i];
        mo95109x(bVar.f79519a + 4, bArr, 0, i);
        return bArr;
    }

    /* renamed from: s */
    public final C32752b mo95104s(int i) throws IOException {
        if (i == 0) {
            return C32752b.f79518d;
        }
        this.f79508a.seek((long) i);
        return new C32752b(i, this.f79508a.readInt());
    }

    /* renamed from: t */
    public final void mo95105t() throws IOException {
        this.f79508a.seek(0);
        this.f79508a.readFully(this.f79513f);
        int u = m132315u(this.f79513f, 0);
        this.f79509b = u;
        if (((long) u) <= this.f79508a.length()) {
            this.f79510c = m132315u(this.f79513f, 4);
            int u2 = m132315u(this.f79513f, 8);
            int u3 = m132315u(this.f79513f, 12);
            this.f79511d = mo95104s(u2);
            this.f79512e = mo95104s(u3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f79509b + ", Actual length: " + this.f79508a.length());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C12361b.f30260k);
        sb.append("fileLength=");
        sb.append(this.f79509b);
        sb.append(", size=");
        sb.append(this.f79510c);
        sb.append(", first=");
        sb.append(this.f79511d);
        sb.append(", last=");
        sb.append(this.f79512e);
        sb.append(", element lengths=[");
        try {
            mo95099k(new C32751a(sb));
        } catch (IOException e) {
            f79505g.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: v */
    public final int mo95107v() {
        return this.f79509b - mo95091C();
    }

    /* renamed from: w */
    public synchronized void mo95108w() throws IOException {
        if (mo95101n()) {
            throw new NoSuchElementException();
        } else if (this.f79510c == 1) {
            mo95097i();
        } else {
            C32752b bVar = this.f79511d;
            int D = mo95092D(bVar.f79519a + 4 + bVar.f79520b);
            mo95109x(D, this.f79513f, 0, 4);
            int u = m132315u(this.f79513f, 0);
            mo95093E(this.f79509b, this.f79510c - 1, D, this.f79512e.f79519a);
            this.f79510c--;
            this.f79511d = new C32752b(D, u);
        }
    }

    /* renamed from: x */
    public final void mo95109x(int i, byte[] bArr, int i2, int i3) throws IOException {
        int D = mo95092D(i);
        int i4 = D + i3;
        int i5 = this.f79509b;
        if (i4 <= i5) {
            this.f79508a.seek((long) D);
            this.f79508a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - D;
        this.f79508a.seek((long) D);
        this.f79508a.readFully(bArr, i2, i6);
        this.f79508a.seek(16);
        this.f79508a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: y */
    public final void mo95110y(int i, byte[] bArr, int i2, int i3) throws IOException {
        int D = mo95092D(i);
        int i4 = D + i3;
        int i5 = this.f79509b;
        if (i4 <= i5) {
            this.f79508a.seek((long) D);
            this.f79508a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - D;
        this.f79508a.seek((long) D);
        this.f79508a.write(bArr, i2, i6);
        this.f79508a.seek(16);
        this.f79508a.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: z */
    public final void mo95111z(int i) throws IOException {
        this.f79508a.setLength((long) i);
        this.f79508a.getChannel().force(true);
    }

    public C32750e(RandomAccessFile randomAccessFile) throws IOException {
        this.f79508a = randomAccessFile;
        mo95105t();
    }
}
