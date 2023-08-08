package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.v0 */
public final class C31994v0 extends OutputStream {

    /* renamed from: a */
    public final C31995v1 f78149a = new C31995v1();

    /* renamed from: b */
    public final File f78150b;

    /* renamed from: c */
    public final C31938i2 f78151c;

    /* renamed from: d */
    public long f78152d;

    /* renamed from: e */
    public long f78153e;

    /* renamed from: f */
    public FileOutputStream f78154f;

    /* renamed from: g */
    public C31968o2 f78155g;

    public C31994v0(File file, C31938i2 i2Var) {
        this.f78150b = file;
        this.f78151c = i2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f78152d == 0 && this.f78153e == 0) {
                int a = this.f78149a.mo92695a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    C31968o2 b = this.f78149a.mo92696b();
                    this.f78155g = b;
                    if (b.mo92657h()) {
                        this.f78152d = 0;
                        this.f78151c.mo92593m(this.f78155g.mo92659i(), this.f78155g.mo92659i().length);
                        this.f78153e = (long) this.f78155g.mo92659i().length;
                    } else if (!this.f78155g.mo92651c() || this.f78155g.mo92650b()) {
                        byte[] i4 = this.f78155g.mo92659i();
                        this.f78151c.mo92593m(i4, i4.length);
                        this.f78152d = this.f78155g.mo92653e();
                    } else {
                        this.f78151c.mo92587g(this.f78155g.mo92659i());
                        File file = new File(this.f78150b, this.f78155g.mo92652d());
                        file.getParentFile().mkdirs();
                        this.f78152d = this.f78155g.mo92653e();
                        this.f78154f = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f78155g.mo92650b()) {
                if (this.f78155g.mo92657h()) {
                    this.f78151c.mo92589i(this.f78153e, bArr, i, i2);
                    this.f78153e += (long) i2;
                    i3 = i2;
                } else if (this.f78155g.mo92651c()) {
                    i3 = (int) Math.min((long) i2, this.f78152d);
                    this.f78154f.write(bArr, i, i3);
                    long j = this.f78152d - ((long) i3);
                    this.f78152d = j;
                    if (j == 0) {
                        this.f78154f.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f78152d);
                    int length = this.f78155g.mo92659i().length;
                    this.f78151c.mo92589i((((long) length) + this.f78155g.mo92653e()) - this.f78152d, bArr, i, i3);
                    this.f78152d -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
