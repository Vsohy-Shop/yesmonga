package com.carrefour.fid.android.core.extension;

import androidx.lifecycle.C19406e0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.LiveData;
import kotlin.C11660u;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LiveDataKt {

    /* renamed from: com.carrefour.fid.android.core.extension.LiveDataKt$a */
    public static final class C36297a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f89634a;

        public C36297a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f89634a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f89634a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f89634a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <A, B> LiveData<Pair<A, B>> m148917a(@C12579k LiveData<A> liveData, @C12579k LiveData<B> liveData2) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(liveData2, "b");
        C19406e0 e0Var = new C19406e0();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        e0Var.mo4611s(liveData, new C36297a(new LiveDataKt$combineLatest$1$1(e0Var, objectRef, objectRef2)));
        e0Var.mo4611s(liveData2, new C36297a(new LiveDataKt$combineLatest$1$2(e0Var, objectRef2, objectRef)));
        return e0Var;
    }
}
