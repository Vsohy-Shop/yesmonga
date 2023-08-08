package androidx.lifecycle;

import androidx.annotation.C0353k0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.c0 */
public final class C19397c0 {

    @C11363r0({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    /* renamed from: androidx.lifecycle.c0$a */
    public static final class C19398a<T> implements C19426h0 {

        /* renamed from: a */
        public final /* synthetic */ C11300l<T, C11079d2> f49779a;

        public C19398a(C11300l<? super T, C11079d2> lVar) {
            this.f49779a = lVar;
        }

        /* renamed from: a */
        public final void mo4590a(T t) {
            this.f49779a.invoke(t);
        }
    }

    @C11395k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @C0353k0
    @C12579k
    /* renamed from: a */
    public static final <T> C19426h0<T> m90666a(@C12579k LiveData<T> liveData, @C12579k C19499w wVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Intrinsics.checkNotNullParameter(lVar, "onChanged");
        C19398a aVar = new C19398a(lVar);
        liveData.mo57491k(wVar, aVar);
        return aVar;
    }
}
