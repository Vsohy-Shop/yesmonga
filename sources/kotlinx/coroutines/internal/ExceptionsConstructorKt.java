package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11078d1;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.C11283a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12039j0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
public final class ExceptionsConstructorKt {

    /* renamed from: a */
    public static final int f29554a = m47728e(Throwable.class, -1);
    @C12579k

    /* renamed from: b */
    public static final C11998j f29555b;

    static {
        C11998j jVar;
        try {
            if (C12006n.m47897a()) {
                jVar = C11980a1.f29574a;
            } else {
                jVar = C11983c.f29580a;
            }
        } catch (Throwable unused) {
            jVar = C11980a1.f29574a;
        }
        f29555b = jVar;
    }

    /* renamed from: b */
    public static final <E extends Throwable> C11300l<Throwable, Throwable> m47725b(Class<E> cls) {
        Object obj;
        C11300l<Throwable, Throwable> lVar;
        Pair<A, B> pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.f29556f;
        if (f29554a != m47728e(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                Class<Throwable> cls2 = Throwable.class;
                Class<String> cls3 = String.class;
                if (length2 == 1) {
                    Class cls4 = parameterTypes[0];
                    if (Intrinsics.areEqual((Object) cls4, (Object) cls3)) {
                        pair = C11078d1.m42659a(m47729f(new ExceptionsConstructorKt$createConstructor$1$2(constructor)), 2);
                    } else if (Intrinsics.areEqual((Object) cls4, (Object) cls2)) {
                        pair = C11078d1.m42659a(m47729f(new ExceptionsConstructorKt$createConstructor$1$3(constructor)), 1);
                    } else {
                        pair = C11078d1.m42659a(null, -1);
                    }
                } else if (length2 != 2) {
                    pair = C11078d1.m42659a(null, -1);
                } else if (!Intrinsics.areEqual((Object) parameterTypes[0], (Object) cls3) || !Intrinsics.areEqual((Object) parameterTypes[1], (Object) cls2)) {
                    pair = C11078d1.m42659a(null, -1);
                } else {
                    pair = C11078d1.m42659a(m47729f(new ExceptionsConstructorKt$createConstructor$1$1(constructor)), 3);
                }
            } else {
                pair = C11078d1.m42659a(m47729f(new ExceptionsConstructorKt$createConstructor$1$4(constructor)), 0);
            }
            arrayList.add(pair);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).mo21851f()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).mo21851f()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 == null || (lVar = (C11300l) pair2.mo21849e()) == null) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        return lVar;
    }

    /* renamed from: c */
    public static final int m47726c(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: d */
    public static /* synthetic */ int m47727d(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m47726c(cls, i);
    }

    /* renamed from: e */
    public static final int m47728e(Class<?> cls, int i) {
        Integer num;
        C11283a.m43413i(cls);
        try {
            Result.C10852a aVar = Result.f28060a;
            num = Result.m38702b(Integer.valueOf(m47727d(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            num = Result.m38702b(C11661u0.m45734a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.m38709i(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: f */
    public static final C11300l<Throwable, Throwable> m47729f(C11300l<? super Throwable, ? extends Throwable> lVar) {
        return new ExceptionsConstructorKt$safeCtor$1(lVar);
    }

    @C12580l
    /* renamed from: g */
    public static final <E extends Throwable> E m47730g(@C12579k E e) {
        E e2;
        if (!(e instanceof C12039j0)) {
            return (Throwable) f29555b.mo24333a(e.getClass()).invoke(e);
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            e2 = Result.m38702b(((C12039j0) e).mo23577a());
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            e2 = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38709i(e2)) {
            e2 = null;
        }
        return (Throwable) e2;
    }
}
