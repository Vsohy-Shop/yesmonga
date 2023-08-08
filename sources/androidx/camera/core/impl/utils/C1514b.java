package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.utils.b */
public class C1514b extends FilterOutputStream {

    /* renamed from: a */
    public final OutputStream f4331a;

    /* renamed from: b */
    public ByteOrder f4332b;

    public C1514b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f4331a = outputStream;
        this.f4332b = byteOrder;
    }

    /* renamed from: a */
    public void mo5386a(ByteOrder byteOrder) {
        this.f4332b = byteOrder;
    }

    /* renamed from: b */
    public void mo5387b(int i) throws IOException {
        this.f4331a.write(i);
    }

    /* renamed from: c */
    public void mo5388c(int i) throws IOException {
        ByteOrder byteOrder = this.f4332b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f4331a.write((i >>> 0) & 255);
            this.f4331a.write((i >>> 8) & 255);
            this.f4331a.write((i >>> 16) & 255);
            this.f4331a.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f4331a.write((i >>> 24) & 255);
            this.f4331a.write((i >>> 16) & 255);
            this.f4331a.write((i >>> 8) & 255);
            this.f4331a.write((i >>> 0) & 255);
        }
    }

    /* renamed from: d */
    public void mo5389d(short s) throws IOException {
        ByteOrder byteOrder = this.f4332b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f4331a.write((s >>> 0) & 255);
            this.f4331a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f4331a.write((s >>> 8) & 255);
            this.f4331a.write((s >>> 0) & 255);
        }
    }

    /* renamed from: f */
    public void mo5390f(long j) throws IOException {
        mo5388c((int) j);
    }

    /* renamed from: g */
    public void mo5391g(int i) throws IOException {
        mo5389d((short) i);
    }

    public void write(byte[] bArr) throws IOException {
        this.f4331a.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f4331a.write(bArr, i, i2);
    }
}
