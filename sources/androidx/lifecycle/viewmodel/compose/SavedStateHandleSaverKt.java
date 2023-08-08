package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.C8629f;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.p027os.C17779d;
import androidx.lifecycle.C19456p0;
import androidx.savedstate.C20431c;
import kotlin.C11078d1;
import kotlin.C11660u;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.C11426d;
import kotlin.properties.C11427e;
import kotlin.properties.C11428f;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class SavedStateHandleSaverKt {

    /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$a */
    public static final class C19482a implements C20431c.C20434c {

        /* renamed from: a */
        public final /* synthetic */ C8628e<T, ? extends Object> f49873a;

        /* renamed from: b */
        public final /* synthetic */ T f49874b;

        /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$a$a */
        public /* synthetic */ class C19483a implements C8629f, C11379z {

            /* renamed from: a */
            public final /* synthetic */ C19456p0.C19457a f49875a;

            public C19483a(C19456p0.C19457a aVar) {
                this.f49875a = aVar;
            }

            /* renamed from: a */
            public final boolean mo16389a(@C12580l Object obj) {
                return this.f49875a.mo57659b(obj);
            }

            public final boolean equals(@C12580l Object obj) {
                if (!(obj instanceof C8629f) || !(obj instanceof C11379z)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
            }

            @C12579k
            public final C11660u<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.f49875a, C19456p0.C19457a.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public C19482a(C8628e<T, ? extends Object> eVar, T t) {
            this.f49873a = eVar;
            this.f49874b = t;
        }

        @C12579k
        /* renamed from: c */
        public final Bundle mo832c() {
            return C17779d.m81164b(C11078d1.m42659a("value", this.f49873a.mo16406a(new C19483a(C19456p0.f49832f), this.f49874b)));
        }
    }

    /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$b */
    public static final class C19484b implements C11426d<Object, C11427e<? super Object, ? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ C19456p0 f49876a;

        /* renamed from: b */
        public final /* synthetic */ C8628e<T, ? extends Object> f49877b;

        /* renamed from: c */
        public final /* synthetic */ C11289a<T> f49878c;

        /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$b$a */
        public static final class C19485a implements C11427e<Object, T> {

            /* renamed from: a */
            public final /* synthetic */ T f49879a;

            public C19485a(T t) {
                this.f49879a = t;
            }

            @C12579k
            /* renamed from: a */
            public final T mo22938a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
                Intrinsics.checkNotNullParameter(nVar, "<anonymous parameter 1>");
                return this.f49879a;
            }
        }

        public C19484b(C19456p0 p0Var, C8628e<T, ? extends Object> eVar, C11289a<? extends T> aVar) {
            this.f49876a = p0Var;
            this.f49877b = eVar;
            this.f49878c = aVar;
        }

        @C12579k
        /* renamed from: b */
        public final C11427e<Object, T> mo22940a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
            Intrinsics.checkNotNullParameter(nVar, "property");
            return new C19485a(SavedStateHandleSaverKt.m90816c(this.f49876a, nVar.getName(), this.f49877b, this.f49878c));
        }
    }

    /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$c */
    public static final class C19486c implements C11426d<Object, C11428f<? super Object, T>> {

        /* renamed from: a */
        public final /* synthetic */ C19456p0 f49880a;

        /* renamed from: b */
        public final /* synthetic */ C8628e<T, ? extends Object> f49881b;

        /* renamed from: c */
        public final /* synthetic */ C11289a<M> f49882c;

        @C11363r0({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$provideDelegate$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,196:1\n89#2:197\n115#2,2:198\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$provideDelegate$1\n*L\n167#1:197\n170#1:198,2\n*E\n"})
        /* renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$c$a */
        public static final class C19487a implements C11428f<Object, T> {

            /* renamed from: a */
            public final /* synthetic */ C8700z0<T> f49883a;

            public C19487a(C8700z0<T> z0Var) {
                this.f49883a = z0Var;
            }

            @C12579k
            /* renamed from: a */
            public T mo22938a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
                Intrinsics.checkNotNullParameter(nVar, "property");
                return this.f49883a.getValue();
            }

            /* renamed from: b */
            public void mo22939b(@C12580l Object obj, @C12579k C11510n<?> nVar, @C12579k T t) {
                Intrinsics.checkNotNullParameter(nVar, "property");
                Intrinsics.checkNotNullParameter(t, "value");
                this.f49883a.setValue(t);
            }
        }

        public C19486c(C19456p0 p0Var, C8628e<T, ? extends Object> eVar, C11289a<? extends M> aVar) {
            this.f49880a = p0Var;
            this.f49881b = eVar;
            this.f49882c = aVar;
        }

        @C12579k
        /* renamed from: b */
        public final C11428f<Object, T> mo22940a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
            Intrinsics.checkNotNullParameter(nVar, "property");
            return new C19487a(SavedStateHandleSaverKt.m90815b(this.f49880a, nVar.getName(), this.f49881b, this.f49882c));
        }
    }

    /* renamed from: a */
    public static final <T> C8628e<C8700z0<T>, C8700z0<Object>> m90814a(C8628e<T, ? extends Object> eVar) {
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.m31375a(new SavedStateHandleSaverKt$mutableStateSaver$1$1(eVar), new SavedStateHandleSaverKt$mutableStateSaver$1$2(eVar));
    }

    @C19489b
    @C12579k
    /* renamed from: b */
    public static final <T> C8700z0<T> m90815b(@C12579k C19456p0 p0Var, @C12579k String str, @C12579k C8628e<T, ? extends Object> eVar, @C12579k C11289a<? extends C8700z0<T>> aVar) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(eVar, "stateSaver");
        Intrinsics.checkNotNullParameter(aVar, "init");
        return (C8700z0) m90816c(p0Var, str, m90814a(eVar), aVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.a<? extends T>, kotlin.jvm.functions.a, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.lifecycle.viewmodel.compose.C19489b
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m90816c(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r2, @org.jetbrains.annotations.C12579k java.lang.String r3, @org.jetbrains.annotations.C12579k androidx.compose.runtime.saveable.C8628e<T, ? extends java.lang.Object> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends T> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "saver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r2.mo57648h(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "value"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r4.mo16407b(r0)
            if (r0 != 0) goto L_0x002e
        L_0x002a:
            java.lang.Object r0 = r5.invoke()
        L_0x002e:
            androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$a r5 = new androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$a
            r5.<init>(r4, r0)
            r2.mo57657r(r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.m90816c(androidx.lifecycle.p0, java.lang.String, androidx.compose.runtime.saveable.e, kotlin.jvm.functions.a):java.lang.Object");
    }

    @C19489b
    @C12579k
    /* renamed from: d */
    public static final <T> C11426d<Object, C11427e<Object, T>> m90817d(@C12579k C19456p0 p0Var, @C12579k C8628e<T, ? extends Object> eVar, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "saver");
        Intrinsics.checkNotNullParameter(aVar, "init");
        return new C19484b(p0Var, eVar, aVar);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m90818e(C19456p0 p0Var, String str, C8628e eVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = SaverKt.m31376b();
        }
        return m90816c(p0Var, str, eVar, aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C11426d m90819f(C19456p0 p0Var, C8628e eVar, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = SaverKt.m31376b();
        }
        return m90817d(p0Var, eVar, aVar);
    }

    @C19489b
    @C11314h(name = "saveableMutableState")
    @C12579k
    /* renamed from: g */
    public static final <T, M extends C8700z0<T>> C11426d<Object, C11428f<Object, T>> m90820g(@C12579k C19456p0 p0Var, @C12579k C8628e<T, ? extends Object> eVar, @C12579k C11289a<? extends M> aVar) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "stateSaver");
        Intrinsics.checkNotNullParameter(aVar, "init");
        return new C19486c(p0Var, eVar, aVar);
    }

    /* renamed from: h */
    public static /* synthetic */ C11426d m90821h(C19456p0 p0Var, C8628e eVar, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = SaverKt.m31376b();
        }
        return m90820g(p0Var, eVar, aVar);
    }
}
