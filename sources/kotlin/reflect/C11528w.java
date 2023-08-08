package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.C11429q;
import kotlin.NotImplementedError;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
@C11363r0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
/* renamed from: kotlin.reflect.w */
public final class C11528w implements TypeVariable<GenericDeclaration>, C11526u {
    @C12579k

    /* renamed from: a */
    public final C11522s f28659a;

    public C11528w(@C12579k C11522s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "typeParameter");
        this.f28659a = sVar;
    }

    @C12580l
    /* renamed from: a */
    public final <T extends Annotation> T mo23151a(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "annotationClass");
        return null;
    }

    @C12579k
    /* renamed from: b */
    public final Annotation[] mo23152b() {
        return new Annotation[0];
    }

    @C12579k
    /* renamed from: c */
    public final Annotation[] mo23153c() {
        return new Annotation[0];
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return Intrinsics.areEqual((Object) getName(), (Object) typeVariable.getName()) && Intrinsics.areEqual((Object) getGenericDeclaration(), (Object) typeVariable.getGenericDeclaration());
        }
    }

    @C12579k
    public Type[] getBounds() {
        Iterable<C11520r> upperBounds = this.f28659a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(upperBounds, 10));
        for (C11520r a : upperBounds) {
            arrayList.add(TypesJVMKt.m44494c(a, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @C12579k
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f28659a));
    }

    @C12579k
    public String getName() {
        return this.f28659a.getName();
    }

    @C12579k
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @C12579k
    public String toString() {
        return getTypeName();
    }
}
