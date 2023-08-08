package com.carrefour.fid.android.tracking;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/tracking/UserTag;", "", "", "tagGroup", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "tagName", "r", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum UserTag {
    LoyaltyCard("loyalty", "loyalty_card");
    
    @C12579k
    private final String tagGroup;
    @C12579k
    private final String tagName;

    /* access modifiers changed from: public */
    UserTag(String str, String str2) {
        this.tagGroup = str;
        this.tagName = str2;
    }

    @C12579k
    /* renamed from: q */
    public final String mo84431q() {
        return this.tagGroup;
    }

    @C12579k
    /* renamed from: r */
    public final String mo84432r() {
        return this.tagName;
    }
}
