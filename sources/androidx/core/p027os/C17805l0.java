package androidx.core.p027os;

import android.os.PersistableBundle;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(21)
/* renamed from: androidx.core.os.l0 */
public final class C17805l0 {
    @C12579k

    /* renamed from: a */
    public static final C17805l0 f46186a = new C17805l0();

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: a */
    public static final PersistableBundle m81197a(int i) {
        return new PersistableBundle(i);
    }

    @C0373u
    @C11384m
    /* renamed from: b */
    public static final void m81198b(@C12579k PersistableBundle persistableBundle, @C12580l String str, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        if (obj == null) {
            persistableBundle.putString(str, (String) null);
        } else if (obj instanceof Boolean) {
            C17809m0.m81203a(persistableBundle, str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
        } else if (obj instanceof boolean[]) {
            C17809m0.m81204b(persistableBundle, str, (boolean[]) obj);
        } else if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            Intrinsics.checkNotNull(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            String canonicalName = componentType.getCanonicalName();
            throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + str + '\"');
        } else {
            String canonicalName2 = obj.getClass().getCanonicalName();
            throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + str + '\"');
        }
    }
}
