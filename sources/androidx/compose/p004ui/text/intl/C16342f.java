package androidx.compose.p004ui.text.intl;

import androidx.appcompat.app.C0499v;
import androidx.compose.runtime.C8585m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,84:1\n151#2,3:85\n33#2,4:88\n154#2,2:92\n38#2:94\n156#2:95\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n48#1:85,3\n48#1:88,4\n48#1:92,2\n48#1:94\n48#1:95\n48#1:96,4\n48#1:100,2\n48#1:102\n48#1:103\n*E\n"})
/* renamed from: androidx.compose.ui.text.intl.f */
public final class C16342f implements Collection<C16340e>, C11345a {
    @C12579k

    /* renamed from: c */
    public static final C16343a f40571c = new C16343a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40572d = 0;
    @C12579k

    /* renamed from: a */
    public final List<C16340e> f40573a;

    /* renamed from: b */
    public final int f40574b;

    /* renamed from: androidx.compose.ui.text.intl.f$a */
    public static final class C16343a {
        public /* synthetic */ C16343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16342f mo47385a() {
            return C16346i.m73631a().mo47352a();
        }

        public C16343a() {
        }
    }

    public C16342f(@C12579k List<C16340e> list) {
        Intrinsics.checkNotNullParameter(list, "localeList");
        this.f40573a = list;
        this.f40574b = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16340e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16340e)) {
            return false;
        }
        return mo47370h((C16340e) obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f40573a.containsAll(collection);
    }

    /* renamed from: e */
    public boolean mo47368e(C16340e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16342f) && Intrinsics.areEqual((Object) this.f40573a, (Object) ((C16342f) obj).f40573a)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo47370h(@C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "element");
        return this.f40573a.contains(eVar);
    }

    public int hashCode() {
        return this.f40573a.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C16340e mo47372i(int i) {
        return this.f40573a.get(i);
    }

    public boolean isEmpty() {
        return this.f40573a.isEmpty();
    }

    @C12579k
    public Iterator<C16340e> iterator() {
        return this.f40573a.iterator();
    }

    @C12579k
    /* renamed from: q */
    public final List<C16340e> mo47375q() {
        return this.f40573a;
    }

    /* renamed from: r */
    public int mo47376r() {
        return this.f40574b;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super C16340e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo47376r();
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public String toString() {
        return "LocaleList(localeList=" + this.f40573a + ')';
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16342f(@org.jetbrains.annotations.C12579k java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "languageTags"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            java.util.List r8 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r1, (java.lang.String[]) r2, (boolean) r3, (int) r4, (int) r5, (java.lang.Object) r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            int r1 = r8.size()
            r2 = 0
            r3 = r2
        L_0x0023:
            if (r3 >= r1) goto L_0x0039
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt__StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0039:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r0.size()
            r8.<init>(r1)
            int r1 = r0.size()
        L_0x0046:
            if (r2 >= r1) goto L_0x0059
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            androidx.compose.ui.text.intl.e r4 = new androidx.compose.ui.text.intl.e
            r4.<init>((java.lang.String) r3)
            r8.add(r4)
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r7.<init>((java.util.List<androidx.compose.p004ui.text.intl.C16340e>) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.intl.C16342f.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16342f(@C12579k C16340e... eVarArr) {
        this((List<C16340e>) ArraysKt___ArraysKt.m39955kz(eVarArr));
        Intrinsics.checkNotNullParameter(eVarArr, C0499v.f1276c);
    }
}
