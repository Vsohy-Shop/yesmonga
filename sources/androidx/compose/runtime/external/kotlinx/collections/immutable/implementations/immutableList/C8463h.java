package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8444c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8534e;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.h */
public final class C8463h<E> extends AbstractPersistentList<E> implements C8444c<E> {
    @C12579k

    /* renamed from: c */
    public static final C8464a f22834c = new C8464a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final C8463h f22835d = new C8463h(new Object[0]);
    @C12579k

    /* renamed from: b */
    public final Object[] f22836b;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.h$a */
    public static final class C8464a {
        public /* synthetic */ C8464a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8463h mo15768a() {
            return C8463h.f22835d;
        }

        public C8464a() {
        }
    }

    public C8463h(@C12579k Object[] objArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f22836b = objArr;
        if (objArr.length <= 32) {
            z = true;
        } else {
            z = false;
        }
        C8530a.m30952a(z);
    }

    @C12579k
    /* renamed from: Z0 */
    public C8450g<E> mo15661Z0(int i) {
        C8534e.m30960a(i, size());
        if (size() == 1) {
            return f22835d;
        }
        Object[] copyOf = Arrays.copyOf(this.f22836b, size() - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        C10956m.m41183c1(this.f22836b, copyOf, i, i + 1, size());
        return new C8463h(copyOf);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22836b.length;
    }

    public E get(int i) {
        C8534e.m30960a(i, size());
        return this.f22836b[i];
    }

    /* renamed from: i */
    public final Object[] mo15765i(int i) {
        return new Object[i];
    }

    public int indexOf(Object obj) {
        return ArraysKt___ArraysKt.m39905jg(this.f22836b, obj);
    }

    public int lastIndexOf(Object obj) {
        return ArraysKt___ArraysKt.m40031ni(this.f22836b, obj);
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        C8534e.m30961b(i, size());
        return new C8457b(this.f22836b, i, size());
    }

    @C12579k
    public C8450g<E> set(int i, E e) {
        C8534e.m30960a(i, size());
        Object[] objArr = this.f22836b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new C8463h(copyOf);
    }

    @C12579k
    /* renamed from: D */
    public C8450g<E> m30627D(@C12579k C11300l<? super E, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        Object[] objArr = this.f22836b;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.f22836b[i];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.f22836b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return f22835d;
        }
        return new C8463h(C10956m.m41088M1(objArr, 0, size));
    }

    @C12579k
    public C8450g<E> add(E e) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f22836b, size() + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e;
            return new C8463h(copyOf);
        }
        return new C8459d(this.f22836b, C8466j.m30638c(e), size() + 1, 0);
    }

    @C12579k
    public C8450g<E> addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f22836b, size() + collection.size());
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new C8463h(copyOf);
        }
        C8450g.C8451a builder = builder();
        builder.addAll(collection);
        return builder.mo15660g();
    }

    @C12579k
    public C8450g.C8451a<E> builder() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.f22836b, 0);
    }

    @C12579k
    public C8450g<E> add(int i, E e) {
        C8534e.m30961b(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        if (size() < 32) {
            Object[] i2 = mo15765i(size() + 1);
            C10956m.m41237l1(this.f22836b, i2, 0, 0, i, 6, (Object) null);
            C10956m.m41183c1(this.f22836b, i2, i + 1, i, size());
            i2[i] = e;
            return new C8463h(i2);
        }
        Object[] objArr = this.f22836b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        C10956m.m41183c1(this.f22836b, copyOf, i + 1, i, size() - 1);
        copyOf[i] = e;
        return new C8459d(copyOf, C8466j.m30638c(this.f22836b[31]), size() + 1, 0);
    }

    @C12579k
    public C8450g<E> addAll(int i, @C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "c");
        C8534e.m30961b(i, size());
        if (size() + collection.size() <= 32) {
            Object[] i2 = mo15765i(size() + collection.size());
            C10956m.m41237l1(this.f22836b, i2, 0, 0, i, 6, (Object) null);
            C10956m.m41183c1(this.f22836b, i2, collection.size() + i, i, size());
            for (Object obj : collection) {
                i2[i] = obj;
                i++;
            }
            return new C8463h(i2);
        }
        C8450g.C8451a builder = builder();
        builder.addAll(i, collection);
        return builder.mo15660g();
    }
}
