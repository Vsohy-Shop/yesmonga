package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: kotlin.coroutines.jvm.internal.g */
public final class C11070g {
    @C12579k

    /* renamed from: a */
    public static final C11070g f28260a = new C11070g();
    @C12579k

    /* renamed from: b */
    public static final C11071a f28261b = new C11071a((Method) null, (Method) null, (Method) null);
    @C12580l

    /* renamed from: c */
    public static C11071a f28262c;

    /* renamed from: kotlin.coroutines.jvm.internal.g$a */
    public static final class C11071a {
        @C12580l
        @C11287e

        /* renamed from: a */
        public final Method f28263a;
        @C12580l
        @C11287e

        /* renamed from: b */
        public final Method f28264b;
        @C12580l
        @C11287e

        /* renamed from: c */
        public final Method f28265c;

        public C11071a(@C12580l Method method, @C12580l Method method2, @C12580l Method method3) {
            this.f28263a = method;
            this.f28264b = method2;
            this.f28265c = method3;
        }
    }

    /* renamed from: a */
    public final C11071a mo22509a(BaseContinuationImpl baseContinuationImpl) {
        try {
            C11071a aVar = new C11071a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f28262c = aVar;
            return aVar;
        } catch (Exception unused) {
            C11071a aVar2 = f28261b;
            f28262c = aVar2;
            return aVar2;
        }
    }

    @C12580l
    /* renamed from: b */
    public final String mo22510b(@C12579k BaseContinuationImpl baseContinuationImpl) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "continuation");
        C11071a aVar = f28262c;
        if (aVar == null) {
            aVar = mo22509a(baseContinuationImpl);
        }
        if (aVar == f28261b) {
            return null;
        }
        Method method = aVar.f28263a;
        if (method != null) {
            obj = method.invoke(baseContinuationImpl.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f28264b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f28265c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
