package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/MemoToAddDomain;", "", "additionSource", "", "description", "label", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionSource", "()Ljava/lang/String;", "getDescription", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class MemoToAddDomain {
    public static final int $stable = 0;
    @C33608c("addition_source")
    @C12579k
    private final String additionSource;
    @C33608c("description")
    @C12579k
    private final String description;
    @C33608c("label")
    @C12579k
    private final String label;

    public MemoToAddDomain() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MemoToAddDomain copy$default(MemoToAddDomain memoToAddDomain, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoToAddDomain.additionSource;
        }
        if ((i & 2) != 0) {
            str2 = memoToAddDomain.description;
        }
        if ((i & 4) != 0) {
            str3 = memoToAddDomain.label;
        }
        return memoToAddDomain.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.additionSource;
    }

    @C12579k
    public final String component2() {
        return this.description;
    }

    @C12579k
    public final String component3() {
        return this.label;
    }

    @C12579k
    public final MemoToAddDomain copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "additionSource");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "label");
        return new MemoToAddDomain(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoToAddDomain)) {
            return false;
        }
        MemoToAddDomain memoToAddDomain = (MemoToAddDomain) obj;
        return Intrinsics.areEqual((Object) this.additionSource, (Object) memoToAddDomain.additionSource) && Intrinsics.areEqual((Object) this.description, (Object) memoToAddDomain.description) && Intrinsics.areEqual((Object) this.label, (Object) memoToAddDomain.label);
    }

    @C12579k
    public final String getAdditionSource() {
        return this.additionSource;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (((this.additionSource.hashCode() * 31) + this.description.hashCode()) * 31) + this.label.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.additionSource;
        String str2 = this.description;
        String str3 = this.label;
        return "MemoToAddDomain(additionSource=" + str + ", description=" + str2 + ", label=" + str3 + ")";
    }

    public MemoToAddDomain(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "additionSource");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "label");
        this.additionSource = str;
        this.description = str2;
        this.label = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MemoToAddDomain(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
