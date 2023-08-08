package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.utils.a */
public final class C1513a extends InputStream implements DataInput {

    /* renamed from: e */
    public static final ByteOrder f4325e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f */
    public static final ByteOrder f4326f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public final DataInputStream f4327a;

    /* renamed from: b */
    public ByteOrder f4328b;

    /* renamed from: c */
    public final int f4329c;

    /* renamed from: d */
    public int f4330d;

    public C1513a(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public int mo5362a() {
        return this.f4329c;
    }

    public int available() throws IOException {
        return this.f4327a.available();
    }

    /* renamed from: b */
    public int mo5364b() {
        return this.f4330d;
    }

    /* renamed from: c */
    public long mo5365c() throws IOException {
        return ((long) readInt()) & 4294967295L;
    }

    /* renamed from: d */
    public void mo5366d(long j) throws IOException {
        int i = this.f4330d;
        if (((long) i) > j) {
            this.f4330d = 0;
            this.f4327a.reset();
            this.f4327a.mark(this.f4329c);
        } else {
            j -= (long) i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    /* renamed from: f */
    public void mo5367f(ByteOrder byteOrder) {
        this.f4328b = byteOrder;
    }

    public void mark(int i) {
        synchronized (this.f4327a) {
            this.f4327a.mark(i);
        }
    }

    public int read() throws IOException {
        this.f4330d++;
        return this.f4327a.read();
    }

    public boolean readBoolean() throws IOException {
        this.f4330d++;
        return this.f4327a.readBoolean();
    }

    public byte readByte() throws IOException {
        int i = this.f4330d + 1;
        this.f4330d = i;
        if (i <= this.f4329c) {
            int read = this.f4327a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public char readChar() throws IOException {
        this.f4330d += 2;
        return this.f4327a.readChar();
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4330d + i2;
        this.f4330d = i3;
        if (i3 > this.f4329c) {
            throw new EOFException();
        } else if (this.f4327a.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public int readInt() throws IOException {
        int i = this.f4330d + 4;
        this.f4330d = i;
        if (i <= this.f4329c) {
            int read = this.f4327a.read();
            int read2 = this.f4327a.read();
            int read3 = this.f4327a.read();
            int read4 = this.f4327a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f4328b;
                if (byteOrder == f4325e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f4326f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f4328b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    public long readLong() throws IOException {
        int i = this.f4330d + 8;
        this.f4330d = i;
        if (i <= this.f4329c) {
            int read = this.f4327a.read();
            int read2 = this.f4327a.read();
            int read3 = this.f4327a.read();
            int read4 = this.f4327a.read();
            int read5 = this.f4327a.read();
            int read6 = this.f4327a.read();
            int read7 = this.f4327a.read();
            int read8 = this.f4327a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f4328b;
                if (byteOrder == f4325e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == f4326f) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f4328b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public short readShort() throws IOException {
        int i = this.f4330d + 2;
        this.f4330d = i;
        if (i <= this.f4329c) {
            int read = this.f4327a.read();
            int read2 = this.f4327a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4328b;
                if (byteOrder == f4325e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f4326f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f4328b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public String readUTF() throws IOException {
        this.f4330d += 2;
        return this.f4327a.readUTF();
    }

    public int readUnsignedByte() throws IOException {
        this.f4330d++;
        return this.f4327a.readUnsignedByte();
    }

    public int readUnsignedShort() throws IOException {
        int i = this.f4330d + 2;
        this.f4330d = i;
        if (i <= this.f4329c) {
            int read = this.f4327a.read();
            int read2 = this.f4327a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4328b;
                if (byteOrder == f4325e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f4326f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f4328b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public int skipBytes(int i) throws IOException {
        int min = Math.min(i, this.f4329c - this.f4330d);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f4327a.skipBytes(min - i2);
        }
        this.f4330d += i2;
        return i2;
    }

    public C1513a(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.f4328b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4327a = dataInputStream;
        int available = dataInputStream.available();
        this.f4329c = available;
        this.f4330d = 0;
        dataInputStream.mark(available);
        this.f4328b = byteOrder;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f4327a.read(bArr, i, i2);
        this.f4330d += read;
        return read;
    }

    public void readFully(byte[] bArr) throws IOException {
        int length = this.f4330d + bArr.length;
        this.f4330d = length;
        if (length > this.f4329c) {
            throw new EOFException();
        } else if (this.f4327a.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public C1513a(byte[] bArr) throws IOException {
        this((InputStream) new ByteArrayInputStream(bArr));
    }
}
