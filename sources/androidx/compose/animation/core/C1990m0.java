package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n442#2:652\n392#2:653\n1238#3,4:654\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:652\n496#1:653\n496#1:654,4\n*E\n"})
/* renamed from: androidx.compose.animation.core.m0 */
public final class C1990m0<T> implements C2020y<T> {

    /* renamed from: b */
    public static final int f5552b = 0;
    @C12579k

    /* renamed from: a */
    public final C1992b<T> f5553a;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.animation.core.m0$b */
    public static final class C1992b<T> {

        /* renamed from: d */
        public static final int f5557d = 8;

        /* renamed from: a */
        public int f5558a = 300;

        /* renamed from: b */
        public int f5559b;
        @C12579k

        /* renamed from: c */
        public final Map<Integer, C1991a<T>> f5560c = new LinkedHashMap();

        @C12579k
        /* renamed from: a */
        public final C1991a<T> mo6914a(T t, int i) {
            C1991a<T> aVar = new C1991a<>(t, (C2022z) null, 2, (DefaultConstructorMarker) null);
            this.f5560c.put(Integer.valueOf(i), aVar);
            return aVar;
        }

        @C12579k
        /* renamed from: b */
        public final C1991a<T> mo6915b(T t, float f) {
            return mo6914a(t, C11409d.m43851L0(((float) this.f5558a) * f));
        }

        /* renamed from: c */
        public final int mo6916c() {
            return this.f5559b;
        }

        /* renamed from: d */
        public final int mo6917d() {
            return this.f5558a;
        }

        @C12579k
        /* renamed from: e */
        public final Map<Integer, C1991a<T>> mo6918e() {
            return this.f5560c;
        }

        public boolean equals(@C12580l Object obj) {
            if (obj instanceof C1992b) {
                C1992b bVar = (C1992b) obj;
                if (this.f5559b == bVar.f5559b && this.f5558a == bVar.f5558a && Intrinsics.areEqual((Object) this.f5560c, (Object) bVar.f5560c)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* renamed from: f */
        public final void mo6920f(int i) {
            this.f5559b = i;
        }

        /* renamed from: g */
        public final void mo6921g(int i) {
            this.f5558a = i;
        }

        /* renamed from: h */
        public final void mo6922h(@C12579k C1991a<T> aVar, @C12579k C2022z zVar) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(zVar, "easing");
            aVar.mo6910c(zVar);
        }

        public int hashCode() {
            return (((this.f5558a * 31) + this.f5559b) * 31) + this.f5560c.hashCode();
        }
    }

    public C1990m0(@C12579k C1992b<T> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "config");
        this.f5553a = bVar;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C1990m0) || !Intrinsics.areEqual((Object) this.f5553a, (Object) ((C1990m0) obj).f5553a)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: h */
    public final C1992b<T> mo6905h() {
        return this.f5553a;
    }

    public int hashCode() {
        return this.f5553a.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public <V extends C1997o> C1985k1<V> m8496a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        Map<Integer, C1991a<T>> e = this.f5553a.mo6918e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(e.size()));
        for (Map.Entry entry : e.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C1991a) entry.getValue()).mo6911d(a1Var.mo6792a()));
        }
        return new C1985k1<>(linkedHashMap, this.f5553a.mo6917d(), this.f5553a.mo6916c());
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.animation.core.m0$a */
    public static final class C1991a<T> {

        /* renamed from: c */
        public static final int f5554c = 8;

        /* renamed from: a */
        public final T f5555a;
        @C12579k

        /* renamed from: b */
        public C2022z f5556b;

        public C1991a(T t, @C12579k C2022z zVar) {
            Intrinsics.checkNotNullParameter(zVar, "easing");
            this.f5555a = t;
            this.f5556b = zVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2022z mo6908a() {
            return this.f5556b;
        }

        /* renamed from: b */
        public final T mo6909b() {
            return this.f5555a;
        }

        /* renamed from: c */
        public final void mo6910c(@C12579k C2022z zVar) {
            Intrinsics.checkNotNullParameter(zVar, "<set-?>");
            this.f5556b = zVar;
        }

        @C12579k
        /* renamed from: d */
        public final <V extends C1997o> Pair<V, C2022z> mo6911d(@C12579k C11300l<? super T, ? extends V> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "convertToVector");
            return C11078d1.m42659a(lVar.invoke(this.f5555a), this.f5556b);
        }

        public boolean equals(@C12580l Object obj) {
            if (obj instanceof C1991a) {
                C1991a aVar = (C1991a) obj;
                return Intrinsics.areEqual((Object) aVar.f5555a, (Object) this.f5555a) && Intrinsics.areEqual((Object) aVar.f5556b, (Object) this.f5556b);
            }
        }

        public int hashCode() {
            T t = this.f5555a;
            return ((t != null ? t.hashCode() : 0) * 31) + this.f5556b.hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1991a(Object obj, C2022z zVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? C1947b0.m8291c() : zVar);
        }
    }
}
