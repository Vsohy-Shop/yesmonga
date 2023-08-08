package org.joda.time;

import androidx.camera.view.C1814q;
import com.carrefour.fid.android.shared.util.C28932h;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.d */
public class C12641d {

    /* renamed from: a */
    public static final C12643b f31120a;

    /* renamed from: b */
    public static volatile C12643b f31121b;

    /* renamed from: c */
    public static final AtomicReference<Map<String, DateTimeZone>> f31122c = new AtomicReference<>();

    /* renamed from: org.joda.time.d$a */
    public static class C12642a implements C12643b {

        /* renamed from: a */
        public final long f31123a;

        public C12642a(long j) {
            this.f31123a = j;
        }

        /* renamed from: k */
        public long mo29032k() {
            return this.f31123a;
        }
    }

    /* renamed from: org.joda.time.d$b */
    public interface C12643b {
        /* renamed from: k */
        long mo29032k();
    }

    /* renamed from: org.joda.time.d$c */
    public static class C12644c implements C12643b {

        /* renamed from: a */
        public final long f31124a;

        public C12644c(long j) {
            this.f31124a = j;
        }

        /* renamed from: k */
        public long mo29032k() {
            return System.currentTimeMillis() + this.f31124a;
        }
    }

    /* renamed from: org.joda.time.d$d */
    public static class C12645d implements C12643b {
        /* renamed from: k */
        public long mo29032k() {
            return System.currentTimeMillis();
        }
    }

    static {
        C12645d dVar = new C12645d();
        f31120a = dVar;
        f31121b = dVar;
    }

    /* renamed from: a */
    public static Map<String, DateTimeZone> m53366a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DateTimeZone dateTimeZone = DateTimeZone.f30651a;
        linkedHashMap.put("UT", dateTimeZone);
        linkedHashMap.put("UTC", dateTimeZone);
        linkedHashMap.put(C28932h.f70913W, dateTimeZone);
        m53382q(linkedHashMap, "EST", "America/New_York");
        m53382q(linkedHashMap, "EDT", "America/New_York");
        m53382q(linkedHashMap, "CST", "America/Chicago");
        m53382q(linkedHashMap, "CDT", "America/Chicago");
        m53382q(linkedHashMap, "MST", "America/Denver");
        m53382q(linkedHashMap, "MDT", "America/Denver");
        m53382q(linkedHashMap, "PST", "America/Los_Angeles");
        m53382q(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: b */
    public static void m53367b() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    /* renamed from: c */
    public static final long m53368c() {
        return f31121b.mo29032k();
    }

    /* renamed from: d */
    public static final long m53369d(double d) {
        return (long) ((d - 2440587.5d) * 8.64E7d);
    }

    /* renamed from: e */
    public static final C12589a m53370e(C12589a aVar) {
        return aVar == null ? ISOChronology.m52933a0() : aVar;
    }

    /* renamed from: f */
    public static final DateFormatSymbols m53371f(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke((Object) null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* renamed from: g */
    public static final Map<String, DateTimeZone> m53372g() {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = f31122c;
        Map<String, DateTimeZone> map = atomicReference.get();
        if (map != null) {
            return map;
        }
        Map<String, DateTimeZone> a = m53366a();
        if (!C1814q.m7242a(atomicReference, (Object) null, a)) {
            return atomicReference.get();
        }
        return a;
    }

    /* renamed from: h */
    public static final long m53373h(C12711k kVar) {
        if (kVar == null) {
            return 0;
        }
        return kVar.mo28667k();
    }

    /* renamed from: i */
    public static final C12589a m53374i(C12712l lVar) {
        if (lVar == null) {
            return ISOChronology.m52933a0();
        }
        C12589a m = lVar.mo27913m();
        if (m == null) {
            return ISOChronology.m52933a0();
        }
        return m;
    }

    /* renamed from: j */
    public static final long m53375j(C12712l lVar) {
        if (lVar == null) {
            return m53368c();
        }
        return lVar.mo27912k();
    }

    /* renamed from: k */
    public static final C12589a m53376k(C12712l lVar, C12712l lVar2) {
        C12589a aVar;
        if (lVar != null) {
            aVar = lVar.mo27913m();
        } else if (lVar2 != null) {
            aVar = lVar2.mo27913m();
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return ISOChronology.m52933a0();
        }
        return aVar;
    }

    /* renamed from: l */
    public static final C12589a m53377l(C12713m mVar) {
        if (mVar == null) {
            return ISOChronology.m52933a0();
        }
        C12589a m = mVar.mo28675m();
        if (m == null) {
            return ISOChronology.m52933a0();
        }
        return m;
    }

    /* renamed from: m */
    public static final PeriodType m53378m(PeriodType periodType) {
        return periodType == null ? PeriodType.m52156q() : periodType;
    }

    /* renamed from: n */
    public static final C12713m m53379n(C12713m mVar) {
        if (mVar != null) {
            return mVar;
        }
        long c = m53368c();
        return new Interval(c, c);
    }

    /* renamed from: o */
    public static final DateTimeZone m53380o(DateTimeZone dateTimeZone) {
        return dateTimeZone == null ? DateTimeZone.m51374n() : dateTimeZone;
    }

    /* renamed from: p */
    public static final boolean m53381p(C12714n nVar) {
        if (nVar != null) {
            DurationFieldType durationFieldType = null;
            for (int i = 0; i < nVar.size(); i++) {
                C12599c field = nVar.getField(i);
                if (i > 0 && (field.mo28805H() == null || field.mo28805H().mo29034W() != durationFieldType)) {
                    return false;
                }
                durationFieldType = field.mo28841t().mo29034W();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }

    /* renamed from: q */
    public static void m53382q(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.m51367g(str2));
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: r */
    public static final void m53383r(long j) throws SecurityException {
        m53367b();
        f31121b = new C12642a(j);
    }

    /* renamed from: s */
    public static final void m53384s(long j) throws SecurityException {
        m53367b();
        if (j == 0) {
            f31121b = f31120a;
        } else {
            f31121b = new C12644c(j);
        }
    }

    /* renamed from: t */
    public static final void m53385t(C12643b bVar) throws SecurityException {
        if (bVar != null) {
            m53367b();
            f31121b = bVar;
            return;
        }
        throw new IllegalArgumentException("The MillisProvider must not be null");
    }

    /* renamed from: u */
    public static final void m53386u() throws SecurityException {
        m53367b();
        f31121b = f31120a;
    }

    /* renamed from: v */
    public static final void m53387v(Map<String, DateTimeZone> map) {
        f31122c.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    /* renamed from: w */
    public static final double m53388w(long j) {
        return (((double) j) / 8.64E7d) + 2440587.5d;
    }

    /* renamed from: x */
    public static final long m53389x(long j) {
        return (long) Math.floor(m53388w(j) + 0.5d);
    }
}
