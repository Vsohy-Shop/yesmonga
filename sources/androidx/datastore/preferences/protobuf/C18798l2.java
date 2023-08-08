package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l2 */
public final class C18798l2 {

    /* renamed from: a */
    public static final C18777j2 f47915a = m86545c();

    /* renamed from: b */
    public static final C18777j2 f47916b = new C18788k2();

    /* renamed from: a */
    public static C18777j2 m86543a() {
        return f47915a;
    }

    /* renamed from: b */
    public static C18777j2 m86544b() {
        return f47916b;
    }

    /* renamed from: c */
    public static C18777j2 m86545c() {
        try {
            return (C18777j2) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
