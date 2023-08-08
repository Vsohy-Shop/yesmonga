package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.bumptech.glide.gifdecoder.d */
public class C22073d {

    /* renamed from: e */
    public static final String f56671e = "GifHeaderParser";

    /* renamed from: f */
    public static final int f56672f = 255;

    /* renamed from: g */
    public static final int f56673g = 44;

    /* renamed from: h */
    public static final int f56674h = 33;

    /* renamed from: i */
    public static final int f56675i = 59;

    /* renamed from: j */
    public static final int f56676j = 249;

    /* renamed from: k */
    public static final int f56677k = 255;

    /* renamed from: l */
    public static final int f56678l = 254;

    /* renamed from: m */
    public static final int f56679m = 1;

    /* renamed from: n */
    public static final int f56680n = 28;

    /* renamed from: o */
    public static final int f56681o = 2;

    /* renamed from: p */
    public static final int f56682p = 1;

    /* renamed from: q */
    public static final int f56683q = 128;

    /* renamed from: r */
    public static final int f56684r = 64;

    /* renamed from: s */
    public static final int f56685s = 7;

    /* renamed from: t */
    public static final int f56686t = 128;

    /* renamed from: u */
    public static final int f56687u = 7;

    /* renamed from: v */
    public static final int f56688v = 2;

    /* renamed from: w */
    public static final int f56689w = 10;

    /* renamed from: x */
    public static final int f56690x = 256;

    /* renamed from: a */
    public final byte[] f56691a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f56692b;

    /* renamed from: c */
    public C22072c f56693c;

    /* renamed from: d */
    public int f56694d = 0;

    /* renamed from: a */
    public void mo65638a() {
        this.f56692b = null;
        this.f56693c = null;
    }

    /* renamed from: b */
    public final boolean mo65639b() {
        return this.f56693c.f56659b != 0;
    }

    /* renamed from: c */
    public boolean mo65640c() {
        mo65649l();
        if (!mo65639b()) {
            mo65647j(2);
        }
        if (this.f56693c.f56660c > 1) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C22072c mo65641d() {
        if (this.f56692b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo65639b()) {
            return this.f56693c;
        } else {
            mo65649l();
            if (!mo65639b()) {
                mo65646i();
                C22072c cVar = this.f56693c;
                if (cVar.f56660c < 0) {
                    cVar.f56659b = 1;
                }
            }
            return this.f56693c;
        }
    }

    /* renamed from: e */
    public final int mo65642e() {
        try {
            return this.f56692b.get() & 255;
        } catch (Exception unused) {
            this.f56693c.f56659b = 1;
            return 0;
        }
    }

    /* renamed from: f */
    public final void mo65643f() {
        boolean z;
        this.f56693c.f56661d.f56645a = mo65652o();
        this.f56693c.f56661d.f56646b = mo65652o();
        this.f56693c.f56661d.f56647c = mo65652o();
        this.f56693c.f56661d.f56648d = mo65652o();
        int e = mo65642e();
        boolean z2 = false;
        if ((e & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((e & 7) + 1));
        C22071b bVar = this.f56693c.f56661d;
        if ((e & 64) != 0) {
            z2 = true;
        }
        bVar.f56649e = z2;
        if (z) {
            bVar.f56655k = mo65645h(pow);
        } else {
            bVar.f56655k = null;
        }
        this.f56693c.f56661d.f56654j = this.f56692b.position();
        mo65657t();
        if (!mo65639b()) {
            C22072c cVar = this.f56693c;
            cVar.f56660c++;
            cVar.f56662e.add(cVar.f56661d);
        }
    }

    /* renamed from: g */
    public final void mo65644g() {
        int e = mo65642e();
        this.f56694d = e;
        if (e > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f56694d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f56692b.get(this.f56691a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable(f56671e, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f56694d);
                    }
                    this.f56693c.f56659b = 1;
                    return;
                }
            }
        }
    }

    @C0363p0
    /* renamed from: h */
    public final int[] mo65645h(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f56692b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << DateTimeFieldType.f30603E0) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f56693c.f56659b = 1;
        }
        return iArr;
    }

    /* renamed from: i */
    public final void mo65646i() {
        mo65647j(Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final void mo65647j(int i) {
        boolean z = false;
        while (!z && !mo65639b() && this.f56693c.f56660c <= i) {
            int e = mo65642e();
            if (e == 33) {
                int e2 = mo65642e();
                if (e2 == 1) {
                    mo65656s();
                } else if (e2 == 249) {
                    this.f56693c.f56661d = new C22071b();
                    mo65648k();
                } else if (e2 == 254) {
                    mo65656s();
                } else if (e2 != 255) {
                    mo65656s();
                } else {
                    mo65644g();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f56691a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        mo65651n();
                    } else {
                        mo65656s();
                    }
                }
            } else if (e == 44) {
                C22072c cVar = this.f56693c;
                if (cVar.f56661d == null) {
                    cVar.f56661d = new C22071b();
                }
                mo65643f();
            } else if (e != 59) {
                this.f56693c.f56659b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: k */
    public final void mo65648k() {
        mo65642e();
        int e = mo65642e();
        C22071b bVar = this.f56693c.f56661d;
        int i = (e & 28) >> 2;
        bVar.f56651g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f56651g = 1;
        }
        if ((e & 1) == 0) {
            z = false;
        }
        bVar.f56650f = z;
        int o = mo65652o();
        if (o < 2) {
            o = 10;
        }
        C22071b bVar2 = this.f56693c.f56661d;
        bVar2.f56653i = o * 10;
        bVar2.f56652h = mo65642e();
        mo65642e();
    }

    /* renamed from: l */
    public final void mo65649l() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) mo65642e());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f56693c.f56659b = 1;
            return;
        }
        mo65650m();
        if (this.f56693c.f56665h && !mo65639b()) {
            C22072c cVar = this.f56693c;
            cVar.f56658a = mo65645h(cVar.f56666i);
            C22072c cVar2 = this.f56693c;
            cVar2.f56669l = cVar2.f56658a[cVar2.f56667j];
        }
    }

    /* renamed from: m */
    public final void mo65650m() {
        boolean z;
        this.f56693c.f56663f = mo65652o();
        this.f56693c.f56664g = mo65652o();
        int e = mo65642e();
        C22072c cVar = this.f56693c;
        if ((e & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.f56665h = z;
        cVar.f56666i = (int) Math.pow(2.0d, (double) ((e & 7) + 1));
        this.f56693c.f56667j = mo65642e();
        this.f56693c.f56668k = mo65642e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65651n() {
        /*
            r3 = this;
        L_0x0000:
            r3.mo65644g()
            byte[] r0 = r3.f56691a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.gifdecoder.c r2 = r3.f56693c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f56670m = r0
        L_0x001b:
            int r0 = r3.f56694d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.mo65639b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C22073d.mo65651n():void");
    }

    /* renamed from: o */
    public final int mo65652o() {
        return this.f56692b.getShort();
    }

    /* renamed from: p */
    public final void mo65653p() {
        this.f56692b = null;
        Arrays.fill(this.f56691a, (byte) 0);
        this.f56693c = new C22072c();
        this.f56694d = 0;
    }

    /* renamed from: q */
    public C22073d mo65654q(@C0359n0 ByteBuffer byteBuffer) {
        mo65653p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f56692b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f56692b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: r */
    public C22073d mo65655r(@C0363p0 byte[] bArr) {
        if (bArr != null) {
            mo65654q(ByteBuffer.wrap(bArr));
        } else {
            this.f56692b = null;
            this.f56693c.f56659b = 2;
        }
        return this;
    }

    /* renamed from: s */
    public final void mo65656s() {
        int e;
        do {
            e = mo65642e();
            this.f56692b.position(Math.min(this.f56692b.position() + e, this.f56692b.limit()));
        } while (e > 0);
    }

    /* renamed from: t */
    public final void mo65657t() {
        mo65642e();
        mo65656s();
    }
}
