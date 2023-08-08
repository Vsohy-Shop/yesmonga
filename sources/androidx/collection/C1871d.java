package androidx.collection;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.collection.d */
public final class C1871d {
    @C12579k
    /* renamed from: a */
    public static final <T> C1869c<T> m7465a() {
        return new C1869c<>();
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C1869c<T> m7466b(@C12579k T... tArr) {
        C1869c<T> cVar = new C1869c<>(tArr.length);
        for (T add : tArr) {
            cVar.add(add);
        }
        return cVar;
    }
}
