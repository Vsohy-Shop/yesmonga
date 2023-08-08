package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.C11079d2;
import kotlin.jvm.C11288f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
@C11363r0({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.o */
public final class C12008o<E> {
    @C12580l

    /* renamed from: a */
    public final Object f29617a;

    public /* synthetic */ C12008o(Object obj) {
        this.f29617a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C12008o m47917a(Object obj) {
        return new C12008o(obj);
    }

    @C12579k
    /* renamed from: b */
    public static <E> Object m47918b(@C12580l Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m47919c(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m47918b(obj);
    }

    /* renamed from: d */
    public static boolean m47920d(Object obj, Object obj2) {
        return (obj2 instanceof C12008o) && Intrinsics.areEqual(obj, ((C12008o) obj2).mo24397j());
    }

    /* renamed from: e */
    public static final boolean m47921e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: f */
    public static final void m47922f(Object obj, @C12579k C11300l<? super E, C11079d2> lVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                lVar.invoke(obj);
                return;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    lVar.invoke(arrayList.get(size));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public static int m47923g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @C12579k
    /* renamed from: h */
    public static final Object m47924h(Object obj, E e) {
        if (obj == null) {
            return m47918b(e);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            return m47918b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m47918b(arrayList);
    }

    /* renamed from: i */
    public static String m47925i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m47920d(this.f29617a, obj);
    }

    public int hashCode() {
        return m47923g(this.f29617a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo24397j() {
        return this.f29617a;
    }

    public String toString() {
        return m47925i(this.f29617a);
    }
}
