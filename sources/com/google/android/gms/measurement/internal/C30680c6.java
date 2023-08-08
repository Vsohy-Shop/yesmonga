package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
public final class C30680c6 {
    /* renamed from: a */
    public static Object m123533a(@C0359n0 Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    /* renamed from: b */
    public static void m123534b(@C0359n0 Bundle bundle, @C0359n0 Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
