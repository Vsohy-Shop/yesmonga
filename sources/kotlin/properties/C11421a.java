package kotlin.properties;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.properties.a */
public final class C11421a {
    @C12579k

    /* renamed from: a */
    public static final C11421a f28554a = new C11421a();

    @C11363r0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: kotlin.properties.a$a */
    public static final class C11422a extends C11425c<T> {

        /* renamed from: b */
        public final /* synthetic */ C11305q<C11510n<?>, T, T, C11079d2> f28555b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11422a(T t, C11305q<? super C11510n<?>, ? super T, ? super T, C11079d2> qVar) {
            super(t);
            this.f28555b = qVar;
        }

        /* renamed from: c */
        public void mo22936c(@C12579k C11510n<?> nVar, T t, T t2) {
            Intrinsics.checkNotNullParameter(nVar, "property");
            this.f28555b.invoke(nVar, t, t2);
        }
    }

    @C11363r0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: kotlin.properties.a$b */
    public static final class C11423b extends C11425c<T> {

        /* renamed from: b */
        public final /* synthetic */ C11305q<C11510n<?>, T, T, Boolean> f28556b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11423b(T t, C11305q<? super C11510n<?>, ? super T, ? super T, Boolean> qVar) {
            super(t);
            this.f28556b = qVar;
        }

        /* renamed from: d */
        public boolean mo22937d(@C12579k C11510n<?> nVar, T t, T t2) {
            Intrinsics.checkNotNullParameter(nVar, "property");
            return this.f28556b.invoke(nVar, t, t2).booleanValue();
        }
    }

    @C12579k
    /* renamed from: a */
    public final <T> C11428f<Object, T> mo22933a() {
        return new C11424b();
    }

    @C12579k
    /* renamed from: b */
    public final <T> C11428f<Object, T> mo22934b(T t, @C12579k C11305q<? super C11510n<?>, ? super T, ? super T, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "onChange");
        return new C11422a(t, qVar);
    }

    @C12579k
    /* renamed from: c */
    public final <T> C11428f<Object, T> mo22935c(T t, @C12579k C11305q<? super C11510n<?>, ? super T, ? super T, Boolean> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "onChange");
        return new C11423b(t, qVar);
    }
}
