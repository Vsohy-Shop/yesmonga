package p073j$.time.temporal;

import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import p073j$.time.C42586c;
import p073j$.time.DayOfWeek;
import p073j$.time.LocalDate;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;

/* renamed from: j$.time.temporal.g */
enum C42668g implements C42675n {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f107953a = null;

    static {
        f107953a = new int[]{0, 90, 181, AudioAttributesCompat.f50016O, 0, 91, 182, DefaultImageHeaderParser.f57426n};
    }

    /* renamed from: a0 */
    static boolean m172488a0(TemporalAccessor temporalAccessor) {
        return Chronology.m172024H(temporalAccessor).equals(C42608p.f107789d);
    }

    /* renamed from: c0 */
    static void m172490c0(TemporalAccessor temporalAccessor) {
        if (!Chronology.m172024H(temporalAccessor).equals(C42608p.f107789d)) {
            throw new C42586c("Resolve requires IsoChronology");
        }
    }

    /* renamed from: d0 */
    static C42679r m172491d0(LocalDate localDate) {
        return C42679r.m172526j(1, (long) m172496i0(m172495h0(localDate)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.mo137919P())) == false) goto L_0x005a;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m172492e0(p073j$.time.LocalDate r5) {
        /*
            j$.time.DayOfWeek r0 = r5.getDayOfWeek()
            int r0 = r0.ordinal()
            int r1 = r5.mo137915E()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x003f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.LocalDate r5 = r5.mo137938h0(r0)
            r0 = -1
            j$.time.LocalDate r5 = r5.mo137927d0(r0)
            int r5 = m172495h0(r5)
            int r5 = m172496i0(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.r r5 = p073j$.time.temporal.C42679r.m172526j(r2, r0)
            long r0 = r5.mo138228d()
            int r5 = (int) r0
            goto L_0x005b
        L_0x003f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0059
            if (r0 == r3) goto L_0x0055
            r3 = -2
            if (r0 != r3) goto L_0x0053
            boolean r5 = r5.mo137919P()
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.temporal.C42668g.m172492e0(j$.time.LocalDate):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static int m172495h0(LocalDate localDate) {
        int year = localDate.getYear();
        int E = localDate.mo137915E();
        if (E <= 3) {
            return E - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (E < 363) {
            return year;
        }
        return ((E - 363) - (localDate.mo137919P() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static int m172496i0(int i) {
        LocalDate of = LocalDate.m171813of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() != DayOfWeek.WEDNESDAY || !of.mo137919P()) ? 52 : 53;
        }
        return 53;
    }

    /* renamed from: K */
    public final boolean mo138211K() {
        return false;
    }

    /* renamed from: L */
    public C42679r mo138212L(TemporalAccessor temporalAccessor) {
        return mo138210E();
    }

    /* renamed from: n */
    public final boolean mo138216n() {
        return true;
    }
}
