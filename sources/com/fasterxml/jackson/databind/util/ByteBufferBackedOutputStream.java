package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedOutputStream extends OutputStream {

    /* renamed from: _b */
    protected final ByteBuffer f37097_b;

    public ByteBufferBackedOutputStream(ByteBuffer byteBuffer) {
        this.f37097_b = byteBuffer;
    }

    public void write(int i) throws IOException {
        this.f37097_b.put((byte) i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f37097_b.put(bArr, i, i2);
    }
}
