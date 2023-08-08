package com.carrefour.fid.android.consent.core.datastore;

import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesKeys;", "", "Landroidx/datastore/preferences/core/a$a;", "", "CONSENT_SKIP_DATE", "Landroidx/datastore/preferences/core/a$a;", "getCONSENT_SKIP_DATE", "()Landroidx/datastore/preferences/core/a$a;", "<init>", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ConsentPreferencesKeys {
    public static final int $stable = 8;
    @C12579k
    private static final C18602a.C18603a<Long> CONSENT_SKIP_DATE = C18606c.m84363e("CONSENT_DATE_KEY");
    @C12579k
    public static final ConsentPreferencesKeys INSTANCE = new ConsentPreferencesKeys();

    private ConsentPreferencesKeys() {
    }

    @C12579k
    public final C18602a.C18603a<Long> getCONSENT_SKIP_DATE() {
        return CONSENT_SKIP_DATE;
    }
}
