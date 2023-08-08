package kotlin.jvm;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.exifinterface.media.C19135a;
import com.urbanairship.analytics.location.C35560b;
import com.urbanairship.contacts.ContactApiClient;
import java.lang.annotation.Annotation;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11362r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "JvmClassMappingKt")
/* renamed from: kotlin.jvm.a */
public final class C11283a {
    @C12579k
    /* renamed from: a */
    public static final <T extends Annotation> C11494d<? extends T> m43405a(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        Intrinsics.checkNotNullExpressionValue(annotationType, "this as java.lang.annota…otation).annotationType()");
        C11494d<? extends T> i = m43413i(annotationType);
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i;
    }

    /* renamed from: b */
    public static final <E extends Enum<E>> Class<E> m43406b(Enum<E> enumR) {
        Intrinsics.checkNotNullParameter(enumR, "<this>");
        Class<E> declaringClass = enumR.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @C11110f
    @C11665v0(version = "1.7")
    /* renamed from: c */
    public static /* synthetic */ void m43407c(Enum enumR) {
    }

    @C12579k
    /* renamed from: d */
    public static final <T> Class<T> m43408d(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Class<?> cls = t.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @C11314h(name = "getJavaClass")
    @C12579k
    /* renamed from: e */
    public static final <T> Class<T> m43409e(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<?> o = ((C11362r) dVar).mo22787o();
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return o;
    }

    /* renamed from: f */
    public static /* synthetic */ void m43410f(C11494d dVar) {
    }

    @C12579k
    /* renamed from: g */
    public static final <T> Class<T> m43411g(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class o = ((C11362r) dVar).mo22787o();
        if (!o.isPrimitive()) {
            Intrinsics.checkNotNull(o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return o;
        }
        String name = o.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(ContactApiClient.f24442G)) {
                    o = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    o = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    o = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    o = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(C35560b.f87804W0)) {
                    o = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    o = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(C16717v.C16719b.f42183f)) {
                    o = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(C16717v.C16719b.f42180c)) {
                    o = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    o = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return o;
    }

    @C12580l
    /* renamed from: h */
    public static final <T> Class<T> m43412h(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<?> o = ((C11362r) dVar).mo22787o();
        if (o.isPrimitive()) {
            Intrinsics.checkNotNull(o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return o;
        }
        String name = o.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    @C11314h(name = "getKotlinClass")
    @C12579k
    /* renamed from: i */
    public static final <T> C11494d<T> m43413i(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return C11342l0.m43547d(cls);
    }

    @C11314h(name = "getRuntimeClassOfKClassInstance")
    @C12579k
    /* renamed from: j */
    public static final <T> Class<C11494d<T>> m43414j(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<?> cls = dVar.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @C11587t0(expression = "(this as Any).javaClass", imports = {}))
    /* renamed from: k */
    public static /* synthetic */ void m43415k(C11494d dVar) {
    }

    /* renamed from: l */
    public static final /* synthetic */ boolean m43416l(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
