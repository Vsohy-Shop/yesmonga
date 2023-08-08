package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.c */
public final class C37263c extends C37269i {

    /* renamed from: d */
    public static final int f93454d = 0;
    @C12579k

    /* renamed from: b */
    public final String f93455b;
    @C12580l

    /* renamed from: c */
    public final C11289a<C11079d2> f93456c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37263c(String str, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C37263c m152894d(C37263c cVar, String str, C11289a<C11079d2> aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f93455b;
        }
        if ((i & 2) != 0) {
            aVar = cVar.f93456c;
        }
        return cVar.mo113447c(str, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113445a() {
        return this.f93455b;
    }

    @C12580l
    /* renamed from: b */
    public final C11289a<C11079d2> mo113446b() {
        return this.f93456c;
    }

    @C12579k
    /* renamed from: c */
    public final C37263c mo113447c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(str, "buttonText");
        return new C37263c(str, aVar);
    }

    @C12579k
    /* renamed from: e */
    public final String mo113448e() {
        return this.f93455b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37263c)) {
            return false;
        }
        C37263c cVar = (C37263c) obj;
        return Intrinsics.areEqual((Object) this.f93455b, (Object) cVar.f93455b) && Intrinsics.areEqual((Object) this.f93456c, (Object) cVar.f93456c);
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo113450f() {
        return this.f93456c;
    }

    public int hashCode() {
        int hashCode = this.f93455b.hashCode() * 31;
        C11289a<C11079d2> aVar = this.f93456c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f93455b;
        C11289a<C11079d2> aVar = this.f93456c;
        return "ListItemButtonUI(buttonText=" + str + ", onButtonClicked=" + aVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37263c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "buttonText");
        this.f93455b = str;
        this.f93456c = aVar;
    }
}
