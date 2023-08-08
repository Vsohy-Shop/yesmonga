package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.autofill.C0861a;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;

@C12439o
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APP_CONSENT", "EMAIL_CONSENT", "PHONE_CONSENT", "LOYALTY_CONSENT", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public enum BffConsentType {
    APP_CONSENT(FirebaseMessaging.f80405r),
    EMAIL_CONSENT("email"),
    PHONE_CONSENT(C0861a.f2705e),
    LOYALTY_CONSENT("loyalty_card");
    
    /* access modifiers changed from: private */
    @C12579k
    public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
    @C12579k
    public static final Companion Companion = null;
    @C12579k
    private final String value;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentType$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentType;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C12248g get$cachedSerializer() {
            return (C12248g) BffConsentType.$cachedSerializer$delegate.getValue();
        }

        @C12579k
        public final C12248g<BffConsentType> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393581.INSTANCE);
    }

    private BffConsentType(String str) {
        this.value = str;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }
}
