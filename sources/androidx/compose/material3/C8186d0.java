package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.d0 */
public final class C8186d0 {

    /* renamed from: d */
    public static final int f20044d = 0;
    @C12579k

    /* renamed from: a */
    public final String f20045a;
    @C12579k

    /* renamed from: b */
    public final String f20046b;
    @C12579k

    /* renamed from: c */
    public final String f20047c;

    public C8186d0() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ String m27008b(C8186d0 d0Var, C8238l lVar, C8244m mVar, Locale locale, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return d0Var.mo12519a(lVar, mVar, locale, z);
    }

    @C12580l
    /* renamed from: a */
    public final String mo12519a(@C12580l C8238l lVar, @C12579k C8244m mVar, @C12579k Locale locale, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(mVar, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (lVar == null) {
            return null;
        }
        if (z) {
            str = this.f20047c;
        } else {
            str = this.f20046b;
        }
        return mVar.mo12852n(lVar, str, locale);
    }

    @C12580l
    /* renamed from: c */
    public final String mo12520c(@C12580l C8266q qVar, @C12579k C8244m mVar, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(mVar, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (qVar == null) {
            return null;
        }
        return mVar.mo12851m(qVar, this.f20045a, locale);
    }

    @C12579k
    /* renamed from: d */
    public final String mo12521d() {
        return this.f20047c;
    }

    @C12579k
    /* renamed from: e */
    public final String mo12522e() {
        return this.f20046b;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C8186d0)) {
            return false;
        }
        C8186d0 d0Var = (C8186d0) obj;
        if (Intrinsics.areEqual((Object) this.f20045a, (Object) d0Var.f20045a) && Intrinsics.areEqual((Object) this.f20046b, (Object) d0Var.f20046b) && Intrinsics.areEqual((Object) this.f20047c, (Object) d0Var.f20047c)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final String mo12524f() {
        return this.f20045a;
    }

    public int hashCode() {
        return (((this.f20045a.hashCode() * 31) + this.f20046b.hashCode()) * 31) + this.f20047c.hashCode();
    }

    public C8186d0(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "yearSelectionSkeleton");
        Intrinsics.checkNotNullParameter(str2, "selectedDateSkeleton");
        Intrinsics.checkNotNullParameter(str3, "selectedDateDescriptionSkeleton");
        this.f20045a = str;
        this.f20046b = str2;
        this.f20047c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8186d0(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DatePickerDefaults.f19307d : str, (i & 2) != 0 ? DatePickerDefaults.f19308e : str2, (i & 4) != 0 ? DatePickerDefaults.f19309f : str3);
    }
}
