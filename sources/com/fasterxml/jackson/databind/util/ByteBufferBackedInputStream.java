package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    protected final ByteBuffer f37096_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f37096_b = byteBuffer;
    }

    public int available() {
        return this.f37096_b.remaining();
    }

    public int read() throws IOException {
        if (this.f37096_b.hasRemaining()) {
            return this.f37096_b.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f37096_b.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f37096_b.remaining());
        this.f37096_b.get(bArr, i, min);
        return min;
    }
}
