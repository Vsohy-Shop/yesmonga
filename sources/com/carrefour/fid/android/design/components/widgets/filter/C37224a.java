package com.carrefour.fid.android.design.components.widgets.filter;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.filter.a */
public final class C37224a extends C37229e {

    /* renamed from: d */
    public static final int f93359d = 0;
    @C12579k

    /* renamed from: b */
    public final String f93360b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93361c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37224a(String str, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C37224a m152812d(C37224a aVar, String str, C11289a<C11079d2> aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f93360b;
        }
        if ((i & 2) != 0) {
            aVar2 = aVar.f93361c;
        }
        return aVar.mo113353c(str, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113351a() {
        return this.f93360b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113352b() {
        return this.f93361c;
    }

    @C12579k
    /* renamed from: c */
    public final C37224a mo113353c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(str, "buttonText");
        return new C37224a(str, aVar);
    }

    @C12579k
    /* renamed from: e */
    public final String mo113354e() {
        return this.f93360b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37224a)) {
            return false;
        }
        C37224a aVar = (C37224a) obj;
        return Intrinsics.areEqual((Object) this.f93360b, (Object) aVar.f93360b) && Intrinsics.areEqual((Object) this.f93361c, (Object) aVar.f93361c);
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo113356f() {
        return this.f93361c;
    }

    public int hashCode() {
        int hashCode = this.f93360b.hashCode() * 31;
        C11289a<C11079d2> aVar = this.f93361c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f93360b;
        C11289a<C11079d2> aVar = this.f93361c;
        return "FilterButtonItemLinkUI(buttonText=" + str + ", onItemClicked=" + aVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37224a(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "buttonText");
        this.f93360b = str;
        this.f93361c = aVar;
    }
}
