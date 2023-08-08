package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.core.content.C17318d;
import java.util.List;

/* renamed from: androidx.browser.trusted.z */
public final class C0988z {
    @C0359n0

    /* renamed from: a */
    public final Intent f3066a;
    @C0359n0

    /* renamed from: b */
    public final List<Uri> f3067b;

    public C0988z(@C0359n0 Intent intent, @C0359n0 List<Uri> list) {
        this.f3066a = intent;
        this.f3067b = list;
    }

    @C0359n0
    /* renamed from: a */
    public Intent mo4080a() {
        return this.f3066a;
    }

    /* renamed from: b */
    public final void mo4081b(Context context) {
        for (Uri grantUriPermission : this.f3067b) {
            context.grantUriPermission(this.f3066a.getPackage(), grantUriPermission, 1);
        }
    }

    /* renamed from: c */
    public void mo4082c(@C0359n0 Context context) {
        mo4081b(context);
        C17318d.m79740w(context, this.f3066a, (Bundle) null);
    }
}
