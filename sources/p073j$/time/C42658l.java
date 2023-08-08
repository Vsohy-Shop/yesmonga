package p073j$.time;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.l */
public final class C42658l implements Serializable {

    /* renamed from: d */
    public static final C42658l f107930d = new C42658l(0);

    /* renamed from: a */
    private final int f107931a = 0;

    /* renamed from: b */
    private final int f107932b = 0;

    /* renamed from: c */
    private final int f107933c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(new C42677p[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}));
    }

    private C42658l(int i) {
        this.f107933c = i;
    }

    /* renamed from: c */
    public static C42658l m172435c(int i) {
        return (i | 0) == 0 ? f107930d : new C42658l(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073j$.time.temporal.C42671j mo138191a(p073j$.time.chrono.C42594b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "temporal"
            java.util.Objects.requireNonNull(r5, r0)
            j$.time.temporal.m r0 = p073j$.time.temporal.C42676o.m172516a()
            java.lang.Object r0 = r5.mo137883c(r0)
            j$.time.chrono.Chronology r0 = (p073j$.time.chrono.Chronology) r0
            if (r0 == 0) goto L_0x0032
            j$.time.chrono.p r1 = p073j$.time.chrono.C42608p.f107789d
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x001a
            goto L_0x0032
        L_0x001a:
            j$.time.c r5 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Chronology mismatch, expected: ISO, actual: "
            r1.<init>(r2)
            java.lang.String r0 = r0.mo138038s()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L_0x0032:
            int r0 = r4.f107932b
            if (r0 != 0) goto L_0x003e
            int r0 = r4.f107931a
            if (r0 == 0) goto L_0x004e
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p073j$.time.temporal.ChronoUnit.YEARS
            goto L_0x004a
        L_0x003e:
            long r0 = r4.mo138193d()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            j$.time.temporal.ChronoUnit r2 = p073j$.time.temporal.ChronoUnit.MONTHS
        L_0x004a:
            j$.time.temporal.j r5 = r5.mo137905b(r0, r2)
        L_0x004e:
            int r0 = r4.f107933c
            if (r0 == 0) goto L_0x0059
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p073j$.time.temporal.ChronoUnit.DAYS
            j$.time.temporal.j r5 = r5.mo137905b(r0, r2)
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.C42658l.mo138191a(j$.time.chrono.b):j$.time.temporal.j");
    }

    /* renamed from: b */
    public final int mo138192b() {
        return this.f107933c;
    }

    /* renamed from: d */
    public final long mo138193d() {
        return (((long) this.f107931a) * 12) + ((long) this.f107932b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42658l)) {
            return false;
        }
        C42658l lVar = (C42658l) obj;
        return this.f107931a == lVar.f107931a && this.f107932b == lVar.f107932b && this.f107933c == lVar.f107933c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f107933c, 16) + Integer.rotateLeft(this.f107932b, 8) + this.f107931a;
    }

    public final String toString() {
        if (this == f107930d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f107931a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f107932b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(C15369g.f37978d);
        }
        int i3 = this.f107933c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
