package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.datastore.preferences.protobuf.ByteString;
import com.contentsquare.android.api.C14092c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;

    /* renamed from: v */
    public static final int[] f47680v = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, C14092c.f34532K1, 233, 377, C16717v.C16722e.f42273z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$a */
    public class C18645a extends ByteString.C18611c {

        /* renamed from: a */
        public final C18647c f47681a;

        /* renamed from: b */
        public ByteString.C18614f f47682b = mo54112c();

        public C18645a() {
            this.f47681a = new C18647c(RopeByteString.this, (C18645a) null);
        }

        /* renamed from: c */
        public final ByteString.C18614f mo54112c() {
            if (this.f47681a.hasNext()) {
                return this.f47681a.next().iterator();
            }
            return null;
        }

        public boolean hasNext() {
            return this.f47682b != null;
        }

        public byte nextByte() {
            ByteString.C18614f fVar = this.f47682b;
            if (fVar != null) {
                byte nextByte = fVar.nextByte();
                if (!this.f47682b.hasNext()) {
                    this.f47682b = mo54112c();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$c */
    public static final class C18647c implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a */
        public final ArrayDeque<RopeByteString> f47685a;

        /* renamed from: b */
        public ByteString.LeafByteString f47686b;

        public /* synthetic */ C18647c(ByteString byteString, C18645a aVar) {
            this(byteString);
        }

        /* renamed from: b */
        public final ByteString.LeafByteString mo54118b(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f47685a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: c */
        public final ByteString.LeafByteString mo54119c() {
            ByteString.LeafByteString b;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f47685a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                b = mo54118b(this.f47685a.pop().right);
            } while (b.isEmpty());
            return b;
        }

        /* renamed from: d */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f47686b;
            if (leafByteString != null) {
                this.f47686b = mo54119c();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f47686b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C18647c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.mo53758o0());
                this.f47685a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f47686b = mo54118b(ropeByteString.left);
                return;
            }
            this.f47685a = null;
            this.f47686b = (ByteString.LeafByteString) byteString;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C18645a aVar) {
        this(byteString, byteString2);
    }

    /* renamed from: h1 */
    public static ByteString m85144h1(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m85145i1(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, m85145i1(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.mo53758o0() > ropeByteString.right.mo53758o0() && ropeByteString.mo53758o0() > byteString2.mo53758o0()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= f47680v[Math.max(byteString.mo53758o0(), byteString2.mo53758o0()) + 1]) {
            return new RopeByteString(byteString, byteString2);
        }
        return new C18646b((C18645a) null).mo54114b(byteString, byteString2);
    }

    /* renamed from: i1 */
    public static ByteString m85145i1(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.mo53755l0(bArr, 0, 0, size);
        byteString2.mo53755l0(bArr, 0, size, size2);
        return ByteString.m84384V0(bArr);
    }

    /* renamed from: k1 */
    public static RopeByteString m85146k1(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: A0 */
    public int mo53731A0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo53731A0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo53731A0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo53731A0(this.left.mo53731A0(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: B0 */
    public int mo53732B0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo53732B0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo53732B0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo53732B0(this.left.mo53732B0(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: L0 */
    public ByteString mo53736L0(int i, int i2) {
        int w = ByteString.m84394w(i, i2, this.totalLength);
        if (w == 0) {
            return ByteString.f47470d;
        }
        if (w == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.mo53736L0(i, i2);
        }
        if (i >= i3) {
            return this.right.mo53736L0(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.mo53735K0(i), this.right.mo53736L0(0, i2 - this.leftLength));
    }

    /* renamed from: R0 */
    public String mo53740R0(Charset charset) {
        return new String(mo53737M0(), charset);
    }

    /* renamed from: X0 */
    public void mo53742X0(C18864t tVar) throws IOException {
        this.left.mo53742X0(tVar);
        this.right.mo53742X0(tVar);
    }

    /* renamed from: Y0 */
    public void mo53743Y0(OutputStream outputStream) throws IOException {
        this.left.mo53743Y0(outputStream);
        this.right.mo53743Y0(outputStream);
    }

    /* renamed from: c1 */
    public void mo53745c1(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.mo53745c1(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.mo53745c1(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.mo53745c1(outputStream, i, i5);
            this.right.mo53745c1(outputStream, 0, i2 - i5);
        }
    }

    /* renamed from: d1 */
    public void mo53746d1(C18864t tVar) throws IOException {
        this.right.mo53746d1(tVar);
        this.left.mo53746d1(tVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int C0 = mo53733C0();
        int C02 = byteString.mo53733C0();
        if (C0 == 0 || C02 == 0 || C0 == C02) {
            return mo54110j1(byteString);
        }
        return false;
    }

    /* renamed from: f0 */
    public void mo53748f0(ByteBuffer byteBuffer) {
        this.left.mo53748f0(byteBuffer);
        this.right.mo53748f0(byteBuffer);
    }

    /* renamed from: h */
    public ByteBuffer mo53749h() {
        return ByteBuffer.wrap(mo53737M0()).asReadOnlyBuffer();
    }

    /* renamed from: i */
    public List<ByteBuffer> mo53751i() {
        ArrayList arrayList = new ArrayList();
        C18647c cVar = new C18647c(this, (C18645a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo53749h());
        }
        return arrayList;
    }

    /* renamed from: j1 */
    public final boolean mo54110j1(ByteString byteString) {
        boolean z;
        C18647c cVar = new C18647c(this, (C18645a) null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) cVar.next();
        C18647c cVar2 = new C18647c(byteString, (C18645a) null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = leafByteString.mo53771e1(leafByteString2, i2, min);
            } else {
                z = leafByteString2.mo53771e1(leafByteString, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    leafByteString = (ByteString.LeafByteString) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    leafByteString2 = (ByteString.LeafByteString) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: m0 */
    public void mo53756m0(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.mo53756m0(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.mo53756m0(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.mo53756m0(bArr, i, i2, i6);
            this.right.mo53756m0(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* renamed from: o0 */
    public int mo53758o0() {
        return this.treeDepth;
    }

    /* renamed from: p0 */
    public byte mo53759p0(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.mo53759p0(i);
        }
        return this.right.mo53759p0(i - i2);
    }

    /* renamed from: q */
    public byte mo53760q(int i) {
        ByteString.m84392r(i, this.totalLength);
        return mo53759p0(i);
    }

    /* renamed from: r0 */
    public boolean mo53761r0() {
        return this.totalLength >= f47680v[this.treeDepth];
    }

    /* renamed from: s0 */
    public boolean mo53762s0() {
        int B0 = this.left.mo53732B0(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.mo53732B0(B0, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.totalLength;
    }

    /* renamed from: t0 */
    public ByteString.C18614f iterator() {
        return new C18645a();
    }

    /* renamed from: v0 */
    public C18889w mo53766v0() {
        return C18889w.m87622j(new C18648d());
    }

    /* renamed from: w0 */
    public InputStream mo53767w0() {
        return new C18648d();
    }

    public Object writeReplace() {
        return ByteString.m84384V0(mo53737M0());
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$b */
    public static class C18646b {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f47684a;

        public C18646b() {
            this.f47684a = new ArrayDeque<>();
        }

        /* renamed from: b */
        public final ByteString mo54114b(ByteString byteString, ByteString byteString2) {
            mo54115c(byteString);
            mo54115c(byteString2);
            ByteString pop = this.f47684a.pop();
            while (!this.f47684a.isEmpty()) {
                pop = new RopeByteString(this.f47684a.pop(), pop, (C18645a) null);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo54115c(ByteString byteString) {
            if (byteString.mo53761r0()) {
                mo54117e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                mo54115c(ropeByteString.left);
                mo54115c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int mo54116d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.f47680v, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        public final void mo54117e(ByteString byteString) {
            int d = mo54116d(byteString.size());
            int[] iArr = RopeByteString.f47680v;
            int i = iArr[d + 1];
            if (this.f47684a.isEmpty() || this.f47684a.peek().size() >= i) {
                this.f47684a.push(byteString);
                return;
            }
            int i2 = iArr[d];
            ByteString pop = this.f47684a.pop();
            while (!this.f47684a.isEmpty() && this.f47684a.peek().size() < i2) {
                pop = new RopeByteString(this.f47684a.pop(), pop, (C18645a) null);
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString, (C18645a) null);
            while (!this.f47684a.isEmpty()) {
                if (this.f47684a.peek().size() >= RopeByteString.f47680v[mo54116d(ropeByteString.size()) + 1]) {
                    break;
                }
                ropeByteString = new RopeByteString(this.f47684a.pop(), ropeByteString, (C18645a) null);
            }
            this.f47684a.push(ropeByteString);
        }

        public /* synthetic */ C18646b(C18645a aVar) {
            this();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.mo53758o0(), byteString2.mo53758o0()) + 1;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$d */
    public class C18648d extends InputStream {

        /* renamed from: a */
        public C18647c f47687a;

        /* renamed from: b */
        public ByteString.LeafByteString f47688b;

        /* renamed from: c */
        public int f47689c;

        /* renamed from: d */
        public int f47690d;

        /* renamed from: e */
        public int f47691e;

        /* renamed from: f */
        public int f47692f;

        public C18648d() {
            mo54126b();
        }

        /* renamed from: a */
        public final void mo54124a() {
            int i;
            if (this.f47688b != null && this.f47690d == (i = this.f47689c)) {
                this.f47691e += i;
                this.f47690d = 0;
                if (this.f47687a.hasNext()) {
                    ByteString.LeafByteString d = this.f47687a.next();
                    this.f47688b = d;
                    this.f47689c = d.size();
                    return;
                }
                this.f47688b = null;
                this.f47689c = 0;
            }
        }

        public int available() throws IOException {
            return RopeByteString.this.size() - (this.f47691e + this.f47690d);
        }

        /* renamed from: b */
        public final void mo54126b() {
            C18647c cVar = new C18647c(RopeByteString.this, (C18645a) null);
            this.f47687a = cVar;
            ByteString.LeafByteString d = cVar.next();
            this.f47688b = d;
            this.f47689c = d.size();
            this.f47690d = 0;
            this.f47691e = 0;
        }

        /* renamed from: c */
        public final int mo54127c(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                mo54124a();
                if (this.f47688b != null) {
                    int min = Math.min(this.f47689c - this.f47690d, i3);
                    if (bArr != null) {
                        this.f47688b.mo53755l0(bArr, this.f47690d, i, min);
                        i += min;
                    }
                    this.f47690d += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f47692f = this.f47691e + this.f47690d;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return mo54127c(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        public synchronized void reset() {
            mo54126b();
            mo54127c((byte[]) null, 0, this.f47692f);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo54127c((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            mo54124a();
            ByteString.LeafByteString leafByteString = this.f47688b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f47690d;
            this.f47690d = i + 1;
            return leafByteString.mo53760q(i) & 255;
        }
    }
}
