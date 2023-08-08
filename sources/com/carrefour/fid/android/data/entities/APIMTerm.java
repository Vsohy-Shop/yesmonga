package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMTerm;", "", "term", "", "count", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCount", "()Ljava/lang/String;", "getSelected", "()Z", "getTerm", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMTerm {
    public static final int $stable = 0;
    @C33608c("count")
    @C12579k
    private final String count;
    @C33608c("selected")
    private final boolean selected;
    @C33608c("term")
    @C12579k
    private final String term;

    public APIMTerm(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        this.term = str;
        this.count = str2;
        this.selected = z;
    }

    public static /* synthetic */ APIMTerm copy$default(APIMTerm aPIMTerm, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMTerm.term;
        }
        if ((i & 2) != 0) {
            str2 = aPIMTerm.count;
        }
        if ((i & 4) != 0) {
            z = aPIMTerm.selected;
        }
        return aPIMTerm.copy(str, str2, z);
    }

    @C12579k
    public final String component1() {
        return this.term;
    }

    @C12579k
    public final String component2() {
        return this.count;
    }

    public final boolean component3() {
        return this.selected;
    }

    @C12579k
    public final APIMTerm copy(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        return new APIMTerm(str, str2, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMTerm)) {
            return false;
        }
        APIMTerm aPIMTerm = (APIMTerm) obj;
        return Intrinsics.areEqual((Object) this.term, (Object) aPIMTerm.term) && Intrinsics.areEqual((Object) this.count, (Object) aPIMTerm.count) && this.selected == aPIMTerm.selected;
    }

    @C12579k
    public final String getCount() {
        return this.count;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @C12579k
    public final String getTerm() {
        return this.term;
    }

    public int hashCode() {
        int hashCode = ((this.term.hashCode() * 31) + this.count.hashCode()) * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        String str = this.term;
        String str2 = this.count;
        boolean z = this.selected;
        return "APIMTerm(term=" + str + ", count=" + str2 + ", selected=" + z + ")";
    }
}
