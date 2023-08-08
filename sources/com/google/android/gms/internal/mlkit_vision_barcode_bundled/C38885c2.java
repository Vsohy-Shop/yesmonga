package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2 */
public final class C38885c2 {

    /* renamed from: a */
    public static final C38865a2<?> f98813a = new C38875b2();

    /* renamed from: b */
    public static final C38865a2<?> f98814b;

    static {
        C38865a2<?> a2Var;
        try {
            a2Var = (C38865a2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            a2Var = null;
        }
        f98814b = a2Var;
    }

    /* renamed from: a */
    public static C38865a2<?> m160405a() {
        C38865a2<?> a2Var = f98814b;
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C38865a2<?> m160406b() {
        return f98813a;
    }
}
