package androidx.datastore.preferences.protobuf;

import com.google.android.material.badge.C31132a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final int f47467a = 128;

    /* renamed from: b */
    public static final int f47468b = 256;

    /* renamed from: c */
    public static final int f47469c = 8192;

    /* renamed from: d */
    public static final ByteString f47470d = new LiteralByteString(C18753i1.f47863d);

    /* renamed from: e */
    public static final C18613e f47471e;

    /* renamed from: f */
    public static final int f47472f = 255;

    /* renamed from: g */
    public static final Comparator<ByteString> f47473g = new C18610b();
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m84394w(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: f1 */
        public int mo53769f1() {
            return this.bytesOffset;
        }

        /* renamed from: m0 */
        public void mo53756m0(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, mo53769f1() + i, bArr, i2, i3);
        }

        /* renamed from: p0 */
        public byte mo53759p0(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        /* renamed from: q */
        public byte mo53760q(int i) {
            ByteString.m84392r(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.m84384V0(mo53737M0());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        /* renamed from: d1 */
        public void mo53746d1(C18864t tVar) throws IOException {
            mo53742X0(tVar);
        }

        /* renamed from: e1 */
        public abstract boolean mo53771e1(ByteString byteString, int i, int i2);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }

        /* renamed from: o0 */
        public final int mo53758o0() {
            return 0;
        }

        /* renamed from: r0 */
        public final boolean mo53761r0() {
            return true;
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        /* renamed from: A0 */
        public final int mo53731A0(int i, int i2, int i3) {
            return C18753i1.m86359w(i, this.bytes, mo53769f1() + i2, i3);
        }

        /* renamed from: B0 */
        public final int mo53732B0(int i, int i2, int i3) {
            int f1 = mo53769f1() + i2;
            return Utf8.m85212w(i, this.bytes, f1, i3 + f1);
        }

        /* renamed from: L0 */
        public final ByteString mo53736L0(int i, int i2) {
            int w = ByteString.m84394w(i, i2, size());
            if (w == 0) {
                return ByteString.f47470d;
            }
            return new BoundedByteString(this.bytes, mo53769f1() + i, w);
        }

        /* renamed from: R0 */
        public final String mo53740R0(Charset charset) {
            return new String(this.bytes, mo53769f1(), size(), charset);
        }

        /* renamed from: X0 */
        public final void mo53742X0(C18864t tVar) throws IOException {
            tVar.mo53823X(this.bytes, mo53769f1(), size());
        }

        /* renamed from: Y0 */
        public final void mo53743Y0(OutputStream outputStream) throws IOException {
            outputStream.write(mo53737M0());
        }

        /* renamed from: c1 */
        public final void mo53745c1(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, mo53769f1() + i, i2);
        }

        /* renamed from: e1 */
        public final boolean mo53771e1(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.mo53736L0(i, i3).equals(mo53736L0(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int f1 = mo53769f1() + i2;
                    int f12 = mo53769f1();
                    int f13 = literalByteString.mo53769f1() + i;
                    while (f12 < f1) {
                        if (bArr[f12] != bArr2[f13]) {
                            return false;
                        }
                        f12++;
                        f13++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int C0 = mo53733C0();
            int C02 = literalByteString.mo53733C0();
            if (C0 == 0 || C02 == 0 || C0 == C02) {
                return mo53771e1(literalByteString, 0, size());
            }
            return false;
        }

        /* renamed from: f0 */
        public final void mo53748f0(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, mo53769f1(), size());
        }

        /* renamed from: f1 */
        public int mo53769f1() {
            return 0;
        }

        /* renamed from: h */
        public final ByteBuffer mo53749h() {
            return ByteBuffer.wrap(this.bytes, mo53769f1(), size()).asReadOnlyBuffer();
        }

        /* renamed from: i */
        public final List<ByteBuffer> mo53751i() {
            return Collections.singletonList(mo53749h());
        }

        /* renamed from: m0 */
        public void mo53756m0(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        /* renamed from: p0 */
        public byte mo53759p0(int i) {
            return this.bytes[i];
        }

        /* renamed from: q */
        public byte mo53760q(int i) {
            return this.bytes[i];
        }

        /* renamed from: s0 */
        public final boolean mo53762s0() {
            int f1 = mo53769f1();
            return Utf8.m85210u(this.bytes, f1, size() + f1);
        }

        public int size() {
            return this.bytes.length;
        }

        /* renamed from: v0 */
        public final C18889w mo53766v0() {
            return C18889w.m87630r(this.bytes, mo53769f1(), size(), true);
        }

        /* renamed from: w0 */
        public final InputStream mo53767w0() {
            return new ByteArrayInputStream(this.bytes, mo53769f1(), size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$a */
    public class C18609a extends C18611c {

        /* renamed from: a */
        public int f47474a = 0;

        /* renamed from: b */
        public final int f47475b;

        public C18609a() {
            this.f47475b = ByteString.this.size();
        }

        public boolean hasNext() {
            return this.f47474a < this.f47475b;
        }

        public byte nextByte() {
            int i = this.f47474a;
            if (i < this.f47475b) {
                this.f47474a = i + 1;
                return ByteString.this.mo53759p0(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$b */
    public static class C18610b implements Comparator<ByteString> {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            C18614f t0 = byteString.iterator();
            C18614f t02 = byteString2.iterator();
            while (t0.hasNext() && t02.hasNext()) {
                int compare = Integer.compare(ByteString.m84380N0(t0.nextByte()), ByteString.m84380N0(t02.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$c */
    public static abstract class C18611c implements C18614f {
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$d */
    public static final class C18612d implements C18613e {
        public C18612d() {
        }

        /* renamed from: a */
        public byte[] mo53779a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C18612d(C18609a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$e */
    public interface C18613e {
        /* renamed from: a */
        byte[] mo53779a(byte[] bArr, int i, int i2);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$f */
    public interface C18614f extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$g */
    public static final class C18615g {

        /* renamed from: a */
        public final CodedOutputStream f47477a;

        /* renamed from: b */
        public final byte[] f47478b;

        public /* synthetic */ C18615g(int i, C18609a aVar) {
            this(i);
        }

        /* renamed from: a */
        public ByteString mo53780a() {
            this.f47477a.mo53826Z();
            return new LiteralByteString(this.f47478b);
        }

        /* renamed from: b */
        public CodedOutputStream mo53781b() {
            return this.f47477a;
        }

        public C18615g(int i) {
            byte[] bArr = new byte[i];
            this.f47478b = bArr;
            this.f47477a = CodedOutputStream.m84519n1(bArr);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$i */
    public static final class C18617i implements C18613e {
        public C18617i() {
        }

        /* renamed from: a */
        public byte[] mo53779a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C18617i(C18609a aVar) {
            this();
        }
    }

    static {
        C18613e eVar;
        if (C18712e.m85800c()) {
            eVar = new C18617i((C18609a) null);
        } else {
            eVar = new C18612d((C18609a) null);
        }
        f47471e = eVar;
    }

    /* renamed from: A */
    public static ByteString m84373A(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return f47470d;
        }
        return m84391k(iterable.iterator(), i);
    }

    /* renamed from: F0 */
    public static ByteString m84374F0(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return m84388Y(bArr, 0, i2);
    }

    /* renamed from: G0 */
    public static ByteString m84375G0(InputStream inputStream) throws IOException {
        return m84378I0(inputStream, 256, 8192);
    }

    /* renamed from: H */
    public static ByteString m84376H(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    /* renamed from: H0 */
    public static ByteString m84377H0(InputStream inputStream, int i) throws IOException {
        return m84378I0(inputStream, i, i);
    }

    /* renamed from: I0 */
    public static ByteString m84378I0(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString F0 = m84374F0(inputStream, i);
            if (F0 == null) {
                return m84373A(arrayList);
            }
            arrayList.add(F0);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: M */
    public static ByteString m84379M(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    /* renamed from: N0 */
    public static int m84380N0(byte b) {
        return b & 255;
    }

    /* renamed from: Q */
    public static ByteString m84381Q(ByteBuffer byteBuffer) {
        return m84385W(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: T0 */
    public static Comparator<ByteString> m84382T0() {
        return f47473g;
    }

    /* renamed from: U0 */
    public static ByteString m84383U0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return m84386W0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: V0 */
    public static ByteString m84384V0(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    /* renamed from: W */
    public static ByteString m84385W(ByteBuffer byteBuffer, int i) {
        m84394w(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    /* renamed from: W0 */
    public static ByteString m84386W0(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    /* renamed from: X */
    public static ByteString m84387X(byte[] bArr) {
        return m84388Y(bArr, 0, bArr.length);
    }

    /* renamed from: Y */
    public static ByteString m84388Y(byte[] bArr, int i, int i2) {
        m84394w(i, i + i2, bArr.length);
        return new LiteralByteString(f47471e.mo53779a(bArr, i, i2));
    }

    /* renamed from: e0 */
    public static ByteString m84390e0(String str) {
        return new LiteralByteString(str.getBytes(C18753i1.f47860a));
    }

    /* renamed from: k */
    public static ByteString m84391k(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m84391k(it, i2).mo53768y(m84391k(it, i - i2));
        }
    }

    /* renamed from: r */
    public static void m84392r(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: u0 */
    public static C18615g m84393u0(int i) {
        return new C18615g(i, (C18609a) null);
    }

    /* renamed from: w */
    public static int m84394w(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: y0 */
    public static C18616h m84395y0() {
        return new C18616h(128);
    }

    /* renamed from: z0 */
    public static C18616h m84396z0(int i) {
        return new C18616h(i);
    }

    /* renamed from: A0 */
    public abstract int mo53731A0(int i, int i2, int i3);

    /* renamed from: B0 */
    public abstract int mo53732B0(int i, int i2, int i3);

    /* renamed from: C0 */
    public final int mo53733C0() {
        return this.hash;
    }

    /* renamed from: J0 */
    public final boolean mo53734J0(ByteString byteString) {
        return size() >= byteString.size() && mo53736L0(0, byteString.size()).equals(byteString);
    }

    /* renamed from: K0 */
    public final ByteString mo53735K0(int i) {
        return mo53736L0(i, size());
    }

    /* renamed from: L0 */
    public abstract ByteString mo53736L0(int i, int i2);

    /* renamed from: M0 */
    public final byte[] mo53737M0() {
        int size = size();
        if (size == 0) {
            return C18753i1.f47863d;
        }
        byte[] bArr = new byte[size];
        mo53756m0(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: O0 */
    public final String mo53738O0(String str) throws UnsupportedEncodingException {
        try {
            return mo53739P0(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* renamed from: P0 */
    public final String mo53739P0(Charset charset) {
        return size() == 0 ? "" : mo53740R0(charset);
    }

    /* renamed from: R0 */
    public abstract String mo53740R0(Charset charset);

    /* renamed from: S0 */
    public final String mo53741S0() {
        return mo53739P0(C18753i1.f47860a);
    }

    /* renamed from: X0 */
    public abstract void mo53742X0(C18864t tVar) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo53743Y0(OutputStream outputStream) throws IOException;

    /* renamed from: b1 */
    public final void mo53744b1(OutputStream outputStream, int i, int i2) throws IOException {
        m84394w(i, i + i2, size());
        if (i2 > 0) {
            mo53745c1(outputStream, i, i2);
        }
    }

    /* renamed from: c1 */
    public abstract void mo53745c1(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: d1 */
    public abstract void mo53746d1(C18864t tVar) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f0 */
    public abstract void mo53748f0(ByteBuffer byteBuffer);

    /* renamed from: h */
    public abstract ByteBuffer mo53749h();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = mo53731A0(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract List<ByteBuffer> mo53751i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k0 */
    public void mo53754k0(byte[] bArr, int i) {
        mo53755l0(bArr, 0, i, size());
    }

    @Deprecated
    /* renamed from: l0 */
    public final void mo53755l0(byte[] bArr, int i, int i2, int i3) {
        m84394w(i, i + i3, size());
        m84394w(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo53756m0(bArr, i, i2, i3);
        }
    }

    /* renamed from: m0 */
    public abstract void mo53756m0(byte[] bArr, int i, int i2, int i3);

    /* renamed from: n0 */
    public final boolean mo53757n0(ByteString byteString) {
        return size() >= byteString.size() && mo53735K0(size() - byteString.size()).equals(byteString);
    }

    /* renamed from: o0 */
    public abstract int mo53758o0();

    /* renamed from: p0 */
    public abstract byte mo53759p0(int i);

    /* renamed from: q */
    public abstract byte mo53760q(int i);

    /* renamed from: r0 */
    public abstract boolean mo53761r0();

    /* renamed from: s0 */
    public abstract boolean mo53762s0();

    public abstract int size();

    /* renamed from: t0 */
    public C18614f iterator() {
        return new C18609a();
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: v0 */
    public abstract C18889w mo53766v0();

    /* renamed from: w0 */
    public abstract InputStream mo53767w0();

    /* renamed from: y */
    public final ByteString mo53768y(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.m85144h1(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + C31132a.f74628J0 + byteString.size());
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$h */
    public static final class C18616h extends OutputStream {

        /* renamed from: f */
        public static final byte[] f47479f = new byte[0];

        /* renamed from: a */
        public final int f47480a;

        /* renamed from: b */
        public final ArrayList<ByteString> f47481b;

        /* renamed from: c */
        public int f47482c;

        /* renamed from: d */
        public byte[] f47483d;

        /* renamed from: e */
        public int f47484e;

        public C18616h(int i) {
            if (i >= 0) {
                this.f47480a = i;
                this.f47481b = new ArrayList<>();
                this.f47483d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final byte[] mo53782a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: b */
        public final void mo53783b(int i) {
            this.f47481b.add(new LiteralByteString(this.f47483d));
            int length = this.f47482c + this.f47483d.length;
            this.f47482c = length;
            this.f47483d = new byte[Math.max(this.f47480a, Math.max(i, length >>> 1))];
            this.f47484e = 0;
        }

        /* renamed from: c */
        public final void mo53784c() {
            int i = this.f47484e;
            byte[] bArr = this.f47483d;
            if (i >= bArr.length) {
                this.f47481b.add(new LiteralByteString(this.f47483d));
                this.f47483d = f47479f;
            } else if (i > 0) {
                this.f47481b.add(new LiteralByteString(mo53782a(bArr, i)));
            }
            this.f47482c += this.f47484e;
            this.f47484e = 0;
        }

        /* renamed from: d */
        public synchronized void mo53785d() {
            this.f47481b.clear();
            this.f47482c = 0;
            this.f47484e = 0;
        }

        /* renamed from: f */
        public synchronized int mo53786f() {
            return this.f47482c + this.f47484e;
        }

        /* renamed from: g */
        public synchronized ByteString mo53787g() {
            mo53784c();
            return ByteString.m84373A(this.f47481b);
        }

        /* renamed from: i */
        public void mo53788i(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.f47481b;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f47483d;
                i = this.f47484e;
            }
            for (ByteString Y0 : byteStringArr) {
                Y0.mo53743Y0(outputStream);
            }
            outputStream.write(mo53782a(bArr, i));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo53786f())});
        }

        public synchronized void write(int i) {
            if (this.f47484e == this.f47483d.length) {
                mo53783b(1);
            }
            byte[] bArr = this.f47483d;
            int i2 = this.f47484e;
            this.f47484e = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f47483d;
            int length = bArr2.length;
            int i3 = this.f47484e;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f47484e += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo53783b(i4);
                System.arraycopy(bArr, i + length2, this.f47483d, 0, i4);
                this.f47484e = i4;
            }
        }
    }
}
