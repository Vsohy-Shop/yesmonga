package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40999y;
import com.google.android.gms.dynamic.C41016d;
import java.lang.reflect.Field;

@C40473a
@C40999y
/* renamed from: com.google.android.gms.dynamic.f */
public final class C41019f<T> extends C41016d.C41017a {

    /* renamed from: n */
    public final Object f104297n;

    public C41019f(Object obj) {
        this.f104297n = obj;
    }

    @C40473a
    @C0359n0
    /* renamed from: O0 */
    public static <T> T m166810O0(@C0359n0 C41016d dVar) {
        if (dVar instanceof C41019f) {
            return ((C41019f) dVar).f104297n;
        }
        IBinder asBinder = dVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C40843u.m166202l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: T6 */
    public static <T> C41016d m166811T6(@C0359n0 T t) {
        return new C41019f(t);
    }
}
