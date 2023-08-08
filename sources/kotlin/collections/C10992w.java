package kotlin.collections;

import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.w */
public class C10992w extends C10990v {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: g0 */
    public static final <T> void m42332g0(List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.fill(list, t);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: h0 */
    public static final <T> void m42333h0(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.shuffle(list);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: i0 */
    public static final <T> void m42334i0(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        Collections.shuffle(list, random);
    }

    /* renamed from: j0 */
    public static final <T extends Comparable<? super T>> void m42335j0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @C11587t0(expression = "this.sortWith(comparator)", imports = {}))
    @C11110f
    /* renamed from: k0 */
    public static final <T> void m42336k0(List<T> list, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @C11587t0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @C11110f
    /* renamed from: l0 */
    public static final <T> void m42337l0(List<T> list, C11304p<? super T, ? super T, Integer> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "comparison");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: m0 */
    public static final <T> void m42338m0(@C12579k List<T> list, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
