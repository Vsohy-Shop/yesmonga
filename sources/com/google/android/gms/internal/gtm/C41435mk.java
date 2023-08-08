package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.mk */
public final class C41435mk implements C41579sk {

    /* renamed from: a */
    public final C41579sk[] f104804a;

    public C41435mk(C41579sk... skVarArr) {
        this.f104804a = skVarArr;
    }

    /* renamed from: a */
    public final C41555rk mo135345a(Class<?> cls) {
        String str;
        C41579sk[] skVarArr = this.f104804a;
        for (int i = 0; i < 2; i++) {
            C41579sk skVar = skVarArr[i];
            if (skVar.mo135346b(cls)) {
                return skVar.mo135345a(cls);
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
    public final boolean mo135346b(Class<?> cls) {
        C41579sk[] skVarArr = this.f104804a;
        for (int i = 0; i < 2; i++) {
            if (skVarArr[i].mo135346b(cls)) {
                return true;
            }
        }
        return false;
    }
}
