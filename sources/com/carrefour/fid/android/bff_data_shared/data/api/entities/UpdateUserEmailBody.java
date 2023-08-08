package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserEmailBody;", "", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UpdateUserEmailBody {
    @C33608c("email")
    @C12579k
    private String email;

    public UpdateUserEmailBody() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateUserEmailBody copy$default(UpdateUserEmailBody updateUserEmailBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateUserEmailBody.email;
        }
        return updateUserEmailBody.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.email;
    }

    @C12579k
    public final UpdateUserEmailBody copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "email");
        return new UpdateUserEmailBody(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateUserEmailBody) && Intrinsics.areEqual((Object) this.email, (Object) ((UpdateUserEmailBody) obj).email);
    }

    @C12579k
    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public final void setEmail(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    @C12579k
    public String toString() {
        String str = this.email;
        return "UpdateUserEmailBody(email=" + str + ")";
    }

    public UpdateUserEmailBody(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "email");
        this.email = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateUserEmailBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str);
    }
}
