package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C18602a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MutablePreferences extends C18602a {
    @C12579k

    /* renamed from: a */
    public final Map<C18602a.C18603a<?>, Object> f47457a;
    @C12579k

    /* renamed from: b */
    public final AtomicBoolean f47458b;

    public MutablePreferences() {
        this((Map) null, false, 3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public Map<C18602a.C18603a<?>, Object> mo53692a() {
        Map<C18602a.C18603a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f47457a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    /* renamed from: b */
    public <T> boolean mo53693b(@C12579k C18602a.C18603a<T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        return this.f47457a.containsKey(aVar);
    }

    @C12580l
    /* renamed from: c */
    public <T> T mo53694c(@C12579k C18602a.C18603a<T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        return this.f47457a.get(aVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof MutablePreferences) {
            return Intrinsics.areEqual((Object) this.f47457a, (Object) ((MutablePreferences) obj).f47457a);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo53696f() {
        if (!(!this.f47458b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* renamed from: g */
    public final void mo53697g() {
        mo53696f();
        this.f47457a.clear();
    }

    /* renamed from: h */
    public final void mo53698h() {
        this.f47458b.set(true);
    }

    public int hashCode() {
        return this.f47457a.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final Map<C18602a.C18603a<?>, Object> mo53700i() {
        return this.f47457a;
    }

    /* renamed from: j */
    public final void mo53701j(@C12579k C18602a.C18603a<?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        mo53696f();
        mo53705n(aVar);
    }

    /* renamed from: k */
    public final void mo53702k(@C12579k C18602a.C18604b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "pair");
        mo53696f();
        mo53704m(bVar);
    }

    /* renamed from: l */
    public final void mo53703l(@C12579k C18602a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "prefs");
        mo53696f();
        this.f47457a.putAll(aVar.mo53692a());
    }

    /* renamed from: m */
    public final void mo53704m(@C12579k C18602a.C18604b<?>... bVarArr) {
        Intrinsics.checkNotNullParameter(bVarArr, "pairs");
        mo53696f();
        for (C18602a.C18604b<?> bVar : bVarArr) {
            mo53707p(bVar.mo53724a(), bVar.mo53725b());
        }
    }

    /* renamed from: n */
    public final <T> T mo53705n(@C12579k C18602a.C18603a<T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        mo53696f();
        return this.f47457a.remove(aVar);
    }

    /* renamed from: o */
    public final <T> void mo53706o(@C12579k C18602a.C18603a<T> aVar, T t) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        mo53707p(aVar, t);
    }

    /* renamed from: p */
    public final void mo53707p(@C12579k C18602a.C18603a<?> aVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(aVar, "key");
        mo53696f();
        if (obj == null) {
            mo53705n(aVar);
        } else if (obj instanceof Set) {
            Map<C18602a.C18603a<?>, Object> map = this.f47457a;
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt___CollectionsKt.m40582V5((Iterable) obj));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f47457a.put(aVar, obj);
        }
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(this.f47457a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, MutablePreferences$toString$1.f47459f, 24, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public MutablePreferences(@C12579k Map<C18602a.C18603a<?>, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "preferencesMap");
        this.f47457a = map;
        this.f47458b = new AtomicBoolean(z);
    }
}
