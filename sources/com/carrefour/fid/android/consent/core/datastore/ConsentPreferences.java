package com.carrefour.fid.android.consent.core.datastore;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferences;", "", "consentDate", "", "(J)V", "getConsentDate", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class ConsentPreferences {
    public static final int $stable = 0;
    private final long consentDate;

    public ConsentPreferences(long j) {
        this.consentDate = j;
    }

    public static /* synthetic */ ConsentPreferences copy$default(ConsentPreferences consentPreferences, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = consentPreferences.consentDate;
        }
        return consentPreferences.copy(j);
    }

    public final long component1() {
        return this.consentDate;
    }

    @C12579k
    public final ConsentPreferences copy(long j) {
        return new ConsentPreferences(j);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsentPreferences) && this.consentDate == ((ConsentPreferences) obj).consentDate;
    }

    public final long getConsentDate() {
        return this.consentDate;
    }

    public int hashCode() {
        return Long.hashCode(this.consentDate);
    }

    @C12579k
    public String toString() {
        long j = this.consentDate;
        return "ConsentPreferences(consentDate=" + j + ")";
    }
}
