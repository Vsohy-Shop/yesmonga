package com.fasterxml.jackson.core.p025io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.io.UTF32Reader */
public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;

    /* renamed from: NC */
    protected static final char f37078NC = 0;
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null ? true : z2;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i) throws IOException {
        int i2;
        int i3;
        this._byteCount += this._length - i;
        if (i > 0) {
            int i4 = this._ptr;
            if (i4 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i4, bArr, 0, i);
                this._ptr = 0;
            }
            this._length = i;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i3 = -1;
            } else {
                i3 = inputStream.read(this._buffer);
            }
            if (i3 < 1) {
                this._length = 0;
                if (i3 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = i3;
        }
        while (true) {
            int i5 = this._length;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this._buffer;
                i2 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += i2;
        }
    }

    private void reportBounds(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    private void reportInvalid(int i, int i2, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this._charCount + i2);
        sb.append(", byte #");
        sb.append((this._byteCount + this._ptr) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i, int i2) throws IOException {
        int i3 = this._charCount;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this._byteCount + i) + ")");
    }

    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r1 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            byte[] r0 = r10._buffer
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            if (r13 >= r0) goto L_0x000a
            return r13
        L_0x000a:
            if (r12 < 0) goto L_0x0011
            int r2 = r12 + r13
            int r3 = r11.length
            if (r2 <= r3) goto L_0x0014
        L_0x0011:
            r10.reportBounds(r11, r12, r13)
        L_0x0014:
            int r13 = r13 + r12
            char r2 = r10._surrogate
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x0022
            int r1 = r12 + 1
            r11[r12] = r2
            r10._surrogate = r3
            goto L_0x003b
        L_0x0022:
            int r2 = r10._length
            int r5 = r10._ptr
            int r2 = r2 - r5
            if (r2 >= r4) goto L_0x003a
            boolean r5 = r10.loadMore(r2)
            if (r5 != 0) goto L_0x003a
            if (r2 != 0) goto L_0x0032
            return r1
        L_0x0032:
            int r1 = r10._length
            int r2 = r10._ptr
            int r1 = r1 - r2
            r10.reportUnexpectedEOF(r1, r4)
        L_0x003a:
            r1 = r12
        L_0x003b:
            int r2 = r10._length
            int r2 = r2 - r4
        L_0x003e:
            if (r1 >= r13) goto L_0x00d1
            int r4 = r10._ptr
            boolean r5 = r10._bigEndian
            if (r5 == 0) goto L_0x0063
            byte[] r5 = r10._buffer
            byte r6 = r5[r4]
            int r6 = r6 << 8
            int r7 = r4 + 1
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r7 = r4 + 2
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            int r8 = r4 + 3
            byte r5 = r5[r8]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r7
            goto L_0x0082
        L_0x0063:
            byte[] r5 = r10._buffer
            byte r6 = r5[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 1
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r7 = r4 + 2
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 + 3
            byte r5 = r5[r8]
            int r5 = r5 << 8
            r5 = r5 | r7
            r9 = r6
            r6 = r5
            r5 = r9
        L_0x0082:
            int r4 = r4 + 4
            r10._ptr = r4
            if (r6 == 0) goto L_0x00c3
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r6
            int r6 = r4 + -1
            r7 = 16
            int r6 = r6 << r7
            r5 = r5 | r6
            if (r4 <= r7) goto L_0x00aa
            int r4 = r1 - r12
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r7 = " (above 0x%08x)"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r10.reportInvalid(r5, r4, r6)
        L_0x00aa:
            int r4 = r1 + 1
            int r6 = r5 >> 10
            r7 = 55296(0xd800, float:7.7486E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            r11[r1] = r6
            r1 = r5 & 1023(0x3ff, float:1.434E-42)
            r6 = 56320(0xdc00, float:7.8921E-41)
            r1 = r1 | r6
            if (r4 < r13) goto L_0x00c1
            char r11 = (char) r5
            r10._surrogate = r11
            goto L_0x00cc
        L_0x00c1:
            r5 = r1
            r1 = r4
        L_0x00c3:
            int r4 = r1 + 1
            char r5 = (char) r5
            r11[r1] = r5
            int r1 = r10._ptr
            if (r1 <= r2) goto L_0x00ce
        L_0x00cc:
            r1 = r4
            goto L_0x00d1
        L_0x00ce:
            r1 = r4
            goto L_0x003e
        L_0x00d1:
            int r1 = r1 - r12
            int r11 = r10._charCount
            int r11 = r11 + r1
            r10._charCount = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p025io.UTF32Reader.read(char[], int, int):int");
    }
}
