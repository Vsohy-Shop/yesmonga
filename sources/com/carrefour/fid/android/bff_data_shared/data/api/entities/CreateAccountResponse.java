package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/CreateAccountResponse;", "", "gender", "", "firstName", "lastName", "bonPlanCarrefour", "", "partnerMail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getBonPlanCarrefour", "()Z", "setBonPlanCarrefour", "(Z)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getGender", "setGender", "getLastName", "setLastName", "getPartnerMail", "setPartnerMail", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CreateAccountResponse {
    @C33608c("bonPlanCarrefour")
    private boolean bonPlanCarrefour;
    @C33608c("nom")
    @C12579k
    private String firstName;
    @C33608c("gender")
    @C12579k
    private String gender;
    @C33608c("prenom")
    @C12579k
    private String lastName;
    @C33608c("mailPartenaire")
    private boolean partnerMail;

    public CreateAccountResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "gender");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        this.gender = str;
        this.firstName = str2;
        this.lastName = str3;
        this.bonPlanCarrefour = z;
        this.partnerMail = z2;
    }

    public static /* synthetic */ CreateAccountResponse copy$default(CreateAccountResponse createAccountResponse, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createAccountResponse.gender;
        }
        if ((i & 2) != 0) {
            str2 = createAccountResponse.firstName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = createAccountResponse.lastName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = createAccountResponse.bonPlanCarrefour;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = createAccountResponse.partnerMail;
        }
        return createAccountResponse.copy(str, str4, str5, z3, z2);
    }

    @C12579k
    public final String component1() {
        return this.gender;
    }

    @C12579k
    public final String component2() {
        return this.firstName;
    }

    @C12579k
    public final String component3() {
        return this.lastName;
    }

    public final boolean component4() {
        return this.bonPlanCarrefour;
    }

    public final boolean component5() {
        return this.partnerMail;
    }

    @C12579k
    public final CreateAccountResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "gender");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        return new CreateAccountResponse(str, str2, str3, z, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAccountResponse)) {
            return false;
        }
        CreateAccountResponse createAccountResponse = (CreateAccountResponse) obj;
        return Intrinsics.areEqual((Object) this.gender, (Object) createAccountResponse.gender) && Intrinsics.areEqual((Object) this.firstName, (Object) createAccountResponse.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) createAccountResponse.lastName) && this.bonPlanCarrefour == createAccountResponse.bonPlanCarrefour && this.partnerMail == createAccountResponse.partnerMail;
    }

    public final boolean getBonPlanCarrefour() {
        return this.bonPlanCarrefour;
    }

    @C12579k
    public final String getFirstName() {
        return this.firstName;
    }

    @C12579k
    public final String getGender() {
        return this.gender;
    }

    @C12579k
    public final String getLastName() {
        return this.lastName;
    }

    public final boolean getPartnerMail() {
        return this.partnerMail;
    }

    public int hashCode() {
        int hashCode = ((((this.gender.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        boolean z = this.bonPlanCarrefour;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.partnerMail;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final void setBonPlanCarrefour(boolean z) {
        this.bonPlanCarrefour = z;
    }

    public final void setFirstName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setGender(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gender = str;
    }

    public final void setLastName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setPartnerMail(boolean z) {
        this.partnerMail = z;
    }

    @C12579k
    public String toString() {
        String str = this.gender;
        String str2 = this.firstName;
        String str3 = this.lastName;
        boolean z = this.bonPlanCarrefour;
        boolean z2 = this.partnerMail;
        return "CreateAccountResponse(gender=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", bonPlanCarrefour=" + z + ", partnerMail=" + z2 + ")";
    }
}
