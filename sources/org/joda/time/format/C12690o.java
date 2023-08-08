package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.C12709i;
import org.joda.time.C12715o;
import org.joda.time.PeriodType;

/* renamed from: org.joda.time.format.o */
public class C12690o {

    /* renamed from: a */
    public static final String f31312a = "org.joda.time.format.messages";

    /* renamed from: b */
    public static final ConcurrentMap<Locale, C12692p> f31313b = new ConcurrentHashMap();

    /* renamed from: org.joda.time.format.o$a */
    public static class C12691a implements C12706s, C12705r {

        /* renamed from: a */
        public final C12692p f31314a;

        public C12691a(C12692p pVar) {
            this.f31314a = pVar;
        }

        /* renamed from: a */
        public void mo29304a(Writer writer, C12715o oVar, Locale locale) throws IOException {
            mo29310g(locale).mo29304a(writer, oVar, locale);
        }

        /* renamed from: b */
        public int mo29305b(C12709i iVar, String str, int i, Locale locale) {
            return mo29309f(locale).mo29305b(iVar, str, i, locale);
        }

        /* renamed from: c */
        public int mo29306c(C12715o oVar, int i, Locale locale) {
            return mo29310g(locale).mo29306c(oVar, i, locale);
        }

        /* renamed from: d */
        public void mo29307d(StringBuffer stringBuffer, C12715o oVar, Locale locale) {
            mo29310g(locale).mo29307d(stringBuffer, oVar, locale);
        }

        /* renamed from: e */
        public int mo29308e(C12715o oVar, Locale locale) {
            return mo29310g(locale).mo29308e(oVar, locale);
        }

        /* renamed from: f */
        public final C12705r mo29309f(Locale locale) {
            if (locale == null || locale.equals(this.f31314a.mo29314d())) {
                return this.f31314a.mo29316f();
            }
            return C12690o.m54366h(locale).mo29316f();
        }

        /* renamed from: g */
        public final C12706s mo29310g(Locale locale) {
            if (locale == null || locale.equals(this.f31314a.mo29314d())) {
                return this.f31314a.mo29317g();
            }
            return C12690o.m54366h(locale).mo29317g();
        }
    }

    /* renamed from: a */
    public static C12692p m54359a(ResourceBundle resourceBundle, Locale locale) {
        String[] f = m54364f(resourceBundle);
        return new C12693q().mo29333F().mo29329B(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29358m().mo29329B(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29332E().mo29329B(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29350e().mo29329B(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29353h().mo29329B(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29357l().mo29329B(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29363r().mo29329B(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds")).mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).mo29355j().mo29329B(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds")).mo29344R().mo29326p(locale);
    }

    /* renamed from: b */
    public static C12692p m54360b(ResourceBundle resourceBundle, Locale locale) {
        String[] f = m54364f(resourceBundle);
        String string = resourceBundle.getString("PeriodFormat.regex.separator");
        C12693q qVar = new C12693q();
        qVar.mo29333F();
        if (m54362d(resourceBundle, "PeriodFormat.years.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.years.regex").split(string), resourceBundle.getString("PeriodFormat.years.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29358m();
        if (m54362d(resourceBundle, "PeriodFormat.months.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.months.regex").split(string), resourceBundle.getString("PeriodFormat.months.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29332E();
        if (m54362d(resourceBundle, "PeriodFormat.weeks.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.weeks.regex").split(string), resourceBundle.getString("PeriodFormat.weeks.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29350e();
        if (m54362d(resourceBundle, "PeriodFormat.days.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.days.regex").split(string), resourceBundle.getString("PeriodFormat.days.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29353h();
        if (m54362d(resourceBundle, "PeriodFormat.hours.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.hours.regex").split(string), resourceBundle.getString("PeriodFormat.hours.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29357l();
        if (m54362d(resourceBundle, "PeriodFormat.minutes.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.minutes.regex").split(string), resourceBundle.getString("PeriodFormat.minutes.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29363r();
        if (m54362d(resourceBundle, "PeriodFormat.seconds.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.seconds.regex").split(string), resourceBundle.getString("PeriodFormat.seconds.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds"));
        }
        qVar.mo29368w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        qVar.mo29355j();
        if (m54362d(resourceBundle, "PeriodFormat.milliseconds.regex")) {
            qVar.mo29331D(resourceBundle.getString("PeriodFormat.milliseconds.regex").split(string), resourceBundle.getString("PeriodFormat.milliseconds.list").split(string));
        } else {
            qVar.mo29329B(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds"));
        }
        return qVar.mo29344R().mo29326p(locale);
    }

    /* renamed from: c */
    public static C12692p m54361c(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle(f31312a, locale);
        if (m54362d(bundle, "PeriodFormat.regex.separator")) {
            return m54360b(bundle, locale);
        }
        return m54359a(bundle, locale);
    }

    /* renamed from: d */
    public static boolean m54362d(ResourceBundle resourceBundle, String str) {
        Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            if (keys.nextElement().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static C12692p m54363e() {
        return m54366h(Locale.ENGLISH);
    }

    /* renamed from: f */
    public static String[] m54364f(ResourceBundle resourceBundle) {
        return new String[]{resourceBundle.getString("PeriodFormat.space"), resourceBundle.getString("PeriodFormat.comma"), resourceBundle.getString("PeriodFormat.commandand"), resourceBundle.getString("PeriodFormat.commaspaceand")};
    }

    /* renamed from: g */
    public static C12692p m54365g() {
        return m54366h(Locale.getDefault());
    }

    /* renamed from: h */
    public static C12692p m54366h(Locale locale) {
        ConcurrentMap<Locale, C12692p> concurrentMap = f31313b;
        C12692p pVar = concurrentMap.get(locale);
        if (pVar != null) {
            return pVar;
        }
        C12691a aVar = new C12691a(m54361c(locale));
        C12692p pVar2 = new C12692p(aVar, aVar, locale, (PeriodType) null);
        C12692p putIfAbsent = concurrentMap.putIfAbsent(locale, pVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return pVar2;
    }
}
