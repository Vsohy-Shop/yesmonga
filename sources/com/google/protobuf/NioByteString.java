package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class NioByteString extends ByteString.LeafByteString {
    /* access modifiers changed from: private */
    public final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        C34471v0.m140574e(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.m137251Q(this.buffer.slice());
    }

    /* renamed from: A0 */
    public int mo99218A0(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    /* renamed from: B0 */
    public int mo99219B0(int i, int i2, int i3) {
        return Utf8.m138644v(i, this.buffer, i2, i3 + i2);
    }

    /* renamed from: L0 */
    public ByteString mo99223L0(int i, int i2) {
        try {
            return new NioByteString(mo100601i1(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: R0 */
    public String mo99227R0(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.buffer.hasArray()) {
            bArr = this.buffer.array();
            i2 = this.buffer.arrayOffset() + this.buffer.position();
            i = this.buffer.remaining();
        } else {
            bArr = mo99224M0();
            i = bArr.length;
            i2 = 0;
        }
        return new String(bArr, i2, i, charset);
    }

    /* renamed from: Y0 */
    public void mo99230Y0(C34437q qVar) throws IOException {
        qVar.mo99312W(this.buffer.slice());
    }

    /* renamed from: b1 */
    public void mo99231b1(OutputStream outputStream) throws IOException {
        outputStream.write(mo99224M0());
    }

    /* renamed from: d1 */
    public void mo99233d1(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i2);
            return;
        }
        C34432p.m140086h(mo100601i1(i, i2 + i), outputStream);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        return this.buffer.equals(byteString.mo99237h());
    }

    /* renamed from: f0 */
    public void mo99236f0(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    /* renamed from: f1 */
    public boolean mo99259f1(ByteString byteString, int i, int i2) {
        return mo99223L0(0, i2).equals(byteString.mo99223L0(i, i2 + i));
    }

    /* renamed from: h */
    public ByteBuffer mo99237h() {
        return this.buffer.asReadOnlyBuffer();
    }

    /* renamed from: i */
    public List<ByteBuffer> mo99239i() {
        return Collections.singletonList(mo99237h());
    }

    /* renamed from: i1 */
    public final ByteBuffer mo100601i1(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    /* renamed from: m0 */
    public void mo99244m0(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    /* renamed from: p0 */
    public byte mo99247p0(int i) {
        return mo99248q(i);
    }

    /* renamed from: q */
    public byte mo99248q(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: s0 */
    public boolean mo99250s0() {
        return Utf8.m138641s(this.buffer);
    }

    public int size() {
        return this.buffer.remaining();
    }

    /* renamed from: v0 */
    public C34448s mo99254v0() {
        return C34448s.m140153o(this.buffer, true);
    }

    /* renamed from: w0 */
    public InputStream mo99255w0() {
        return new C34279a();
    }

    /* renamed from: com.google.protobuf.NioByteString$a */
    public class C34279a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f83082a;

        public C34279a() {
            this.f83082a = NioByteString.this.buffer.slice();
        }

        public int available() throws IOException {
            return this.f83082a.remaining();
        }

        public void mark(int i) {
            this.f83082a.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (!this.f83082a.hasRemaining()) {
                return -1;
            }
            return this.f83082a.get() & 255;
        }

        public void reset() throws IOException {
            try {
                this.f83082a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f83082a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f83082a.remaining());
            this.f83082a.get(bArr, i, min);
            return min;
        }
    }
}
