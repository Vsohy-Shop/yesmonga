package com.carrefour.fid.android.shared.privacy;

import android.content.Context;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.privacy.a */
public interface C28874a {

    /* renamed from: com.carrefour.fid.android.shared.privacy.a$a */
    public static final class C28875a {
        /* renamed from: a */
        public static boolean m119430a(@C12579k C28874a aVar, @C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            if (new OTPublishersHeadlessSDK(context).getConsentStatusForGroupId(aVar.mo32687c()) == 1) {
                return true;
            }
            return false;
        }
    }

    @C12579k
    /* renamed from: c */
    String mo32687c();

    /* renamed from: f */
    boolean mo32689f(@C12579k Context context);
}
