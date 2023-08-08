package com.google.protobuf;

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
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final int f82782a = 128;

    /* renamed from: b */
    public static final int f82783b = 256;

    /* renamed from: c */
    public static final int f82784c = 8192;

    /* renamed from: d */
    public static final ByteString f82785d = new LiteralByteString(C34471v0.f83532d);

    /* renamed from: e */
    public static final C34158e f82786e;

    /* renamed from: f */
    public static final int f82787f = 255;

    /* renamed from: g */
    public static final Comparator<ByteString> f82788g = new C34155b();
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m137264w(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: h1 */
        public int mo99257h1() {
            return this.bytesOffset;
        }

        /* renamed from: m0 */
        public void mo99244m0(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, mo99257h1() + i, bArr, i2, i3);
        }

        /* renamed from: p0 */
        public byte mo99247p0(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        /* renamed from: q */
        public byte mo99248q(int i) {
            ByteString.m137262r(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.m137255W0(mo99224M0());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        /* renamed from: e1 */
        public void mo99234e1(C34437q qVar) throws IOException {
            mo99230Y0(qVar);
        }

        /* renamed from: f1 */
        public abstract boolean mo99259f1(ByteString byteString, int i, int i2);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }

        /* renamed from: o0 */
        public final int mo99246o0() {
            return 0;
        }

        /* renamed from: r0 */
        public final boolean mo99249r0() {
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
        public final int mo99218A0(int i, int i2, int i3) {
            return C34471v0.m140592w(i, this.bytes, mo99257h1() + i2, i3);
        }

        /* renamed from: B0 */
        public final int mo99219B0(int i, int i2, int i3) {
            int h1 = mo99257h1() + i2;
            return Utf8.m138645w(i, this.bytes, h1, i3 + h1);
        }

        /* renamed from: L0 */
        public final ByteString mo99223L0(int i, int i2) {
            int w = ByteString.m137264w(i, i2, size());
            if (w == 0) {
                return ByteString.f82785d;
            }
            return new BoundedByteString(this.bytes, mo99257h1() + i, w);
        }

        /* renamed from: R0 */
        public final String mo99227R0(Charset charset) {
            return new String(this.bytes, mo99257h1(), size(), charset);
        }

        /* renamed from: Y0 */
        public final void mo99230Y0(C34437q qVar) throws IOException {
            qVar.mo99314X(this.bytes, mo99257h1(), size());
        }

        /* renamed from: b1 */
        public final void mo99231b1(OutputStream outputStream) throws IOException {
            outputStream.write(mo99224M0());
        }

        /* renamed from: d1 */
        public final void mo99233d1(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, mo99257h1() + i, i2);
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
            int C0 = mo99220C0();
            int C02 = literalByteString.mo99220C0();
            if (C0 == 0 || C02 == 0 || C0 == C02) {
                return mo99259f1(literalByteString, 0, size());
            }
            return false;
        }

        /* renamed from: f0 */
        public final void mo99236f0(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, mo99257h1(), size());
        }

        /* renamed from: f1 */
        public final boolean mo99259f1(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.mo99223L0(i, i3).equals(mo99223L0(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int h1 = mo99257h1() + i2;
                    int h12 = mo99257h1();
                    int h13 = literalByteString.mo99257h1() + i;
                    while (h12 < h1) {
                        if (bArr[h12] != bArr2[h13]) {
                            return false;
                        }
                        h12++;
                        h13++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: h */
        public final ByteBuffer mo99237h() {
            return ByteBuffer.wrap(this.bytes, mo99257h1(), size()).asReadOnlyBuffer();
        }

        /* renamed from: h1 */
        public int mo99257h1() {
            return 0;
        }

        /* renamed from: i */
        public final List<ByteBuffer> mo99239i() {
            return Collections.singletonList(mo99237h());
        }

        /* renamed from: m0 */
        public void mo99244m0(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        /* renamed from: p0 */
        public byte mo99247p0(int i) {
            return this.bytes[i];
        }

        /* renamed from: q */
        public byte mo99248q(int i) {
            return this.bytes[i];
        }

        /* renamed from: s0 */
        public final boolean mo99250s0() {
            int h1 = mo99257h1();
            return Utf8.m138643u(this.bytes, h1, size() + h1);
        }

        public int size() {
            return this.bytes.length;
        }

        /* renamed from: v0 */
        public final C34448s mo99254v0() {
            return C34448s.m140156r(this.bytes, mo99257h1(), size(), true);
        }

        /* renamed from: w0 */
        public final InputStream mo99255w0() {
            return new ByteArrayInputStream(this.bytes, mo99257h1(), size());
        }
    }

    /* renamed from: com.google.protobuf.ByteString$a */
    public class C34154a extends C34156c {

        /* renamed from: a */
        public int f82789a = 0;

        /* renamed from: b */
        public final int f82790b;

        public C34154a() {
            this.f82790b = ByteString.this.size();
        }

        public boolean hasNext() {
            return this.f82789a < this.f82790b;
        }

        public byte nextByte() {
            int i = this.f82789a;
            if (i < this.f82790b) {
                this.f82789a = i + 1;
                return ByteString.this.mo99247p0(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$b */
    public static class C34155b implements Comparator<ByteString> {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            C34159f t0 = byteString.iterator();
            C34159f t02 = byteString2.iterator();
            while (t0.hasNext() && t02.hasNext()) {
                int compare = Integer.compare(ByteString.m137250N0(t0.nextByte()), ByteString.m137250N0(t02.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* renamed from: com.google.protobuf.ByteString$c */
    public static abstract class C34156c implements C34159f {
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$d */
    public static final class C34157d implements C34158e {
        public C34157d() {
        }

        /* renamed from: a */
        public byte[] mo99267a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C34157d(C34154a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$e */
    public interface C34158e {
        /* renamed from: a */
        byte[] mo99267a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.ByteString$f */
    public interface C34159f extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: com.google.protobuf.ByteString$g */
    public static final class C34160g {

        /* renamed from: a */
        public final CodedOutputStream f82792a;

        /* renamed from: b */
        public final byte[] f82793b;

        public /* synthetic */ C34160g(int i, C34154a aVar) {
            this(i);
        }

        /* renamed from: a */
        public ByteString mo99268a() {
            this.f82792a.mo99317Z();
            return new LiteralByteString(this.f82793b);
        }

        /* renamed from: b */
        public CodedOutputStream mo99269b() {
            return this.f82792a;
        }

        public C34160g(int i) {
            byte[] bArr = new byte[i];
            this.f82793b = bArr;
            this.f82792a = CodedOutputStream.m137393n1(bArr);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$i */
    public static final class C34162i implements C34158e {
        public C34162i() {
        }

        /* renamed from: a */
        public byte[] mo99267a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C34162i(C34154a aVar) {
            this();
        }
    }

    static {
        C34158e eVar;
        if (C34354e.m139158c()) {
            eVar = new C34162i((C34154a) null);
        } else {
            eVar = new C34157d((C34154a) null);
        }
        f82786e = eVar;
    }

    /* renamed from: A */
    public static ByteString m137243A(Iterable<ByteString> iterable) {
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
            return f82785d;
        }
        return m137261k(iterable.iterator(), i);
    }

    /* renamed from: F0 */
    public static ByteString m137244F0(InputStream inputStream, int i) throws IOException {
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
        return m137258Y(bArr, 0, i2);
    }

    /* renamed from: G0 */
    public static ByteString m137245G0(InputStream inputStream) throws IOException {
        return m137248I0(inputStream, 256, 8192);
    }

    /* renamed from: H */
    public static ByteString m137246H(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    /* renamed from: H0 */
    public static ByteString m137247H0(InputStream inputStream, int i) throws IOException {
        return m137248I0(inputStream, i, i);
    }

    /* renamed from: I0 */
    public static ByteString m137248I0(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString F0 = m137244F0(inputStream, i);
            if (F0 == null) {
                return m137243A(arrayList);
            }
            arrayList.add(F0);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: M */
    public static ByteString m137249M(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    /* renamed from: N0 */
    public static int m137250N0(byte b) {
        return b & 255;
    }

    /* renamed from: Q */
    public static ByteString m137251Q(ByteBuffer byteBuffer) {
        return m137254W(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: U0 */
    public static Comparator<ByteString> m137252U0() {
        return f82788g;
    }

    /* renamed from: V0 */
    public static ByteString m137253V0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return m137257X0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: W */
    public static ByteString m137254W(ByteBuffer byteBuffer, int i) {
        m137264w(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    /* renamed from: W0 */
    public static ByteString m137255W0(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    /* renamed from: X */
    public static ByteString m137256X(byte[] bArr) {
        return m137258Y(bArr, 0, bArr.length);
    }

    /* renamed from: X0 */
    public static ByteString m137257X0(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    /* renamed from: Y */
    public static ByteString m137258Y(byte[] bArr, int i, int i2) {
        m137264w(i, i + i2, bArr.length);
        return new LiteralByteString(f82786e.mo99267a(bArr, i, i2));
    }

    /* renamed from: e0 */
    public static ByteString m137260e0(String str) {
        return new LiteralByteString(str.getBytes(C34471v0.f83529a));
    }

    /* renamed from: k */
    public static ByteString m137261k(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m137261k(it, i2).mo99256y(m137261k(it, i - i2));
        }
    }

    /* renamed from: r */
    public static void m137262r(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: u0 */
    public static C34160g m137263u0(int i) {
        return new C34160g(i, (C34154a) null);
    }

    /* renamed from: w */
    public static int m137264w(int i, int i2, int i3) {
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
    public static C34161h m137265y0() {
        return new C34161h(128);
    }

    /* renamed from: z0 */
    public static C34161h m137266z0(int i) {
        return new C34161h(i);
    }

    /* renamed from: A0 */
    public abstract int mo99218A0(int i, int i2, int i3);

    /* renamed from: B0 */
    public abstract int mo99219B0(int i, int i2, int i3);

    /* renamed from: C0 */
    public final int mo99220C0() {
        return this.hash;
    }

    /* renamed from: J0 */
    public final boolean mo99221J0(ByteString byteString) {
        return size() >= byteString.size() && mo99223L0(0, byteString.size()).equals(byteString);
    }

    /* renamed from: K0 */
    public final ByteString mo99222K0(int i) {
        return mo99223L0(i, size());
    }

    /* renamed from: L0 */
    public abstract ByteString mo99223L0(int i, int i2);

    /* renamed from: M0 */
    public final byte[] mo99224M0() {
        int size = size();
        if (size == 0) {
            return C34471v0.f83532d;
        }
        byte[] bArr = new byte[size];
        mo99244m0(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: O0 */
    public final String mo99225O0(String str) throws UnsupportedEncodingException {
        try {
            return mo99226P0(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* renamed from: P0 */
    public final String mo99226P0(Charset charset) {
        return size() == 0 ? "" : mo99227R0(charset);
    }

    /* renamed from: R0 */
    public abstract String mo99227R0(Charset charset);

    /* renamed from: S0 */
    public final String mo99228S0() {
        return mo99226P0(C34471v0.f83529a);
    }

    /* renamed from: T0 */
    public final String mo99229T0() {
        if (size() <= 50) {
            return C34440q2.m140133a(this);
        }
        return C34440q2.m140133a(mo99223L0(0, 47)) + "...";
    }

    /* renamed from: Y0 */
    public abstract void mo99230Y0(C34437q qVar) throws IOException;

    /* renamed from: b1 */
    public abstract void mo99231b1(OutputStream outputStream) throws IOException;

    /* renamed from: c1 */
    public final void mo99232c1(OutputStream outputStream, int i, int i2) throws IOException {
        m137264w(i, i + i2, size());
        if (i2 > 0) {
            mo99233d1(outputStream, i, i2);
        }
    }

    /* renamed from: d1 */
    public abstract void mo99233d1(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: e1 */
    public abstract void mo99234e1(C34437q qVar) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f0 */
    public abstract void mo99236f0(ByteBuffer byteBuffer);

    /* renamed from: h */
    public abstract ByteBuffer mo99237h();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = mo99218A0(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract List<ByteBuffer> mo99239i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k0 */
    public void mo99242k0(byte[] bArr, int i) {
        mo99243l0(bArr, 0, i, size());
    }

    @Deprecated
    /* renamed from: l0 */
    public final void mo99243l0(byte[] bArr, int i, int i2, int i3) {
        m137264w(i, i + i3, size());
        m137264w(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo99244m0(bArr, i, i2, i3);
        }
    }

    /* renamed from: m0 */
    public abstract void mo99244m0(byte[] bArr, int i, int i2, int i3);

    /* renamed from: n0 */
    public final boolean mo99245n0(ByteString byteString) {
        return size() >= byteString.size() && mo99222K0(size() - byteString.size()).equals(byteString);
    }

    /* renamed from: o0 */
    public abstract int mo99246o0();

    /* renamed from: p0 */
    public abstract byte mo99247p0(int i);

    /* renamed from: q */
    public abstract byte mo99248q(int i);

    /* renamed from: r0 */
    public abstract boolean mo99249r0();

    /* renamed from: s0 */
    public abstract boolean mo99250s0();

    public abstract int size();

    /* renamed from: t0 */
    public C34159f iterator() {
        return new C34154a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), mo99229T0()});
    }

    /* renamed from: v0 */
    public abstract C34448s mo99254v0();

    /* renamed from: w0 */
    public abstract InputStream mo99255w0();

    /* renamed from: y */
    public final ByteString mo99256y(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.m138521i1(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + C31132a.f74628J0 + byteString.size());
    }

    /* renamed from: com.google.protobuf.ByteString$h */
    public static final class C34161h extends OutputStream {

        /* renamed from: f */
        public static final byte[] f82794f = new byte[0];

        /* renamed from: a */
        public final int f82795a;

        /* renamed from: b */
        public final ArrayList<ByteString> f82796b;

        /* renamed from: c */
        public int f82797c;

        /* renamed from: d */
        public byte[] f82798d;

        /* renamed from: e */
        public int f82799e;

        public C34161h(int i) {
            if (i >= 0) {
                this.f82795a = i;
                this.f82796b = new ArrayList<>();
                this.f82798d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final byte[] mo99270a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: b */
        public final void mo99271b(int i) {
            this.f82796b.add(new LiteralByteString(this.f82798d));
            int length = this.f82797c + this.f82798d.length;
            this.f82797c = length;
            this.f82798d = new byte[Math.max(this.f82795a, Math.max(i, length >>> 1))];
            this.f82799e = 0;
        }

        /* renamed from: c */
        public final void mo99272c() {
            int i = this.f82799e;
            byte[] bArr = this.f82798d;
            if (i >= bArr.length) {
                this.f82796b.add(new LiteralByteString(this.f82798d));
                this.f82798d = f82794f;
            } else if (i > 0) {
                this.f82796b.add(new LiteralByteString(mo99270a(bArr, i)));
            }
            this.f82797c += this.f82799e;
            this.f82799e = 0;
        }

        /* renamed from: d */
        public synchronized void mo99273d() {
            this.f82796b.clear();
            this.f82797c = 0;
            this.f82799e = 0;
        }

        /* renamed from: f */
        public synchronized int mo99274f() {
            return this.f82797c + this.f82799e;
        }

        /* renamed from: g */
        public synchronized ByteString mo99275g() {
            mo99272c();
            return ByteString.m137243A(this.f82796b);
        }

        /* renamed from: i */
        public void mo99276i(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.f82796b;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f82798d;
                i = this.f82799e;
            }
            for (ByteString b1 : byteStringArr) {
                b1.mo99231b1(outputStream);
            }
            outputStream.write(mo99270a(bArr, i));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo99274f())});
        }

        public synchronized void write(int i) {
            if (this.f82799e == this.f82798d.length) {
                mo99271b(1);
            }
            byte[] bArr = this.f82798d;
            int i2 = this.f82799e;
            this.f82799e = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f82798d;
            int length = bArr2.length;
            int i3 = this.f82799e;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f82799e += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo99271b(i4);
                System.arraycopy(bArr, i + length2, this.f82798d, 0, i4);
                this.f82799e = i4;
            }
        }
    }
}
