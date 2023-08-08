package androidx.compose.runtime.reflect;

import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.analytics.location.C35560b;
import com.urbanairship.contacts.ContactApiClient;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,219:1\n185#1:232\n185#1:239\n185#1:246\n1735#2,6:220\n1549#3:226\n1620#3,3:227\n1549#3:233\n1620#3,3:234\n1549#3:240\n1620#3,3:241\n1549#3:247\n1620#3,3:248\n37#4,2:230\n37#4,2:237\n37#4,2:244\n37#4,2:251\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n201#1:232\n210#1:239\n211#1:246\n57#1:220,6\n185#1:226\n185#1:227,3\n201#1:233\n201#1:234,3\n210#1:240\n210#1:241,3\n211#1:247\n211#1:248,3\n185#1:230,2\n201#1:237,2\n210#1:244,2\n211#1:251,2\n*E\n"})
/* renamed from: androidx.compose.runtime.reflect.d */
public final class C8612d {

    /* renamed from: a */
    public static final int f23052a = 31;

    @C12580l
    /* renamed from: b */
    public static final C8611c m31261b(@C12579k Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        C8609a f = m31265f(method);
        if (f.mo16320j()) {
            return new C8611c(method, f);
        }
        return null;
    }

    /* renamed from: c */
    public static final int m31262c(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 10.0d);
    }

    /* renamed from: d */
    public static final int m31263d(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    /* renamed from: e */
    public static final /* synthetic */ <T> T[] m31264e(T t, int i) {
        C11466l W1 = C11479u.m44378W1(0, i);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            ((C10953k0) it).mo6374c();
            arrayList.add(t);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: f */
    public static final C8609a m31265f(Method method) {
        boolean z;
        int i;
        Class[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.areEqual((Object) parameterTypes[length], (Object) C8592o.class)) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        length = -1;
        boolean z2 = false;
        if (length == -1) {
            return new C8609a(false, method.getParameterTypes().length, 0, 0);
        }
        int c = m31262c(length, Modifier.isStatic(method.getModifiers()) ^ true ? 1 : 0);
        int i3 = length + 1 + c;
        int length2 = method.getParameterTypes().length;
        if (length2 != i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = m31263d(length);
        } else {
            i = 0;
        }
        if (i3 + i == length2) {
            z2 = true;
        }
        return new C8609a(z2, length, c, i);
    }

    @C12579k
    /* renamed from: g */
    public static final C8611c m31266g(@C12579k Class<?> cls, @C12579k String str, @C12579k Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        Class<C8592o> cls2 = C8592o.class;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(str, "methodName");
        Intrinsics.checkNotNullParameter(clsArr, "args");
        int c = m31262c(clsArr.length, 0);
        try {
            C11366s0 s0Var = new C11366s0(3);
            s0Var.mo22856b(clsArr);
            s0Var.mo22855a(cls2);
            Class cls3 = Integer.TYPE;
            C11466l W1 = C11479u.m44378W1(0, c);
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                ((C10953k0) it).mo6374c();
                arrayList.add(cls3);
            }
            s0Var.mo22856b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) s0Var.mo22858d(new Class[s0Var.mo22857c()]));
        } catch (ReflectiveOperationException unused) {
            int d = m31263d(clsArr.length);
            try {
                C11366s0 s0Var2 = new C11366s0(4);
                s0Var2.mo22856b(clsArr);
                s0Var2.mo22855a(cls2);
                Class cls4 = Integer.TYPE;
                C11466l W12 = C11479u.m44378W1(0, c);
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(W12, 10));
                Iterator it2 = W12.iterator();
                while (it2.hasNext()) {
                    ((C10953k0) it2).mo6374c();
                    arrayList2.add(cls4);
                }
                s0Var2.mo22856b(arrayList2.toArray(new Class[0]));
                Class cls5 = Integer.TYPE;
                C11466l W13 = C11479u.m44378W1(0, d);
                ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(W13, 10));
                Iterator it3 = W13.iterator();
                while (it3.hasNext()) {
                    ((C10953k0) it3).mo6374c();
                    arrayList3.add(cls5);
                }
                s0Var2.mo22856b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) s0Var2.mo22858d(new Class[s0Var2.mo22857c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            C8611c b = m31261b(method);
            Intrinsics.checkNotNull(b);
            return b;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* renamed from: h */
    public static final Object m31267h(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(ContactApiClient.f24442G)) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return 0;
                }
                break;
            case 3327612:
                if (name.equals(C35560b.f87804W0)) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals(C16717v.C16719b.f42183f)) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals(C16717v.C16719b.f42180c)) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }
}
