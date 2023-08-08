package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.lifecycle.C19426h0;
import kotlin.C11660u;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.home.g */
public final class C24158g {

    /* renamed from: a */
    public static final long f60426a = 150;

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.g$a */
    public static final class C24159a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f60427a;

        public C24159a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f60427a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f60427a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f60427a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }
}
