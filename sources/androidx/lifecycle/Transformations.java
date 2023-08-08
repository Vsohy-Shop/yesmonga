package androidx.lifecycle;

import androidx.annotation.C0349j;
import androidx.annotation.C0353k0;
import androidx.arch.core.util.C0843a;
import kotlin.C11395k;
import kotlin.C11660u;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "Transformations")
public final class Transformations {

    /* renamed from: androidx.lifecycle.Transformations$a */
    public static final class C19384a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f49740a;

        public C19384a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f49740a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f49740a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f49740a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @C0349j
    @C11314h(name = "distinctUntilChanged")
    @C0353k0
    @C12579k
    /* renamed from: a */
    public static final <X> LiveData<X> m90601a(@C12579k LiveData<X> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        C19406e0 e0Var = new C19406e0();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.mo57490j()) {
            e0Var.mo57496r(liveData.mo4610f());
            booleanRef.element = false;
        }
        e0Var.mo4611s(liveData, new C19384a(new Transformations$distinctUntilChanged$1(e0Var, booleanRef)));
        return e0Var;
    }

    @C0349j
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @C11314h(name = "map")
    @C0353k0
    /* renamed from: b */
    public static final /* synthetic */ LiveData m90602b(LiveData liveData, C0843a aVar) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "mapFunction");
        C19406e0 e0Var = new C19406e0();
        e0Var.mo4611s(liveData, new C19384a(new Transformations$map$2(e0Var, aVar)));
        return e0Var;
    }

    @C0349j
    @C11314h(name = "map")
    @C0353k0
    @C12579k
    /* renamed from: c */
    public static final <X, Y> LiveData<Y> m90603c(@C12579k LiveData<X> liveData, @C12579k C11300l<X, Y> lVar) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        C19406e0 e0Var = new C19406e0();
        e0Var.mo4611s(liveData, new C19384a(new Transformations$map$1(e0Var, lVar)));
        return e0Var;
    }

    @C0349j
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @C11314h(name = "switchMap")
    @C0353k0
    /* renamed from: d */
    public static final /* synthetic */ LiveData m90604d(LiveData liveData, C0843a aVar) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "switchMapFunction");
        C19406e0 e0Var = new C19406e0();
        e0Var.mo4611s(liveData, new Transformations$switchMap$2(aVar, e0Var));
        return e0Var;
    }

    @C0349j
    @C11314h(name = "switchMap")
    @C0353k0
    @C12579k
    /* renamed from: e */
    public static final <X, Y> LiveData<Y> m90605e(@C12579k LiveData<X> liveData, @C12579k C11300l<X, LiveData<Y>> lVar) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        C19406e0 e0Var = new C19406e0();
        e0Var.mo4611s(liveData, new Transformations$switchMap$1(lVar, e0Var));
        return e0Var;
    }
}
