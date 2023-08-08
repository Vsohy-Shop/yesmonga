package com.carrefour.fid.android.analytics.data.analytics.firebasetypes;

import com.bumptech.glide.gifdecoder.C22075f;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.journeyapps.barcodescanner.camera.C34935s;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/analytics/data/analytics/firebasetypes/FirebaseProductDimension;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "analytics_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum FirebaseProductDimension {
    FREQUENT(C22075f.f56695A),
    CLASSIC("c"),
    SPONSORED(C34935s.f84988a),
    RECOMMENDATION(C28515a1.f68703k);
    
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    FirebaseProductDimension(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo32726q() {
        return this.value;
    }
}
