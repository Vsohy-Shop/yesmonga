package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
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
        C18753i1.m86341e(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.m84381Q(this.buffer.slice());
    }

    /* renamed from: A0 */
    public int mo53731A0(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    /* renamed from: B0 */
    public int mo53732B0(int i, int i2, int i3) {
        return Utf8.m85211v(i, this.buffer, i2, i3 + i2);
    }

    /* renamed from: L0 */
    public ByteString mo53736L0(int i, int i2) {
        try {
            return new NioByteString(mo54102h1(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: R0 */
    public String mo53740R0(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.buffer.hasArray()) {
            bArr = this.buffer.array();
            i2 = this.buffer.arrayOffset() + this.buffer.position();
            i = this.buffer.remaining();
        } else {
            bArr = mo53737M0();
            i = bArr.length;
            i2 = 0;
        }
        return new String(bArr, i2, i, charset);
    }

    /* renamed from: X0 */
    public void mo53742X0(C18864t tVar) throws IOException {
        tVar.mo53821W(this.buffer.slice());
    }

    /* renamed from: Y0 */
    public void mo53743Y0(OutputStream outputStream) throws IOException {
        outputStream.write(mo53737M0());
    }

    /* renamed from: c1 */
    public void mo53745c1(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i2);
            return;
        }
        C18857s.m87404h(mo54102h1(i, i2 + i), outputStream);
    }

    /* renamed from: e1 */
    public boolean mo53771e1(ByteString byteString, int i, int i2) {
        return mo53736L0(0, i2).equals(byteString.mo53736L0(i, i2 + i));
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
        return this.buffer.equals(byteString.mo53749h());
    }

    /* renamed from: f0 */
    public void mo53748f0(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    /* renamed from: h */
    public ByteBuffer mo53749h() {
        return this.buffer.asReadOnlyBuffer();
    }

    /* renamed from: h1 */
    public final ByteBuffer mo54102h1(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    /* renamed from: i */
    public List<ByteBuffer> mo53751i() {
        return Collections.singletonList(mo53749h());
    }

    /* renamed from: m0 */
    public void mo53756m0(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    /* renamed from: p0 */
    public byte mo53759p0(int i) {
        return mo53760q(i);
    }

    /* renamed from: q */
    public byte mo53760q(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: s0 */
    public boolean mo53762s0() {
        return Utf8.m85208s(this.buffer);
    }

    public int size() {
        return this.buffer.remaining();
    }

    /* renamed from: v0 */
    public C18889w mo53766v0() {
        return C18889w.m87627o(this.buffer, true);
    }

    /* renamed from: w0 */
    public InputStream mo53767w0() {
        return new C18642a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.NioByteString$a */
    public class C18642a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f47669a;

        public C18642a() {
            this.f47669a = NioByteString.this.buffer.slice();
        }

        public int available() throws IOException {
            return this.f47669a.remaining();
        }

        public void mark(int i) {
            this.f47669a.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (!this.f47669a.hasRemaining()) {
                return -1;
            }
            return this.f47669a.get() & 255;
        }

        public void reset() throws IOException {
            try {
                this.f47669a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f47669a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f47669a.remaining());
            this.f47669a.get(bArr, i, min);
            return min;
        }
    }
}
