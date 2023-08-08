package com.urbanairship.iam.html;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.iam.C9179f;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.DisplayHandler;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.util.C9642c0;

/* renamed from: com.urbanairship.iam.html.b */
public class C9197b extends C9179f {

    /* renamed from: d */
    public final InAppMessage f25024d;

    /* renamed from: e */
    public final C9198c f25025e;

    public C9197b(@C0359n0 InAppMessage inAppMessage, @C0359n0 C9198c cVar) {
        this.f25024d = inAppMessage;
        this.f25025e = cVar;
    }

    @C0359n0
    /* renamed from: e */
    public static C9197b m34502e(@C0359n0 InAppMessage inAppMessage) {
        C9198c cVar = (C9198c) inAppMessage.mo18182n();
        if (cVar != null) {
            return new C9197b(inAppMessage, cVar);
        }
        throw new IllegalArgumentException("Invalid message for adapter: " + inAppMessage);
    }

    /* renamed from: a */
    public void mo18457a(@C0359n0 Context context) {
    }

    /* renamed from: b */
    public void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler) {
        context.startActivity(new Intent(context, HtmlActivity.class).setFlags(268435456).putExtra(C9206k.f25060Y0, displayHandler).putExtra("in_app_message", this.f25024d));
    }

    /* renamed from: c */
    public int mo18458c(@C0359n0 Context context, @C0359n0 Assets assets) {
        if (UAirship.m146188Y().mo106206H().mo18743g(this.f25025e.mo18467n(), 2)) {
            return 0;
        }
        C36059m.m148409e("HTML in-app message URL is not allowed. Unable to display message.", new Object[0]);
        return 2;
    }

    /* renamed from: d */
    public boolean mo18323d(@C0359n0 Context context) {
        if (!super.mo18323d(context)) {
            return false;
        }
        if (!this.f25025e.mo18466m() || C9642c0.m36130c().mo19605b(context)) {
            return true;
        }
        return false;
    }
}
