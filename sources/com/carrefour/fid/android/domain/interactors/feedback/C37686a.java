package com.carrefour.fid.android.domain.interactors.feedback;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.p046io.PrivacyThrowable;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.interactors.feedback.a */
public final class C37686a implements C37678e<Boolean>, C28874a {

    /* renamed from: b */
    public static final int f94544b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f94545a;

    @Inject
    public C37686a(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f94545a = context;
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.CRITIZR.mo83424q();
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172968invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        if (!mo32689f(this.f94545a)) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new PrivacyThrowable()));
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(C11064a.m42615a(true));
    }
}
