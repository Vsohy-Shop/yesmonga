package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;

@C12439o
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0013\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPTIN_CARREFOUR_EMAIL", "OPTIN_CARREFOUR_SMS", "CGU_CLIENT", "DATA_NO_CARD", "DATA_CARD", "OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING", "OPTIN_PARTNER_PERSONALIZED_ADVERTISING", "OPTIN_FID_EMAIL", "OPTIN_FID_SMS", "OPTIN_FID_POST", "OPTIN_FID_CARREFOUR_GROUP", "OPTIN_FID_TIERS", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public enum BffConsentOptInName {
    OPTIN_CARREFOUR_EMAIL("cg_emgr"),
    OPTIN_CARREFOUR_SMS("cg_smsgr"),
    CGU_CLIENT("cgu_client"),
    DATA_NO_CARD("do_1"),
    DATA_CARD("do_2"),
    OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING("ca_pubcar"),
    OPTIN_PARTNER_PERSONALIZED_ADVERTISING("ca_pubpart"),
    OPTIN_FID_EMAIL("opt_email"),
    OPTIN_FID_SMS("opt_sms"),
    OPTIN_FID_POST("opt_courrier"),
    OPTIN_FID_CARREFOUR_GROUP("cons_group"),
    OPTIN_FID_TIERS("cons_tiers");
    
    /* access modifiers changed from: private */
    @C12579k
    public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
    @C12579k
    public static final Companion Companion = null;
    @C12579k
    private final String value;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C12248g get$cachedSerializer() {
            return (C12248g) BffConsentOptInName.$cachedSerializer$delegate.getValue();
        }

        @C12579k
        public final C12248g<BffConsentOptInName> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393571.INSTANCE);
    }

    private BffConsentOptInName(String str) {
        this.value = str;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }
}
