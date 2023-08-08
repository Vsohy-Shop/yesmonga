package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o3 */
public final class C39004o3 implements C39058u3 {

    /* renamed from: a */
    public final C39058u3[] f98906a;

    public C39004o3(C39058u3... u3VarArr) {
        this.f98906a = u3VarArr;
    }

    /* renamed from: a */
    public final C39049t3 mo122898a(Class<?> cls) {
        String str;
        C39058u3[] u3VarArr = this.f98906a;
        for (int i = 0; i < 2; i++) {
            C39058u3 u3Var = u3VarArr[i];
            if (u3Var.mo122899b(cls)) {
                return u3Var.mo122898a(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: b */
    public final boolean mo122899b(Class<?> cls) {
        C39058u3[] u3VarArr = this.f98906a;
        for (int i = 0; i < 2; i++) {
            if (u3VarArr[i].mo122899b(cls)) {
                return true;
            }
        }
        return false;
    }
}
