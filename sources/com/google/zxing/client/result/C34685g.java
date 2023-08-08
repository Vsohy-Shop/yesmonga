package com.google.zxing.client.result;

import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.AirshipConfigOptions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.google.zxing.client.result.g */
public final class C34685g extends C34699q {

    /* renamed from: m */
    public static final Pattern f83943m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n */
    public static final long[] f83944n = {604800000, 86400000, 3600000, AirshipConfigOptions.f87111Y, 1000};

    /* renamed from: o */
    public static final Pattern f83945o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    public final String f83946b;

    /* renamed from: c */
    public final long f83947c;

    /* renamed from: d */
    public final boolean f83948d;

    /* renamed from: e */
    public final long f83949e;

    /* renamed from: f */
    public final boolean f83950f;

    /* renamed from: g */
    public final String f83951g;

    /* renamed from: h */
    public final String f83952h;

    /* renamed from: i */
    public final String[] f83953i;

    /* renamed from: j */
    public final String f83954j;

    /* renamed from: k */
    public final double f83955k;

    /* renamed from: l */
    public final double f83956l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34685g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        boolean z;
        long j;
        this.f83946b = str;
        try {
            long s = m141430s(str2);
            this.f83947c = s;
            if (str3 == null) {
                long u = m141432u(str4);
                if (u < 0) {
                    j = -1;
                } else {
                    j = s + u;
                }
                this.f83949e = j;
            } else {
                try {
                    this.f83949e = m141430s(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z2 = true;
            if (str2.length() == 8) {
                z = true;
            } else {
                z = false;
            }
            this.f83948d = z;
            this.f83950f = (str3 == null || str3.length() != 8) ? false : z2;
            this.f83951g = str5;
            this.f83952h = str6;
            this.f83953i = strArr;
            this.f83954j = str7;
            this.f83955k = d;
            this.f83956l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: e */
    public static String m141429e(boolean z, long j) {
        DateFormat dateFormat;
        if (j < 0) {
            return null;
        }
        if (z) {
            dateFormat = DateFormat.getDateInstance(2);
        } else {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateFormat.format(Long.valueOf(j));
    }

    /* renamed from: s */
    public static long m141430s(String str) throws ParseException {
        if (!f83945o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        } else if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(C28932h.f70913W));
            return simpleDateFormat.parse(str).getTime();
        } else if (str.length() != 16 || str.charAt(15) != 'Z') {
            return m141431t(str);
        } else {
            long t = m141431t(str.substring(0, 15));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long j = t + ((long) gregorianCalendar.get(15));
            gregorianCalendar.setTime(new Date(j));
            return j + ((long) gregorianCalendar.get(16));
        }
    }

    /* renamed from: t */
    public static long m141431t(String str) throws ParseException {
        return new SimpleDateFormat(C28932h.f70935v, Locale.ENGLISH).parse(str).getTime();
    }

    /* renamed from: u */
    public static long m141432u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1;
        }
        Matcher matcher = f83943m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f83944n;
            if (i >= jArr.length) {
                return j;
            }
            int i2 = i + 1;
            String group = matcher.group(i2);
            if (group != null) {
                j += jArr[i] * ((long) Integer.parseInt(group));
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(100);
        C34699q.m141521c(this.f83946b, sb);
        C34699q.m141521c(m141429e(this.f83948d, this.f83947c), sb);
        C34699q.m141521c(m141429e(this.f83950f, this.f83949e), sb);
        C34699q.m141521c(this.f83951g, sb);
        C34699q.m141521c(this.f83952h, sb);
        C34699q.m141522d(this.f83953i, sb);
        C34699q.m141521c(this.f83954j, sb);
        return sb.toString();
    }

    /* renamed from: f */
    public String[] mo102546f() {
        return this.f83953i;
    }

    /* renamed from: g */
    public String mo102547g() {
        return this.f83954j;
    }

    @Deprecated
    /* renamed from: h */
    public Date mo102548h() {
        if (this.f83949e < 0) {
            return null;
        }
        return new Date(this.f83949e);
    }

    /* renamed from: i */
    public long mo102549i() {
        return this.f83949e;
    }

    /* renamed from: j */
    public double mo102550j() {
        return this.f83955k;
    }

    /* renamed from: k */
    public String mo102551k() {
        return this.f83951g;
    }

    /* renamed from: l */
    public double mo102552l() {
        return this.f83956l;
    }

    /* renamed from: m */
    public String mo102553m() {
        return this.f83952h;
    }

    @Deprecated
    /* renamed from: n */
    public Date mo102554n() {
        return new Date(this.f83947c);
    }

    /* renamed from: o */
    public long mo102555o() {
        return this.f83947c;
    }

    /* renamed from: p */
    public String mo102556p() {
        return this.f83946b;
    }

    /* renamed from: q */
    public boolean mo102557q() {
        return this.f83950f;
    }

    /* renamed from: r */
    public boolean mo102558r() {
        return this.f83948d;
    }
}
