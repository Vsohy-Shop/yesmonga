package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
public final class C41985h9 {

    /* renamed from: a */
    public static final C41949f9 f106190a = new C41967g9();

    /* renamed from: b */
    public static final C41949f9 f106191b;

    static {
        C41949f9 f9Var;
        try {
            f9Var = (C41949f9) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f9Var = null;
        }
        f106191b = f9Var;
    }

    /* renamed from: a */
    public static C41949f9 m170219a() {
        C41949f9 f9Var = f106191b;
        if (f9Var != null) {
            return f9Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C41949f9 m170220b() {
        return f106190a;
    }
}
