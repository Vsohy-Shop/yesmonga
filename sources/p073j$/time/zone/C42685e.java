package p073j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;

/* renamed from: j$.time.zone.e */
final class C42685e implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ List f107998a;

    C42685e(List list) {
        this.f107998a = list;
    }

    public final Object run() {
        Class<C42687g> cls = C42687g.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C42687g cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                C42687g.m172582e(cast);
                this.f107998a.add(cast);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        } else {
            C42687g.m172582e(new C42686f());
            return null;
        }
    }
}
