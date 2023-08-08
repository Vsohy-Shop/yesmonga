package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.C11429q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
@C11363r0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
/* renamed from: kotlin.reflect.x */
public final class C11529x implements WildcardType, C11526u {
    @C12579k

    /* renamed from: c */
    public static final C11530a f28660c = new C11530a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final C11529x f28661d = new C11529x((Type) null, (Type) null);
    @C12580l

    /* renamed from: a */
    public final Type f28662a;
    @C12580l

    /* renamed from: b */
    public final Type f28663b;

    /* renamed from: kotlin.reflect.x$a */
    public static final class C11530a {
        public /* synthetic */ C11530a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11529x mo23165a() {
            return C11529x.f28661d;
        }

        public C11530a() {
        }
    }

    public C11529x(@C12580l Type type, @C12580l Type type2) {
        this.f28662a = type;
        this.f28663b = type2;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    @C12579k
    public Type[] getLowerBounds() {
        Type type = this.f28663b;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @C12579k
    public String getTypeName() {
        if (this.f28663b != null) {
            return "? super " + TypesJVMKt.m44501j(this.f28663b);
        }
        Type type = this.f28662a;
        if (type == null || Intrinsics.areEqual((Object) type, (Object) Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.m44501j(this.f28662a);
    }

    @C12579k
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f28662a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @C12579k
    public String toString() {
        return getTypeName();
    }
}
