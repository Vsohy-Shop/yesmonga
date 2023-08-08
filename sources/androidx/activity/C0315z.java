package androidx.activity;

import androidx.lifecycle.C19499w;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.z */
public final class C0315z {

    /* renamed from: androidx.activity.z$a */
    public static final class C0316a extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ C11300l<C0309t, C11079d2> f830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0316a(boolean z, C11300l<? super C0309t, C11079d2> lVar) {
            super(z);
            this.f830d = lVar;
        }

        /* renamed from: f */
        public void mo792f() {
            this.f830d.invoke(this);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C0309t m1561a(@C12579k OnBackPressedDispatcher onBackPressedDispatcher, @C12580l C19499w wVar, boolean z, @C12579k C11300l<? super C0309t, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onBackPressed");
        C0316a aVar = new C0316a(z, lVar);
        if (wVar != null) {
            onBackPressedDispatcher.mo764c(wVar, aVar);
        } else {
            onBackPressedDispatcher.mo763b(aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C0309t m1562b(OnBackPressedDispatcher onBackPressedDispatcher, C19499w wVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m1561a(onBackPressedDispatcher, wVar, z, lVar);
    }
}
