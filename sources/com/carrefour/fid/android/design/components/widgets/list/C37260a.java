package com.carrefour.fid.android.design.components.widgets.list;

import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.a */
public final class C37260a extends C37269i {

    /* renamed from: d */
    public static final int f93447d = 0;

    /* renamed from: b */
    public final int f93448b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93449c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37260a(int i, C11289a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C37260a m152885d(C37260a aVar, int i, C11289a<C11079d2> aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f93448b;
        }
        if ((i2 & 2) != 0) {
            aVar2 = aVar.f93449c;
        }
        return aVar.mo113434c(i, aVar2);
    }

    /* renamed from: a */
    public final int mo113432a() {
        return this.f93448b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113433b() {
        return this.f93449c;
    }

    @C12579k
    /* renamed from: c */
    public final C37260a mo113434c(@C0375v int i, @C12580l C11289a<C11079d2> aVar) {
        return new C37260a(i, aVar);
    }

    /* renamed from: e */
    public final int mo113435e() {
        return this.f93448b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37260a)) {
            return false;
        }
        C37260a aVar = (C37260a) obj;
        return this.f93448b == aVar.f93448b && Intrinsics.areEqual((Object) this.f93449c, (Object) aVar.f93449c);
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo113437f() {
        return this.f93449c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f93448b) * 31;
        C11289a<C11079d2> aVar = this.f93449c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @C12579k
    public String toString() {
        int i = this.f93448b;
        C11289a<C11079d2> aVar = this.f93449c;
        return "ListImageUI(imageResId=" + i + ", onItemClicked=" + aVar + ")";
    }

    public C37260a(@C0375v int i, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        this.f93448b = i;
        this.f93449c = aVar;
    }
}
