package com.usabilla.sdk.ubform.sdk.banner;

import com.urbanairship.iam.banner.C9156c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "", "", "position", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public enum BannerPosition {
    TOP(C9156c.f24820X),
    BOTTOM(C9156c.f24821Y);
    
    @C12579k

    /* renamed from: a */
    public static final C9922a f27325a = null;
    @C12579k
    private final String position;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerPosition$a */
    public static final class C9922a {
        public /* synthetic */ C9922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final BannerPosition mo20708a(@C12580l String str) {
            BannerPosition bannerPosition = BannerPosition.TOP;
            if (Intrinsics.areEqual((Object) str, (Object) bannerPosition.mo20707q())) {
                return bannerPosition;
            }
            return BannerPosition.BOTTOM;
        }

        public C9922a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f27325a = new C9922a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    BannerPosition(String str) {
        this.position = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo20707q() {
        return this.position;
    }
}
