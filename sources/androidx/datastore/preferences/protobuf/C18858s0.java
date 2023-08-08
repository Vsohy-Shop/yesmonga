package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s0 */
public final class C18858s0 {

    /* renamed from: a */
    public static final C18844q0<?> f48001a = new C18850r0();

    /* renamed from: b */
    public static final C18844q0<?> f48002b = m87408c();

    /* renamed from: a */
    public static C18844q0<?> m87406a() {
        C18844q0<?> q0Var = f48002b;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C18844q0<?> m87407b() {
        return f48001a;
    }

    /* renamed from: c */
    public static C18844q0<?> m87408c() {
        try {
            return (C18844q0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
