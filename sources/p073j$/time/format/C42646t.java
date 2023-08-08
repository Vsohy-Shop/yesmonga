package p073j$.time.format;

import java.util.Locale;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.WeekFields;

/* renamed from: j$.time.format.t */
final class C42646t implements C42633g {

    /* renamed from: a */
    private char f107899a;

    /* renamed from: b */
    private int f107900b;

    C42646t(char c, int i) {
        this.f107899a = c;
        this.f107900b = i;
    }

    /* renamed from: a */
    private C42637k m172393a(Locale locale) {
        C42675n nVar;
        WeekFields of = WeekFields.m172453of(locale);
        char c = this.f107899a;
        if (c == 'W') {
            nVar = of.mo138206h();
        } else if (c == 'Y') {
            C42675n g = of.mo138204g();
            int i = this.f107900b;
            if (i == 2) {
                return new C42643q(g, C42643q.f107891i, 0);
            }
            return new C42637k(g, i, 19, i < 4 ? C42625D.NORMAL : C42625D.EXCEEDS_PAD, -1);
        } else if (c == 'c' || c == 'e') {
            nVar = of.mo138201d();
        } else if (c == 'w') {
            nVar = of.mo138208i();
        } else {
            throw new IllegalStateException("unreachable");
        }
        return new C42637k(nVar, this.f107900b == 2 ? 2 : 1, 2, C42625D.NOT_NEGATIVE);
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        return m172393a(yVar.mo138183c()).mo138135n(yVar, sb);
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        return m172393a(wVar.mo138168i()).mo138136o(wVar, charSequence, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f107899a;
        if (c == 'Y') {
            int i = this.f107900b;
            if (i == 1) {
                sb.append("WeekBasedYear");
            } else if (i == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f107900b);
                sb.append(",19,");
                sb.append(this.f107900b < 4 ? C42625D.NORMAL : C42625D.EXCEEDS_PAD);
            }
        } else {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(this.f107900b);
        }
        sb.append(")");
        return sb.toString();
    }
}
