package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.g */
public final class C37267g extends C37269i {

    /* renamed from: c */
    public static final int f93477c = 0;
    @C12579k

    /* renamed from: b */
    public final String f93478b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37267g(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "messageText");
        this.f93478b = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C37267g m152940c(C37267g gVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f93478b;
        }
        return gVar.mo113500b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113499a() {
        return this.f93478b;
    }

    @C12579k
    /* renamed from: b */
    public final C37267g mo113500b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "messageText");
        return new C37267g(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo113501d() {
        return this.f93478b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37267g) && Intrinsics.areEqual((Object) this.f93478b, (Object) ((C37267g) obj).f93478b);
    }

    public int hashCode() {
        return this.f93478b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f93478b;
        return "ListItemMessageUI(messageText=" + str + ")";
    }
}
