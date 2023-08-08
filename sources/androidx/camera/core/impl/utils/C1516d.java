package androidx.camera.core.impl.utils;

import android.location.Location;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: androidx.camera.core.impl.utils.d */
public final class C1516d {

    /* renamed from: c */
    public static final long f4334c = -1;

    /* renamed from: d */
    public static final String f4335d = "d";

    /* renamed from: e */
    public static final ThreadLocal<SimpleDateFormat> f4336e = new C1517a();

    /* renamed from: f */
    public static final ThreadLocal<SimpleDateFormat> f4337f = new C1518b();

    /* renamed from: g */
    public static final ThreadLocal<SimpleDateFormat> f4338g = new C1519c();

    /* renamed from: h */
    public static final String f4339h = "K";

    /* renamed from: i */
    public static final String f4340i = "M";

    /* renamed from: j */
    public static final String f4341j = "N";

    /* renamed from: a */
    public final C19135a f4342a;

    /* renamed from: b */
    public boolean f4343b = false;

    /* renamed from: androidx.camera.core.impl.utils.d$a */
    public class C1517a extends ThreadLocal<SimpleDateFormat> {
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.d$b */
    public class C1518b extends ThreadLocal<SimpleDateFormat> {
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DateExtensionsKt.f70331e, Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.d$c */
    public class C1519c extends ThreadLocal<SimpleDateFormat> {
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.d$d */
    public static final class C1520d {

        /* renamed from: androidx.camera.core.impl.utils.d$d$a */
        public static final class C1521a {

            /* renamed from: a */
            public final double f4344a;

            public C1521a(double d) {
                this.f4344a = d;
            }

            /* renamed from: a */
            public double mo5424a() {
                return this.f4344a / 0.621371d;
            }

            /* renamed from: b */
            public double mo5425b() {
                return this.f4344a / 1.15078d;
            }

            /* renamed from: c */
            public double mo5426c() {
                return this.f4344a / 2.23694d;
            }

            /* renamed from: d */
            public double mo5427d() {
                return this.f4344a;
            }
        }

        /* renamed from: a */
        public static C1521a m6409a(double d) {
            return new C1521a(d * 0.621371d);
        }

        /* renamed from: b */
        public static C1521a m6410b(double d) {
            return new C1521a(d * 1.15078d);
        }

        /* renamed from: c */
        public static C1521a m6411c(double d) {
            return new C1521a(d * 2.23694d);
        }

        /* renamed from: d */
        public static C1521a m6412d(double d) {
            return new C1521a(d);
        }
    }

    public C1516d(C19135a aVar) {
        this.f4342a = aVar;
    }

    /* renamed from: d */
    public static Date m6376d(String str) throws ParseException {
        return f4336e.get().parse(str);
    }

    /* renamed from: e */
    public static Date m6377e(String str) throws ParseException {
        return f4338g.get().parse(str);
    }

    /* renamed from: f */
    public static Date m6378f(String str) throws ParseException {
        return f4337f.get().parse(str);
    }

    /* renamed from: g */
    public static String m6379g(long j) {
        return f4338g.get().format(new Date(j));
    }

    @C0359n0
    /* renamed from: h */
    public static C1516d m6380h(@C0359n0 File file) throws IOException {
        return m6381i(file.toString());
    }

    @C0359n0
    /* renamed from: i */
    public static C1516d m6381i(@C0359n0 String str) throws IOException {
        return new C1516d(new C19135a(str));
    }

    @C0359n0
    /* renamed from: j */
    public static C1516d m6382j(@C0359n0 InputStream inputStream) throws IOException {
        return new C1516d(new C19135a(inputStream));
    }

    /* renamed from: A */
    public void mo5394A(int i) {
        int i2;
        if (i % 90 != 0) {
            C1417i2.m5924n(f4335d, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", new Object[]{Integer.valueOf(i)}));
            this.f4342a.mo56452A0(C19135a.f48683C, String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int q = mo5407q();
        while (i3 < 0) {
            i3 += 90;
            switch (q) {
                case 2:
                    q = 5;
                    break;
                case 3:
                case 8:
                    q = 6;
                    break;
                case 4:
                    q = 7;
                    break;
                case 5:
                    q = 4;
                    break;
                case 6:
                    q = 1;
                    break;
                case 7:
                    q = 2;
                    break;
                default:
                    q = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (q) {
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 8;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 2;
                    break;
                case 6:
                    i2 = 3;
                    break;
                case 7:
                    i2 = 4;
                    break;
                case 8:
                    i2 = 1;
                    break;
                default:
                    i2 = 6;
                    break;
            }
        }
        this.f4342a.mo56452A0(C19135a.f48683C, String.valueOf(q));
    }

    /* renamed from: B */
    public void mo5395B() throws IOException {
        if (!this.f4343b) {
            mo5398a();
        }
        this.f4342a.mo56516v0();
    }

    /* renamed from: C */
    public void mo5396C(@C0363p0 String str) {
        this.f4342a.mo56452A0(C19135a.f48854V, str);
    }

    /* renamed from: D */
    public void mo5397D(int i) {
        this.f4342a.mo56452A0(C19135a.f48683C, String.valueOf(i));
    }

    /* renamed from: a */
    public final void mo5398a() {
        long currentTimeMillis = System.currentTimeMillis();
        String g = m6379g(currentTimeMillis);
        this.f4342a.mo56452A0(C19135a.f48845U, g);
        try {
            this.f4342a.mo56452A0(C19135a.f49035r0, Long.toString(currentTimeMillis - m6377e(g).getTime()));
        } catch (ParseException unused) {
        }
    }

    /* renamed from: b */
    public void mo5399b(@C0359n0 Location location) {
        this.f4342a.mo56456C0(location);
    }

    /* renamed from: c */
    public void mo5400c() {
        long currentTimeMillis = System.currentTimeMillis();
        String g = m6379g(currentTimeMillis);
        this.f4342a.mo56452A0(C19135a.f48995m0, g);
        this.f4342a.mo56452A0(C19135a.f49003n0, g);
        try {
            String l = Long.toString(currentTimeMillis - m6377e(g).getTime());
            this.f4342a.mo56452A0(C19135a.f49043s0, l);
            this.f4342a.mo56452A0(C19135a.f49051t0, l);
        } catch (ParseException unused) {
        }
        this.f4343b = false;
    }

    /* renamed from: k */
    public void mo5401k() {
        int i;
        switch (mo5407q()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.f4342a.mo56452A0(C19135a.f48683C, String.valueOf(i));
    }

    /* renamed from: l */
    public void mo5402l() {
        int i;
        switch (mo5407q()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.f4342a.mo56452A0(C19135a.f48683C, String.valueOf(i));
    }

    @C0363p0
    /* renamed from: m */
    public String mo5403m() {
        return this.f4342a.mo56501o(C19135a.f48854V);
    }

    /* renamed from: n */
    public int mo5404n() {
        return this.f4342a.mo56507r(C19135a.f49094y, 0);
    }

    /* renamed from: o */
    public long mo5405o() {
        long w = mo5414w(this.f4342a.mo56501o(C19135a.f48845U));
        if (w == -1) {
            return -1;
        }
        String o = this.f4342a.mo56501o(C19135a.f49035r0);
        if (o == null) {
            return w;
        }
        try {
            long parseLong = Long.parseLong(o);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return w + parseLong;
        } catch (NumberFormatException unused) {
            return w;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    @androidx.annotation.C0363p0
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo5406p() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f4342a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.mo56501o(r2)
            androidx.exifinterface.media.a r2 = r0.f4342a
            double[] r2 = r2.mo56453B()
            androidx.exifinterface.media.a r3 = r0.f4342a
            r4 = 0
            double r6 = r3.mo56499n(r4)
            androidx.exifinterface.media.a r3 = r0.f4342a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.mo56505q(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f4342a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.mo56501o(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L_0x002d
            r3 = r10
        L_0x002d:
            androidx.exifinterface.media.a r11 = r0.f4342a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.mo56501o(r12)
            androidx.exifinterface.media.a r12 = r0.f4342a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.mo56501o(r13)
            long r11 = r0.mo5415x(r11, r12)
            if (r2 != 0) goto L_0x0045
            r1 = 0
            return r1
        L_0x0045:
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = f4335d
        L_0x0049:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            r13.setAltitude(r6)
        L_0x0061:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00b5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L_0x008a
            r2 = 77
            if (r1 == r2) goto L_0x0080
            r2 = 78
            if (r1 == r2) goto L_0x0076
            goto L_0x0092
        L_0x0076:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = r14
            goto L_0x0093
        L_0x0080:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = 0
            goto L_0x0093
        L_0x008a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L_0x0092
            r1 = 2
            goto L_0x0093
        L_0x0092:
            r1 = -1
        L_0x0093:
            if (r1 == 0) goto L_0x00a9
            if (r1 == r14) goto L_0x00a0
            androidx.camera.core.impl.utils.d$d$a r1 = androidx.camera.core.impl.utils.C1516d.C1520d.m6409a(r8)
            double r1 = r1.mo5426c()
            goto L_0x00b1
        L_0x00a0:
            androidx.camera.core.impl.utils.d$d$a r1 = androidx.camera.core.impl.utils.C1516d.C1520d.m6410b(r8)
            double r1 = r1.mo5426c()
            goto L_0x00b1
        L_0x00a9:
            androidx.camera.core.impl.utils.d$d$a r1 = androidx.camera.core.impl.utils.C1516d.C1520d.m6412d(r8)
            double r1 = r1.mo5426c()
        L_0x00b1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        L_0x00b5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00be
            r13.setTime(r11)
        L_0x00be:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C1516d.mo5406p():android.location.Location");
    }

    /* renamed from: q */
    public int mo5407q() {
        return this.f4342a.mo56507r(C19135a.f48683C, 0);
    }

    /* renamed from: r */
    public int mo5408r() {
        switch (mo5407q()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: s */
    public long mo5409s() {
        long w = mo5414w(this.f4342a.mo56501o(C19135a.f48995m0));
        if (w == -1) {
            return -1;
        }
        String o = this.f4342a.mo56501o(C19135a.f49043s0);
        if (o == null) {
            return w;
        }
        try {
            long parseLong = Long.parseLong(o);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return w + parseLong;
        } catch (NumberFormatException unused) {
            return w;
        }
    }

    /* renamed from: t */
    public int mo5410t() {
        return this.f4342a.mo56507r(C19135a.f49085x, 0);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(mo5410t()), Integer.valueOf(mo5404n()), Integer.valueOf(mo5408r()), Boolean.valueOf(mo5413v()), Boolean.valueOf(mo5412u()), mo5406p(), Long.valueOf(mo5409s()), mo5403m()});
    }

    /* renamed from: u */
    public boolean mo5412u() {
        return mo5407q() == 2;
    }

    /* renamed from: v */
    public boolean mo5413v() {
        int q = mo5407q();
        return q == 4 || q == 5 || q == 7;
    }

    /* renamed from: w */
    public final long mo5414w(@C0363p0 String str) {
        if (str == null) {
            return -1;
        }
        try {
            return m6377e(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: x */
    public final long mo5415x(@C0363p0 String str, @C0363p0 String str2) {
        if (str == null && str2 == null) {
            return -1;
        }
        if (str2 == null) {
            try {
                return m6376d(str).getTime();
            } catch (ParseException unused) {
                return -1;
            }
        } else if (str == null) {
            try {
                return m6378f(str2).getTime();
            } catch (ParseException unused2) {
                return -1;
            }
        } else {
            return mo5414w(str + " " + str2);
        }
    }

    /* renamed from: y */
    public void mo5416y() {
        this.f4342a.mo56452A0(C19135a.f48883Y1, (String) null);
        this.f4342a.mo56452A0(C19135a.f49105z1, (String) null);
        this.f4342a.mo56452A0(C19135a.f49096y1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48676B1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48667A1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48694D1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48685C1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48757K1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48748J1, (String) null);
        this.f4342a.mo56452A0(C19135a.f48901a2, (String) null);
        this.f4342a.mo56452A0(C19135a.f48703E1, (String) null);
    }

    /* renamed from: z */
    public void mo5417z() {
        this.f4342a.mo56452A0(C19135a.f48845U, (String) null);
        this.f4342a.mo56452A0(C19135a.f48995m0, (String) null);
        this.f4342a.mo56452A0(C19135a.f49003n0, (String) null);
        this.f4342a.mo56452A0(C19135a.f49035r0, (String) null);
        this.f4342a.mo56452A0(C19135a.f49043s0, (String) null);
        this.f4342a.mo56452A0(C19135a.f49051t0, (String) null);
        this.f4343b = true;
    }
}
