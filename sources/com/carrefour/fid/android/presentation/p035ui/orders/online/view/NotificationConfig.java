package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationConfig */
public final class NotificationConfig {
    @C12579k

    /* renamed from: a */
    public final String f62317a;
    @C12580l

    /* renamed from: b */
    public final String f62318b;

    /* renamed from: c */
    public final boolean f62319c;
    @C12580l

    /* renamed from: d */
    public final String f62320d;
    @C12579k

    /* renamed from: e */
    public final C11289a<C11079d2> f62321e;
    @C12579k

    /* renamed from: f */
    public final C11289a<C11079d2> f62322f;

    public NotificationConfig(@C12579k String str, @C12580l String str2, boolean z, @C12580l String str3, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(aVar, "onActionClicked");
        Intrinsics.checkNotNullParameter(aVar2, "onDismissClicked");
        this.f62317a = str;
        this.f62318b = str2;
        this.f62319c = z;
        this.f62320d = str3;
        this.f62321e = aVar;
        this.f62322f = aVar2;
    }

    /* renamed from: h */
    public static /* synthetic */ NotificationConfig m109319h(NotificationConfig notificationConfig, String str, String str2, boolean z, String str3, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationConfig.f62317a;
        }
        if ((i & 2) != 0) {
            str2 = notificationConfig.f62318b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = notificationConfig.f62319c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = notificationConfig.f62320d;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            aVar = notificationConfig.f62321e;
        }
        C11289a<C11079d2> aVar3 = aVar;
        if ((i & 32) != 0) {
            aVar2 = notificationConfig.f62322f;
        }
        return notificationConfig.mo73664g(str, str4, z2, str5, aVar3, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo73657a() {
        return this.f62317a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo73658b() {
        return this.f62318b;
    }

    /* renamed from: c */
    public final boolean mo73659c() {
        return this.f62319c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo73660d() {
        return this.f62320d;
    }

    @C12579k
    /* renamed from: e */
    public final C11289a<C11079d2> mo73661e() {
        return this.f62321e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationConfig)) {
            return false;
        }
        NotificationConfig notificationConfig = (NotificationConfig) obj;
        return Intrinsics.areEqual((Object) this.f62317a, (Object) notificationConfig.f62317a) && Intrinsics.areEqual((Object) this.f62318b, (Object) notificationConfig.f62318b) && this.f62319c == notificationConfig.f62319c && Intrinsics.areEqual((Object) this.f62320d, (Object) notificationConfig.f62320d) && Intrinsics.areEqual((Object) this.f62321e, (Object) notificationConfig.f62321e) && Intrinsics.areEqual((Object) this.f62322f, (Object) notificationConfig.f62322f);
    }

    @C12579k
    /* renamed from: f */
    public final C11289a<C11079d2> mo73663f() {
        return this.f62322f;
    }

    @C12579k
    /* renamed from: g */
    public final NotificationConfig mo73664g(@C12579k String str, @C12580l String str2, boolean z, @C12580l String str3, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(aVar, "onActionClicked");
        Intrinsics.checkNotNullParameter(aVar2, "onDismissClicked");
        return new NotificationConfig(str, str2, z, str3, aVar, aVar2);
    }

    public int hashCode() {
        int hashCode = this.f62317a.hashCode() * 31;
        String str = this.f62318b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f62319c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f62320d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i2 + i) * 31) + this.f62321e.hashCode()) * 31) + this.f62322f.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C11289a<C11079d2> mo73666i() {
        return this.f62321e;
    }

    @C12579k
    /* renamed from: j */
    public final C11289a<C11079d2> mo73667j() {
        return this.f62322f;
    }

    @C12580l
    /* renamed from: k */
    public final String mo73668k() {
        return this.f62320d;
    }

    @C12580l
    /* renamed from: l */
    public final String mo73669l() {
        return this.f62318b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo73670m() {
        return this.f62317a;
    }

    /* renamed from: n */
    public final boolean mo73671n() {
        return this.f62319c;
    }

    @C12579k
    public String toString() {
        String str = this.f62317a;
        String str2 = this.f62318b;
        boolean z = this.f62319c;
        String str3 = this.f62320d;
        C11289a<C11079d2> aVar = this.f62321e;
        C11289a<C11079d2> aVar2 = this.f62322f;
        return "NotificationConfig(title=" + str + ", textContent=" + str2 + ", isCloseable=" + z + ", textAction=" + str3 + ", onActionClicked=" + aVar + ", onDismissClicked=" + aVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationConfig(String str, String str2, boolean z, String str3, C11289a aVar, C11289a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? C252521.f62323f : aVar, (i & 32) != 0 ? C252532.f62324f : aVar2);
    }
}
