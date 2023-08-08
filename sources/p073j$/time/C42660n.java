package p073j$.time;

import java.util.Objects;
import p073j$.time.zone.C42683c;
import p073j$.time.zone.C42687g;

/* renamed from: j$.time.n */
final class C42660n extends ZoneId {

    /* renamed from: b */
    private final String f107935b;

    /* renamed from: c */
    private final transient C42683c f107936c;

    C42660n(String str, C42683c cVar) {
        this.f107935b = str;
        this.f107936c = cVar;
    }

    /* renamed from: q */
    static C42660n m172439q(String str) {
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new C42586c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            return new C42660n(str, C42687g.m172581b(str, true));
        }
        throw new C42586c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    /* renamed from: n */
    public final C42683c mo138001n() {
        C42683c cVar = this.f107936c;
        return cVar != null ? cVar : C42687g.m172581b(this.f107935b, false);
    }

    /* renamed from: s */
    public final String mo138002s() {
        return this.f107935b;
    }
}
