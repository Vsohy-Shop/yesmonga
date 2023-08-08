package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.C0328d;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.C19065o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.C11679z1;

@C0328d
@RestrictTo({RestrictTo.Scope.LIBRARY})
@C0376v0(19)
/* renamed from: androidx.emoji2.text.o */
public class C19100o {

    /* renamed from: a */
    public static final int f48601a = 1164798569;

    /* renamed from: b */
    public static final int f48602b = 1701669481;

    /* renamed from: c */
    public static final int f48603c = 1835365473;

    /* renamed from: androidx.emoji2.text.o$a */
    public static class C19101a implements C19104d {
        @C0359n0

        /* renamed from: c */
        public final ByteBuffer f48604c;

        public C19101a(@C0359n0 ByteBuffer byteBuffer) {
            this.f48604c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo56300a() throws IOException {
            return this.f48604c.getInt();
        }

        /* renamed from: b */
        public void mo56301b(int i) throws IOException {
            ByteBuffer byteBuffer = this.f48604c;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: c */
        public long mo56302c() throws IOException {
            return C19100o.m89403e(this.f48604c.getInt());
        }

        public long getPosition() {
            return (long) this.f48604c.position();
        }

        public int readUnsignedShort() throws IOException {
            return C19100o.m89404f(this.f48604c.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.o$b */
    public static class C19102b implements C19104d {
        @C0359n0

        /* renamed from: c */
        public final byte[] f48605c;
        @C0359n0

        /* renamed from: d */
        public final ByteBuffer f48606d;
        @C0359n0

        /* renamed from: e */
        public final InputStream f48607e;

        /* renamed from: f */
        public long f48608f = 0;

        public C19102b(@C0359n0 InputStream inputStream) {
            this.f48607e = inputStream;
            byte[] bArr = new byte[4];
            this.f48605c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f48606d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo56300a() throws IOException {
            this.f48606d.position(0);
            mo56305d(4);
            return this.f48606d.getInt();
        }

        /* renamed from: b */
        public void mo56301b(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.f48607e.skip((long) i);
                if (skip >= 1) {
                    i -= skip;
                    this.f48608f += (long) skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        /* renamed from: c */
        public long mo56302c() throws IOException {
            this.f48606d.position(0);
            mo56305d(4);
            return C19100o.m89403e(this.f48606d.getInt());
        }

        /* renamed from: d */
        public final void mo56305d(@C0337f0(from = 0, mo995to = 4) int i) throws IOException {
            if (this.f48607e.read(this.f48605c, 0, i) == i) {
                this.f48608f += (long) i;
                return;
            }
            throw new IOException("read failed");
        }

        public long getPosition() {
            return this.f48608f;
        }

        public int readUnsignedShort() throws IOException {
            this.f48606d.position(0);
            mo56305d(2);
            return C19100o.m89404f(this.f48606d.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.o$c */
    public static class C19103c {

        /* renamed from: a */
        public final long f48609a;

        /* renamed from: b */
        public final long f48610b;

        public C19103c(long j, long j2) {
            this.f48609a = j;
            this.f48610b = j2;
        }

        /* renamed from: a */
        public long mo56306a() {
            return this.f48610b;
        }

        /* renamed from: b */
        public long mo56307b() {
            return this.f48609a;
        }
    }

    /* renamed from: androidx.emoji2.text.o$d */
    public interface C19104d {

        /* renamed from: a */
        public static final int f48611a = 2;

        /* renamed from: b */
        public static final int f48612b = 4;

        /* renamed from: a */
        int mo56300a() throws IOException;

        /* renamed from: b */
        void mo56301b(int i) throws IOException;

        /* renamed from: c */
        long mo56302c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    /* renamed from: a */
    public static C19103c m89399a(C19104d dVar) throws IOException {
        long j;
        dVar.mo56301b(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.mo56301b(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int a = dVar.mo56300a();
                dVar.mo56301b(4);
                j = dVar.mo56302c();
                dVar.mo56301b(4);
                if (1835365473 == a) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                dVar.mo56301b((int) (j - dVar.getPosition()));
                dVar.mo56301b(12);
                long c = dVar.mo56302c();
                for (int i2 = 0; ((long) i2) < c; i2++) {
                    int a2 = dVar.mo56300a();
                    long c2 = dVar.mo56302c();
                    long c3 = dVar.mo56302c();
                    if (1164798569 == a2 || 1701669481 == a2) {
                        return new C19103c(c2 + j, c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static C19065o m89400b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            C19065o c = m89401c(open);
            if (open != null) {
                open.close();
            }
            return c;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public static C19065o m89401c(InputStream inputStream) throws IOException {
        C19102b bVar = new C19102b(inputStream);
        C19103c a = m89399a(bVar);
        bVar.mo56301b((int) (a.mo56307b() - bVar.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a.mo56306a());
        int read = inputStream.read(allocate.array());
        if (((long) read) == a.mo56306a()) {
            return C19065o.m89262G(allocate);
        }
        throw new IOException("Needed " + a.mo56306a() + " bytes, got " + read);
    }

    /* renamed from: d */
    public static C19065o m89402d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m89399a(new C19101a(duplicate)).mo56307b());
        return C19065o.m89262G(duplicate);
    }

    /* renamed from: e */
    public static long m89403e(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: f */
    public static int m89404f(short s) {
        return s & C11679z1.f28988d;
    }
}
