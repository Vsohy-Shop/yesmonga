package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0376v0(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.i1 */
public class C17598i1 extends C17588h1 {

    /* renamed from: B */
    public static final String f45964B = "createFromFamiliesWithDefault";

    /* renamed from: C */
    public static final int f45965C = -1;

    /* renamed from: D */
    public static final String f45966D = "sans-serif";

    /* renamed from: B */
    public Method mo52035B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @C0359n0
    /* renamed from: g */
    public Typeface mo51928g(@C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* renamed from: p */
    public Typeface mo52039p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f45950m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f45956s.invoke((Object) null, new Object[]{newInstance, f45966D, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
