package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.FocusRequester;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.h */
public final class C36988h {
    @C12579k

    /* renamed from: a */
    public final List<FocusRequester> f92394a;

    /* renamed from: b */
    public final int f92395b;

    public C36988h(@C12579k List<FocusRequester> list, int i) {
        Intrinsics.checkNotNullParameter(list, "focusRequester");
        this.f92394a = list;
        this.f92395b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C36988h m151724d(C36988h hVar, List<FocusRequester> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = hVar.f92394a;
        }
        if ((i2 & 2) != 0) {
            i = hVar.f92395b;
        }
        return hVar.mo112410c(list, i);
    }

    @C12579k
    /* renamed from: a */
    public final List<FocusRequester> mo112408a() {
        return this.f92394a;
    }

    /* renamed from: b */
    public final int mo112409b() {
        return this.f92395b;
    }

    @C12579k
    /* renamed from: c */
    public final C36988h mo112410c(@C12579k List<FocusRequester> list, int i) {
        Intrinsics.checkNotNullParameter(list, "focusRequester");
        return new C36988h(list, i);
    }

    @C12579k
    /* renamed from: e */
    public final List<FocusRequester> mo112411e() {
        return this.f92394a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36988h)) {
            return false;
        }
        C36988h hVar = (C36988h) obj;
        return Intrinsics.areEqual((Object) this.f92394a, (Object) hVar.f92394a) && this.f92395b == hVar.f92395b;
    }

    /* renamed from: f */
    public final int mo112413f() {
        return this.f92395b;
    }

    public int hashCode() {
        return (this.f92394a.hashCode() * 31) + Integer.hashCode(this.f92395b);
    }

    @C12579k
    public String toString() {
        List<FocusRequester> list = this.f92394a;
        int i = this.f92395b;
        return "FocusRequesterDetail(focusRequester=" + list + ", pos=" + i + ")";
    }
}
