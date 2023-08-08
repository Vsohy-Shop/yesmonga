package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.platform.C15999y0;
import androidx.compose.runtime.internal.C8567o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11660u;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.j */
public final class C16035j implements C16044q, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, C11345a {

    /* renamed from: d */
    public static final int f39828d = 8;
    @C12579k

    /* renamed from: a */
    public final Map<SemanticsPropertyKey<?>, Object> f39829a = new LinkedHashMap();

    /* renamed from: b */
    public boolean f39830b;

    /* renamed from: c */
    public boolean f39831c;

    /* renamed from: H */
    public final boolean mo46152H() {
        return this.f39831c;
    }

    /* renamed from: M */
    public final boolean mo46153M() {
        return this.f39830b;
    }

    /* renamed from: Q */
    public final void mo46154Q(@C12579k C16035j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "child");
        for (Map.Entry next : jVar.f39829a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            Object obj = this.f39829a.get(semanticsPropertyKey);
            Intrinsics.checkNotNull(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object d = semanticsPropertyKey.mo46085d(obj, value);
            if (d != null) {
                this.f39829a.put(semanticsPropertyKey, d);
            }
        }
    }

    /* renamed from: W */
    public final void mo46155W(boolean z) {
        this.f39831c = z;
    }

    /* renamed from: X */
    public final void mo46156X(boolean z) {
        this.f39830b = z;
    }

    /* renamed from: e */
    public <T> void mo46157e(@C12579k SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        this.f39829a.put(semanticsPropertyKey, t);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16035j)) {
            return false;
        }
        C16035j jVar = (C16035j) obj;
        if (Intrinsics.areEqual((Object) this.f39829a, (Object) jVar.f39829a) && this.f39830b == jVar.f39830b && this.f39831c == jVar.f39831c) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo46159h(@C12579k C16035j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "peer");
        if (jVar.f39830b) {
            this.f39830b = true;
        }
        if (jVar.f39831c) {
            this.f39831c = true;
        }
        for (Map.Entry next : jVar.f39829a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            if (!this.f39829a.containsKey(semanticsPropertyKey)) {
                this.f39829a.put(semanticsPropertyKey, value);
            } else if (value instanceof C16023a) {
                Object obj = this.f39829a.get(semanticsPropertyKey);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C16023a aVar = (C16023a) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.f39829a;
                String b = aVar.mo46089b();
                if (b == null) {
                    b = ((C16023a) value).mo46089b();
                }
                C11660u a = aVar.mo46088a();
                if (a == null) {
                    a = ((C16023a) value).mo46088a();
                }
                map.put(semanticsPropertyKey, new C16023a(b, a));
            }
        }
    }

    public int hashCode() {
        return (((this.f39829a.hashCode() * 31) + Boolean.hashCode(this.f39830b)) * 31) + Boolean.hashCode(this.f39831c);
    }

    /* renamed from: i */
    public final <T> boolean mo46161i(@C12579k SemanticsPropertyKey<T> semanticsPropertyKey) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        return this.f39829a.containsKey(semanticsPropertyKey);
    }

    @C12579k
    public Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> iterator() {
        return this.f39829a.entrySet().iterator();
    }

    @C12579k
    /* renamed from: q */
    public final C16035j mo46163q() {
        C16035j jVar = new C16035j();
        jVar.f39830b = this.f39830b;
        jVar.f39831c = this.f39831c;
        jVar.f39829a.putAll(this.f39829a);
        return jVar;
    }

    /* renamed from: r */
    public final <T> T mo46164r(@C12579k SemanticsPropertyKey<T> semanticsPropertyKey) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        T t = this.f39829a.get(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f39830b) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f39831c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry next : this.f39829a.entrySet()) {
            Object value = next.getValue();
            sb.append(str);
            sb.append(((SemanticsPropertyKey) next.getKey()).mo46083b());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return C15999y0.m71811b(this, (String) null) + "{ " + sb + " }";
    }

    /* renamed from: w */
    public final <T> T mo46166w(@C12579k SemanticsPropertyKey<T> semanticsPropertyKey, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        T t = this.f39829a.get(semanticsPropertyKey);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    @C12580l
    /* renamed from: y */
    public final <T> T mo46167y(@C12579k SemanticsPropertyKey<T> semanticsPropertyKey, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        T t = this.f39829a.get(semanticsPropertyKey);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }
}
