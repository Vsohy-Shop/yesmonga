package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.w1 */
public final class C18898w1 {

    /* renamed from: a */
    public static final C18881u1 f48106a = m87905c();

    /* renamed from: b */
    public static final C18881u1 f48107b = new C18886v1();

    /* renamed from: a */
    public static C18881u1 m87903a() {
        return f48106a;
    }

    /* renamed from: b */
    public static C18881u1 m87904b() {
        return f48107b;
    }

    /* renamed from: c */
    public static C18881u1 m87905c() {
        try {
            return (C18881u1) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
