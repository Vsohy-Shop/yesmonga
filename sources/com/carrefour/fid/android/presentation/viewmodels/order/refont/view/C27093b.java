package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.b */
public final class C27093b {

    /* renamed from: f */
    public static final int f65886f = 0;

    /* renamed from: a */
    public final int f65887a;

    /* renamed from: b */
    public final int f65888b;

    /* renamed from: c */
    public final int f65889c;

    /* renamed from: d */
    public final int f65890d;
    @C12579k

    /* renamed from: e */
    public final String f65891e;

    public C27093b(int i, int i2, int i3, int i4, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f65887a = i;
        this.f65888b = i2;
        this.f65889c = i3;
        this.f65890d = i4;
        this.f65891e = str;
    }

    /* renamed from: g */
    public static /* synthetic */ C27093b m114557g(C27093b bVar, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bVar.f65887a;
        }
        if ((i5 & 2) != 0) {
            i2 = bVar.f65888b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = bVar.f65889c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = bVar.f65890d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = bVar.f65891e;
        }
        return bVar.mo78776f(i, i6, i7, i8, str);
    }

    /* renamed from: a */
    public final int mo78770a() {
        return this.f65887a;
    }

    /* renamed from: b */
    public final int mo78771b() {
        return this.f65888b;
    }

    /* renamed from: c */
    public final int mo78772c() {
        return this.f65889c;
    }

    /* renamed from: d */
    public final int mo78773d() {
        return this.f65890d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo78774e() {
        return this.f65891e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27093b)) {
            return false;
        }
        C27093b bVar = (C27093b) obj;
        return this.f65887a == bVar.f65887a && this.f65888b == bVar.f65888b && this.f65889c == bVar.f65889c && this.f65890d == bVar.f65890d && Intrinsics.areEqual((Object) this.f65891e, (Object) bVar.f65891e);
    }

    @C12579k
    /* renamed from: f */
    public final C27093b mo78776f(int i, int i2, int i3, int i4, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new C27093b(i, i2, i3, i4, str);
    }

    /* renamed from: h */
    public final int mo78777h() {
        return this.f65890d;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f65887a) * 31) + Integer.hashCode(this.f65888b)) * 31) + Integer.hashCode(this.f65889c)) * 31) + Integer.hashCode(this.f65890d)) * 31) + this.f65891e.hashCode();
    }

    /* renamed from: i */
    public final int mo78779i() {
        return this.f65889c;
    }

    /* renamed from: j */
    public final int mo78780j() {
        return this.f65888b;
    }

    /* renamed from: k */
    public final int mo78781k() {
        return this.f65887a;
    }

    @C12579k
    /* renamed from: l */
    public final String mo78782l() {
        return this.f65891e;
    }

    @C12579k
    public String toString() {
        int i = this.f65887a;
        int i2 = this.f65888b;
        int i3 = this.f65889c;
        int i4 = this.f65890d;
        String str = this.f65891e;
        return "ExitDialogModel(title=" + i + ", message=" + i2 + ", confirmationText=" + i3 + ", cancellationText=" + i4 + ", url=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27093b(int i, int i2, int i3, int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? R.string.general_information : i, (i5 & 2) != 0 ? R.string.general_external_link_popup_message : i2, (i5 & 4) != 0 ? R.string.yes : i3, (i5 & 8) != 0 ? R.string.general_cancel : i4, str);
    }
}
