package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public final class n00 implements v00 {

    /* renamed from: a */
    public final v00[] f71367a;

    public n00(v00... v00Arr) {
        this.f71367a = v00Arr;
    }

    /* renamed from: a */
    public final u00 mo84613a(Class<?> cls) {
        String str;
        v00[] v00Arr = this.f71367a;
        for (int i = 0; i < 2; i++) {
            v00 v00 = v00Arr[i];
            if (v00.mo84614b(cls)) {
                return v00.mo84613a(cls);
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
    public final boolean mo84614b(Class<?> cls) {
        v00[] v00Arr = this.f71367a;
        for (int i = 0; i < 2; i++) {
            if (v00Arr[i].mo84614b(cls)) {
                return true;
            }
        }
        return false;
    }
}
