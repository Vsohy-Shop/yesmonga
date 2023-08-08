package com.carrefour.fid.android.design.components.extension;

import com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayout;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class PullToRefreshLayoutKt {

    /* renamed from: com.carrefour.fid.android.design.components.extension.PullToRefreshLayoutKt$a */
    public static final class C37097a implements C11289a<C11079d2> {

        /* renamed from: a */
        public final /* synthetic */ C12074o0 f92884a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<C11079d2, C11079d2> f92885b;

        public C37097a(C12074o0 o0Var, C11300l<? super C11079d2, C11079d2> lVar) {
            this.f92884a = o0Var;
            this.f92885b = lVar;
        }

        /* renamed from: a */
        public void mo112712a() {
            if (C12079p0.m48270k(this.f92884a)) {
                this.f92885b.invoke(C11079d2.f28267a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo112712a();
            return C11079d2.f28267a;
        }
    }

    /* renamed from: b */
    public static final C37097a m152111b(C12074o0 o0Var, C11300l<? super C11079d2, C11079d2> lVar) {
        return new C37097a(o0Var, lVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C11907e<C11079d2> m152112c(@C12579k PullToRefreshLayout pullToRefreshLayout) {
        Intrinsics.checkNotNullParameter(pullToRefreshLayout, "<this>");
        return C11909g.m47500w(new PullToRefreshLayoutKt$refreshes$1(pullToRefreshLayout, (C11045c<? super PullToRefreshLayoutKt$refreshes$1>) null));
    }
}
