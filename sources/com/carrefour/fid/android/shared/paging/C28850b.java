package com.carrefour.fid.android.shared.paging;

import androidx.annotation.C0337f0;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.paging.C36334b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.paging.b */
public final class C28850b {

    /* renamed from: c */
    public static final int f70669c = 8;
    @C12579k

    /* renamed from: a */
    public final C11911i<C36334b> f70670a;
    @C12579k

    /* renamed from: b */
    public final C11911i<C36334b> f70671b;

    public C28850b() {
        C11911i<C36334b> a = C11945o.m47609a(10, 10, BufferOverflow.DROP_OLDEST);
        this.f70670a = a;
        this.f70671b = a;
    }

    @C12579k
    /* renamed from: a */
    public final C11911i<C36334b> mo83961a() {
        return this.f70671b;
    }

    /* renamed from: b */
    public final void mo83962b(@C0337f0(from = 0) int i) {
        this.f70670a.mo24198a(new C36334b.C36335a(i));
    }

    /* renamed from: c */
    public final void mo83963c() {
        this.f70670a.mo24198a(C36334b.C36337c.f89756a);
    }

    /* renamed from: d */
    public final void mo83964d() {
        this.f70670a.mo24198a(C36334b.C36338d.f89757a);
    }
}
