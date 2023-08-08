package androidx.compose.runtime.reflect;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.collections.C10956m;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1549#2:220\n1620#2,3:221\n1804#2,4:224\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n143#1:220\n143#1:221,3\n144#1:224,4\n*E\n"})
/* renamed from: androidx.compose.runtime.reflect.c */
public final class C8611c {

    /* renamed from: c */
    public static final int f23049c = 8;
    @C12579k

    /* renamed from: a */
    public final Method f23050a;
    @C12579k

    /* renamed from: b */
    public final C8609a f23051b;

    public C8611c(@C12579k Method method, @C12579k C8609a aVar) {
        Intrinsics.checkNotNullParameter(method, FirebaseAnalytics.C32532b.f78973v);
        Intrinsics.checkNotNullParameter(aVar, "composableInfo");
        this.f23050a = method;
        this.f23051b = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final Method mo16322a() {
        return this.f23050a;
    }

    /* renamed from: b */
    public final int mo16323b() {
        return this.f23051b.mo16319i();
    }

    @C12579k
    /* renamed from: c */
    public final Class<?>[] mo16324c() {
        Class[] parameterTypes = this.f23050a.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "method.parameterTypes");
        return (Class[]) C10956m.m41088M1(parameterTypes, 0, this.f23051b.mo16319i());
    }

    @C12579k
    /* renamed from: d */
    public final Parameter[] mo16325d() {
        Parameter[] a = this.f23050a.getParameters();
        Intrinsics.checkNotNullExpressionValue(a, "method.parameters");
        return (Parameter[]) C10956m.m41088M1(a, 0, this.f23051b.mo16319i());
    }

    @C12580l
    /* renamed from: e */
    public final Object mo16326e(@C12579k C8592o oVar, @C12580l Object obj, @C12579k Object... objArr) {
        boolean z;
        Object obj2;
        boolean z2;
        boolean z3;
        int i;
        Object[] objArr2 = objArr;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(oVar2, "composer");
        Intrinsics.checkNotNullParameter(objArr2, "args");
        C8609a aVar = this.f23051b;
        int b = aVar.mo16311b();
        int c = aVar.mo16312c();
        int d = aVar.mo16313d();
        int length = this.f23050a.getParameterTypes().length;
        int i2 = b + 1;
        int i3 = c + i2;
        Object[] objArr3 = new Integer[d];
        for (int i4 = 0; i4 < d; i4++) {
            int i5 = i4 * 31;
            C11466l W1 = C11479u.m44378W1(i5, Math.min(i5 + 31, b));
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                int c2 = ((C10953k0) it).mo6374c();
                if (c2 >= objArr2.length || objArr2[c2] == null) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int i6 = 0;
            int i7 = 0;
            for (Object next : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                i6 |= ((Number) next).intValue() << i7;
                i7 = i8;
            }
            objArr3[i4] = Integer.valueOf(i6);
        }
        Object[] objArr4 = new Object[length];
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 < 0 || i9 >= b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (i9 < 0 || i9 > ArraysKt___ArraysKt.m39523Xe(objArr)) {
                    Class cls = this.f23050a.getParameterTypes()[i9];
                    Intrinsics.checkNotNullExpressionValue(cls, "method.parameterTypes[idx]");
                    obj2 = C8612d.m31267h(cls);
                } else {
                    obj2 = objArr2[i9];
                }
            } else if (i9 == b) {
                obj2 = oVar2;
            } else {
                if (i9 != i2) {
                    if (i2 + 1 > i9 || i9 >= i3) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (i3 > i9 || i9 >= length) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            obj2 = objArr3[i9 - i3];
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                obj2 = 0;
            }
            objArr4[i9] = obj2;
        }
        return this.f23050a.invoke(obj, Arrays.copyOf(objArr4, length));
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C8611c) {
            return Intrinsics.areEqual((Object) this.f23050a, (Object) ((C8611c) obj).f23050a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23050a.hashCode();
    }
}
