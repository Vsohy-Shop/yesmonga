package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Facet;", "", "name", "", "type", "totalTerms", "", "topTerms", "", "Lcom/carrefour/fid/android/data/entities/APIMTerm;", "field", "selected", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Z)V", "getField", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "getTopTerms", "()Ljava/util/List;", "getTotalTerms", "()I", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Facet {
    public static final int $stable = 8;
    @C33608c("field")
    @C12579k
    private final String field;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("selected")
    private final boolean selected;
    @C33608c("topTerms")
    @C12579k
    private final List<APIMTerm> topTerms;
    @C33608c("totalTerms")
    private final int totalTerms;
    @C33608c("type")
    @C12579k
    private final String type;

    public Facet(@C12579k String str, @C12579k String str2, int i, @C12579k List<APIMTerm> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        this.name = str;
        this.type = str2;
        this.totalTerms = i;
        this.topTerms = list;
        this.field = str3;
        this.selected = z;
    }

    public static /* synthetic */ Facet copy$default(Facet facet, String str, String str2, int i, List<APIMTerm> list, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = facet.name;
        }
        if ((i2 & 2) != 0) {
            str2 = facet.type;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = facet.totalTerms;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = facet.topTerms;
        }
        List<APIMTerm> list2 = list;
        if ((i2 & 16) != 0) {
            str3 = facet.field;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            z = facet.selected;
        }
        return facet.copy(str, str4, i3, list2, str5, z);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.type;
    }

    public final int component3() {
        return this.totalTerms;
    }

    @C12579k
    public final List<APIMTerm> component4() {
        return this.topTerms;
    }

    @C12579k
    public final String component5() {
        return this.field;
    }

    public final boolean component6() {
        return this.selected;
    }

    @C12579k
    public final Facet copy(@C12579k String str, @C12579k String str2, int i, @C12579k List<APIMTerm> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        return new Facet(str, str2, i, list, str3, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Facet)) {
            return false;
        }
        Facet facet = (Facet) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) facet.name) && Intrinsics.areEqual((Object) this.type, (Object) facet.type) && this.totalTerms == facet.totalTerms && Intrinsics.areEqual((Object) this.topTerms, (Object) facet.topTerms) && Intrinsics.areEqual((Object) this.field, (Object) facet.field) && this.selected == facet.selected;
    }

    @C12579k
    public final String getField() {
        return this.field;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @C12579k
    public final List<APIMTerm> getTopTerms() {
        return this.topTerms;
    }

    public final int getTotalTerms() {
        return this.totalTerms;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.totalTerms)) * 31) + this.topTerms.hashCode()) * 31) + this.field.hashCode()) * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.type;
        int i = this.totalTerms;
        List<APIMTerm> list = this.topTerms;
        String str3 = this.field;
        boolean z = this.selected;
        return "Facet(name=" + str + ", type=" + str2 + ", totalTerms=" + i + ", topTerms=" + list + ", field=" + str3 + ", selected=" + z + ")";
    }
}
