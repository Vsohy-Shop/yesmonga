package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.f */
public final class C37266f extends C37269i {

    /* renamed from: d */
    public static final int f93474d = 0;
    @C12579k

    /* renamed from: b */
    public final String f93475b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93476c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37266f(String str, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C37266f m152934d(C37266f fVar, String str, C11289a<C11079d2> aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f93475b;
        }
        if ((i & 2) != 0) {
            aVar = fVar.f93476c;
        }
        return fVar.mo113493c(str, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113491a() {
        return this.f93475b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113492b() {
        return this.f93476c;
    }

    @C12579k
    /* renamed from: c */
    public final C37266f mo113493c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(str, "linkText");
        return new C37266f(str, aVar);
    }

    @C12579k
    /* renamed from: e */
    public final String mo113494e() {
        return this.f93475b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37266f)) {
            return false;
        }
        C37266f fVar = (C37266f) obj;
        return Intrinsics.areEqual((Object) this.f93475b, (Object) fVar.f93475b) && Intrinsics.areEqual((Object) this.f93476c, (Object) fVar.f93476c);
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo113496f() {
        return this.f93476c;
    }

    public int hashCode() {
        int hashCode = this.f93475b.hashCode() * 31;
        C11289a<C11079d2> aVar = this.f93476c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f93475b;
        C11289a<C11079d2> aVar = this.f93476c;
        return "ListItemLinkUI(linkText=" + str + ", onItemClicked=" + aVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37266f(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "linkText");
        this.f93475b = str;
        this.f93476c = aVar;
    }
}
