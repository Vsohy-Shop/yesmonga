package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.d */
public final class C37264d extends C37269i {

    /* renamed from: e */
    public static final int f93457e = 0;
    @C12579k

    /* renamed from: b */
    public final CheckboxComponent.C37150a f93458b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93459c;
    @C12580l

    /* renamed from: d */
    public final C11289a<C11079d2> f93460d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37264d(CheckboxComponent.C37150a aVar, C11289a aVar2, C11289a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : aVar2, (i & 4) != 0 ? null : aVar3);
    }

    /* renamed from: e */
    public static /* synthetic */ C37264d m152900e(C37264d dVar, CheckboxComponent.C37150a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = dVar.f93458b;
        }
        if ((i & 2) != 0) {
            aVar2 = dVar.f93459c;
        }
        if ((i & 4) != 0) {
            aVar3 = dVar.f93460d;
        }
        return dVar.mo113456d(aVar, aVar2, aVar3);
    }

    @C12579k
    /* renamed from: a */
    public final CheckboxComponent.C37150a mo113453a() {
        return this.f93458b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113454b() {
        return this.f93459c;
    }

    @C12580l
    /* renamed from: c */
    public final C11289a<C11079d2> mo113455c() {
        return this.f93460d;
    }

    @C12579k
    /* renamed from: d */
    public final C37264d mo113456d(@C12579k CheckboxComponent.C37150a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3) {
        Intrinsics.checkNotNullParameter(aVar, "checkboxUIViewModel");
        return new C37264d(aVar, aVar2, aVar3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37264d)) {
            return false;
        }
        C37264d dVar = (C37264d) obj;
        return Intrinsics.areEqual((Object) this.f93458b, (Object) dVar.f93458b) && Intrinsics.areEqual((Object) this.f93459c, (Object) dVar.f93459c) && Intrinsics.areEqual((Object) this.f93460d, (Object) dVar.f93460d);
    }

    @C12579k
    /* renamed from: f */
    public final CheckboxComponent.C37150a mo113458f() {
        return this.f93458b;
    }

    @C12580l
    /* renamed from: g */
    public final C11289a<C11079d2> mo113459g() {
        return this.f93459c;
    }

    @C12580l
    /* renamed from: h */
    public final C11289a<C11079d2> mo113460h() {
        return this.f93460d;
    }

    public int hashCode() {
        int hashCode = this.f93458b.hashCode() * 31;
        C11289a<C11079d2> aVar = this.f93459c;
        int i = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C11289a<C11079d2> aVar2 = this.f93460d;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        CheckboxComponent.C37150a aVar = this.f93458b;
        C11289a<C11079d2> aVar2 = this.f93459c;
        C11289a<C11079d2> aVar3 = this.f93460d;
        return "ListItemCheckboxWithDeleteUI(checkboxUIViewModel=" + aVar + ", onCheckboxClicked=" + aVar2 + ", onDeleteClicked=" + aVar3 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37264d(@C12579k CheckboxComponent.C37150a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "checkboxUIViewModel");
        this.f93458b = aVar;
        this.f93459c = aVar2;
        this.f93460d = aVar3;
    }
}
