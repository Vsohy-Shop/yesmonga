package androidx.compose.p004ui;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15857b4;
import androidx.compose.p004ui.platform.C15983v0;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nActual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n35#1:51\n36#1:52,6\n*E\n"})
/* renamed from: androidx.compose.ui.b */
public final class C8732b {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n1#1,328:1\n35#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.b$a */
    public static final class C8733a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((Field) t).getName(), ((Field) t2).getName());
        }
    }

    /* renamed from: a */
    public static final boolean m32369a(@C12579k Object obj, @C12579k Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "a");
        Intrinsics.checkNotNullParameter(obj2, "b");
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m32370b(@C12579k C15983v0 v0Var, @C12579k C15723p0<?> p0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(p0Var, "element");
        Field[] declaredFields = p0Var.getClass().getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "element.javaClass.declaredFields");
        List mw = ArraysKt___ArraysKt.m40014mw(declaredFields, new C8733a());
        int size = mw.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) mw.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(C15723p0.class)) {
                try {
                    field.setAccessible(true);
                    C15857b4 b = v0Var.mo45971b();
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "field.name");
                    b.mo45707c(name, field.get(p0Var));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
