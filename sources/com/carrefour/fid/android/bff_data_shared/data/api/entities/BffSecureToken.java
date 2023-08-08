package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 ,2\u00020\u0001:\u0003-,.B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b&\u0010'B=\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0010\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R \u0010\u0011\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u0012\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;", "component3", "expiresIn", "idToken", "tokenType", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getExpiresIn", "()J", "getExpiresIn$annotations", "()V", "Ljava/lang/String;", "getIdToken", "()Ljava/lang/String;", "getIdToken$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;", "getTokenType", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;", "getTokenType$annotations", "<init>", "(JLjava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "TokenType", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSecureToken {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final long expiresIn;
    @C12579k
    private final String idToken;
    @C12579k
    private final TokenType tokenType;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSecureToken> serializer() {
            return BffSecureToken$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "cUSTOMER", "sERVICEACCOUNT", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum TokenType {
        cUSTOMER("CUSTOMER"),
        sERVICEACCOUNT("SERVICE_ACCOUNT"),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken$TokenType;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) TokenType.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<TokenType> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393611.INSTANCE);
        }

        private TokenType(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSecureToken(int i, @C12438n("expires_in") long j, @C12438n("id_token") String str, @C12438n("token_type") TokenType tokenType2, C12295n1 n1Var) {
        if (7 != (i & 7)) {
            C12261c1.m49256b(i, 7, BffSecureToken$$serializer.INSTANCE.getDescriptor());
        }
        this.expiresIn = j;
        this.idToken = str;
        this.tokenType = tokenType2;
    }

    public static /* synthetic */ BffSecureToken copy$default(BffSecureToken bffSecureToken, long j, String str, TokenType tokenType2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bffSecureToken.expiresIn;
        }
        if ((i & 2) != 0) {
            str = bffSecureToken.idToken;
        }
        if ((i & 4) != 0) {
            tokenType2 = bffSecureToken.tokenType;
        }
        return bffSecureToken.copy(j, str, tokenType2);
    }

    @C12438n("expires_in")
    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    @C12438n("id_token")
    public static /* synthetic */ void getIdToken$annotations() {
    }

    @C12438n("token_type")
    public static /* synthetic */ void getTokenType$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSecureToken bffSecureToken, C12239d dVar, C12217f fVar) {
        dVar.mo24902G(fVar, 0, bffSecureToken.expiresIn);
        dVar.mo24929z(fVar, 1, bffSecureToken.idToken);
        dVar.mo24899D(fVar, 2, BffSecureToken$TokenType$$serializer.INSTANCE, bffSecureToken.tokenType);
    }

    public final long component1() {
        return this.expiresIn;
    }

    @C12579k
    public final String component2() {
        return this.idToken;
    }

    @C12579k
    public final TokenType component3() {
        return this.tokenType;
    }

    @C12579k
    public final BffSecureToken copy(long j, @C12579k String str, @C12579k TokenType tokenType2) {
        Intrinsics.checkNotNullParameter(str, "idToken");
        Intrinsics.checkNotNullParameter(tokenType2, "tokenType");
        return new BffSecureToken(j, str, tokenType2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSecureToken)) {
            return false;
        }
        BffSecureToken bffSecureToken = (BffSecureToken) obj;
        return this.expiresIn == bffSecureToken.expiresIn && Intrinsics.areEqual((Object) this.idToken, (Object) bffSecureToken.idToken) && this.tokenType == bffSecureToken.tokenType;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    @C12579k
    public final String getIdToken() {
        return this.idToken;
    }

    @C12579k
    public final TokenType getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((Long.hashCode(this.expiresIn) * 31) + this.idToken.hashCode()) * 31) + this.tokenType.hashCode();
    }

    @C12579k
    public String toString() {
        long j = this.expiresIn;
        String str = this.idToken;
        TokenType tokenType2 = this.tokenType;
        return "BffSecureToken(expiresIn=" + j + ", idToken=" + str + ", tokenType=" + tokenType2 + ")";
    }

    public BffSecureToken(long j, @C12579k String str, @C12579k TokenType tokenType2) {
        Intrinsics.checkNotNullParameter(str, "idToken");
        Intrinsics.checkNotNullParameter(tokenType2, "tokenType");
        this.expiresIn = j;
        this.idToken = str;
        this.tokenType = tokenType2;
    }
}
