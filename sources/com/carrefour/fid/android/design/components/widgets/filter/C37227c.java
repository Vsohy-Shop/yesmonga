package com.carrefour.fid.android.design.components.widgets.filter;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.filter.c */
public final class C37227c extends C37229e {

    /* renamed from: d */
    public static final int f93366d = 0;
    @C12579k

    /* renamed from: b */
    public final CheckboxComponent.C37150a f93367b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93368c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37227c(CheckboxComponent.C37150a aVar, C11289a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : aVar2);
    }

    /* renamed from: d */
    public static /* synthetic */ C37227c m152821d(C37227c cVar, CheckboxComponent.C37150a aVar, C11289a<C11079d2> aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = cVar.f93367b;
        }
        if ((i & 2) != 0) {
            aVar2 = cVar.f93368c;
        }
        return cVar.mo113366c(aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public final CheckboxComponent.C37150a mo113364a() {
        return this.f93367b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113365b() {
        return this.f93368c;
    }

    @C12579k
    /* renamed from: c */
    public final C37227c mo113366c(@C12579k CheckboxComponent.C37150a aVar, @C12580l C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "checkboxUIViewModel");
        return new C37227c(aVar, aVar2);
    }

    @C12579k
    /* renamed from: e */
    public final CheckboxComponent.C37150a mo113367e() {
        return this.f93367b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37227c)) {
            return false;
        }
        C37227c cVar = (C37227c) obj;
        return Intrinsics.areEqual((Object) this.f93367b, (Object) cVar.f93367b) && Intrinsics.areEqual((Object) this.f93368c, (Object) cVar.f93368c);
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo113369f() {
        return this.f93368c;
    }

    public int hashCode() {
        int hashCode = this.f93367b.hashCode() * 31;
        C11289a<C11079d2> aVar = this.f93368c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @C12579k
    public String toString() {
        CheckboxComponent.C37150a aVar = this.f93367b;
        C11289a<C11079d2> aVar2 = this.f93368c;
        return "FilterItemCheckboxUI(checkboxUIViewModel=" + aVar + ", onCheckboxClicked=" + aVar2 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37227c(@C12579k CheckboxComponent.C37150a aVar, @C12580l C11289a<C11079d2> aVar2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "checkboxUIViewModel");
        this.f93367b = aVar;
        this.f93368c = aVar2;
    }
}
