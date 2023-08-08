package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.shared.util.C28935i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.events.a */
public class C28926a<T> implements C19426h0<T> {

    /* renamed from: b */
    public static final int f70875b = 8;
    @C12579k

    /* renamed from: a */
    public final C19426h0<? super T> f70876a;

    public C28926a(@C12579k C19426h0<? super T> h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "observer");
        this.f70876a = h0Var;
    }

    /* renamed from: a */
    public void mo4590a(T t) {
        try {
            this.f70876a.mo4590a(t);
        } catch (Exception e) {
            String str = "error on Observer onChanged() = " + String.valueOf(e.getMessage());
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply {\n…\n            }.toString()");
            C28935i.m119705e(C28935i.f70940a, str, (Throwable) null, 0, 6, (Object) null);
        }
    }

    /* renamed from: b */
    public boolean mo84204b(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        return false;
    }
}
