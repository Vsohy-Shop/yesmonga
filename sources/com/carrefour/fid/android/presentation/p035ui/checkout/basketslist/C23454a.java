package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.annotation.C0375v;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.a */
public final class C23454a {
    @C12579k

    /* renamed from: d */
    public static final C23455a f59310d = new C23455a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C23454a f59311e = new C23454a(R.drawable.ds_il_drive_active, "", "");

    /* renamed from: a */
    public final int f59312a;
    @C12580l

    /* renamed from: b */
    public final String f59313b;
    @C12579k

    /* renamed from: c */
    public final String f59314c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.a$a */
    public static final class C23455a {
        public /* synthetic */ C23455a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C23454a mo68700a() {
            return C23454a.f59311e;
        }

        public C23455a() {
        }
    }

    public C23454a(@C0375v int i, @C12580l String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str2, "subtitle");
        this.f59312a = i;
        this.f59313b = str;
        this.f59314c = str2;
    }

    /* renamed from: f */
    public static /* synthetic */ C23454a m104528f(C23454a aVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f59312a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f59313b;
        }
        if ((i2 & 4) != 0) {
            str2 = aVar.f59314c;
        }
        return aVar.mo68693e(i, str, str2);
    }

    /* renamed from: b */
    public final int mo68690b() {
        return this.f59312a;
    }

    @C12580l
    /* renamed from: c */
    public final String mo68691c() {
        return this.f59313b;
    }

    @C12579k
    /* renamed from: d */
    public final String mo68692d() {
        return this.f59314c;
    }

    @C12579k
    /* renamed from: e */
    public final C23454a mo68693e(@C0375v int i, @C12580l String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str2, "subtitle");
        return new C23454a(i, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23454a)) {
            return false;
        }
        C23454a aVar = (C23454a) obj;
        return this.f59312a == aVar.f59312a && Intrinsics.areEqual((Object) this.f59313b, (Object) aVar.f59313b) && Intrinsics.areEqual((Object) this.f59314c, (Object) aVar.f59314c);
    }

    /* renamed from: g */
    public final int mo68695g() {
        return this.f59312a;
    }

    @C12579k
    /* renamed from: h */
    public final String mo68696h() {
        return this.f59314c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f59312a) * 31;
        String str = this.f59313b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f59314c.hashCode();
    }

    @C12580l
    /* renamed from: i */
    public final String mo68698i() {
        return this.f59313b;
    }

    @C12579k
    public String toString() {
        int i = this.f59312a;
        String str = this.f59313b;
        String str2 = this.f59314c;
        return "BasketConfig(icon=" + i + ", title=" + str + ", subtitle=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23454a(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, str2);
    }
}
