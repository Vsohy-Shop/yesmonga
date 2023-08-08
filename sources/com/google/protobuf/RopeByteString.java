package com.google.protobuf;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.contentsquare.android.api.C14092c;
import com.google.protobuf.ByteString;
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
    public static final int[] f83094v = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, C14092c.f34532K1, 233, 377, C16717v.C16722e.f42273z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: com.google.protobuf.RopeByteString$a */
    public class C34284a extends ByteString.C34156c {

        /* renamed from: a */
        public final C34286c f83095a;

        /* renamed from: b */
        public ByteString.C34159f f83096b = mo100622c();

        public C34284a() {
            this.f83095a = new C34286c(RopeByteString.this, (C34284a) null);
        }

        /* renamed from: c */
        public final ByteString.C34159f mo100622c() {
            if (this.f83095a.hasNext()) {
                return this.f83095a.next().iterator();
            }
            return null;
        }

        public boolean hasNext() {
            return this.f83096b != null;
        }

        public byte nextByte() {
            ByteString.C34159f fVar = this.f83096b;
            if (fVar != null) {
                byte nextByte = fVar.nextByte();
                if (!this.f83096b.hasNext()) {
                    this.f83096b = mo100622c();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.RopeByteString$c */
    public static final class C34286c implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a */
        public final ArrayDeque<RopeByteString> f83099a;

        /* renamed from: b */
        public ByteString.LeafByteString f83100b;

        public /* synthetic */ C34286c(ByteString byteString, C34284a aVar) {
            this(byteString);
        }

        /* renamed from: b */
        public final ByteString.LeafByteString mo100628b(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f83099a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: c */
        public final ByteString.LeafByteString mo100629c() {
            ByteString.LeafByteString b;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f83099a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                b = mo100628b(this.f83099a.pop().right);
            } while (b.isEmpty());
            return b;
        }

        /* renamed from: d */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f83100b;
            if (leafByteString != null) {
                this.f83100b = mo100629c();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f83100b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C34286c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.mo99246o0());
                this.f83099a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f83100b = mo100628b(ropeByteString.left);
                return;
            }
            this.f83099a = null;
            this.f83100b = (ByteString.LeafByteString) byteString;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C34284a aVar) {
        this(byteString, byteString2);
    }

    /* renamed from: i1 */
    public static ByteString m138521i1(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m138522j1(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, m138522j1(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.mo99246o0() > ropeByteString.right.mo99246o0() && ropeByteString.mo99246o0() > byteString2.mo99246o0()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= m138523m1(Math.max(byteString.mo99246o0(), byteString2.mo99246o0()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        return new C34285b((C34284a) null).mo100624b(byteString, byteString2);
    }

    /* renamed from: j1 */
    public static ByteString m138522j1(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.mo99243l0(bArr, 0, 0, size);
        byteString2.mo99243l0(bArr, 0, size, size2);
        return ByteString.m137255W0(bArr);
    }

    /* renamed from: m1 */
    public static int m138523m1(int i) {
        int[] iArr = f83094v;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: n1 */
    public static RopeByteString m138524n1(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: A0 */
    public int mo99218A0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo99218A0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo99218A0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo99218A0(this.left.mo99218A0(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: B0 */
    public int mo99219B0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo99219B0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo99219B0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo99219B0(this.left.mo99219B0(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: L0 */
    public ByteString mo99223L0(int i, int i2) {
        int w = ByteString.m137264w(i, i2, this.totalLength);
        if (w == 0) {
            return ByteString.f82785d;
        }
        if (w == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.mo99223L0(i, i2);
        }
        if (i >= i3) {
            return this.right.mo99223L0(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.mo99222K0(i), this.right.mo99223L0(0, i2 - this.leftLength));
    }

    /* renamed from: R0 */
    public String mo99227R0(Charset charset) {
        return new String(mo99224M0(), charset);
    }

    /* renamed from: Y0 */
    public void mo99230Y0(C34437q qVar) throws IOException {
        this.left.mo99230Y0(qVar);
        this.right.mo99230Y0(qVar);
    }

    /* renamed from: b1 */
    public void mo99231b1(OutputStream outputStream) throws IOException {
        this.left.mo99231b1(outputStream);
        this.right.mo99231b1(outputStream);
    }

    /* renamed from: d1 */
    public void mo99233d1(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.mo99233d1(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.mo99233d1(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.mo99233d1(outputStream, i, i5);
            this.right.mo99233d1(outputStream, 0, i2 - i5);
        }
    }

    /* renamed from: e1 */
    public void mo99234e1(C34437q qVar) throws IOException {
        this.right.mo99234e1(qVar);
        this.left.mo99234e1(qVar);
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
        int C0 = mo99220C0();
        int C02 = byteString.mo99220C0();
        if (C0 == 0 || C02 == 0 || C0 == C02) {
            return mo100620k1(byteString);
        }
        return false;
    }

    /* renamed from: f0 */
    public void mo99236f0(ByteBuffer byteBuffer) {
        this.left.mo99236f0(byteBuffer);
        this.right.mo99236f0(byteBuffer);
    }

    /* renamed from: h */
    public ByteBuffer mo99237h() {
        return ByteBuffer.wrap(mo99224M0()).asReadOnlyBuffer();
    }

    /* renamed from: i */
    public List<ByteBuffer> mo99239i() {
        ArrayList arrayList = new ArrayList();
        C34286c cVar = new C34286c(this, (C34284a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo99237h());
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public final boolean mo100620k1(ByteString byteString) {
        boolean z;
        C34286c cVar = new C34286c(this, (C34284a) null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) cVar.next();
        C34286c cVar2 = new C34286c(byteString, (C34284a) null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = leafByteString.mo99259f1(leafByteString2, i2, min);
            } else {
                z = leafByteString2.mo99259f1(leafByteString, i, min);
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
    public void mo99244m0(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.mo99244m0(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.mo99244m0(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.mo99244m0(bArr, i, i2, i6);
            this.right.mo99244m0(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* renamed from: o0 */
    public int mo99246o0() {
        return this.treeDepth;
    }

    /* renamed from: p0 */
    public byte mo99247p0(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.mo99247p0(i);
        }
        return this.right.mo99247p0(i - i2);
    }

    /* renamed from: q */
    public byte mo99248q(int i) {
        ByteString.m137262r(i, this.totalLength);
        return mo99247p0(i);
    }

    /* renamed from: r0 */
    public boolean mo99249r0() {
        return this.totalLength >= m138523m1(this.treeDepth);
    }

    /* renamed from: s0 */
    public boolean mo99250s0() {
        int B0 = this.left.mo99219B0(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.mo99219B0(B0, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.totalLength;
    }

    /* renamed from: t0 */
    public ByteString.C34159f iterator() {
        return new C34284a();
    }

    /* renamed from: v0 */
    public C34448s mo99254v0() {
        return C34448s.m140151m(mo99239i(), true);
    }

    /* renamed from: w0 */
    public InputStream mo99255w0() {
        return new C34287d();
    }

    public Object writeReplace() {
        return ByteString.m137255W0(mo99224M0());
    }

    /* renamed from: com.google.protobuf.RopeByteString$b */
    public static class C34285b {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f83098a;

        public C34285b() {
            this.f83098a = new ArrayDeque<>();
        }

        /* renamed from: b */
        public final ByteString mo100624b(ByteString byteString, ByteString byteString2) {
            mo100625c(byteString);
            mo100625c(byteString2);
            ByteString pop = this.f83098a.pop();
            while (!this.f83098a.isEmpty()) {
                pop = new RopeByteString(this.f83098a.pop(), pop, (C34284a) null);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo100625c(ByteString byteString) {
            if (byteString.mo99249r0()) {
                mo100627e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                mo100625c(ropeByteString.left);
                mo100625c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int mo100626d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.f83094v, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        public final void mo100627e(ByteString byteString) {
            int d = mo100626d(byteString.size());
            int m1 = RopeByteString.m138523m1(d + 1);
            if (this.f83098a.isEmpty() || this.f83098a.peek().size() >= m1) {
                this.f83098a.push(byteString);
                return;
            }
            int m12 = RopeByteString.m138523m1(d);
            ByteString pop = this.f83098a.pop();
            while (!this.f83098a.isEmpty() && this.f83098a.peek().size() < m12) {
                pop = new RopeByteString(this.f83098a.pop(), pop, (C34284a) null);
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString, (C34284a) null);
            while (!this.f83098a.isEmpty() && this.f83098a.peek().size() < RopeByteString.m138523m1(mo100626d(ropeByteString.size()) + 1)) {
                ropeByteString = new RopeByteString(this.f83098a.pop(), ropeByteString, (C34284a) null);
            }
            this.f83098a.push(ropeByteString);
        }

        public /* synthetic */ C34285b(C34284a aVar) {
            this();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.mo99246o0(), byteString2.mo99246o0()) + 1;
    }

    /* renamed from: com.google.protobuf.RopeByteString$d */
    public class C34287d extends InputStream {

        /* renamed from: a */
        public C34286c f83101a;

        /* renamed from: b */
        public ByteString.LeafByteString f83102b;

        /* renamed from: c */
        public int f83103c;

        /* renamed from: d */
        public int f83104d;

        /* renamed from: e */
        public int f83105e;

        /* renamed from: f */
        public int f83106f;

        public C34287d() {
            mo100637c();
        }

        /* renamed from: a */
        public final void mo100634a() {
            int i;
            if (this.f83102b != null && this.f83104d == (i = this.f83103c)) {
                this.f83105e += i;
                this.f83104d = 0;
                if (this.f83101a.hasNext()) {
                    ByteString.LeafByteString d = this.f83101a.next();
                    this.f83102b = d;
                    this.f83103c = d.size();
                    return;
                }
                this.f83102b = null;
                this.f83103c = 0;
            }
        }

        public int available() throws IOException {
            return mo100636b();
        }

        /* renamed from: b */
        public final int mo100636b() {
            return RopeByteString.this.size() - (this.f83105e + this.f83104d);
        }

        /* renamed from: c */
        public final void mo100637c() {
            C34286c cVar = new C34286c(RopeByteString.this, (C34284a) null);
            this.f83101a = cVar;
            ByteString.LeafByteString d = cVar.next();
            this.f83102b = d;
            this.f83103c = d.size();
            this.f83104d = 0;
            this.f83105e = 0;
        }

        /* renamed from: d */
        public final int mo100638d(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                mo100634a();
                if (this.f83102b == null) {
                    break;
                }
                int min = Math.min(this.f83103c - this.f83104d, i3);
                if (bArr != null) {
                    this.f83102b.mo99243l0(bArr, this.f83104d, i, min);
                    i += min;
                }
                this.f83104d += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f83106f = this.f83105e + this.f83104d;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int d = mo100638d(bArr, i, i2);
            if (d != 0) {
                return d;
            }
            if (i2 > 0 || mo100636b() == 0) {
                return -1;
            }
            return d;
        }

        public synchronized void reset() {
            mo100637c();
            mo100638d((byte[]) null, 0, this.f83106f);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo100638d((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            mo100634a();
            ByteString.LeafByteString leafByteString = this.f83102b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f83104d;
            this.f83104d = i + 1;
            return leafByteString.mo99248q(i) & 255;
        }
    }
}
